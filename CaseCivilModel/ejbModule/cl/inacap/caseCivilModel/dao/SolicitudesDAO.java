package cl.inacap.caseCivilModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.caseCivilModel.dto.Solicitud;

/**
 * Session Bean implementation class SolicitudesDAO
 */
@Stateless
@LocalBean
public class SolicitudesDAO implements SolicitudesDAOLocal {
List<Solicitud> solicitudes =new ArrayList <>();
    /**
     * Default constructor. 
     */
 

	@Override
	public void save(Solicitud solicitud) {
		// TODO Auto-generated method stub
		solicitudes.add (solicitud);
	}

	@Override
	public List<Solicitud> getAll() {
		// TODO Auto-generated method stub
		return solicitudes;
	}

	@Override
	public void delete(Solicitud solicitud) {
		// TODO Auto-generated method stub
	solicitudes.remove(solicitud);
	}

	@Override
	public List<Solicitud> filterByName(String nombrec) {
		
		
		return solicitudes.stream().filter(c->c.getTipoSolicitud().contains(nombrec)).collect(Collectors.toList());
			}
		
	

	
	

}




