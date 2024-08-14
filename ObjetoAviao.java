package pessoa;

public class ObjetoAviao {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		aviao1.setModelo("rosinha");
		aviao1.setFabricante("Latam");
		aviao1.setCapacidade(150);
		aviao1.setAnoDeFabricacao(1977);

		System.out.println("----- AVIÃO -----");
		System.out.println("Modelo: " + aviao1.getModelo());
		System.out.println("Fabricante: " + aviao1.getFabricante());
		System.out.println("Capacidade: " + aviao1.getCapacidade());
		System.out.println("Ano de fabricação: " + aviao1.getAnoDeFabricacao());
	}
}
