public class Arrays_bidimensionales {
    public static void main(String[] args) {
        int [][] matrix = new int[5][5];

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix.length; j++){
                matrix[i][j] = (int) Math.round(Math.random()*100);
            }

        }
        for (int [] fila:matrix){
            System.out.println();
            for (int z:fila){
                System.out.print(z + " ");
            }
        }
    }
}
