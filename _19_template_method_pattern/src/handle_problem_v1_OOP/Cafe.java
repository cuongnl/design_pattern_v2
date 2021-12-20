package handle_problem_v1_OOP;

public class Cafe extends CaffeineBeverage {

    //các bước thực hiện để pha coffee
    @Override
    public void prepareRecipe() {
        boldWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    /**
     * mỗi phương thức tương ứng với 1 bước của thuât toán.
     * Có 1 phương thức để đun sôi nước, pha coffee, rót coffee vào côc và thêm đường và sữa
     */
    public void brewCoffeeGrinds() {
        System.out.println("Dripping coffee through filter");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding sugar and milk");
    }
}
