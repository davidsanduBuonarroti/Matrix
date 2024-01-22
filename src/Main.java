public class Main {
    public static void main(String[] args) throws Exception {

        int m[][] = {
                {7, 3, 5},
                {9, 3, 9}

        };

        int n[][] = {
                {5, 5},
                {9, 4},
                {1, 3}
        };

        int n2232[][] = {
                {10, 5},
                {9, 6},
                {8, 4}
        };



        Matrice.printMatrix(n);
        System.out.println();
        Matrice.printMatrix(Matrice.mpx(m,n));
        System.out.println();
        Matrice.printMatrix(Matrice.somma(n,n2232));

    }
}