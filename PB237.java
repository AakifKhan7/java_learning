import java.util.Scanner;
class PB237{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        double previousBillSeptember = 1774.86;
        double gstPercentage = 0.18;

        double pricePerUnitBeforeOctober = 0.0;

        System.out.print("Enter the number of units used in october: ");
        int unitUsedInOctober = sc.nextInt();

        sc.close();
        
        double billOctober = 0.0;

        if(unitUsedInOctober < 50){
            pricePerUnitBeforeOctober = 2.0;
        }
        else if(unitUsedInOctober <= 250){
            pricePerUnitBeforeOctober = 10.0;
        }
        else if(unitUsedInOctober <= 350){
            pricePerUnitBeforeOctober = 13.0;
        }
        else if(unitUsedInOctober <= 500){
            pricePerUnitBeforeOctober = 18;
        }
        else{
            pricePerUnitBeforeOctober = 25.0;
        }

        billOctober = unitUsedInOctober * (pricePerUnitBeforeOctober + 5);

        double billWithGstOctober = billOctober + billOctober * gstPercentage;

        double billDifference = billWithGstOctober - previousBillSeptember;

        System.out.println("Bill for September (including GST): Rs. " + previousBillSeptember);
        System.out.println("Bill for October (including GST): Rs. " + billWithGstOctober);
        System.out.println("Difference between September and October bills: Rs. " + billDifference);

    }
}