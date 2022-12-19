<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">

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
    <link rel="stylesheet" href="assets/css/navbarYfooter.css">
    <link rel="stylesheet" href="assets/css/colecciones.css">
</head>

<body>
    <!-- Esto es el inicio del navbar-->
    <h6 class="noti">Envío delivery - Starken</h6>
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
                        <a class="margin_a" href="/home">Inicio</a>
                    </li>
                    <li class="nav-item">
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
                                                <a href="/polerones"> <img class="card-img-top "
                                                        style="background-color: #202020;" src="assets/img/polerón Eren titán.png" alt="Card image cap">
                                                    <div style="background-color:#2D2D2D;">
                                                </a>
                                                <h5 class="card-title fontZenKaku">Polerones</h5>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-3">
                                        <div class="card"
                                            style="width: 15rem; border-radius: 0%; border-color: #202020; ">
                                            <a href="/bandoleras"> <img class="card-img-top "
                                                    style="background-color: #202020;"
                                                    src="assets/img/Bandolera EVA-01.png" alt="Card image cap"></a>
                                            <div style="background-color:#2D2D2D;">
                                                <h5 class="card-title fontZenKaku">Bandoleras</h5>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-3">
                                        <div class="card"
                                            style="width: 15rem; border-radius: 0%; border-color: #202020; ">
                                            <a href="/totebag"><img class="card-img-top"
                                                    style="background-color: #202020; "
                                                    src="assets/img/JUNJI sin fondo figma.png" alt="Card image cap">
                                                <div style="background-color:#2D2D2D;">
                                            </a>
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
	<div class="container ">
        <div class="row">

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/Poleron Akira.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Akira Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Chrollo lucifer.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Chrollo Lucifer Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/Poleron Dazai Osamu.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Dazai Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/Poleron DEDEDE.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">DEDEDE Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/Poleron Dragon Ball Z.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Dragon Ball Z Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/Poleron Eren Titán.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Eren Titán Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>
            
            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/Poleron EVA-01.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">EVA-01 Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón FEMTO.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Femto Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Fireforce.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Fire Force Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Fushiguro.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Fushiguro Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Gate FMA.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">FMA Gate Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Genei Ryodan.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Gen'ei Ryoda Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Griffith.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Griffith Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>
            
            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Gyutaro.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Gyutaro Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Hisoka.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Hisoka Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/Poleron Junji Ito.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Junji Ito Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Kaneda.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Kaneda Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Kaneki.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Kaneki Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Killua.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Killua Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Maka.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Maka Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Marin.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Marin Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Mieruko.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Mieruko Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Mikasa.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Mikasa Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Misato.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Misato Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Mob Pyscho.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Mob Psycho 100 Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/Poleron Naruto.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Naruto Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Nobara.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Nobara Kugisaki Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Obito.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Obito Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Punpun.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Punpun Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Shinji Bleach.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Shinji Hirako Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

            <div class="col-sm-12 col-md-6 col-lg-4 my-5">
                <div class="card">
                    <a class="imagenLink" href="/descripcionproducto.html"><img class="card-img-top card_color"
                            src="assets/img/Polerones polo/polerón Uzui.png" alt="Card image cap"></a>
                </div>
                <div class="product_card_body my-3">
                    <h5 class="card-title product_title">Uzui Poleron Polo</h5>
                    <h6 class="product_price my-2">$28.990</h6>
                    <a class="btn btn-primary px-5 option_btn">Ver Opciones</a>
                </div>
            </div>

        </div>
    </div>
    <br>
    <br>
    </div>
    <br>

    <!--Inicio Footer-->
    <footer class="escritorio">
        <div class="logo footer_bloques">
            <img class="imgconfig" src="./assets/img/Symbol_White_135px.png" alt="">
            <div class="rrss">
                <a href=""><img class="imgconfig" src="./assets/img/iconmail.png" alt=""></a>
                <a href="https://www.instagram.com/blackdomino.atelier/"><img class="imgconfig"
                        src="./assets/img/instagramIcon.png" alt="ig logo"></a>
                <a href="https://www.facebook.com/people/Blacky-Domino/100079510762644/"><img class="imgconfig"
                        src="./assets/img/facebookicon.png" alt="fb logo"></a>
            </div>
        </div>

        <div class="footer_bloques">
            <h5 class="FT">Sobre Nosotros</h5>
            <p>Las mejores serigrafías <br> desde 2013.</p>
        </div>
        <div class="footer_bloques">
            <h5>Ayuda</h5>
            <p>
                <a href="/preguntasfrecuentes">Preguntas frecuentes</a><br>
                <a href="/comocomprar">Cómo comprar</a><br>
                <a href="/tallaje">Tallaje</a><br>
            </p>
        </div>
        <div class="footer_bloques">
            <h5 class="FT">Horario</h5>
            <p><b>Lunes a Viernes</b> <br> 11:30 hrs.<br>
                <b>Sábado</b> <br> 11:00 a 16:00 hrs.
            </p>
        </div>
        <div class="footer_bloques">
            <h5 class="FT">Productos</h5>
            <p>
                <a href="/bandoleras"> Bandoleras</a><br>
                <a href="/totebag"> Totebags</a><br>
                <a href="/poleras"> Poleras</a><br>
                <a href="polerones"> Polerones</a><br>
                <a href="/colecciones"> Colecciones</a>
            </p>
        </div>
        <div class="footer_bloques">
            <img class="imgconfig" src="./assets/img/webpay.png" alt="webpay"> <br>
            <img class="imgconfig" src="./assets/img/khipu.png" alt="khipu">
        </div>
    </footer>
    <div>
        <h6 class="noti">©2022 Squirr3l - Todos los derechos reservados </h6>
    </div>
    <!--Fin Footer-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>

</html>