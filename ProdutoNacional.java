public class ProdutoNacional extends Produto{
	private float taxaImposto;

	public ProdutoNacional();

	public void setTaxaImposto(float taxaImposto){
		this.taxaImposto = taxaImposto;
	}
	public float getTaxaImposto(){
		return this.taxaImposto;
	}

	public float calcularPrecos(){
		//DEFINIR
	}
}