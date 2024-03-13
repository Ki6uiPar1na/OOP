public class Calculate_Taxes {
    public static void main(String[] args) {
        double netValue = 9.99;
        double vatRate = 0.23;

        // Calculate VAT
        double vatAmount = netValue * vatRate;

        // Calculate gross value
        double grossValue = netValue + vatAmount;

        // Multiply gross value by 10000
        double grossValueMultipliedBy10000 = grossValue * 10000;

        // Calculate gross value excluding VAT
        double grossValueExcludingVAT = grossValue / (1 + vatRate);

        System.out.println("Gross value: " + grossValue);
        System.out.println("Gross value multiplied by 10000: " + grossValueMultipliedBy10000);
        System.out.println("Gross value excluding VAT: " + grossValueExcludingVAT);
    }
}