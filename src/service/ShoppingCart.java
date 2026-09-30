// Пакет сервиса, содержащий классы для реализации бизнес-логики
package service;

// Импорт интерфейса Discountable и класса Food из пакета модели

import model.Discountable;
import model.Food;

import static model.constants.Discount.DEFAULT_DISCOUNT;

// Класс ShoppingCart, представляющий корзину покупок
public class ShoppingCart {
    // Массив продуктов в корзине
    private final Food[] items;

    // Конструктор класса ShoppingCart, принимающий массив продуктов
    public ShoppingCart(Food[] items) {
        this.items = items; // Инициализация массива продуктов
    }

    // Метод для расчета общей суммы без учета скидок
    public double getTotalSumWithoutDiscount() {
        double sum = 0; // Инициализация суммы
        for (Food item : items) { // Перебор продуктов в корзине
            sum += item.getAmount() * item.getPrice(); // Добавление стоимости продукта к сумме
        }
        return sum;
    }

    public double getTotalSumWithDiscount() {
        double sum = 0;
        for (Food item : items) {
            if (item instanceof Discountable) {
                sum += item.getAmount() * item.getPrice();

            } else {
                sum += item.getAmount() * item.getPrice() * DEFAULT_DISCOUNT;
            }
        }
        return sum;
    }

    public double getTotalSumOfVegetarianProductsWithoutDiscount() {
        double sum = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                sum += item.getAmount() * item.getPrice();
            }
        }
        return sum;
    }
}