package T3_learning;

import java.util.Scanner;

class college_admission {
    
}

class Student{
    String full_name;
    int birth_year;
    String address;
    int marks_Maths;
    int marks_Physics;
    int marks_Chemistry;
    int branch;
    String user_id;
    int fees;

    Scanner sc = new Scanner(System.in);
    void setDetails(){
        System.out.print("Enter you'r full name: ");
        full_name = sc.next();
        System.out.println("Enter Year of birth: ");
        birth_year = sc.nextInt();
        System.out.println("Enter Address: ");
        address = sc.next();
        System.out.println("Enter marks of maths: ");
        marks_Maths = sc.nextInt();
        System.out.println("Enter marks of physics: ");
        marks_Physics = sc.nextInt();
        System.out.println("Enter marks of chemistry: ");
        marks_Chemistry = sc.nextInt();

        System.out.println("press 1 for Mechanical");
        System.out.println("press 2 for Electrical");
        System.out.println("press 3 for computer");
        System.out.println("press 4 for IT");
        System.out.println("press 5 for AIML");
        branch = sc.nextInt();
        
    }

    void createUserId(){
        // user id = first name + birth year

        String first_name = full_name.split(" ")[0];
        user_id = first_name + birth_year;
    }

    void setFees(){
        if( branch == 1 || branch == 2){
            fees = 50000;
        }else{
            fees = 65000;
        }
    }

    void displayData(){
        System.out.println("Full name: " + full_name);
        System.out.println("Year of birth: " + birth_year);
        System.out.println("Address: " + address);
        System.out.println("Maths: " + marks_Maths);
        System.out.println("Physics: " + marks_Physics);
        System.out.println("Chemistry: " + marks_Chemistry);
        System.out.println("Branch: " + branch);
    }

    void updateInformation(){

    }
}
