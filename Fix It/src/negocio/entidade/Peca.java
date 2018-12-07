package negocio.entidade;

import javafx.beans.property.SimpleStringProperty;

public class Peca extends Produto {
	private SimpleStringProperty modeloCarro;// Ex: Fiat
	private double precoReparo;
	public Peca(String tipo,String modeloCarro,double precoCompra,double precoVenda,double precoReparo){
		super(tipo,precoCompra,precoVenda);// Ex Tipo: Motor
		this.modeloCarro = new SimpleStringProperty(modeloCarro);
		this.precoReparo = precoReparo;
	}
	public String getModeloCarro() {
		return modeloCarro.get();
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro.set(modeloCarro);
	}


	public double getPrecoReparo() {
		return precoReparo;
	}

	public void setPrecoReparo(double precoReparo) {
		this.precoReparo = precoReparo;
	}
}