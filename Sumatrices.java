public class Sumatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] S = new int[3][3];

         // Matriz A
        System.out.println("Ingrese los elementos de la matriz A (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                while (!scanner.hasNextInt()) { 
                    System.out.print("Entrada no válida. Intente nuevamente: ");
                    scanner.next();
                }
                A[i][j] = scanner.nextInt();
            }
        }
    }

}        