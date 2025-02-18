/**
 * This class is responsible for keeping the track of teacher's name, id, salary
 */
public class Teachers {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * 
     * @param id     unique
     * @param name
     * @param salary unique
     */
    public Teachers(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    /**
     * used ot update the salary of the teacher
     * 
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
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
     * Adds to salary
     * Removes from the total money earned by the school
     * 
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
    public int totalSalaryEarned(){
        return salaryEarned;
    }

}
