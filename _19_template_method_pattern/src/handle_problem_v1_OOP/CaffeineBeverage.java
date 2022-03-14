package handle_problem_v1_OOP;

public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boldWater();
        pourInCup();
    }

    public void boldWater() {
        System.out.println("bold warter");
    }
    public void pourInCup() {
        System.out.println("pouring into cup");
    }
}
