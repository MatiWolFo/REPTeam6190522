<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <script src="../js/phaser.js"></script>
    <meta charset="UTF-8">
    <title>PAGINA INICIO PRUEBA BABYDnD</title>
</head>
<body>
<script type="text/javascript">
    var canasta;
    var plaforms;
    var cursors;
    var letras;
    var score = 0;
    var scoreText;
    var config = {
        type: Phaser.AUTO,
        width: 1366,
        height: 768,
        physics: {
            default: 'arcade',
            arcade: {
                gravity: {y: 300},
                debug: false
            }
        },
        scene: {
            preload: preload,
            create: create,
            update: update
        }
    };

    var game = new Phaser.Game(config);

    function preload() {
        this.load.image('fondoboton', 'images/fondoboton.jpg');
        this.load.image('fondo', 'images/fondo.png');
        this.load.image('a', 'images/A.png');
        this.load.image('e', 'images/E.png');
        this.load.image('i', 'images/I.png');
        this.load.image('o', 'images/O.png');
        this.load.image('u', 'images/U.png');
        this.load.spritesheet('canasta', 'images/canasta.png',
            {frameWidth: 629, frameHeight: 369}
        );
        this.load.spritesheet('boton', 'images/boton.png',
            {frameWidth: 629, frameHeight: 369}
        );

    }

    var buttonplay;
    var fondoboton;
    var fondo;
    var playGame = false;

    function create() {

        fondoboton = this.add.image(1366 / 2, 768 / 2, 'fondoboton');
        buttonplay = this.add.sprite(1366 / 2, 768 / 2, 'boton')
            .setScale(0.5)
            .setInteractive()
            .on('pointerdown', () => play(this))
            .on('pointerup', () => buttonplay.setScale(0.5))

    }

    function play(that) {
        playGame = true;
        fondoboton.visible = false;
        fondo = that.add.image(1366 / 2, 768 / 2, 'fondo');

        buttonplay.visible = false;

        platforms = that.physics.add.staticGroup();

        canasta = that.physics.add.sprite(400, 690, 'canasta');
        canasta.setScale(0.5);

        canasta.setBounce(0.2);
        canasta.setCollideWorldBounds(true);

        scoreText = that.add.text(16, 16, 'puntaje: 0', {
            fontSize: '48px',
            fill: '#fff',
            stroke: '#000000',
            strokeThickness: 6
        });


    }

    function collectLetras(canasta, letras) {
        letras.disableBody(true, true);
        score += 10;
        scoreText.setText('puntaje: ' + score);
    }

    var vDerecha = 800;
    var vIzquierda = 800;
    var tiempoInicio = new Date();
    var tiempoTermino = new Date();

    function getLetra() {
        var result = '';
        var characters = 'aeiou';
        var charactersLength = characters.length;
        result = characters.charAt(Math.floor(Math.random() * charactersLength));
        return result;
    }

    function update() {

        if (playGame) {
            cursors = this.input.keyboard.createCursorKeys();
            if (cursors.left.isDown) {
                vIzquierda += 20;
                canasta.setVelocityX(vIzquierda * -1);


            } else if (cursors.right.isDown) {
                vDerecha += 20;
                canasta.setVelocityX(vDerecha);

            } else {
                vDerecha = 800;
                vIzquierda = 800;
                canasta.setVelocityX(0);
            }
            tiempoTermino = new Date();
            if (tiempoTermino.getTime() - tiempoInicio.getTime() >= 1000) {
                tiempoInicio = new Date();
                letras = this.physics.add.group({
                    key: getLetra(),
                    repeat: 0,
                    setXY: {x: Phaser.Math.Between(0, 1366), y: 0},
                    setScale: {x: 0.5, y: 0.5}
                });
                this.physics.add.overlap(canasta, letras, collectLetras, null, this);
            }
        }

    }

</script>

</body>
</html>