public class Cheque extends TipoPagamento(){
	private String nomeEmissor, numeroCheque;

	public Cheque(String nome, String numero){
		this.nomeEmissor = nome;
		this.numeroCheque = numero;
	}

	public void setNome(String nome){
		this.nomeEmissor = nome;
	}
	public String getNome(){
		return this.nomeEmissor;
	}
	public void setNumero(String numero){
		this.numeroCheque = numero;
	} 
	public String getNumero(){
		return this.numeroCheque;
	}


	public void exbirDados(){
		//DEFINIR
	}

}