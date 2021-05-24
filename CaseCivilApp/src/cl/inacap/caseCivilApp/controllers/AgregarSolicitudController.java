package cl.inacap.caseCivilApp.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import cl.inacap.caseCivilModel.dao.SolicitudesDAOLocal;
import cl.inacap.caseCivilModel.dto.Solicitud;

/**
 * Servlet implementation class AgregarSolicitudController
 */
@WebServlet("/AgregarSolicitudController.do")
public class AgregarSolicitudController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private SolicitudesDAOLocal solicitudesDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarSolicitudController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/vistas/agregarSolicitud.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	List<String>errores=new ArrayList <>();
	String rut =request.getParameter("rut-txt").trim();
	if(rut.isEmpty()) {
		errores.add("Debe ingresar rut");
	}else if (!rut.matches ( "[0-9]{7,8}+-[0-9kk]{1}$")) {
		errores.add("Debe ingresar rut correctamente");
	}
	String nombre=request.getParameter("nombre-txt").trim();
	if (nombre .isEmpty()) {
		errores.add("debe ingresar nombre y apellido");
	}
	String tipo=request.getParameter("tipo-select").trim();
	if(tipo.isEmpty()) {
		errores.add("Debe seleccionar una tipo de solicitud");
	}
	if (errores.isEmpty()){
		Solicitud solicitud =new Solicitud();
		solicitud.setTipoSolicitud(tipo);
		solicitud.setClientes(null);
		solicitud.setNumeroAtencion(0);
		solicitudesDAO.save(solicitud);
		
		request.setAttribute("mensaje","solicitud ingresada");
	}
	
	else {
		
		request.setAttribute("errores", errores);
	
}
doGet(request,response);
	}
}

