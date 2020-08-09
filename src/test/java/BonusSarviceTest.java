import static org.junit.jupiter.api.Assertions.*;

class BonusSarviceTest {

    @org.junit.jupiter.api.Test
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

    @org.junit.jupiter.api.Test
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
        long amount = 1000_60;
        boolean registered = true;
        long expected = 40;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisterredAndMoreLimit() {
        BonusSarvice service = new BonusSarvice();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

}