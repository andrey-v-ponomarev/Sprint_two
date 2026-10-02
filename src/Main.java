import model.Apple;
import model.Food;
import model.constants.Colour;
import service.ShoppingCart;
import model.Meat;
import model.Apple;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApples = new Apple(10, 50, Colour.RED);
        Food greenApples = new Apple(8, 60, Colour.GREEN);
        Food[] products = {meat, redApples, greenApples};
        ShoppingCart cart = new ShoppingCart(products);
        System.out.printf("Общая сумма без скидки: %.2f%n", cart.getTotalSumWithoutDiscount());
        System.out.printf("Общая сумма со скидкой: %.2f%n", cart.getTotalSumWithDiscount());
        System.out.printf("Сумма вегетарианских продуктов без скидки: %.2f%n", cart.getTotalSumOfVegetarianProductsWithoutDiscount());
    }
}