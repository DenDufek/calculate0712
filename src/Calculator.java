import java.util.function.BinaryOperator;

public class Calculator {
    public static void main(String[] args) {
        // Лямбда-вирази для арифметичних операцій
        BinaryOperator<Double> addition = (a, b) -> a + b;
        BinaryOperator<Double> subtraction = (a, b) -> a - b;
        BinaryOperator<Double> multiplication = (a, b) -> a * b;
        BinaryOperator<Double> division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        };

        // Приклади використання лямбда-виразів для арифметичних операцій
        System.out.println("Addition: " + calculate(5, 3, addition));
        System.out.println("Subtraction: " + calculate(5, 3, subtraction));
        System.out.println("Multiplication: " + calculate(5, 3, multiplication));
        System.out.println("Division: " + calculate(5, 3, division));
    }

    // Метод для виконання арифметичної операції за допомогою лямбда-виразу
    private static double calculate(double a, double b, BinaryOperator<Double> operator) {
        return operator.apply(a, b);
    }
}
