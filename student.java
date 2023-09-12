package task1;

import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the marks of five subject");
        int sub_1=sc.nextInt();
        int sub_2=sc.nextInt();
        int sub_3=sc.nextInt();
        int sub_4=sc.nextInt();
        int sub_5=sc.nextInt();
        float total;
        float average;
        float percentage;
        char grade;
        total=sub_1+sub_2+sub_3+sub_4+sub_5;
        average=(float)(total/5.0);
        percentage=(float)(total/500.0*100);
        if(percentage>=90 && percentage<=100) {
            grade='A';
        }
        else if(percentage>=80 && percentage<90){
                grade='B';
            }
        else if(percentage>=70 && percentage<80){
            grade='C';
        }
        else if (percentage>=60 && percentage<70){
            grade='D';
        }
        else if (percentage>=50 && percentage<60){
            grade='E';
        }
        else
          grade='F';
        System.out.println("total number is - "+total);
        System.out.println("average of the number is - "+average);
        System.out.println("percentage of the student - "+percentage);
        System.out.println("grade of the student - "+grade);

    }
}
