import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.stats.BonusSarvice;

import static org.junit.jupiter.api.Assertions.*;

class BonusSarviceTest {

    @ParameterizedTest(name = "[{index}] {0}" )
    @CsvSource(
            value ={
            "'registered user, bonus under limit', 1000_60, true, 30",
            "'registered user, bonus over limit', 1_000_000_60, true, 500",
            "'unregistered user, bonus under limit', 1000_60, false, 10",
            "'unregistered user, bonus over limit', 1_000_000_60, false, 500"

     }, delimiter = ',')
    void shouldCalculateForRegisterredAndUnderLimit() {
        BonusSarvice service = new BonusSarvice();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateForNotRegisterredAndUnderLimit() {
        BonusSarvice service = new BonusSarvice();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisterredAndMoreLimit() {
        BonusSarvice service = new BonusSarvice();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisterredAndMoreLimit() {
        BonusSarvice service = new BonusSarvice();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

}