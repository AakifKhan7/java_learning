import java.util.Scanner;

class LineReader {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter count of lines: ");
        int n = sc.nextInt();
        sc.nextLine();
        sc.close();
        int lineCount = 0;
        int lineAE = 0; // line which start with 'A' or start with 'E' 

        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter line " + (i + 1) + ": ");
            lines[i] = sc.nextLine();
            if(lines[i].equals("exit")) {
                break;
            }
            else{
                lineCount++;
                if(lines[i].charAt(0) == 'A' || lines[i].charAt(0) == 'E' || lines[i].charAt(0) == 'a' || lines[i].charAt(0) == 'e') {
                    lineAE++;
                }
            }
        }
        System.out.println("Total lines: " + lineCount);

        for(int i = 0; i < lineCount; i++) {
            System.out.println(lines[i]);
        }
        System.out.println("Entered Lines count: "+ lineCount);
        System.out.println("Lines starting with 'A' or 'E': " + lineAE);
    }
}
