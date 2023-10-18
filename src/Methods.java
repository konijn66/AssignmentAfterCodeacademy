public class Methods {
    String input;
    int ChangeIndex;
    int num1;
    int num2;
    int greatest;
    public Methods(){
        ReverseAString();
       MaxNumber();
    }

    public static void main(String[] args) {
        Methods myMethods=new Methods();
    }

    public void ReverseAString(){
        input=("It is Wednesday");
        System.out.println(input);
       // System.out.println("testing");
        //System.out.println(input.length());

        for(int z=input.length()-1;z>=0;z--){
            //System.out.println(z);
            //System.out.println("reversing");
            System.out.print(input.charAt(z));
        }

       // System.out.println(input.length());
        //System.out.println(input.indexOf("e"));

       /* for(int x=0;x<input.length();x++){
           System.out.println( "At character "+x+" the letter is "+input.charAt(x));
           ChangeIndex=input.length()-x;
           //input.charAt(x)=input.charAt(ChangeIndex);
           System.out.println(input.indexOf(input.charAt(x)));

        }
        System.out.println(input); */


    }

    public void MaxNumber(){
        num1=(int)(100*(Math.random()));
        num2=(int)(100*(Math.random()));
        System.out.println("num1="+num1+"  num2="+num2);
        greatest=num2;

        if(num1>num2){
            greatest=num1;
        }
        System.out.println("Max=" +greatest);

    }


}
