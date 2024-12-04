class InsurancePremiumCalculator{
    public static void main(String []args){

        int age = Integer.parseInt(args [0]);
        double annualIncome = Double.parseDouble(args [1]);
        char occupation = args[2].charAt(0);

        double basePremium = 1000;
        double finalPremium = basePremium;

        if (age > 0 && age < 25){
            finalPremium += 500;
        }
        else if(age < 40){
            finalPremium += 300;
        }
        else if (age >= 40){
            finalPremium += 200;
        }
        else{
            System.out.println("Invalid Age");
        }

        if(annualIncome > 0 && annualIncome < 20000){
            finalPremium += 400;
        }
        else if (annualIncome <= 50000){
            finalPremium += 300;
        }
        else if( annualIncome > 50000){
            finalPremium += 200;
        }
        else{
            System.out.println("Invalid Income");
        }

        if (occupation  == 'M' || occupation == 'm'){
            finalPremium += 200;
        }
        else if(occupation == 'H' || occupation == 'h'){
            finalPremium += 500;
        }

        System.out.println("The final insurance premium is: $" + finalPremium);

    }
}