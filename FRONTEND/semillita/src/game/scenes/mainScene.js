import { Scene } from "phaser";

import Phaser from "phaser";
import { getJuegoById, guardarScoreUsuario } from "../../services/JuegoService";

export default class MainScene extends Scene {
  constructor() {
    super({ key: "MainScene" });

  }

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

  preload() {

    this.juego = getJuegoById(1).then((data) => {
      console.log(data)
      this.juego = data;

      this.vidas = data.listaConfiguracionJuego[0].vidas
      this.puntajeParaPasarNivel = data.listaConfiguracionJuego[0].scoreMinimo
      
    });
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

  create() {
    this.fondoStart = this.add.image(1024 / 2, 720 / 2, "fondoboton").setScale(0.85);
    this.botonStart = this.add
      .sprite(1024 / 2, 650, "boton")
      .setInteractive()
      .on("pointerdown", () => this.play());

    this.ENTER = this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.ENTER);


  }

  colisionPlatform(objeto, platform) {
    //console.log(objeto.texture)
    if (objeto.texture.key !== "bicho" && this.puntajeInt > 0) {

      this.puntajeInt -= 10;
      this.puntajeText.setText("puntaje: " + this.puntajeInt);
    }
    objeto.destroy()
  }

  update() {
    if (this.juagando && !this.gameOver && !this.win && this.huevoTocaPiso) {
      this.cursors = this.input.keyboard.createCursorKeys();
      if (this.cursors.left.isDown) {
        this.vIzquierda += 20;
        this.huevo?.setVelocityX(this.vIzquierda * -1);
      } else if (this.cursors.right.isDown) {
        this.vDerecha += 20;
        this.huevo?.setVelocityX(this.vDerecha);
      } else {
        this.vDerecha = 800;
        this.vIzquierda = 800;
        if (this.huevo) {
          this.huevo.setVelocityX(0);

        }
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
