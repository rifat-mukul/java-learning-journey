public class LogicalOperator {
    public static void main(String[] args) {
        int temperature = 25;
        boolean isWarm = temperature > 20 && temperature < 30; // && it is and opoerator

        boolean hasHighIncome = true;
        boolean hasGoodCradit = true;
        boolean isEligibleApply = hasHighIncome || hasGoodCradit; // || it is or operator

        boolean hasCriminalRecord = false;
        boolean iseligible = (hasGoodCradit || hasHighIncome) && !hasCriminalRecord;


        System.out.println(isWarm);
        System.out.println(isEligibleApply);
        System.out.println(iseligible);

    }
}
