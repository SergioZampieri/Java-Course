public class Uso_forEach {
    public static void main(String[] args) {
        int [] array = new int[150];

        for (int i=0; i<array.length; i++){
            array[i] = (int)Math.round(Math.random()*100);
        }

        for (int elemento:array){
            System.out.println(elemento);
        }
    }
}
