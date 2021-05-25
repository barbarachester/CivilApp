package cl.inacap.caseCivilApp.controllers;

import java.io.IOException;
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
 * Servlet implementation class AtenderSolicitudesController
 */
@WebServlet("/AtenderSolicitudesController.do")
public class AtenderSolicitudesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	
	private SolicitudesDAOLocal  solicitudesDAO;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AtenderSolicitudesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List <Solicitud> solicitudes =solicitudesDAO.getAll();
		if(request.getParameter("nombreEliminar")!=null) {
			String nombrec = request.getParameter("nombreEliminar").trim();
			List<Solicitud> busqueda = solicitudesDAO.filterByName(nombrec);
			Solicitud solicitudAEliminar =busqueda.isEmpty()? null:busqueda.get(0);
			if(solicitudAEliminar!=null) {
				solicitudesDAO.delete(solicitudAEliminar);
			}
		}
		
		
		request.setAttribute("solicitudes",solicitudes);
		request.getRequestDispatcher("WEB-INF/vistas/atenderSolicitudes.jsp").forward(request,response);
		
	}
	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
