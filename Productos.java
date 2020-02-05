//Ejercicio Herencia
//Se plantea desarrollar un programa Java que permita la gestión de una empresa agroalimentaria que trabaja con tres tipos de productos: 
//productos frescos, productos refrigerados y productos congelados. 

//Todos los productos llevan esta información común: 
//fecha de caducidad y número de lote. A su vez, cada tipo de producto lleva alguna información específica. 

//Los productos frescos deben llevar la fecha de envasado y el país de origen. 
//Los productos refrigerados deben llevar el código del organismo de supervisión alimentaria. 
//Los productos congelados deben llevar la temperatura de congelación recomendada. 


//Crear el código de las clases Java implementando una relación de herencia desde la superclase 
//Producto hasta las subclases ProductoFresco, ProductoRefrigerado y ProductoCongelado. 

//Cada clase debe disponer de constructor y permitir establecer (set) y recuperar (get) el valor de sus atributos get set
//y tener un método que permita mostrar la información del objeto. to string
//Crear una clase testHerencia2 con el método main donde se cree un objeto de cada tipo y 
//se muestren los datos de cada uno de los objetos creados.

package TareaHerencia2;

public class Productos {
	
	private String fechadecaducidad;
	private int numerodelote;
	
	public Productos() {
		
		this.fechadecaducidad = "cinco de agosto";
		this.numerodelote = 23456;
		
	}

	public Productos(String fechadecaducidad, int numerodelote) {
		
		this.fechadecaducidad = fechadecaducidad;
		this.numerodelote = numerodelote;
		
	}

	public String getFechadecaducidad() {
		return fechadecaducidad;
	}

	public void setFechadecaducidad(String fechadecaducidad) {
		this.fechadecaducidad = fechadecaducidad;
	}

	public int getNumerodelote() {
		return numerodelote;
	}

	public void setNumerodelote(int numerodelote) {
		this.numerodelote = numerodelote;
	}

	

}
