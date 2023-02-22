public class primeNumbers {
    public static void main(String[] args) {

        int counter=0;

        for (int i = 1; i < 100; i++) {
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    counter++;
                }
                // STOPSHIP: 22.02.2023
            }
            if(counter==2){
                System.out.print(" "+i);
            }
            counter=0;
        }
    }
}

