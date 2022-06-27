public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long profit = service.calculate(3_000, false);
        System.out.println("Количество бонусов:    " + profit);
    }
}
