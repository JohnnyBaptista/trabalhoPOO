public abstract class Produto{
	private String codigo, descricao;
	private float valor;

	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	public String getCodigo(){
		return this.codigo;
	}
	public void setDesc(String desc){
		this.descricao = desc;
	}
	public String getDesc(){
		return this.descricao;
	}
	public void setValor(float valor){
		this.valor = valor;
	}
	public float getValor(){
		return this.valor;
	}

	public abstract float calcularPrecos(); 
}