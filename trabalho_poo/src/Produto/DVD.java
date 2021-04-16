package Produto;

public class DVD extends Produto {

		private String nomeBanda;
		private int tempoTotal;
		
		public DVD(Object codigo, String nome, String descricao, float preco, String nomeBanda,int tempoTotal) {
			super(codigo,nome,descricao,preco);
			this.nomeBanda = nomeBanda;
			this.tempoTotal = tempoTotal;
		}

		public String getNomeBanda() {
			return nomeBanda;
		}

		public void setNomeBanda(String nomeBanda) {
			this.nomeBanda = nomeBanda;
		}

		public int getTempoTotal() {
			return tempoTotal;
		}

		public void setTempoTotal(int tempoTotal) {
			this.tempoTotal = tempoTotal;
		}
}
