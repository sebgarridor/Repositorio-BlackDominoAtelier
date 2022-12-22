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
    <title>Descripción producto</title>
    <link rel="stylesheet" href="assets/css/navbarYfooter.css">
    <link rel="stylesheet" href="assets/css/descripcionproducto.css">
    <!--  <link rel="stylesheet" href="assets/js/jquery.js">-->
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
	 <div class="row align-items-center">
    <div class="col">
      <img id="imagenproducto" src="/assets/img/Poleras sin fondo/AKIRA sin fondo1.png" alt="foto">
    </div>
    <div class="col">
      <!-- *TEXTO -->
      <div class="texto">
        <h1 class="textleft destacado">Akira Tee</h1>
        <h4 class="textleft">$10.000 CLP</h4>
        <h5 class="textleft">Descripción</h5>
        <p class="textleft">Polera negra talla a elección, estampada a través de los métodos artesanales
          serigrafía.
        <p>Manga larga +$3.000 CLP</p>
        <p>Tallas 2XL - 3XL: +$2000 CLP</p>

        </p>
      </div>

      <!-- * SELECTOR POLERA -->
      <form action="/productoscarrito" method="post">
      <div class="texto">
        <h4 class="textleft">Tipo polera</h4>
        <select class="form-select" aria-label="lista de categorias" name="categoria">
          <option selected>Seleccione el tipo de polera</option>
          <c:forEach var="categoria" items="${listaSelCategoria}">
		<option value="${categoria.id}">${categoria.producto}</option>
		</c:forEach>
        </select>
      </div>
      <br>
      <!-- * SELECTOR TALLA -->
      <div class="texto">
        <h4 class="textleft">Talla</h4>
        <select class="form-select" aria-label="lista de tallas" name="tallaje">
          <option selected>Seleccione la talla</option>
          	<c:forEach var="tallaje" items="${listaSelTallaje}">
			<option value="${tallaje.id}">${tallaje.talla}</option>
			</c:forEach>
        </select>
      </div>
      <br><br>

      <!-- *CONTADOR -->
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"
        integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w=="
        crossorigin="anonymous" />
      <!-- *DIV QUE CONTIENE CONTADOR Y BUTTON -->
      <div id="contadorYbutton">
        

        <!-- * BOTON AÑADIR AL CARRO -->
        <div>
         <button type="submit" id="carroboton">Añadir al carro</button>
          </form>
          
          <div class="number-input texto">
          <button onclick="this.parentNode.querySelector('input[type=number]').stepDown()" class="minus"></button>
          <input class="quantity" id="bordecontador" min="1" name="quantity" value="1" type="number">
          <button onclick="this.parentNode.querySelector('input[type=number]').stepUp()" class="plus"></button>
        </div>
        </div>
      </div>

    </div>
  </div>
  <br><br><br><br><br>
  <!-- *SECCIÓN DESTACADOS -->
  <h3 class="destacado text-center">También te puede interesar</h3>

  <!-- *CARRUSEL -->
  <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
    <div class="carousel-inner">
      <div class="carousel-item active">
        <div class=" flexdisplay">
          <div class="text-center">
            <img class="carruselimg d-block" src="assets/img/Poleras sin fondo/AKIRA sin fondo1.png" alt="foto">
            <h3 class="destacado">Akira</h3>
            <h5>$10.000 CLP</h5>
            <button id="carroboton">Ver opciones</button>
          </div>
          <div class="text-center">
            <img class="carruselimg d-block" src="assets/img/Bandolera EVA-01.png" alt="foto">
            <h3 class="destacado">Eva</h3>
            <h5>$10.000 CLP</h5>
            <button id="carroboton">Ver opciones</button>
          </div>
          <div class="text-center">
            <img class="carruselimg d-block" src="assets/img/Poleras sin fondo/Chrollo Lucifer sin fondo.png"
              alt="foto">
            <h3 class="destacado">Chrollo Lucifer</h3>
            <h5>$10.000 CLP</h5>
            <button id="carroboton">Ver opciones</button>
          </div>

        </div>
      </div>
      <div class="carousel-item">
        <div class="flexdisplay">
          <div class="text-center">
            <img class="carruselimg d-block" src="assets/img/JUNJI sin fondo figma.png" alt="foto">
            <h3 class="destacado">Junji</h3>
            <h5>$10.000 CLP</h5>
            <button id="carroboton">Ver opciones</button>
          </div>
          <div class="text-center">
            <img class="carruselimg d-block" src="assets/img/poleron Dragonball.png" alt="foto">
            <h3 class="destacado">Dragonball</h3>
            <h5>$10.000 CLP</h5>
            <button id="carroboton">Ver opciones</button>
          </div>
          <div class="text-center">
            <img class="carruselimg d-block" src="assets/img/polerón Eren titán.png" alt="foto">
            <h3 class="destacado">Eren</h3>
            <h5>$10.000 CLP</h5>
            <button id="carroboton">Ver opciones</button>
          </div>
        </div>
      </div>
      <div class="carousel-item">
        <div class="flexdisplay">
          <div class="text-center">
            <img class="carruselimg d-block" src="assets/img/Bandolera EVA-01.png" alt="foto">
            <h3 class="destacado">Eva</h3>
            <h5>$10.000 CLP</h5>
            <button id="carroboton">Ver opciones</button>
          </div>
          <div class="text-center">
            <img class="carruselimg d-block" src="assets/img/JUNJI sin fondo figma.png" alt="foto">
            <h3 class="destacado">Junji</h3>
            <h5>$10.000 CLP</h5>
            <button id="carroboton">Ver opciones</button>
          </div>
          <div class="text-center">
            <img class="carruselimg d-block" src="assets/img/polerón Eren titán.png" alt="foto">
            <h3 class="destacado">Eren</h3>
            <h5>$10.000 CLP</h5>
            <button id="carroboton">Ver opciones</button>
          </div>
        </div>
      </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
    </button>
  </div>


  <br><br><br><br>

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