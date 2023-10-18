import java.util.ArrayList;

public class MainObjOr {
    public StudentObjOr[] Students;
    public int total;
    public int avgGrade;

    public MainObjOr(){

        Students=new StudentObjOr[3];
        Students[0]=(new StudentObjOr("Myriam", 11, 88));
        Students[1]=(new StudentObjOr("Edward", 12, 79));
        Students[2]=(new StudentObjOr("Rickey", 11, 94));

       for(int x=0;x<3;x++) {
           Students[x].print();
       }

        CalcAvgGrade();

    }

    public static void main(String[] args) {
        MainObjOr myMainObjOr=new MainObjOr();
    }

    public void CalcAvgGrade(){
        for(int x=0; x<3;x++){
            total= total+ Students[x].grade;
        }
        avgGrade=total/(Students.length);
        System.out.println("Average grade = "+avgGrade);
    }


}
