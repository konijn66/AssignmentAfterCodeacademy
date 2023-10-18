public class MethodPar {


    public MethodPar(){
        findGreater((int)(100*Math.random()),(int)(100*Math.random()));
        findSum(12,20);
        findSum(13.2, 79.83);

        ReverseString("It is no longer Wednesday");
    }


    public static void main(String[] args) {
        MethodPar myMethodPar=new MethodPar();
    }

    public void findGreater(int x, int y){
        System.out.println(x +" "+y);
       if(x>y){
           System.out.println("x is greater");
       }
       else{
           System.out.println("y is greater");
       }
    }

    public void findSum(int a, int b){
        System.out.println(a+b);
    }

    public void findSum(double a, double b){
        System.out.println(a+b);
    }

    public void ReverseString(String input){
        System.out.println(input);
        for(int z=input.length()-1;z>=0;z--){
            System.out.print(input.charAt(z));
        }
    }
}
