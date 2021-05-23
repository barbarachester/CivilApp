package cl.inacap.caseCivilModel.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.caseCivilModel.dto.Cliente;

/**
 * Session Bean implementation class ClientesDAO
 */
@Stateless
@LocalBean
public class ClientesDAO implements ClientesDAOLocal {
List <Cliente> clientes = new ArrayList<>();
    /**
     * Default constructor. 
     */
 
	@Override
	public void save(Cliente cliente) {
		// TODO Auto-generated method stub
		clientes.add (cliente);
	}

	@Override
	public List<Cliente> getAll() {
		// TODO Auto-generated method stub
		return clientes;
	}

	@Override
	public void delete(Cliente cliente) {
		// TODO Auto-generated method stub
		clientes.remove(cliente);
	}

}
