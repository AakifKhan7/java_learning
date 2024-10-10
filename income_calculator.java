import java.util.Scanner;
class SalaryCalculator{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double PROFESSIONAL_TAX = 200;
        double TRANSPORT_ALLOWANCE = 900;
        double basicPay = 0;
        double HouseRentAllowance = 0;
        double dearnessAllowance = 0;
        double otherAllowances = 0;
        double providentFund = 0;
        double incomeTax = 0;

        System.out.print("Enter the Grade Level(A, B, C, D, E or F): ");
        char gradeLevel = sc.next().charAt(0);

        switch (gradeLevel) {
            case 'A':
                basicPay = 60000;
                otherAllowances = 8000;
                break;
            case 'B': 
                basicPay = 50000;
                otherAllowances = 7000;
                break;
            case 'c': 
                basicPay = 40000;
                otherAllowances = 6000;
                break;
            case 'D': 
                basicPay = 30000;
                otherAllowances = 5000;
                break;
            case 'E': 
                basicPay = 20000;
                otherAllowances = 4000;
                break;
            case 'F':
                basicPay = 10000;
                otherAllowances = 3000;
                break;
        }

        System.out.println("city 1 is a tier 1 (metro), city 2 is tier 2 and city 3 is tier 3");
        System.out.print("Enter the city (1,2 or 3): ");
        int houseRentAllowanceCity = sc.nextInt();

        switch (houseRentAllowanceCity) {
            case 1:
                HouseRentAllowance = 0.3 * basicPay;
                break;
            case 2: 
                HouseRentAllowance = 0.2 * basicPay;
                break;
            case 3:
                HouseRentAllowance = 0.1 * basicPay;
                break;
        }

        dearnessAllowance = 0.5 * basicPay;
        providentFund = 0.11 * basicPay;

        double grossPay = basicPay + HouseRentAllowance + dearnessAllowance + otherAllowances + TRANSPORT_ALLOWANCE - providentFund - PROFESSIONAL_TAX;

        double annualSalary = grossPay * 12;

        if (annualSalary > 250000 && annualSalary <= 500000){
            incomeTax = (annualSalary - 250000) * 0.05;
        }
        else if (annualSalary <= 750000){
            incomeTax = (annualSalary - 500000) * 0.1 + 12500;
        }
        else if (annualSalary <= 1000000){
            incomeTax = (annualSalary - 750000) * 0.15 + 37500;
        }
        else if (annualSalary <= 1250000){
            incomeTax = (annualSalary - 1000000) * 0.20 + 75000;
        }
        else if (annualSalary <= 1500000){
            incomeTax = (annualSalary - 1250000) * 0.25 + 125000;
        }
        else{
            incomeTax = (annualSalary - 1500000) * 0.30 + 187500;
        }

        System.out.printf("Gross Pay of an Employee is: %.2f%n", grossPay);
        System.out.printf("Annual income of an Employee is: %.2f%n", annualSalary);
        System.out.printf("Income Tax to be paid by an Employee is: %.2f%n", incomeTax);
        
    }
}