package DAOImplements;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.ICliente;
import model.TblCliente;

public class DAOCliente implements ICliente  {

	@Override
	public void RegistrarCliente(TblCliente cli) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPA_MAVEN-MAR_NOCHE");
		EntityManager em=emf.createEntityManager();
		try {
			//iniciamos la transaccion
			em.getTransaction().begin();
			//invocamos al metodo registrar
			em.persist(cli);
			//confirmamos
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
			System.out.println("NO SE PUEDE REGISTRAR EN LA TABLA");
			// TODO: handle exception
		}finally{
			//cerramos
			em.close();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ActualizarCliente(TblCliente cli) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPA_MAVEN-MAR_NOCHE");
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(cli);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
			System.out.println("NO SE PUEDE ACTUALIZAR EN LA TABLA");
			// TODO: handle exception
		}finally{
			em.close();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarCliente(TblCliente cli) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPA_MAVEN-MAR_NOCHE");
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(cli);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			System.out.println("NO SE PUEDE ELIMINAR EN LA TABLA");
			// TODO: handle exception
		}finally{
			em.close();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblCliente> ListarCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TblCliente BuscarCliente(TblCliente cli) {
		// TODO Auto-generated method stub
		return null;
	}

}
