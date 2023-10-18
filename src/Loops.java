public class Loops {
    int TermOne;
    int TermTwo;
    public Loops(){
        for(int x=1;x<11;x++){
            System.out.println(x);
        }

        for(int a=2; a<11;a=a+2){
            System.out.println(a);
        }


    }

    public static void main(String[] args) {
        Loops myLoops=new Loops();
    }
}
