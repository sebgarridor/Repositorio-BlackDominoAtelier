<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
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
    <link rel="stylesheet" href="assets/css/exitotarjeta.css">
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
	  <br><br><br><br><br>
    <div class="container" id="divcentral">
        <div class="container" id="estadocompra">
            <h4><span>Carro > Proceso de pago > Revisión del pedido > </span><strong> Éxito</strong>  </h4>
        
        </div>
        <div class="container" id="gracias" style="margin-top: 3rem;">
            <p style="text-align: left;">Pedido #xxxxx</p>
            <h4 style="text-align: left; margin-top: -1rem;">Gracias {nombrecliente} por tu compra!</h4>
        </div>
        <div class="card" style="width: 100; margin-top: 3rem; margin-bottom: 4rem;">
            <div class="card-body">
                <h5 class="card-text" style="text-align: left;">¡Estamos muy contentos de que hayas comprado en Black
                    Domino Atelier!</h5>
                <p style="text-align: left;">Una vez tu compra sea procesada por nosotros comenzaremos con el proceso de
                    confección de tu pedido. Debes tener en cuenta de que este periodo puede tomar hasta una semana
                    dependiendo de qué tan grande sea el pedido. Si tienes alguna duda con respecto al tiempo de
                    confección no dudes en escribirnos a nuestro Instagram (@blackdominoatelier)
                    o a nuestro mail (blackdominoatlier@gmail.com).
                </p>
                <p style="text-align: left;">Con respeto al envío: si elegiste un método de envío a domicilio o sucursal
                    de retiro, te enviaremos a tu mail un código de seguimiento cuando hayamos enviado el pedido.</p>
                <p style="text-align: left;">Si elegiste el método de retiro en metro Ciudad del Niño, nos pondremos en
                    contacto contigo para coordinar el día y el horario para que puedas pasar a retirar tu(s)
                    productos(s).</p>
            </div>
            <div class="card-body">
                <h4 style="text-align: left; color: #92478C; margin-bottom: 2rem;">Resumen de tu compra</h4>
                <div class="container text-center">
                    <div class="row" id="fila1">
                        <div class="col">
                            <p>Producto</p>
                        </div>
                        <div class="col">

                        </div>
                        <div class="col">
                            <p>Cantidad</p>
                        </div>
                        <div class="col">
                            <p>Precio unitario</p>
                        </div>
                        <div class="col">
                            <p>Subtotal</p>
                        </div>

                    </div>
                    <div class="row" id="fila2">
                        <div class="col">
                            <img src="/assets/img/Poleras sin fondo/AKIRA sin fondo1.png" alt="Card image cap"
                                style="width: 5rem;">
                        </div>
                        <div class="col">
                            <p style="margin-bottom: 0.05rem; margin-top: 1rem; color:#92478C ;">Akira Tee</p>
                            <p style="margin-bottom: 0.05rem;">Talla: M</p>
                            <p>Manga corta</p>

                        </div>
                        <div class="col">
                            <p style="margin-top:2.5rem;">1</p>
                        </div>
                        <div class="col">
                            <p style="margin-top:2.5rem;">$10.000CLP</p>
                        </div>
                        <div class="col">
                            <p style="margin-top:2.5rem;">$10.000CLP</p>
                        </div>
                    </div>
                    <div class="row" id="fila2">
                        <div class="col">
                            <img src="/assets/img/Polerones polo/Poleron Naruto.png" alt="Card image cap"
                                style="width: 5rem;">
                        </div>
                        <div class="col">
                            <p style="margin-bottom: 0.05rem; margin-top: 1rem; color:#92478C ;">Polerón polo Naruto</p>
                            <p style="margin-bottom: 0.05rem;">Talla: XL</p>
                            

                        </div>
                        <div class="col">
                            <p style="margin-top:2.5rem;">2</p>
                        </div>
                        <div class="col">
                            <p style="margin-top:2.5rem;">$10.000CLP</p>
                        </div>
                        <div class="col">
                            <p style="margin-top:2.5rem;">$20.000CLP</p>
                        </div>
                    </div>

                </div>
            </div>
            <hr>
            <div class="container" id="totalcompra">
                <h4>Total de tu compra incluyendo envío</h4>
                <p>$30.000CLP</p>
            </div>
            <hr>
            <div class="card-body">
                <h4 style="text-align: left; color: #92478C; margin-bottom: 2rem;">Información del cliente</h4>
                <div class="container">
                    <div class="row">
                      <div class="col" style="text-align: left;">
                        <h5>Información de contacto</h5>
                        <p>sebgarridor@gmail.com</p>
                      </div>
                      <div class="col" style="text-align: left;">
                        <h5>Método de pago</h5>
                        <p>Pago Webpay - <b>$30.000CLP</b></p>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col" style="text-align: left;">
                        <h5>Dirección de envío</h5>
                        <p>Sebastián Garrido</p>
                        <p  style="margin-top: -0.8rem;">Alameda 123</p>
                        <p style="margin-top: -0.8rem;">Santiago, RM</p>
                        <p style="margin-top: -0.8rem;">9 3531 7521</p>
                      </div>
                      <div class="col" style="text-align: left;">
                        <h5>Dirección de facturación</h5>
                        <p>Sebastián Garrido</p>
                        <p style="margin-top: -0.8rem;">Alameda 123</p>
                        <p style="margin-top: -0.8rem;">Santiago, RM</p>
                        <p style="margin-top: -0.8rem;">9 3531 7521</p>

                      </div>

                    </div>
                    <div class="col" style="text-align: left;">
                        <h5>Método de envío</h5>
                        <p>Retiro en Metro Ciudad del Niño</p>
                      </div>
                    </div>
                  </div>
                
            </div>
            

        </div>

    </div>

	

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