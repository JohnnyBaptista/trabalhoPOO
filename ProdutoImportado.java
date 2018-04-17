public class ProdutoImportado extends Produto(){
	private float taxaImposto, taxaImportacao;


	public ProdutoImportado();

	public void setTaxaImposto(float taxa){
		this.taxaImposto = taxa;
	}
	public void setTaxaImportacao(float taxa){
		this.taxaImportacao = taxa;
	}
	public float getTaxaImposto(){
		return this.taxaImposto;
	}
	public float getTaxaImportacao(){
		return this.taxaImportacao;
	}

	public float calcularPrecos(){
		//DEFINIR
	}
}