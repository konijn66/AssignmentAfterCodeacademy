public class PersonDatEncap {
    private String name="joe";
    private int age=37;
    private String address="314 elm rd";

    public PersonDatEncap(){

        getPerson();

    }

    public static void main(String[] args) {
        PersonDatEncap myPersonDatEncap= new PersonDatEncap();
    }

    public String getName(){
        return name;
    }
    public int getAge(){
      return age;
    }
    public String getAddress(){
        return address;
    }

    public void getPerson(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getAddress());
    }


}
