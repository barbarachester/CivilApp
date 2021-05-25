<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../templates/header.jsp"></jsp:include>
<main class="container mt-6">
<div class="columns is-centered">
<div class="column is-8">
<form method="POST" action="AtenderSolicitudesController.do">
<div class="card">
<div class="card-header has-background-primary">
<span class="card-header-title is-centered">Atender Solicitudes</span>
</div>

<div class="card-content">
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
  <div class="container mt-6"></div>
 <table class="table is-hovered is-bordered is-fullwidth">
 <thead class="has-background-primary">
 <tr>
 <th>Nro de Atención</th>
 <th>Nombre del Cliente</th>
 <th>Tipo de Solicitud</th>
 <th>Acciones</th>
 </tr>
</thead>
 <tbody>
 <c:forEach var="solicitud" items="${solicitudes}"> 
 <tr>
 <td>${solicitud.numeroAtencion}</td>
 <td> ${clientes.nombre }</td>                          
  <td>${solicitud.tipoSolicitud}</td>
   <td>
      <a href="AtenderSolicitudesController.do?nombreEliminar=${solicitud.clientes}" 
      class="has-text-danger">Atender </a>
      </td>
   </tr>
 </c:forEach>
 </tbody>
 </table>
 </div>
</div>

</form>




</div>

</div>


</main>
  </body>
</html>