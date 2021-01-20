package sara;

import java.util.ArrayList;
import java.util.Scanner;

import sara.Cliente;

public class EntradaSalida {
	final static int INSERTAR_CLIENTE=1;
	final static int INSERTAR_PRODUCTO=2;
	final static int COMPRAR=3;
	final static int ELEGIR_CLIENTE=31;
	final static int ELEGIR_PRODUCTO=32;
	final static int BUSCAR=4;
	final static int SALIR=5;

	public static int pedirOpcion() {
		System.out.println(INSERTAR_CLIENTE+"-Insertar cliente");
        System.out.println(INSERTAR_PRODUCTO+"-Insertar producto");
        System.out.println(COMPRAR+"-Comprar");
        System.out.println(BUSCAR+"-Buscar contacto");
        System.out.println(SALIR+"-Salir");
        Scanner sc=new Scanner(System.in);
        int opcion=sc.nextInt();
        return opcion;
	}

	public static int pedirSegundaOpcion() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static Cliente pedirCliente() {
		Scanner sc=new Scanner(System.in);
        System.out.println("Nombre");
        String nombre=sc.nextLine();
        System.out.println("Apellido");
        String apellido=sc.nextLine();
        System.out.println("Dinero en la bolsa");
        int bolsa=sc.nextInt();
        Cliente c=new Cliente(nombre, apellido, bolsa);
        return c;
	}

	public static Producto pedirProducto() {
		Scanner sc=new Scanner(System.in);
        System.out.println("Nombre del producto");
        String nombre=sc.nextLine();
        System.out.println("Precio");
        int precio=sc.nextInt();
        Producto p=new Producto(precio, nombre, precio);
        return p;
	}

	public static String pedirNombre() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nombre buscado:");
		String nombre=sc.nextLine();
		return nombre;
	}

	public static void mostrarClientes(ArrayList<Cliente> lista_clientes) {
		for (Cliente cliente : lista_clientes) {
			System.out.println(cliente);
		}
	}

	

	

	

}
