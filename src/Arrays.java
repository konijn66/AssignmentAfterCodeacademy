public class Arrays {
    public int[] places;
    public int[] evens;
    public int sum;
    public int maxnum;

    public Arrays(){
        places=new int[4];
        for(int x=0;x<4;x++){
            places[x]=x;
        }

       printArray();

       sumArray();
       findMax();
    }

    public static void main(String[] args) {
        Arrays myArray=new Arrays();
    }

    public void printArray(){
        for(int x=0;x<4;x++){
            System.out.println(places[x]);
        }

    }

    public void sumArray(){
      //  evens=new int[50];

      /* for(int z=0;z<50;z++) {
           for (int y = 0; y < 100; y = y + 2) {
               evens[z] = y;
               System.out.println("evens"+z+"="+evens[z]);
           }
       } */

        for(int x=0;x<4;x++) {
                sum=sum+places[x];
               // System.out.println("current sum is "+sum);
        }
        System.out.println(sum);

    }

    public void findMax(){
        for (int x=0;x<4;x++){
            if (places[x]>maxnum){
                maxnum=places[x];
            }
        }
        System.out.println("max num" +maxnum);
    }


}
