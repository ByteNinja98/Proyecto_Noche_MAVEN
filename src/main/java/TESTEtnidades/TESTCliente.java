package TESTEtnidades;

import DAOImplements.DAOCliente;
import model.TblCliente;

public class TESTCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblCliente tblc=new TblCliente();
		DAOCliente cliImpl=new DAOCliente();
		tblc.setIdcliente(1);
		tblc.setNombre("REALES");
		tblc.setApellido("CAMBIO");
		tblc.setSexo("MACHAZO");
		tblc.setDni("789654123");
		tblc.setEmail("FAST@GMAIL.COM");
		tblc.setTelef("963258741");
		cliImpl.ActualizarCliente(tblc);
		System.out.println("DATOS ACTUALIZADOS");
	}

}
