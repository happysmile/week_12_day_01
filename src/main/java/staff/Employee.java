package staff;

public abstract class Employee {
    private String name;
    private String nin;
    private double salary;


    public Employee(String name, String nin, double salary) {
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getNin() {
        return this.nin;
    }

    public void setName(String name) {
        if(this.name != null){
            this.name = name;
        }
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double increment){
        if(increment>0){
            this.salary += increment;
        }
    }

    public float payBonus(){
        return  (float)this.salary/100;
    }

}



