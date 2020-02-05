package TareaHerencia2;

	public class Productosrefrigerados extends Productos {
	
		
		private int codigodesupervision;

		public Productosrefrigerados(String fechadecaducidad, int numerodelote, int codigodesupervision) {
			super(fechadecaducidad, numerodelote);
			this.codigodesupervision = codigodesupervision;
		}

		public int getCodigodesupervision() {
			return codigodesupervision;
		}

		public void setCodigodesupervision(int codigodesupervision) {
			this.codigodesupervision = codigodesupervision;
		}

		@Override
		public String toString() {
			return "Productosrefrigerados [codigodesupervision=" + codigodesupervision + "]";
		}
		
		
		
		

	

	}
