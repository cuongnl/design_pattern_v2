package problem;

public class Tea {

    public void prepareRecipe(){
        boldWater();
        steepTeaBag();
        addLemon();
        pourInCup();
    }

    /**
     * mỗi phương thức tương ứng với 1 bước của thuât toán.
     * Có 1 phương thức để đun sôi nước, pha coffee, rót coffee vào côc và thêm đường và sữa
     */
    //giống với method bên class Cafe
    public void boldWater() {
        System.out.println("bold warter");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding lemon");
    }

    //giống với method bên class Cafe
    public void pourInCup() {
        System.out.println("pouring into cup");
    }
}
