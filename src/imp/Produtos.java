package imp;

public class Produtos extends Servico{

	private float valor;
	private float frete;
	private float seguro;
	private float margem;


	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getFrete() {
		return frete;
	}

	public void setFrete(float frete) {
		this.frete = frete;
	}

	public float getSeguro() {
		return seguro;
	}

	public void setSeguro(float seguro) {
		this.seguro = seguro;
	}

	public float getMargem() {
		return margem;
	}

	public void setMargem(float margem) {
		this.margem = margem;
	}


	public float calcularBaseCalculo() {

		return valor + frete + seguro;
	}

	public float calcularIPI() {
		float baseCalculo = calcularBaseCalculo();
		return baseCalculo * 0.0015f;
	}

	public float calcularICMS () {
		float aliquota = valor * 0.0020f;;
		return valor + aliquota;
	}
	public float calcularPrecoFinal () {
		float ipi = calcularIPI();

		return calcularBaseCalculo() + calcularICMS() + calcularISS()+ ipi;	
		}
}
