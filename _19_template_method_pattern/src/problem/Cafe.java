package problem;

public class Cafe {

    //các bước thực hiện để pha coffee
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
    public void boldWater() {
        System.out.println("bold warter");
    }

    public void brewCoffeeGrinds() {
        System.out.println("Dripping coffee through filter");
    }

    public void pourInCup() {
        System.out.println("pouring into cup");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding sugar and milk");
    }
}
