package imp;

public class Servico {
	private float valor;
	private float aliquota ;
	
	public float getValor() {
		return valor;
	}





	public void setValor(float valor) {
		this.valor = valor;
	}





	public float getAliquota() {
		return aliquota;
	}





	public void setAliquota(float aliquota) {
		this.aliquota = aliquota;
	}

	
	

	
	
	public float calcularISS() {
		return valor * aliquota;
	}
	
	
}
