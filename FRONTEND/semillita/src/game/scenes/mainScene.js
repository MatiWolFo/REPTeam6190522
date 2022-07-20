import { Scene } from "phaser";//importando libreria phaser en particular {scene} npm i phaser
import Phaser from "phaser";
import { getJuegoById, guardarScoreUsuario } from "../../services/JuegoService";//importando desde JuegoService en particular {getJuegoById y guardarScoreUsuario}

export default class MainScene extends Scene {//Aqui extiendo la clase MainScene de la clase Scene para ocupar los metodos de Scene(preload,create,update) y exporto MainScene para que pueda ser ocupada en otro lugar 
  //Inicio de variables
  fondoWinner = {}
  fondoGameOver = {}
  botonStart = {}
  corazones = []
  fondoStart = {}
  fondoJuego = {}
  huevo = {}
  puntajeText = {}
  cursors = {}
  letras = {}
  bichos = {};
  juagando = false;
  platforms = {};
  vDerecha = 800;
  vIzquierda = 800;
  tiempoInicioLetra = new Date();
  tiempoTerminoLetra = new Date();
  puntajeInt = 0;
  tiempoInicioBicho = new Date();
  tiempoTerminoBicho = new Date();
  tiempoEsperaLetra = 1000;
  tiempoEsperaBicho = 500;
  vidas;
  gameOver = false;
  win = false;
  puntajeParaPasarNivel;
  huevoTocaPiso = false;
  ENTER = null;
  juego = {};
  //Fin de variables

  //Objeto ScoreUsuario con atributos iguales a la bd y al backend (La idea es ocuparlo para Json api)
  scoreUsuario = {
    id:0,
    scoreRealizado:0,
    vidasUtilizadas:0,
    juego:{
      id:1
    },
    usuario:{
      id:1
    }
  }
//PRIMER METODO DE SCENE
  preload() {//Aquí voy a precargar todas mis imagenes del juego

    this.juego = getJuegoById(1).then((juego) => {//Aqui ocupo la funcion del servicejuego "getJuegoById" la cual obtiene el objeto juego, pasandole el id del juego. en este caso 1.
      console.log(juego)//comprobación de juego
      this.juego = juego;//seteo la variable global juego con el objeto juego que obtuve del servicio

      this.vidas = juego.listaConfiguracionJuego[0].vidas//seteo la variable global vidas con la primera configuracion del juego que tengo en base de datos
      this.puntajeParaPasarNivel = juego.listaConfiguracionJuego[0].scoreMinimo//seteo la variable global puntajeParaPasarNivel con la primera configuracion del juego que tengo en base de datos
      
    });
    //Precarga de imagenes con su id para poder ocuparlo despues
    this.load.image("fondoboton", "assets/img/fondoboton.png");
      this.load.image("fondo", "assets/img/fondojuego1.png");
      this.load.image("body", "assets/img/body.png");
      this.load.image("head", "assets/img/head.png");
      this.load.image("title", "assets/img/title.png");

      this.load.image("html", "assets/img/html.png");
      this.load.image("html2", "assets/img/html2.png");

      this.load.image('piso', 'assets/img/platform.png');
      this.load.image('corazon', 'assets/img/corazon.png');
      this.load.image('bicho', 'assets/img/bicho.png');
      this.load.image('fondoWinner', 'assets/img/winner.png');
      this.load.image('fondoGameOver', 'assets/img/game-over.png');

      this.load.spritesheet("huevo", "assets/img/TAMA-RD.png", {
        frameWidth: 629,
        frameHeight: 369,
      });
      this.load.spritesheet("boton", "assets/img/jugar.png", {
        frameWidth: 629,
        frameHeight: 369,
      });


  }
//SEGUNDO METODO DE SCENE
  create() {//aqui vamos a crear las imagenes precargadas y las llamamos con su id
    this.fondoStart = this.add.image(1024 / 2, 720 / 2, "fondoboton").setScale(0.85);//aqui agrego y ajusto la imagen en el centro de la pantalla al dividirla por 2  y la referencio con el id de la foto.
    this.botonStart = this.add//aqui agrego y ajusto la imagen boton y cuando es apretado llamo a la funcion play(), cuando este es clickeado
      .sprite(1024 / 2, 650, "boton")//es por esto que esta la accion .on(pointerdown)
      .setInteractive()
      .on("pointerdown", () => this.play());

    this.ENTER = this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.ENTER);//aqui agrego la tecla enter para ser ocupada más adelante

  }

  colisionPlatform(objeto, platform) {//colision de objeto y plataforma(suelo)
    //console.log(objeto.texture)
    if (objeto.texture.key !== "bicho" && this.puntajeInt > 0) {//si objeto.texture.key(imagenesprecargadas(texturas) segun id) es distinto de "bicho" y el puntaje es mayor que 0 entonces voy a restar del puntaje -10 puntos

      this.puntajeInt -= 10;//resto -10 puntos
      this.puntajeText.setText("puntaje: " + this.puntajeInt);//seteo el puntaje actual 
    }
    objeto.destroy()//cuando colisiona los taghtml(imagen) con la plataforma destruyo el objeto para que desaparezca 
  }
//TERCER METODO DE SCENE
  update() {//Aqui se va a ejecutar todo el juego, en si el update esta en constante actualizacion
    if (this.juagando && !this.gameOver && !this.win && this.huevoTocaPiso) {//si jugando es verdadero y gameover es falso y win es falso y huevo es verdadero entonces
      this.cursors = this.input.keyboard.createCursorKeys();//creo los cursores de flecha para jugar
      if (this.cursors.left.isDown) {//si apreto el cursor flecha izquierda entonces
        this.vIzquierda += 20;//le voy aumentando en 20 la velocidad
        this.huevo.setVelocityX(this.vIzquierda * -1);//Lo multiplico por -1, ya que al irse hacia la izquierda queda con valores negativos, entonces asi puedo tener el valor en positivo
      } else if (this.cursors.right.isDown) {//Lo mismo pero hacia la derecha
        this.vDerecha += 20;//Lo mismo pero hacia la derecha
        this.huevo.setVelocityX(this.vDerecha);//Lo mismo pero hacia la derecha
      } else {
        this.vDerecha = 800;//reinicio la velocidad a la inicial
        this.vIzquierda = 800;//reinicio la velocidad a la inicial

          this.huevo.setVelocityX(0);

      }
      this.tiempoTerminoLetra = new Date();
      if (this.tiempoTerminoLetra.getTime() - this.tiempoInicioLetra.getTime() >= this.tiempoEsperaLetra) {
        this.tiempoInicioLetra = new Date();
        this.letras = this.physics.add.group({
          key: this.getEtiqueta(),
          repeat: 0,
          setXY: { x: Phaser.Math.Between(0, 900), y: 0 },
          setScale: { x: 0.3, y: 0.3 },
        });
        this.physics.add.collider(this.letras, this.platforms, this.colisionPlatform, undefined, this);
        this.physics.add.overlap(this.huevo, this.letras, this.collectLetras, undefined, this);

      }
      this.tiempoTerminoBicho = new Date();
      if (this.tiempoTerminoBicho.getTime() - this.tiempoInicioBicho.getTime() >= this.tiempoEsperaBicho) {
        this.tiempoInicioBicho = new Date();
        this.bichos = this.physics.add.group({
          key: "bicho",
          repeat: 0,
          setXY: { x: Phaser.Math.Between(0, 900), y: 0 },
          setScale: { x: 0.07, y: 0.07 },
        });
        this.physics.add.collider(this.bichos, this.platforms, this.colisionPlatform, undefined, this);

        this.physics.add.overlap(
          this.huevo,
          this.bichos,
          this.collectBichos,
          undefined,
          this
        );
      }
    } else {
      if (this.gameOver && this.ENTER.isDown) {


        this.scene.restart();
        this.gameOver = false;
        this.vidas = 3;
        this.fondoGameOver.visible = false;
        this.juagando = false;
        this.huevoTocaPiso = false;
        this.corazones = []

        this.scoreUsuario = {
          id:0,
          scoreRealizado:0,
          vidasUtilizadas:0,
          juego:{
            id:1
          },
          usuario:{
            id:1
          }
        }


      }
    }
  }

  play() {
    this.juagando = true;
    this.fondoStart.visible = false;
    this.fondoJuego = this.add.image(1024 / 2, 720 / 2, "fondo").setScale(0.5);
    this.botonStart.visible = false;

    this.platforms = this.physics.add.staticGroup();
    this.platforms.create(1024 / 2, 670, 'piso').setScale(0.5).refreshBody();

    let corazon = this.add.image(800, 40, "corazon").setScale(0.08);
    this.corazones.push(corazon);
    corazon = this.add.image(850, 40, "corazon").setScale(0.08);
    this.corazones.push(corazon);
    corazon = this.add.image(900, 40, "corazon").setScale(0.08);
    this.corazones.push(corazon);

    this.huevo = this.physics.add.sprite(400, 200, "huevo").setScale(0.3);

    this.huevo.setBounce(0.2);
    this.huevo.setCollideWorldBounds(true);

    this.physics.add.collider(this.huevo, this.platforms, this.colisionHuevoPlatform, undefined, this);



    this.puntajeText = this.add.text(16, 16, "puntaje: 0", {
      fontSize: "48px",
      stroke: "#000000",
      strokeThickness: 6,
    });
  }
  colisionHuevoPlatform(huevo, platform) {
    this.huevoTocaPiso = true;
  }

  collectLetras(huevo, letras) {
    letras.disableBody(true, true);
    this.puntajeInt += 10;
    this.puntajeText.setText("puntaje: " + this.puntajeInt);
    if (this.puntajeInt >= this.puntajeParaPasarNivel) {
      this.fondoWinner = this.add.image(1024 / 2, 720 / 2, "fondoWinner").setScale(0.3);
      this.physics.pause();
      this.win = true;
      this.scoreUsuario.scoreRealizado = this.puntajeInt;
      guardarScoreUsuario(this.scoreUsuario).then(()=>{
        console.log("score guardado con exito")

        setTimeout(() => {
          window.location.reload();
        }, 1000);
      });
    }
  }

  collectBichos(huevo, bichos) {
    bichos.disableBody(true, true);
    this.vidas -= 1;
    this.scoreUsuario.vidasUtilizadas +=1;
    if (this.vidas > 0) {
      this.corazones[this.vidas].visible = false;
    } else {
      this.corazones[this.vidas].visible = false;
      this.physics.pause();
      this.gameOver = true;
      this.fondoGameOver = this.add.image(1024 / 2, 720 / 2, "fondoGameOver").setScale(0.3);
      this.scoreUsuario.scoreRealizado = this.puntajeInt;
      guardarScoreUsuario(this.scoreUsuario).then(()=>{
        console.log("score guardado con exito")
      });

    }
    this.puntajeInt = 0;
    this.puntajeText.setText("puntaje: " + this.puntajeInt);
  }

  getEtiqueta() {
    var result = "";
    var etiquetas = ["body", "title", "head", "html", "html2"]
    result = etiquetas[Math.floor(Math.random() * etiquetas.length)];
    return result;
  }
}
