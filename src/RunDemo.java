public class RunDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL ", "Oracle Corporation");

        double resultChangePercent = stock.getChangePercent(34.5, 34.35);

        System.out.println("Information the share");//Cổ phiếu

        System.out.println("ID the share : " + stock.getSymbol());

        System.out.println("Name the share : " + stock.getName());

        System.out.println("Result change percent the share : " + resultChangePercent + "%");
    }
}
