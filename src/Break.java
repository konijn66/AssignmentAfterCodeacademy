public class Break {

    public Break(){

        for (int x=0;x<100;x=x+2){
            System.out.println(x);
            if(x==10){
                break;
            }
        }

    }

    public static void main(String[] args) {
        Break myBreak=new Break();
    }

}
