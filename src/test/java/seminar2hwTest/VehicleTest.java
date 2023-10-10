package seminar2hwTest;

import org.junit.jupiter.api.DisplayName;
import seminar2hw.Car;
import seminar2hw.Motorcycle;
import seminar2hw.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    //проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    @DisplayName("Car является транспортным средством")
    public void instanceofTest() {
        Vehicle car = new Car("Toyota", "Camry", 2021);
        assertTrue(car instanceof Vehicle);
    }

    //проверка того, объект Car создается с 4-мя колесами
    @Test
    @DisplayName("Car создается с 4-мя колесамим")
    public void carNumWheelsTest() {
        Car car = new Car("Toyota", "Camry", 2021);
        assertEquals(4,car.getNumWheels());
    }

    //проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    @DisplayName("Motorcycle создается с 2-мя колесами")
    public void motorcycleNumWheelsTest() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022);
        assertEquals(2,motorcycle.getNumWheels());
    }

    //проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    @DisplayName("Car развивает скорость 60 в режиме тестового вождения")
    public void carTestDriveSpeedTest() {
        Car car = new Car("Toyota", "Camry", 2021);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    //проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    @DisplayName("Motorcycle развивает скорость 75 в режиме тестового вождения")
    public void motorcycleTestDriveSpeedTest() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    //проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    @DisplayName("Скорость Car в режиме парковки")
    public void carParkingSpeedTest() {
        Car car = new Car("Toyota", "Camry", 2021);
        car.testDrive();;
        car.park();
        assertEquals(0, car.getSpeed());
    }


    //проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    @DisplayName("Скорость Motorcycle в режиме парковки")
    public void motorcycleParkingSpeedTest() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022);
        motorcycle.testDrive();;
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
