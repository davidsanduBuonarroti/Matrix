import java.rmi.server.ExportException;

public class Matrice {

    public static int[][] somma(int[][] n, int[][] m) {

        int [][]rit = new int [n.length][n[0].length];


        for(int i = 0; i < n.length; i++){
            for(int x = 0; x < n[i].length; x++){
                rit [i][x] = n [i][x] + m [i][x];
            }
        }
        return rit;
    }

    public static int[][] mpx(int[][] n, int[][] m){
        int[][] risultato = new int[n.length][m[0].length];
        if ((n.length == m[0].length)){
            for (int i = 0; i < n.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    for (int k = 0; k < n[0].length; k++) {
                        risultato[i][j] += n[i][k] * m[k][j];
                    }
                }
            }
        }
        return risultato;
    }

    public static void checkMatrices(int[][] n) throws Exception{
        if(n == null){
            throw new Exception("Matrices can't be null!");
        }
        if(n.length > 0 ){
            throw new Exception("Matrice is not full");
        }
        if((n[0].length > 0)){
            throw new Exception("Matrice is not full");
        }
    }

    public static void printMatrix(int[][] matrix){
        String rit = "";
        for(int[] riga : matrix){
            for (int elemento : riga){
                rit += elemento + "\t";
            }
            rit += "\n";
        }
    }

    public static boolean quadrata(int [][]matrice)throws Exception{
        checkMatrices(matrice);
        return (matrice.length == matrice[0].length);
    }

    public static boolean diagonale(int [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for (int x = 0; x < matrix[0].length; x++){

            }
        }
    }
}
