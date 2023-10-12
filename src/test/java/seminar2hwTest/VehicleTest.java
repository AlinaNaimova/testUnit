package seminar2hwTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import seminar2hw.Car;
import seminar2hw.Motorcycle;
import seminar2hw.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;
    @BeforeEach
    public void setUp(){
        car = new Car("Toyota", "Camry", 2021);
        motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022);
    }

    //проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    @DisplayName("Car является транспортным средством")
    public void carIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    //проверка того, объект Car создается с 4-мя колесами
    @Test
    @DisplayName("Car создается с 4-мя колесами")
    public void carNumWheelsTest() {
        assertEquals(4, car.getNumWheels());
    }

    //проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    @DisplayName("Motorcycle создается с 2-мя колесами")
    public void motorcycleNumWheelsTest() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    //проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    @DisplayName("Car развивает скорость 60 в режиме тестового вождения")
    public void carTestDriveSpeedTest() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    //проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    @DisplayName("Motorcycle развивает скорость 75 в режиме тестового вождения")
    public void motorcycleTestDriveSpeedTest() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    //проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    @DisplayName("Скорость Car в режиме парковки")
    public void carParkingSpeedTest() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }


    //проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    @DisplayName("Скорость Motorcycle в режиме парковки")
    public void motorcycleParkingSpeedTest() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

    // Добавляем тесты на исключения
    /**
     * Эти тесты(negativeYearForCarThrowsException и negativeYearForMotorcycleThrowsException) проверяют,
     * что конструкторы классов Car и Motorcycle выбрасывают исключение IllegalArgumentException
     * при попытке создать объект с отрицательным годом выпуска. Для этого используется метод assertThrows, который
     * ожидает генерации исключения указанного типа при выполнении лямбда-выражения. Такие тесты помогают обнаружить
     * ошибки валидации данных и защитить программу от некорректного использования.
     */
    @Test
    @DisplayName("Отрицательный год выпуска автомобиля вызывает исключение")
    public void negativeYearForCarThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Car("Toyota", "Camry", -2021));
    }

    @Test
    @DisplayName("Отрицательный год выпуска мотоцикла вызывает исключение")
    public void negativeYearForMotorcycleThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Motorcycle("Harley-Davidson", "Sportster", -2022));
    }
}
