package TareaHerencia2;

public class Productoscongelados extends Productos {
	
		private float temperaturacongelado;

		public Productoscongelados(String fechadecaducidad, int numerodelote,float temperaturacongelado) {
			super(fechadecaducidad, numerodelote);
			this.temperaturacongelado = temperaturacongelado;
			
		}

		public float getTemperaturacongelado() {
			return temperaturacongelado;
		}

		public void setTemperaturacongelado(float temperaturacongelado) {
			this.temperaturacongelado = temperaturacongelado;
		}

		@Override
		public String toString() {
			return "Productoscongelados [temperaturacongelado=" + temperaturacongelado + "]";
		}
	
		
		
		
		
		
}
