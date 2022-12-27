<%@ page language="java" contentType="text/html; charset=UTF-8"
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
    <link rel="stylesheet" href="assets/css/navbaryfooternew.css">
    <link rel="stylesheet" href="assets/css/preguntasfrecuentes.css">
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
            <button class="navbar-toggler" style="background-color: white;" type="button"
                data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
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
                            <a href="poleras">Poleras</a>
                            <hr>
                            <a href="polerones_polo">Polerones polo</a>
                            <hr>
                            <a href="polerones_hoodie">Polerones canguro</a>
                            <hr>
                            <a href="totebags">Totebags</a>
                            <hr>
                            <a href="bandoleras">Bandoleras</a><br>
    
                        </div>
                    </li>
    
                    <li class="nav-item" id="dropdown-productos">
                        <div>
                            <a class="margin_a" href="" data-bs-toggle="dropdown"
                                aria-expanded="false">Productos</a>
    
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
                                                        assets/img/polerón Eren titán.png" alt="Card image cap"
                                                        id="poleronesphoto">
                                                    <div id="botones">
                                                        <button class="fontZenKaku" id="primerboton"
                                                            onclick="location.href = '/polerones_polo';">Polerones
                                                            polo</button>
                                                        <button class="fontZenKaku" id="segundoboton"
                                                            onclick="location.href = '/polerones_hoodie';">Polerones
                                                            canguro</button>
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
                                                    src="assets/img/JUNJI sin fondo figma.png"
                                                    alt="Card image cap">
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
 <br><br><br><br><br>
  <div class="container" id="divcentral">
    <div class="container-fluid">
      <h1 class="fontbokor">Preguntas Frecuentes</h1>
      <img id="logoblanco" src="assets/img/Symbol_White_Png.png" alt="logo">
      <br><br>
      <p>Nunca está de más aclarar las dudas más consultadas por nuestros clientes, si tienes otra pregunta que no
        aparece aquí no dudes en preguntarnos directamente a nuestro Instagram @blackdomino.atelier o a nuestro correo
        blackdominoatelier@gmail.com</p>
    </div>
    <br><br><br><br><br>

    <div class="container">
      <br><br><br><br>
      <h3 class="text-start">¿Qué técnica utilizan para estampar?</h3>
      <br><br>
      <p>Para estampar nuestras poleras usamos la técnica artesanal de serigrafía. Utilizamos pintura al agua sobre
        poleras 100% algodón.</p>
      <br><br>
      <h3 class="text-start">¿Hacen diseños a pedido?</h3>
      <br><br>
      <p>No, actualmente sólo trabajamos en base a un catálogo que puedes encontrar en la sección ‘Productos’ y
        ‘Colecciones’.</p>
      <br><br>
      <h3 class="text-start">Me equivoqué de talla, ¿Qué puedo hacer?</h3>
      <br><br>
      <p>Tienes un plazo de 10 días desde que recibes el producto para realizar el cambio. Esto aplica siempre y cuando
        esté nuevo, en impecables condiciones y en su respectivo empaque. Para hacer efectiva la devolución, contáctanos
        a través de nuestro Instagram o correo electrónico.</p>
      <br><br>
      <h3 class="text-start">¿Cuánto se demora mi pedido online?</h3>
      <br><br>
      <p>Al recibir el comprobante de transferencia tu pedido se demora entre 5 a 7 días háblies para el envío o entrega
        en metro.</p>
      <br><br>
      <h3 class="text-start">¿Hacen pedidos por mayor?</h3>
      <br><br>
      <p>Actualmente tenemos cupos disponibles para compras por mayor. Envíanos un correo a blackdominoatelier@gmail.com
        para más información.</p>
      <br><br>
      <h3 class="text-start">¿Trabajan con stock?</h3>
      <br><br>
      <p>No, gran parte de nuestros productos se realizan en base a pedido, a excepción de poleras con entrega inmediata
        que pueden ser publicadas a través de nuestro Instagram.</p>
      <br><br>
      <h3 class="text-start">¿Trabajan con tallas más grandes?</h3>
      <br><br>
      <p>Sí, trabajamos con tallas grandes como 2XL - 3XL para nuestras poleras. Sin embargo, estas tallas tienen un
        valor adicional de $2000CLP por prenda.</p>
      <br><br>

    </div>
    <br><br><br><br><br>
  </div>
  <br>

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
                    <p>Las mejores serigrafías <br> desde 2013.</p>
                </div>
                <div class="footer-col">
                    <h5>Ayuda</h5>
                    <p>
                        <a href="/preguntasfrecuentes">Preguntas frecuentes</a><br>
                        <a href="/comocomprar">Cómo comprar</a><br>
                        <a href="/Tallaje">Tallaje</a><br>
                    </p>
                </div>
                <div class="footer-col">
                    <h5 class="FT">Horario</h5>
                    <p><b>Lunes a Viernes</b> <br> 11:30 hrs.<br>
                        <b>Sábado</b> <br> 11:00 a 16:00 hrs.
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
    <!--Fin Footer-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>

</html>