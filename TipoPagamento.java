public abstract class TipoPagamento(){
	
	private String tipoPagamento;

	public TipoPagamento();

	public void setTipo(String tipo){
		this.tipoPagamento = tipo;
	}
	public String getTipo(){
		return this.tipoPagamento;
	}

	public abstract void exibirDados();


}