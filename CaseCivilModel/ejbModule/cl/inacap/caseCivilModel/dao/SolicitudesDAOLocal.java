package cl.inacap.caseCivilModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.caseCivilModel.dto.Solicitud;

@Local
public interface SolicitudesDAOLocal {
void save (Solicitud solicitud);
List <Solicitud> getAll();
void delete (Solicitud solicitud);

}
