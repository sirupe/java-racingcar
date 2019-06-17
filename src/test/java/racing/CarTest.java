package racing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racing.vo.Car;

class CarTest {
    private Car car;
    
    @BeforeEach
    void setUp() {
        car = new Car(TestData.DEFAULT_CAR_NAME);
    }
    
    @Test
    void constructorTest() {
        Assertions.assertThat(car.getName()).isEqualTo(TestData.DEFAULT_CAR_NAME);
        Assertions.assertThat(car.getPosition()).isEqualTo(Car.DEFAULT_POSITION);
    }
    
    @Test
    void forwardTest() {
        car.forward();
        Assertions.assertThat(car.getPosition()).isEqualTo(TestData.ONE_MOVED_POSITION);
    }
}
