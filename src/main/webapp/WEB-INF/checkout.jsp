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
    <link rel="stylesheet" href="assets/css/checkout.css">
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
	<div class="container" id="estadocompra">
    <h4><span>Carro ></span><strong> Proceso de pago ></strong> Revisión del pedido > Éxito </h4>

  </div>


  <div class="container-fluid" id="containerprincipal" style="margin-top: 5rem;">
    <div class="container">
      <div class="row">
        <div class="col-8">
          <div class="card" id="card-contenido">
            <div class="row">
              <h5 style="text-align:left; margin-left: 1%; color: #92478C;" class="card-title">Contacto</h5>
              <div class="col-6">
               <form method="post">
                  <div class="form-group text-start">
                    <label for="text-email" style="margin-bottom: 0.5rem;">E-mail</label>
                    <input type="text" class="form-control" id="text-email" placeholder="Ingrese E-mail" style="margin-top:0.5rem; margin-bottom: 0.5rem;     color: white;
    background: transparent;">
                  </div>
                  <div class="form-group text-start">
                    <label for="text-rut" style="margin-bottom: 0.5rem;">Rut</label>
                    <input type="text" class="form-control" id="text-rut" placeholder="Ingrese Rut" style="margin-top:0.5rem; margin-bottom: 0.5rem;     color: white;
    background: transparent;">
                  </div>
                
              </div>
              <div class="col-6">
                <!--  -->
                  <div class="form-group text-start">
                    <label for="text-telefono" style="margin-bottom: 0.5rem;">Teléfono</label>
                    <input type="text" class="form-control" id="text-telefono" placeholder="Ingrese Teléfono" style="margin-top:0.5rem; margin-bottom: 0.5rem;     color: white;
    background: transparent;">
                  </div>
             
              </div>
            </div>
            <hr>
            <div class="row">
              <h5 style="text-align:left; margin-left: 1%; color: #92478C;" class="card-title">Dirección de envío</h5>
              <div class="col-6 ">
               
                  <div class="form-group text-start">
                    <label for="text-nombre" style="margin-bottom: 0.5rem; ">Nombre</label>
                    <input type="text" class="form-control" id="text-nombre" placeholder="Ingrese Nombre" style="margin-top:0.5rem; margin-bottom: 0.5rem;     color: white;
    background: transparent;">
                  </div>
                  <div class="form-group text-start">
                    <label for="text-direccion" style="margin-bottom: 0.5rem;">Dirección</label>
                    <input type="text" class="form-control" id="text-direccion" placeholder="Ingrese Dirección" style="margin-top:0.5rem; margin-bottom: 0.5rem;     color: white;
    background: transparent;">
                  </div>
                  <div class="text-start">
                    <label class="text-start" for="form-select" style="margin-bottom: 0.5rem;">Región</label>
                    <select class="form-select" aria-label="Default select example"
                      style="margin-top:0.5rem; margin-bottom: 0.5rem; width: 100%;">
                      <option selected>Seleccione Región</option>
                      <option value="1">One</option>
                    </select>
                  </div>
                  <div class="form-check text-start">
                    <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                    <label class="form-check-label" for="flexCheckDefault" style="font-size: 0.8rem; color: #6C757D;">
                      Dirección de facturación igual a la de envío
                  </div>
               

              </div>
              <div class="col-6" id="facturacion">
                
                  <div class="form-group text-start">
                    <label for="text-apellidos" style="margin-bottom: 0.5rem;">Apellidos</label>
                    <input type="text" class="form-control" id="text-apellidos" placeholder="Ingrese Apellidos" style="margin-top:0.5rem; margin-bottom: 0.5rem;    color: white;
    background: transparent;">
                  </div>
                  <div class="form-group text-start">
                    <label for="text-ciudad" style="margin-bottom: 0.5rem;">Ciudad</label>
                    <input type="text" class="form-control" id="text-ciudad" placeholder="Ingrese Ciudad" style="margin-top:0.5rem; margin-bottom: 0.5rem;    color: white;
    background: transparent;">
                  </div>
                  <div class="text-start">
                    <label for="form-select " style="margin-bottom: 0.5rem;">Comuna</label>
                    <select class="form-select" aria-label="Default select example"
                      style="margin-top:0.5rem; margin-bottom: 0.5rem;  width: 100%;">
                      <option selected>Seleccione Comuna</option>
                      <option value="1">One</option>
                    </select>
                  </div>
               
              </div>
            </div>
            <hr>
            <div class="row">
              <h5 style="text-align:left; margin-left: 1%; color: #92478C;" class="card-title">Dirección de facturación
              </h5>
              <div class="col-6">
               
                  <div class="form-group text-start">
                    <label for="formGroupExampleInput" style="margin-bottom: 0.5rem;">Nombre</label>
                    <input type="text" class="form-control" id="text-nombre" placeholder="Ingrese Nombre" style="margin-top:0.5rem; margin-bottom: 0.5rem;    color: white;
    background: transparent;">
                  </div>
                  <div class="form-group text-start">
                    <label for="formGroupExampleInput2" style="margin-bottom: 0.5rem;">Dirección</label>
                    <input type="text" class="form-control" id="text-direccion" placeholder="Ingrese Dirección" style="margin-top:0.5rem; margin-bottom: 0.5rem;    color: white;
    background: transparent;">
                  </div>
                  <div class="text-start">
                    <label for="form-select" style="margin-bottom: 0.5rem;">Región</label>
                    <select class="form-select" aria-label="Default select example"
                      style="margin-top:0.5rem; margin-bottom: 0.5rem;  width: 100%;">
                      <option selected>Seleccione Región</option>
                      <option value="1">One</option>
                    </select>
                  </div>
              

              </div>
              <div class="col-6">
                <form>
                  <div class="form-group text-start">
                    <label for="formGroupExampleInput" style="margin-bottom: 0.5rem;">Apellidos</label>
                    <input type="text" class="form-control" id="text-apellidos" placeholder="Ingrese Apellidos" style="margin-top:0.5rem; margin-bottom: 0.5rem;    color: white;
    background: transparent;">
                  </div>
                  <div class="form-group text-start">
                    <label for="formGroupExampleInput" style="margin-bottom: 0.5rem;">Ciudad</label>
                    <input type="text" class="form-control" id="text-ciudad" placeholder="Ingrese Ciudad" style="margin-top:0.5rem; margin-bottom: 0.5rem;    color: white;
    background: transparent;">
                  </div>
                  <div class="text-start">
                    <label for="form-select" style="margin-bottom: 0.5rem;">Comuna</label>
                    <select class="form-select" aria-label="Default select example"
                      style="margin-top:0.5rem; margin-bottom: 0.5rem; width: 100%;">
                      <option selected>Seleccione Comuna</option>
                      <option value="1">One</option>
                    </select>
                  </div>
                </form>
              </div>
            </div>
            <hr>
            <div class="row">
              <h5 style="text-align:left; margin-left: 1%; color: #92478C;" class="card-title">Información adicional
              </h5>
              <div class="col-12">
                <div class="mb-3">
                  <label for="exampleFormControlTextarea1" class="form-label" style="color: #6C757D;">Introduzca las
                    instrucciones especiales para su pedido</label>
                  <textarea class="form-control" style="    color: white;
    background: transparent;" id="exampleFormControlTextarea1" rows="3"></textarea>
    </form>
                </div>
              </div>
            </div>
            <hr>
          </div>

        </div>
        <div class="col-4">
          <div class="card" id="card-revisionpedido">
            <div>
              <h4 class="card-title" id="revision-pedido">Revisión del pedido </h4>
              <img src="/assets/img/Poleras sin fondo/AKIRA sin fondo1.png" alt="akiratee"
                style="width: 35%;display: flex ;justify-content:left;">
              <div class="container" id="detalles-pedido">
                <ul style="list-style: none;">
                  <li style="color: #92478C;">Akira Tee</li>
                  <li>Talla M</li>
                  <li>Manga corta</li>
                </ul>
              </div>
              <div class="container" id="detalles-cantidad">
                <ul style="list-style: none;">
                  <li style="color: #92478C;">1x</li>
                  <li>$10.000</li>
                  <li>CLP</li>
                </ul>
              </div>
              <br>
              <div class="container-fluid" id="subtotal">
                <p style="margin-left: 7%;">Subtotal</p>

                <p style="display: inline-block;">$10.000CLP</p>
              </div>


              <br>
              <button type="submit" id="revisarcompra-button" onclick="location.href = '/revisionpedido';">Revisar la
                compra</button>
              <br>
              <button id="editarcarrito-button" onclick="location.href = '/productoscarrito';">Editar
                carrito</button>
              <br>
              <button id="seguircomprando-button" onclick="location.href = '/home';">Seguir
                comprando</button>

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