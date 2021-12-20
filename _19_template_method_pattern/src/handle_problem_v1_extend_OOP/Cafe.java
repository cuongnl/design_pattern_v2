package handle_problem_v1_extend_OOP;

public class Cafe extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping cofffe throught filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
