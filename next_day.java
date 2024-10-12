import  java.util.Scanner;
class NextDay{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int daysInMonth = 0;
        
        System.out.print("Enter Today date: ");
        int nowDate = sc.nextInt();
        System.out.print("Enter month(in number 1-12): ");
        int nowMonth = sc.nextInt();

        if(nowMonth > 12){
            System.out.println("Invalid Month");
        }
        else{
            System.out.print("Enter year: ");
            int nowYear = sc.nextInt();
        
            int next_day = nowDate + 1;


            switch (nowMonth) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth = 31;
                    if(nowDate > daysInMonth){
                        System.out.println("Invalid Date");
                    }
                    else{
                        if (next_day > daysInMonth){
                            next_day = 1;
                            nowMonth += 1;
                            if (nowMonth > 12){
                                nowYear += 1;
                                nowMonth = 1;
                            }
                        }
                        System.out.println("next date is: "+ next_day + "-" + nowMonth + "-" + nowYear);
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    if (nowDate > daysInMonth){
                        System.out.println("Invalid Date");
                    }
                    else{
                        if (next_day > daysInMonth){
                            next_day = 1;
                            nowMonth += 1;
                        }
                        System.out.println("next date is: "+ next_day + "-" + nowMonth + "-" + nowYear);
                    }

                    break;
                case 2:
                    if (nowYear % 400 == 0 || nowYear % 4 == 0 && nowYear % 100 != 0){
                        daysInMonth = 29;
                    }
                    else {
                        daysInMonth = 28;
                    }
                    if (nowDate > daysInMonth){
                        System.out.println("Invalid Date");
                    }
                    else{
                        if (next_day > daysInMonth){
                            next_day = 1;
                            nowMonth += 1;
                        }
                        System.out.println("next date is: "+ next_day + "-" + nowMonth + "-" + nowYear);
                    }
            }
        }
    }
}
