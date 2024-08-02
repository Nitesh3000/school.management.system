import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) { // psvm
        Teachers ravi = new Teachers(1, "Ravi", 500);
        Teachers hena = new Teachers(2, "Hena", 600);
        Teachers lina = new Teachers(3, "Lina", 400);

        List<Teachers> teacherList = new ArrayList<>();
        teacherList.add(ravi);
        teacherList.add(hena);
        teacherList.add(lina);

        Student rahul = new Student(1, "Rahul", 5);
        Student rakhi = new Student(2, "Rakhi", 3);
        Student akriti = new Student(3, "Akriti", 12);

        List<Student> studentList = new ArrayList<>();
        studentList.add(rahul);
        studentList.add(rakhi);
        studentList.add(akriti);

        School sss = new School(teacherList, studentList);
        System.out.println("sss has earned : " + sss.getTotalMoneySpent());
        System.out.println("sss has spent : " + sss.getTotalMoneyEarned());

    }
}
