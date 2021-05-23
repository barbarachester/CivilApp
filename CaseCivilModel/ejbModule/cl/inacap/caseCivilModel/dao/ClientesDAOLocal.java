package cl.inacap.caseCivilModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.caseCivilModel.dto.Cliente;

@Local
public interface ClientesDAOLocal {
	void save (Cliente cliente);
	List <Cliente>getAll();
	void delete (Cliente cliente);

}
