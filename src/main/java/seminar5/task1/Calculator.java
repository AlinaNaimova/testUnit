package seminar5.task1;

public class Calculator {
    private Logger logger;

    // Конструктор класса принимает объект Logger, который используется для логирования результатов выполнения операций.
    public Calculator(Logger logger) {
        this.logger = logger;
    }

    // Метод add выполняет сложение двух чисел и логирует результат.
    public int add(int a, int b) {
        int result = a + b;
        logger.log("Сложение: " + a + " + " + b + " = " + result);
        return result;
    }

    // Метод subtract выполняет вычитание двух чисел и также логирует результат.
    public int subtract(int a, int b) {
        int result = a - b;
        logger.log("Вычитание: " + a + " - " + b + " = " + result);
        return result;
    }
}
