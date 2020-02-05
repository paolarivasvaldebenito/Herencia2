package TareaHerencia2;


public class testHerencia2 {

public static void main(String[] args) {
		
	Productosfrescos PF = new Productosfrescos("treinta de diciembre", 402020, "dos de abril", "Alemania");
	
	
	System.out.println("fecha de caducidad: "+PF.getFechadecaducidad());
	
	System.out.println("numerodelote: "+PF.getNumerodelote());
	
	System.out.println("fechadenvasado: "+PF.getFechadenvasado());
	
	//System.out.println("Pais de origen: "+PF.getPaisdeorigen());
	
	PF.setPaisdeorigen("chile");
	
	System.out.println("Pais de origen: "+PF.getPaisdeorigen());
	
}




}