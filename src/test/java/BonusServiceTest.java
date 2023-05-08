import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    public void testRegisteredUnderLimited() {
        BonusService service = new BonusService();

        long expected = 30;
        long actual = service.calculate(1_000, true);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRegisteredOverLimit() {
        BonusService service = new BonusService();

        long expected = 500;
        long actual = service.calculate(1_000_000, true);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnregisteredUnderLimited() {
        BonusService service = new BonusService();

        long expected = 10;
        long actual = service.calculate(1_000, false);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnregisteredOverLimited() {
        BonusService service = new BonusService();

        long expected = 500;
        long actual = service.calculate(1_000_000, false);

        Assertions.assertEquals(expected, actual);
    }

}
