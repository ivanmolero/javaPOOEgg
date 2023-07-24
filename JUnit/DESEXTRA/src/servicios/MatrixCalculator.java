package servicios;

public class MatrixCalculator {

    public double[][] sumaMatrix(double[][] matrizA, double[][] matrizB) {
        // dos matrices del mismo tamaño
        if (matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length) {
            return null;
        }
        double[][] matrizResultado = new double[matrizA.length][matrizA[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizResultado;
    }

    public double[][] restaMatrix(double[][] matrizA, double[][] matrizB) {
        // dos matrices del mismo tamaño
        if (matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length) {
            return null;
        }
        double[][] matrizResultado = new double[matrizA.length][matrizA[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizResultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
        return matrizResultado;
    }

    public double[][] multiplicacionMatrix(double[][] matrizA, double[][] matrizB) {
        // dos matrices con el numero de columnas de matrizA es igual al numero de
        // fila de matrizB
        if (matrizA[0].length != matrizB.length) {
            return null;
        }
        double[][] matrizResultado = new double[matrizA.length][matrizB[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; i < matrizB[0].length; j++) {
                for (int k = 0; k < matrizA[0].length; k++) {
                    matrizResultado[i][j] += matrizA[i][k] + matrizB[k][j];
                }
            }
        }
        return matrizResultado;
    }

    public double[][] inversaMatrix(double[][] matriz) {
        // una matriz cuadrada
        if (matriz.length != matriz[0].length) {
            return null;
        }
        double[][] identidad = new double[matriz.length][matriz.length];
        for (int i = 0; i < identidad.length; i++) {
            identidad[i][i] = 1.0;
        }
        // transforma la matriz original en una matriz triangular superior
        for (int i = 0; i < identidad.length; i++) {
            if (matriz[i][i] == 0.0) {
                boolean filaCambiada = false;
                for (int k = i + 1; k < identidad.length; k++) {
                    if (matriz[k][i] != 0.0) {
                        cambiaFilas(matriz, i, k);
                        cambiaFilas(identidad, i, k);
                        filaCambiada = true;
                        break;
                    }
                }
                if (!filaCambiada) {
                    return null;
                }
            }
            double pivot = matriz[i][i];

        }
        return identidad;
    }

    private void cambiaFilas(double[][] matriz, int i, int k) {
        double[] aux = matriz[i];
        matriz[i] = matriz[k];
        matriz[k] = aux;
    }

    public int[][] transpuestaMatrix(int[][] matriz) {
        // una matriz cualquiera
        int[][] arrayResultado = null;
        return arrayResultado;
    }

    public int determinanteMatrix(int[][] matriz) {
        // una matriz cuadrada
        return 0;
    }


}
