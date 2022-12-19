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
    <link rel="stylesheet" href="assets/css/comocomprar.css">
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
    <div class="container-fluid">
      <h1 class="fontbokor">Como Comprar</h1>
      <img id="logoblanco" src="assets/img/Symbol_White_Png.png" alt="logo">
      <br><br>
      <p>Absolutamente todos los productos publicados son realizados de manera manual y a pedido, por tanto, al
        momento de confirmar tu compra se comenzará la confección del producto.</p>
    </div>
    <br><br><br><br><br>

    <div class="container">
      <h1 class="fontbokor">Metodos de Pago</h1>
      <br><br><br><br>
      <h3 class="text-start">Crédito/Débito</h3>
      <br><br>
      <p>El pago de los productos es posible realizarlos a través de Webpay, Flow y Khipu (?). Dentro de estos
        sitios podrás realizar la compra con tarjetas de crédito y débito emitidas por bancos nacionales, además
        de tarjetas prepago como MACH.</p>
      <br><br>
      <h3 class="text-start">Transferencia Eléctronica</h3>
      <br><br>
      <p>Además, también está habilitado el sistema de transferencia electrónica. Al finalizar tu compra y haber
        elegido el método de pago, se te entregarán los datos para realizar el pago. Después de haber realizado
        la transferencia, escríbenos a blackdominoatelier@gmail.com o a nuestro Instagram para que confirmemos
        el depósito y así comenzar con la confección de la prenda.</p>
      <br><br>
    </div>
    <br><br><br><br><br>
    <div class="container">
      <h1>Envios</h1>
      <br><br><br><br>
      <p>Por el momento, nuestros envíos son realizados a través de Starken dentro y fuera de la Región
        Metropolitana. Sin embargo, también está disponible la opción para coordinar una entrega en la estación
        de metro Ciudad del Niño. Si optas por este método, escríbenos a nuestro Instagram o mail para coordinar
        el día y horario de entrega de tu producto.</p>
      <p>Si elegiste el envío a través de Starken, tienes que considerar que el costo de envío viene generado en
        el total de la compra. Una vez confeccionada y enviada tu prenda, te enviaremos un código para el
        seguimiento del envío. Ojo, considera el tiempo de confección de cada prenda que suele tomar entre 5 a 7
        días.</p>
    </div>
  </div>
  <br><br><br><br><br><br><br><br><br><br>
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