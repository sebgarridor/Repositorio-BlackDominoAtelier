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
    <link rel="stylesheet" href="assets/css/navbaryfooternew.css">
    <link rel="stylesheet" href="assets/css/home.css">
</head>

<body>
    <!-- Esto es el inicio del navbar-->
    <h6 class="noti">Env�o delivery - Starken</h6>
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

	<br>
  <div id="carouselExampleInterval" class="carousel slide" data-bs-ride="carousel">
    <div class="carousel-inner">
      <div class="carousel-item active" data-bs-interval="10000">
        <img src="assets/img/slider01img.jpg" class="d-block w-100" alt="...">
      </div>
      <div class="carousel-item" data-bs-interval="2000">
        <img src="assets/img/slider02img.jpg" class="d-block w-100" alt="...">
      </div>
      <div class="carousel-item">
        <img src="assets/img/slider03img.jpg" class="d-block w-100" alt="...">
      </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
    </button>
  </div>
  <br>
  <div class="seccionmedio">
    <h1>Destacados</h1>
    <br>
    <div class="container ">

      <div class="row">
        <div class="col">
          <div class="card">
            <img class="card-img-top" src="assets/img/destacados_1.jpeg" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">Totebag Eva-01</h5>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img class="card-img-top" src="assets/img/destacados_2.jpeg" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">Bandolera Akira</h5>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img class="card-img-top" src="assets/img/destacados_3.jpeg" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">Poler�n Misato Eva-01</h5>
            </div>
          </div>
        </div>
      </div>
    </div>
    <br>
    <br>

    <div class="container">
      <div class="row">
        <div class="col">
          <div class="card">
            <img class="card-img-top" src="assets/img/destacados_4.jpeg" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">Bandolera Eva-01</h5>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img class="card-img-top" src="assets/img/destacados_5.jpeg" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">Gen'ei Ryodan Tee</h5>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img class="card-img-top" src="assets/img/destacados_6.jpeg" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">Hisoka Tee</h5>
            </div>
          </div>
        </div>
      </div>
    </div>

  </div>
  <br>
  <div class="seccionmedio">
    <h1 style="text-align: center ;">Novedades</h1>
    <br>
    <div class="container ">

      <div class="row">
        <div class="col">
          <div class="card">
            <img class="card-img-top card_color" src="assets/img/Poleras sin fondo/AKIRA sin fondo1.png"
              alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">Akira Tee</h5>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img class="card-img-top card_color" src="assets/img/Poleras sin fondo/Chrollo Lucifer sin fondo.png"
              alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">Chrollo Lucifer Tee</h5>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img class="card-img-top card_color" src="assets/img/JUNJI sin fondo figma.png" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">Junji Ito Tee</h5>
            </div>
          </div>
        </div>
      </div>
    </div>
    <br>
    <br>

    <div class="container">
      <div class="row">
        <div class="col">
          <div class="card">
            <img class="card-img-top card_color" src="assets/img/poleron Dragonball.png" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">Poler�n Dragon Ball</h5>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img class="card-img-top card_color" src="assets/img/Bandolera EVA-01.png" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">Bandolera EVA-01</h5>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img class="card-img-top card_color" src="assets/img/poler�n Eren tit�n.png" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">Poler�n Eren Tit�n</h5>
            </div>
          </div>
        </div>
      </div>
    </div>
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