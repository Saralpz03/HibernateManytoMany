package sara;

import java.util.ArrayList;

import sara.Cliente;
import sara.AccesoDatos;
import sara.EntradaSalida;

public class ClasePrincipal {
	public static void main(String[] args) {
		int opcion=EntradaSalida.pedirOpcion();
        AccesoDatos.inicializarBD();
        while(opcion!=EntradaSalida.SALIR)
        {
        	switch(opcion)
            {
                case EntradaSalida.INSERTAR_CLIENTE:
                    Cliente c=EntradaSalida.pedirCliente();
                    AccesoDatos.insertarContacto(c);
                    break;
                case EntradaSalida.INSERTAR_PRODUCTO:
                	Producto p=EntradaSalida.pedirProducto();
                    AccesoDatos.insertarProducto(p);
                	break;
                //case EntradaSalida.COMPRAR:
                //	int opcion_comprar=EntradaSalida.pedirSegundaOpcion();
                 //   break;
                case EntradaSalida.BUSCAR:
                	String nombre_buscado=EntradaSalida.pedirNombre();
                	ArrayList<Cliente> lista_clientes=AccesoDatos.recuperarClientes(nombre_buscado);
                	EntradaSalida.mostrarClientes(lista_clientes);
                    break;
                     
            }
            opcion=EntradaSalida.pedirOpcion();
        }
	}
}
