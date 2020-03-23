package management;

public class Director extends Manager{

    private double budget;

    public Director(String name, String nin, double salary, String deptName, double budget) {
        super(name, nin, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public float payBonus(){
        return  ((float)this.getSalary() * 2)/100;
    }

}



//    Create a constructor for Director that includes the parameters needed for Manager and the budget parameter.
//        Create a getter method for this property.
//        Test all methods.