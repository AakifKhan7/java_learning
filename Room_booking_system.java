import java.util.Scanner;
class HotelRentCalculator{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        double studioPrice = 0;
        double ApartmentPrice = 0;

        
        System.out.print("Enter month in 1 to 12(1 for january and 12 for december) : ");
        int month = sc.nextInt();

        System.out.print("Enter nights you want to stay(Upto 30 Days): ");
        int nightStay = sc.nextInt();

        sc.close();

        if ( month >= 1 && month <= 4){
            studioPrice = 50;
            ApartmentPrice = 60;

            if(nightStay > 3){
                studioPrice = studioPrice - (studioPrice * 0.2);
            }
            else if (nightStay > 7){
                studioPrice = studioPrice - (studioPrice * 0.3);
            }

        }
        else if ( month <= 8){
            studioPrice = 70;
            ApartmentPrice = 80;
            if(nightStay > 3){
                studioPrice = studioPrice - (studioPrice * 0.1);
            }
            else if (nightStay > 7){
                studioPrice = studioPrice - (studioPrice * 0.2);
            }
        }
        else if (month <= 12){
            studioPrice = 80;
            ApartmentPrice = 90;
            if(nightStay > 3){
                studioPrice = studioPrice - (studioPrice * 0.05);
            }
            else if (nightStay > 7){
                studioPrice = studioPrice - (studioPrice * 0.1);
            }
        }
        else{
            System.out.println("Invalid month");
        }

        if(nightStay > 7){
            ApartmentPrice = ApartmentPrice - ApartmentPrice * 0.1;
        }

        System.out.println("Studio Rent for " + nightStay + "Nights is $" + (studioPrice * nightStay));
        System.out.println("Apartment Rent for " + nightStay + "Nights is $" + (ApartmentPrice * nightStay));

    }
}