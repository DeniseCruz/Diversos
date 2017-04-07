package Strategy;

public class Sedex implements Frete{
	public double calcularPreco(int distancia){
		return distancia * 1.75 + 12;
	}

}
