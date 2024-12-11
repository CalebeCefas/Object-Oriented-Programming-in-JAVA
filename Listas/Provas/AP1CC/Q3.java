package Listas.Provas.AP1CC;

public class Q3 {
    public static int[][] somaMatrizes(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            throw new IllegalArgumentException("As matrizes devem ter as mesmas dimensões.");
        }

        int linhas = mat1.length;
        int colunas = mat1[0].length;
        int[][] matResult = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matResult[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        return matResult;
    }
}
    