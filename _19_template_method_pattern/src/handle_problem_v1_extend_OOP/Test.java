package handle_problem_v1_extend_OOP;

public class Test {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.prepareRecipe();

        System.out.println("==================");

        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
