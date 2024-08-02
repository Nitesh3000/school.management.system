
import java.util.List;

/**
 * Many teachers, many students
 * Implements teachers and student using ArrayList
 */
public class School {
    private List<Teachers> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;
    
    /**
     * 
     * @param teacher list of teachers in the school
     * @param student list of students in the school
     */
    public School(List<Teachers> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    /**
     * @return List<Teachers> return the teacher
     */
    public List<Teachers> getTeacher() {
        return teachers;
    }

    /**
     * @param teacher the teacher to set
     */
    public void addTeacher(Teachers teacher) {
        teachers.add(teacher);
    }

    /**
     * @return List<Student> return the student
     */
    public List<Student> getStudent() {
        return students;
    }

    /**
     * @param student the student to set
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * @return int return the totalMoneyEarned
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * @param totalMoneyEarned the totalMoneyEarned to set
     */
    public void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned+=MoneyEarned;
    }

    /**
     * @return int return the totalMoneySpent
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * @param totalMoneySpent the totalMoneySpent spent giving salary to the teacher
     */  
    public void updateTotalMoneySpent(int MoneySpent) {
        totalMoneySpent -= MoneySpent;
    }

}
