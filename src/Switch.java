public class Switch {
    public String Day;
    public int num;
    public int num2;

    public Switch(){
        num=(int)(7*Math.random());
        System.out.println(num);

            switch(num){
                case 0:
                    Day="Monday";
                    break;
                case 1:
                    Day="Tuesday";
                    break;
                case 2:
                    Day="Wednesday";
                    break;
                case 3:
                    Day="Thursday";
                    break;
                case 4:
                    Day="Friday";
                    break;
                case 5:
                    Day="Saturday";
                    break;
                case 6:
                    Day="Sunday";
                    break;
            }
        System.out.println(Day);


            num2=(int)(100*Math.random());
            System.out.println(num2);


            switch(num2/10){

                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                   // System.out.println(num2+ " "+num2/10);
                    System.out.println("F");
                    break;
                case 6:
                    //System.out.println(num2+ " "+num2/10);
                    System.out.println("D");
                    break;
                case 7:
                    //System.out.println(num2+ " "+num2/10);
                    System.out.println("C");
                    break;
                case 8:
                   // System.out.println(num2+ " "+num2/10);
                    System.out.println("B");
                    break;
                case 9:
                    //System.out.println(num2+ " "+num2/10);
                    System.out.println("A");
                    break;
            }
    }

    public static void main(String[] args) {
        Switch mySwitch=new Switch();
    }
}
