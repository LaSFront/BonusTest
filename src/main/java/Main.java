public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        long bonus = service.calculate(1_000, true);
        System.out.println("1. Начислено " + bonus + " бонусов.");

        bonus = service.calculate(1_000_000, true);
        System.out.println("2. Начислено " + bonus + " бонусов.");
    }
}
