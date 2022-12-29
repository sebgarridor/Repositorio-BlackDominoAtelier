<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html lang="en">
    
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Bokor&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Zen+Kaku+Gothic+New:wght@300;400;500;700;900&display=swap"
            rel="stylesheet">
        <link
            href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap"
            rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Black Domino Atelier</title>
        <link rel="stylesheet" href="assets/css/navbaryfooternew.css">
        <link rel="stylesheet" href="assets/css/colecciones.css">
    </head>
    
    <body>
        <!-- Esto es el inicio del navbar-->
        <h6 class="noti">Env铆o delivery - Starken</h6>
        <header>
            <div>
                <img class="fotoprincipal" src="assets/img/Logo_Color_Png.png">
            </div>
        </header>
        <br>
    
    
    
         <nav class="navbar navbar-expand-lg fontbokor" id="fontsize">
            <div class="container">
                <button class="navbar-toggler" style="background-color: white;" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                    aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="nav">
    
                        <li class="nav-item">
                            <a class="margin_a" href="home">Inicio</a>
                        </li>
    
                        
    
    
                        <li class="nav-item" id="dropdown-productosresponsive">
                            <p>
                                <a class="margin_a" data-bs-toggle="collapse" href="#productos" role="button"
                                    aria-expanded="false" aria-controls="collapseExample">
                                    Productos
                                </a>
                            </p>
                            <div class="collapse fontbokor" id="productos">
                                <a href="poleras">Poleras</a><hr>
                                <a href="polerones_polo">Polerones polo</a><hr>
                                <a href="polerones_hoodie">Polerones canguro</a><hr>
                                <a href="totebags">Totebags</a><hr>
                                <a href="bandoleras">Bandoleras</a><br>
                                
                            </div>
                        </li>
    
                        <li class="nav-item" id="dropdown-productos">
                            <div>
                                <a class="margin_a" href="" data-bs-toggle="dropdown" aria-expanded="false">Productos</a>
    
                                <ul class="dropdown-menu drop">
    
                                    <div class="container">
    
                                        <div class="row" style="padding: 2rem;">
                                            <div class="col-3">
                                                <div class="card"
                                                    style="width: 15rem; border-radius: 0%; border-color: #202020;  ">
                                                    <a href="/poleras"><img class="card-img-top "
                                                            style="background-color: #202020;"
                                                            src="assets/img/JUNJI sin fondo figma.png"
                                                            alt="Card image cap"></a>
                                                    <div style="background-color:#2D2D2D;">
                                                        <h5 class="card-title fontZenKaku">Poleras<h5>
                                                    </div>
                                                </div>
                                            </div>
    
    
                                            <div class="col-3">
                                                <div class="card"
                                                    style="width: 15rem; border-radius: 0%; border-color: #202020; ">
                                                    <div class="hovercontainer" style="position: relative;">
                                                        <img class="card-img-top "
                                                        style="background-color: #202020;  height: 21rem;"" src="
                                                        assets/img/poler髇 Eren tit醤.png" alt="Card image cap" id="poleronesphoto">
                                                        <div id="botones">
                                                            <button class="fontZenKaku" id="primerboton" onclick="location.href = '/polerones_polo';">Polerones polo</button>
                                                            <button class="fontZenKaku" id="segundoboton" onclick="location.href = '/polerones_hoodie';">Polerones canguro</button>
                                                        </div>
    
                                                    </div>
    
                                                    <div style="background-color:#2D2D2D;">
                                                        <h5 class="card-title fontZenKaku">Polerones</h5>
                                                    </div>
                                                </div>
                                            </div>
    
                                            <div class="col-3">
                                                <div class="card"
                                                    style="width: 15rem; border-radius: 0%; border-color: #202020; ">
                                                    <img class="card-img-top "
                                                        style="background-color: #202020; height: 21rem;"
                                                        src="assets/img/Bandolera EVA-01.png" alt="Card image cap">
                                                    <div style="background-color:#2D2D2D;">
                                                        <h5 class="card-title fontZenKaku">Bandoleras</h5>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-3">
                                                <div class="card"
                                                    style="width: 15rem; border-radius: 0%; border-color: #202020; ">
                                                    <img class="card-img-top" style="background-color: #202020; "
                                                        src="assets/img/JUNJI sin fondo figma.png" alt="Card image cap">
                                                    <div style="background-color:#2D2D2D;">
                                                        <h5 class="card-title fontZenKaku">Totebags</h5>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </ul>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="margin_a" href="/colecciones">Colecciones</a>
                        </li>
                        <li class="nav-item">
                            <a class="margin_a" href="/comocomprar">Como Comprar</a>
                        </li>
                </div>
            </div>
        </nav>
    
        <!-- Esto es el fin del navbar-->
        <div class="seccionmedio">
            <h1 class="encabezado">Coleccion Naruto</h1>
            <br>
            <div class="container">
                <div class="row">
                    <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                        <div class="card">
                            <img class="card-img-top card_color" src="assets/img/Poleras sin fondo/Naruto SF.png" alt="Polera Naruto">
                        </div>
                        <div class="product_card_body my-3">
                            <h5 class="card-title product_title">Naruto Tee</h5>
                            <h6 class="product_price my-2">$10.000 CLP</h6>
                            <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                        </div>
                    </div>
                    <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                        <div class="card">
                            <img class="card-img-top card_color" src="assets/img/Poleras sin fondo/Obito SF.png" alt="Polera Obito">
                        </div>
                        <div class="product_card_body my-3">
                            <h5 class="card-title product_title">Obito Tee</h5>
                            <h6 class="product_price my-2">$10.000 CLP</h6>
                            <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                        </div>
                    </div>
                    <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                        <div class="card">
                            <img class="card-img-top card_color" src="assets/img/Polerones polo/Poleron Naruto.png" alt="Card image cap">
                        </div>
                        <div class="product_card_body my-3">
                            <h5 class="card-title product_title">Poler贸n Polo Naruto</h5>
                            <h6 class="product_price my-2">$20.000 CLP</h6>
                            <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                        </div>
                    </div>
                    <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                        <div class="card">
                            <img class="card-img-top card_color" src="assets/img/Polerones polo/poler贸n Obito.png" alt="Card image cap">
                        </div>
                        <div class="product_card_body my-3">
                            <h5 class="card-title product_title">Poler贸n Polo Obito</h5>
                            <h6 class="product_price my-2">$20.000 CLP</h6>
                            <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                        </div>
                    </div>
                    <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                        <div class="card">
                            <img class="card-img-top card_color" src="assets/img/Hoodies/poler贸n Canguro Naruto.png" alt="Card image cap">
                        </div>
                        <div class="product_card_body my-3">
                            <h5 class="card-title product_title">Poler贸n Canguro Naruto</h5>
                            <h6 class="product_price my-2">$23.000 CLP</h6>
                            <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                        </div>
                    </div>
                    <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                        <div class="card">
                            <img class="card-img-top card_color" src="assets/img/Hoodies/poler贸n Canguro Obito.png" alt="Card image cap">
                        </div>
                        <div class="product_card_body my-3">
                            <h5 class="card-title product_title">Poler贸n Canguro Obito</h5>
                            <h6 class="product_price my-2">$23.000 CLP</h6>
                            <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                        </div>
                    </div>
                    
                </div>
            </div>
    
        <!--Inicio Footer-->
        <footer class="footer">
            <div class="container">
                <div class="row">
                    <div class="footer-col" id="logofooter">
                        <img class="imgconfig" src="./assets/img/Symbol_White_135px.png" alt="">
                        <div class="rrss">
                            <a href=""><img class="imgconfig" src="./assets/img/iconmail.png" alt=""></a>
                            <a href="https://www.instagram.com/blackdomino.atelier/"><img class="imgconfig"
                                    src="./assets/img/instagramIcon.png" alt="ig logo"></a>
                            <a href="https://www.facebook.com/people/Blacky-Domino/100079510762644/"><img
                                    class="imgconfig" src="./assets/img/facebookicon.png" alt="fb logo"></a>
                        </div>
                    </div>
                    <div class="footer-col">
                        <h5 class="FT">Sobre Nosotros</h5>
                        <p>Las mejores serigraf铆as <br> desde 2013.</p>
                    </div>
                    <div class="footer-col">
                        <h5>Ayuda</h5>
                        <p>
                            <a href="/preguntasfrecuentes">Preguntas frecuentes</a><br>
                            <a href="/comocomprar">C贸mo comprar</a><br>
                            <a href="/Tallaje">Tallaje</a><br>
                        </p>
                    </div>
                    <div class="footer-col">
                        <h5 class="FT">Horario</h5>
                        <p><b>Lunes a Viernes</b> <br> 11:30 hrs.<br>
                            <b>S谩bado</b> <br> 11:00 a 16:00 hrs.
                        </p>
                    </div>
                    <div class="footer-col">
                        <h5 class="FT">Productos</h5>
                        <p>
                            <a href="/bandoleras"> Bandoleras</a><br>
                            <a href="/totebag"> Totebags</a><br>
                            <a href="/poleras"> Poleras</a><br>
                            <a href="/polerones"> Polerones</a><br>
                            <a href="/colecciones"> Colecciones</a>
                        </p>
                    </div>
                    <div class="footer-col" id="metodosdepago">
                        <img class="imgconfig" src="./assets/img/webpay.png" alt="webpay" style="width: 9rem;"> <br>
                        <img class="imgconfig" src="./assets/img/khipu.png" alt="khipu">
                    </div>
                    <div class="footer-col" id="logofooter2">
                        <div class="rrss">
                            <a href=""><img class="imgconfig" src="./assets/img/iconmail.png" alt=""></a>
                            <a href="https://www.instagram.com/blackdomino.atelier/"><img class="imgconfig"
                                    src="./assets/img/instagramIcon.png" alt="ig logo"></a>
                            <a href="https://www.facebook.com/people/Blacky-Domino/100079510762644/"><img
                                    class="imgconfig" src="./assets/img/facebookicon.png" alt="fb logo"></a>
                        </div>
                    </div>
                </div>
            </div>

        </footer>
    
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
    </body>
    
    </html>    