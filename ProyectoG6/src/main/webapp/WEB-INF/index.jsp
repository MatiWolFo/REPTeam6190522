<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Kids D&D</title>
            <!--Referencias fuente-->
            <link rel="preconnect" href="https://fonts.googleapis.com">
            <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
            <link href="https://fonts.googleapis.com/css2?family=Press+Start+2P&display=swap" rel="stylesheet">
            <!--Referencia bootstrap-->
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
            <!--Coneccion con css-->
            <link rel="stylesheet" href="style.css">
        </head>

        <body>
            <header>
                <!--banner?-->
                <div class="nompag">
                    <a class="aimg" href="index.html">
                        <img class="img" src="public/pixil-frame-0 (3).png" alt="neko">
                    </a>
                    <div class="kd">
                        <h1 class="k">K</h1>
                        <h1 class="i">i</h1>
                        <h1 class="d">d</h1>
                        <h1 class="s">s</h1>
                        <h1 class="D1">D</h1>
                        <h1 class="y">&</h1>
                        <h1 class="D2">D</h1>
                    </div>
                </div>
                <!--navbar-->
                <nav>
                    <ul class="nav nav-pills">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="index.html">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="pages/Nosotros.html"> ¿Quienes somos?</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="pages/contacto.html">Contacto</a>
                        </li>
                    </ul>
                    <!--ver como hacer que queden en la misma linea, por ahora queda asi-->
                    <ul class="nav justify-content-end">
                        <li class="nav-item">
                            <a class="nav-link" href="pages/registro.html">Registro</a>
                        </li>
                        <li class="nav justify-content-end">
                            <a class="nav-link" href="pages/iniciarSesion.html">Iniciar Sesión</a>
                        </li>
                    </ul>
                </nav>
            </header>
            <!--Cuerpo de pagina-->
            <main>
                <section>
                </section>
            </main>
            <!--Pie de pagina-->
            <footer>
                <div class="foot">
                    <a href="https://www.instagram.com"><img class="img-ig" src="public/ig.png" alt="ig"></a>
                    <a href="https://www.Facebook.com"><img class="img-fb" src="public/fb.png" alt="fb"></a>
                    <a href="https://twitter.com"><img class="img-tw " src="public/tw.png" alt="tw"></a>
                    <br> Generation 2022
                </div>
            </footer>
        </body>

        </html>