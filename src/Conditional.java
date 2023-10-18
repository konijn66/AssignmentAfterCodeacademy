public class Conditional {
    public int[] EvenOddNumber;
    public int[] PosNegNumber;
    public int[] PrimeOrNotNumber;

    public Conditional(){
        EvenOddNumber=new int[100];
        for (int x=0;x<100;x++) {
            EvenOddNumber[x]=x;
            //System.out.println(number[x]);
        }
        //evenOrOdd();

        PosNegNumber=new int[100];
        for (int y=-50;y<50;y++){
            PosNegNumber[y+50]=y;
            //System.out.println(y);
        }
        //checkPositive();

        PrimeOrNotNumber=new int[100];
        for(int z=0;z<100;z++){
            PrimeOrNotNumber[z]=z;
        }

        checkPrime();

    }

    public static void main(String[] args) {Conditional myConditional=new Conditional();}

    //check if number is even or odd
    public void evenOrOdd(){
        for(int x=0;x<100;x++) {
            if (EvenOddNumber[x] % 2 == 0) {
                System.out.println(EvenOddNumber[x]);
            }
        }
    }

    public void checkPositive(){
        for (int y=-50;y<50;y++){
            if(PosNegNumber[y+50]<0) {
                System.out.println("Negative!");
            }
            if(PosNegNumber[y+50]>0) {
                System.out.println("Positive!");
            }
            if(PosNegNumber[y+50]==0){
                System.out.println("0");
            }
        }
    }

    public void checkPrime(){
        for(int z=0;z<100;z++) {
            if (PrimeOrNotNumber[z] % 2 == 0&& PrimeOrNotNumber[z]!=2) {
               // System.out.println(PrimeOrNotNumber[z]+" is divisible by 2");
               continue;
            }
            if (PrimeOrNotNumber[z] % 3 == 0&& PrimeOrNotNumber[z]!=3) {
                continue;
            }
            if (PrimeOrNotNumber[z] % 4 == 0) {
                continue;
            }
            if (PrimeOrNotNumber[z] % 5 == 0&& PrimeOrNotNumber[z]!=5) {
                continue;
            }
            if (PrimeOrNotNumber[z] % 7 == 0&& PrimeOrNotNumber[z]!=7) {
                continue;
            }
            System.out.println(PrimeOrNotNumber[z] + " is prime!");
        }


    }

}
