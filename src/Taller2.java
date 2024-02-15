/*
 * Autores: Juan David Delgado Muñoz
 * Victor Manuel Velasquez Benavides
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Taller2 {

		    private ArrayList<Producto> misProductos;
		    private Scanner lector;
		    
		    public Taller2() {
		        misProductos = new ArrayList<>();
		        lector = new Scanner(System.in);
		    }
		    
		    public void mostrarOpciones() {
		    boolean activo=true;
		    do {
		    System.out.println("========== MENÚ DE OPCIONES ==========\n"
		            + "1. Agregar Producto\n"
		            + "2. Mostrar Productos\n"
		            + "3. Eliminar Productos\n"
		            + "4. Terminar Programa\n");
		    
		    int opcion=lector.nextInt();
		    switch(opcion){
		        case 1:
		        	agregarProducto();
		        break;
		           
		        case 2:
		            listarProductos(); 
		        break;
		        
		        case 3:
		        	eliminarProducto();
		        break;
		        
		        case 4:
		            activo=false;
		            System.out.println("Programa terminado.");
		        break;
		        
		        default:
		            System.out.println("Opción Incorrecta, intenta nuevamente.");
		        }
		    }
		    while (activo);  
			}
		    public void agregarProducto() {
		    	System.out.println("Ingrese el Id del producto: ");
	            int idProducto = lector.nextInt();
	        	System.out.println("Ingresa el nombre del producto: ");
	            lector.nextLine();
	            String nombreProducto = lector.nextLine();
	            System.out.println("Ingrese el precio del producto: ");
	            double precio = lector.nextDouble();
	            System.out.println("Ingrese la cantidad del producto: ");
	            int cantidad = lector.nextInt();
	            System.out.println("======================================");
	            
	            Producto nuevoProducto = new Producto(idProducto, nombreProducto, precio, cantidad);
	            
	            misProductos.add(nuevoProducto);
	            System.out.println("El producto fue agregado exitosamente");
		    }
		    
		    public void listarProductos() {
		    	if (misProductos.isEmpty()) {
                    System.out.println("Aún no has registrado productos en el sistema.");
                } else {
                    System.out.println("==========Productos Registrados==========");
                    for(int i=0; i<misProductos.size()-1; i ++) {
                    	for (int j= i+1; j<misProductos.size(); j ++) {
                    		Producto producto1 = misProductos.get(i);
                    		Producto producto2 = misProductos.get(j);		                        	
                    		if (producto1.getCantidad()>producto2.getCantidad()) {
                    			misProductos.set(i, producto2);
                    			misProductos.set(j, producto1);
                    		}
                    	}
                    }
                    for (Producto producto : misProductos) {
                        System.out.println(" Id: "+producto.getIdProducto()+"\n Nombre: "+producto.getNombreProducto() + " \n Cantidad: " +
                        producto.getCantidad()+ " \n Precio: " + producto.getPrecio());
                        System.out.println("======================================");
                    } 
                }
		    }

		    public void eliminarProducto() {
		        if (misProductos.isEmpty()) {
		            System.out.println("No hay productos registrados en el sistema.");
		        } else {
		            System.out.println("Digite el Id del producto que quiere eliminar: ");
		            int id = lector.nextInt();
		            boolean encontrado = false;
		            Iterator<Producto> iterador = misProductos.iterator();
		            while (iterador.hasNext()) {
		                Producto p = iterador.next();
		                if (p.getIdProducto() == id) {
		                    encontrado = true;
		                    System.out.println("¿Estás seguro que quieres eliminar este producto?");
		                    System.out.println("Ingrese: 1 para confirmar o 2 para cancelar: ");
		                    int confirmacion = lector.nextInt();
		                    if (confirmacion == 1) {
		                        iterador.remove();
		                        System.out.println("El producto con Id: " + id + " ha sido eliminado.");
		                    } else {
		                        System.out.println("El producto no ha sido eliminado.");
		                    }
		                    break;
		                }
		            }
		            if (!encontrado) {
		                System.out.println("No se encontró el producto con es Id.");
		            }
		        }
		    }

		    public static void main(String[] args) {
		    	Taller2 organizador = new Taller2();
		    	organizador.mostrarOpciones();
		    }
		
}
