package TareaHerencia2;

	public class Productosfrescos extends Productos {  //Productosfrescos es un aextension de Productos

		private String fechadenvasado;
		private String paisdeorigen;
		
		public Productosfrescos(String fechadecaducidad, int numerodelote,String fechadenvasado, String paisdeorigen) {
			super(fechadecaducidad,numerodelote);
			this.fechadenvasado = fechadenvasado;
			this.paisdeorigen = paisdeorigen;
		}

		public String getFechadenvasado() {
			return fechadenvasado;
		}

		public void setFechadenvasado(String fechadenvasado) {
			this.fechadenvasado = fechadenvasado;
		}

		public String getPaisdeorigen() {
			return paisdeorigen;
		}

		public void setPaisdeorigen(String paisdeorigen) {
			this.paisdeorigen = paisdeorigen;
		}

		@Override
		public String toString() {
			return "Productosfrescos [fechadenvasado=" + fechadenvasado + ", paisdeorigen=" + paisdeorigen + "]";
		}
		
		
		
		
		
		
		
		
}


