package handle_problem_v1_extend_OOP;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        brew();
        addCondiments();
        boldWater();
        pourInCup();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boldWater() {
        System.out.println("bold warter");
    }

    public void pourInCup() {
        System.out.println("pouring into cup");
    }
}
