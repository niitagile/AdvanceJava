package Encapsulation;
class Student{
    private int rollno;
    private String name;
    private int eng, hindi;

    public int getEng() {
        return eng;
    }

    public int getHindi() {
        return hindi;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private int total(){
        return eng+hindi;
    }
    public void display(){
        System.out.println("rollno="+rollno);
        System.out.println("name="+name);

        System.out.println("total marks="+total());
    }
}
public class StrongerEncapsulation
 {

    public static void main(String[] args) {
       Student student=new Student();
       student.setRollno(12);
       student.setName("Kavita");
        student.setEng(34);
        student.setHindi(89);
        student.display();
    }
}
