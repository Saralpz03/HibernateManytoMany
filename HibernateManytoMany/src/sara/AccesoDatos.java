package sara;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AccesoDatos {
	static StandardServiceRegistry s=null;
	static SessionFactory sf=null;
	public static void inicializarBD() {
		// TODO Auto-generated method stub
		s=new StandardServiceRegistryBuilder().configure().build();
		   sf=new MetadataSources(s).buildMetadata().buildSessionFactory();
	}

	public static void insertarContacto(Cliente c) {
		// TODO Auto-generated method stub
		Session sesion=sf.openSession();
   	 	Transaction t=sesion.beginTransaction();
   	 	sesion.save(c);
   	 	t.commit();
	}

	public static void insertarProducto(Producto p) {
		// TODO Auto-generated method stub
		Session sesion=sf.openSession();
   	 	Transaction t=sesion.beginTransaction();
   	 	sesion.save(p);
   	 	t.commit();
	}

	public static ArrayList<Cliente> recuperarClientes(String nombre_buscado) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Query q=s.createQuery("SELECT nombre FROM Cliente");
		List lista_clientes=q.getResultList();
		return (ArrayList)lista_clientes;
	}
	
	
	

}
