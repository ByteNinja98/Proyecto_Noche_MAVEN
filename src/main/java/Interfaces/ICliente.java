package Interfaces;

import java.util.List;

import model.TblCliente;

public interface ICliente {
	void RegistrarCliente(TblCliente cli);
	void ActualizarCliente(TblCliente cli);
	void EliminarCliente(TblCliente cli);
	List<TblCliente> ListarCliente();
	TblCliente BuscarCliente(TblCliente cli);
	
}
