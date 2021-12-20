package handle_problem_v1_OOP;

public class Tea extends CaffeineBeverage {

    public void prepareRecipe() {
        boldWater();
        steepTeaBag();
        addLemon();
        pourInCup();
    }

    /**
     * mỗi phương thức tương ứng với 1 bước của thuât toán.
     * Có 1 phương thức để đun sôi nước, pha coffee, rót coffee vào côc và thêm đường và sữa
     */
    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding lemon");
    }
}
