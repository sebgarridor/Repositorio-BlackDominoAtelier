<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>

<div class="container-fluid">

<h2>Formulario de Registro</h2>

<!-- alerta de error -->
<!--  si la variable msgError es distinto de nulo -->
<c:if test="${msgError != null }">
<div class="alert alert-danger" role="alert">

<!-- que devuelva el mensaje de error -->
<c:out value="${msgError}"></c:out>
</div>
</c:if>

<div class="card">
<div class="card-body">
<!-- creamos formulario, donde solicitaremos la información -->
<!-- action: ruta donde enviaremos los parámetros(atributos/información)
method: forma de cómo se envían los parámetros
post: enviamos parametros ocultos para la url -->
<form action="/admin/registro" method="post">

<label for="nombre" class="form-label">Nombre:</label>
<input type="text" class="form-control" id="nombre" name="nombre" placeholder="Ingresa tu nombre">
<!-- 
for=id
name: nombre de la variable a capturar
id: nombre para identificar
placeholder: lo que se muestra como sugerencia de texto
 -->
 <br>
 <label for="apellido" class="form-label">Apellido:</label>
<input type="text" class="form-control" id="apellido" name="apellido" placeholder="Ingresa tu apellido" required>
<br>
 <label for="correo" class="form-label">E-mail:</label>
<input type="text" class="form-control" id="correo" name="correo" placeholder="Ingresa tu correo" required>
<br>
 <label for="telefono" class="form-label">Teléfono:</label>
<input type="text" class="form-control" id="telefono" name="telefono" placeholder="Ingresa tu teléfono">
<br>
 <label for="password" class="form-label">Contraseña:</label>
<input type="password" class="form-control" id="password" name="password" placeholder="Ingresa tu contraseña" required>
<br>
 <label for="password2" class="form-label">Repite la contraseña:</label>
<input type="password" class="form-control" id="password2" name="password2" placeholder="Vuelve a ingresar tu contraseña">
<br>

<!-- colocamos input tipo submit para enviar la información -->
<input type="submit" class="btn btn-outline-primary btn-lg" value="Enviar">
<!-- value: texto mostrado -->

</form>

</div>

</div>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>