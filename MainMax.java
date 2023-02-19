
public class MainMax {
	public static void main(String[] args) {
		Max matriz1 = new Max(3, 3);
        matriz1.setValor(0, 0, 1);
        matriz1.setValor(0, 1, 2);
        matriz1.setValor(0, 2, 3);
        matriz1.setValor(1, 0, 4);
        matriz1.setValor(1, 1, 5);
        matriz1.setValor(1, 2, 6);
        matriz1.setValor(2, 0, 7);
        matriz1.setValor(2, 1, 8);
        matriz1.setValor(2, 2, 9);

        System.out.println("La matriz es:");
        for (int i = 0; i < matriz1.getFilas(); i++) {
            for (int j = 0; j < matriz1.getColumnas(); j++) {
                System.out.print(matriz1.getValor(i, j)+ " ");
            }
            System.out.println("");
        }
        System.out.println("El maximo valor es:"+matriz1.Maximo());
	}
}