import java.util.ArrayList;

public class ArrList {
    public ArrayList<Integer> nums;
    public int placeholder;

    public ArrList(){

        nums=new ArrayList<Integer>();
        nums.add(12);
        nums.add(24);
        nums.add(23);
        nums.add(-98);
        nums.add(71);
        nums.remove(1);
        nums.remove(3);

        System.out.println("size of nums = "+ nums.size());
        System.out.println(nums);

        System.out.println(nums.contains(71));
        System.out.println(nums.contains(-98));

        for (int x=0;x<nums.size()-1;x++){
            if (nums.get(x)<nums.get(x+1)){
                placeholder=nums.get(x);
                nums.set(x,nums.get(x+1));
                nums.set((x+1),placeholder);
            }
        }
        System.out.println("ordered largest to smallest: " +nums);
    }

    public static void main(String[] args) {
       ArrList myArrList=new ArrList();
    }

}
