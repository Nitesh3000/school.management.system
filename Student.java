/*
 * This class is responsible for keeping the track of students, fees, grade and fees paid 
 */
public class Student {
    // fields
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    // constructor
    /**
     * to create like this use / followed by ** and hit enter
     * Fees for every student is 30,000
     * Fees paid initially is 0
     * 
     * @param id    : unique
     * @param name
     * @param grade
     */
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Not going to alter students name, students id
    /**
     * Used to update the student's grade
     * 
     * @param grade new grade of the student
     */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * fees paid = 10000 + 5000 + 15000
     * keep addig the fees to the fees paid field
     * Add the fees to the fees paid
     * The school is goinog to receive the funds.
     * 
     * @param fees the fees that the student pays
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void UpdateFeesPaid(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param feesPaid the feesPaid to set
     */
    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }

    /**
     * @param feesTotal the feesTotal to set
     */
    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }

}