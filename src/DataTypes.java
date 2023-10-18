public class DataTypes {

    byte red=2;
    short orange=-37;
    int yellow=1234567;
    long green=1234567891;
    double blue= 2.222;
    char purple='p';
    boolean isPink=true;

    double DoubleToInt=11*(Math.random());
    int AsInt;

    int IntToDouble=(int)(10*(Math.random()));
    double AsDouble;


    public DataTypes(){
        printDataTypes();

        //ConvertToInt();

       // ConvertToDouble();
    }

    public static void main(String[] args) {
        DataTypes myDataTypes= new DataTypes();
    }

   public void printDataTypes(){
        System.out.println("byte:" +red+" short:"+orange+" int:"+yellow+" " +
                "long:"+green+" double:"+blue+" char:"+purple+" boolean:"+isPink);
   }

    public void ConvertToInt(){
        System.out.println(DoubleToInt);
        AsInt= (int)DoubleToInt;
        System.out.println(AsInt);
    }

    public void ConvertToDouble(){
        System.out.println(IntToDouble);
        AsDouble=IntToDouble;
        System.out.println(AsDouble);
    }

    public void PrintingDatatypes(){

    }


}
