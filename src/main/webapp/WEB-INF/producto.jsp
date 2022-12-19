<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Productos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div>
			<form action="/producto" method="post">
				<label for="nombre" class="form-label">Productos</label> </select><br>
				<button type="submit" class="btn bg-nav">Filtrar producto</button>
				<!-- Selector -->
				<select class="form-select" aria-label="Lista de productos" name="productoSeleccionado">
					<!-- agregar name -->
					<option value="0" selected> Seleccione su Producto </option>
					<c:forEach var="producto" items="${listaSelectProductos}">
						<option value="${producto.id}"> ${producto.categoria.producto} - ${producto.diseno.serigrafia}</option>
					</c:forEach>
					
				</select><br>
				<button type="submit" class="btn bg-nav">Filtrar producto</button>
				
			</form>
			
			<br> <br>
			<h2>Productos</h2>
			<br>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Categoría</th>
						<th scope="col">Color</th>
						<th scope="col">Tallaje</th>
						<th scope="col">Precio</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="producto" items="${productos}">
						<tr>
							<td>${producto.id}</td>
							<td>${producto.categoria.producto}</td>
							<td>${producto.diseno.serigrafia}</td>
							<td>${producto.tallaje.talla}</td>
							<td>${producto.precio}</td>
							
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<br>
		</div>
		
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>