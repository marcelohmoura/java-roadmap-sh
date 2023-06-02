package dataTypesAndVariables;

public class exercise01 {
    public static void main(String[] args) {
        int januarySpending = 15000;
        int februarySpending = 23000;
        int marchSpending = 17000;
        int totalSpending = januarySpending + februarySpending + marchSpending;
        float spendingAverage = (float) totalSpending / 3;

        System.out.println("Total de gastos no trimestre: " + totalSpending);
        System.out.println("Média de gastos: " + spendingAverage);
    }
}
