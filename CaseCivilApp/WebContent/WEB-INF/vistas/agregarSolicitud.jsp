<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../templates/header.jsp"></jsp:include>
<main class ="Container mt-6">
<c:if test="${errores!=null}">
<div class="columns is-centered mb-6">
<div class="column is-6"> 
<div class="notification is-warning">
<h6>Debe ingresar todos los datos</h6>
</div>
</div>
</div>
</c:if>
<div class="columns is-centered">
<div class="column is-6">
<form method="POST" action="AgregarSolicitudController.do">
<div class="card">
<div class="card-header has-background-primary">
<span class="card-header-title">Ingresar Solicitud</span>
</div>

<div class="card-content">
<div class="field">
<label class="label" for ="rut-txt"> Rut del Cliente</label>
<div class="control">
<input type="text" class="input" id="rut-txt" name="rut-txt">
</div>
</div>
<div class="field">
<label class="label" for ="nombre-txt"> Nombre del Cliente</label>
<div class="control">
<input type="text" class="input" id="nombre-txt" name="nombre-txt">
</div>
</div>
<div class="field"></div>
 <label class="label">Tipo de Solicitud</label>
  <div class="control">
    <div class="select">
      <select name="tipo-select" id="tipo-select">
        <option>Solicitud de cédula de identidad</option>
        <option>Retiro de Cédula de identidad</option>
        <option>Solicitud de Certificado de Nacimiento</option>
        <option>Solicitud de certificado de Defunción></option>
      </select>
    </div>
  </div>
</div>



<div class="card-footer has-text-centered">
<div class="card-footer-item">
<button type="submit" class="button is-primary">Ingresar Solicitud </button>
</div>
</div>
</div>
</form>
</div>
</div>

</main>
  </body>
</html>