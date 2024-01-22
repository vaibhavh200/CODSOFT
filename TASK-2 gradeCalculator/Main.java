import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total No. of subjects-> ");
        int total_subject = sc.nextInt();
        System.out.println();

        int total_mark = 0;
        int i = 1;
        System.out.println("Reminder: please Enter marks out of 100 only");
        System.out.println();
        while(i<=total_subject){
            System.out.print("Enter your marks obtained in subject "+ i + " : ");
            int mark = sc.nextInt();
            total_mark+=mark;
            i++;
        }
        float averagePercentage = (float) total_mark/(total_subject*100) * 100;
        String average_percentage = String.format("%.2f",averagePercentage);
        char grade;
        if(averagePercentage>=91){
            grade = 'A';
        }
        else if(averagePercentage>=81){
            grade = 'B';
        }
        else if(averagePercentage>=71){
            grade = 'C';
        }
        else if(averagePercentage>=61){
            grade = 'D';
        }
        else if(averagePercentage>=51){
            grade = 'E';
        }
        else{
            grade = 'F';
        }
        System.out.println("------------------------------------------------");
        System.out.println("Here is your performance -> ");
        System.out.println("Total marks : "+ total_mark);
        System.out.println("Average Percentage : "+ average_percentage + "%");
        System.out.println("Grade : "+ grade);

        sc.close();
    }
}