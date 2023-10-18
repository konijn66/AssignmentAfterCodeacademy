public class StudentObjOr {
    String name;
    int age;
    int grade;

    public StudentObjOr(String Sname, int Sage, int Sgrade){
        name=Sname;
        age=Sage;
        grade=Sgrade;
    }

    public void print(){
        System.out.println(name+" is a student who is "+age+" years old and has a/n "+grade+" in this class.");
    }



}
