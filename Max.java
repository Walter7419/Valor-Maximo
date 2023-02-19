
public class Max {
    private int[][] matriz;
    private int filas;
    private int columnas;
    int max;
    
	public Max(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new int[filas][columnas];
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public int getValor(int fila, int columna) {
        return matriz[fila][columna];
    }

    public void setValor(int fila, int columna, int valor) {
        matriz[fila][columna] = valor;
    }
    public int Maximo() {
    	for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                max = 0;
                if (max<matriz[i][j]) {
                	max=matriz[i][j];
                }
               
                
            }
        }
    	return max;
    }
}
