package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.print("0123456789012345678901\n" +
                "         __\n" +
                " _(\\    |@@|\n" +
                "(__/\\__ \\--/ __\n" +
                "   \\___|----|  |   __\n" +
                "       \\ }{ /\\ )_ / _\\\n" +
                "       /\\__/\\ \\__O (__\n" +
                "      (--/\\--)    \\__/\n" +
                "      _)(  )(_\n" +
                "     `---''---`\n");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        int x = 'Z';
        int y = 0xface;
        int z = 012;
        int i = (int) 80L; //type-casting float to int (same for line 35 to 38)
        int o = (int) 44e-1f;
        int u = (int) 5.5f;
        int w = (int) 8.88e1;
        int q = (int) 99.9;
        int result = (x+y+z+i+o+u+w+q);
        System.out.println(result);

    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner scan  = new Scanner(System.in);
        int first_digit = scan.nextInt();
        int second_digit = scan.nextInt();
        int result = first_digit + second_digit;
        System.out.println(result);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scan.nextInt();
        System.out.print("y: ");
        int y = scan.nextInt();
        System.out.println("After Swap:");
        if (x != y ){
            System.out.println("x: "+ y +"\ny: "+x);
        }
        else{System.out.println("x: "+ x +"\ny: "+y);}

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here, if else
        Scanner scan = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = scan.nextInt();
        System.out.print("n2: ");
        int n2 = scan.nextInt();
        if (n1>n2){
            System.out.println("n1 > n2");
        } else if (n1<n2) {
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson() {
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int revenue = scan.nextInt();
        if (revenue < 0 | revenue >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (revenue >= 0 & revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (revenue >= 20000 & revenue < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (revenue >= 50000 & revenue < 80000) {
            System.out.println("Good Sales Revenue");
        } else if (revenue >= 80000 & revenue < 100000) {
            System.out.println("Excellent Sales Revenue");
        }
    }
    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int Class = scan.nextInt();
        switch (Class){
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here, divide with rest '%'
        Scanner scan = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scan.nextInt();
        int leap = year%4 + year%100 - year%400; //
        switch (leap) {
            case 0:
                System.out.println("Leapyear");
                break;
            default:
                System.out.println("Not a Leapyear");
                break;
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scan.nextInt();
        int reveresed = 0;
        while (number !=0){
            int last_digit = number%10;
            reveresed = reveresed * 10 + last_digit;
            // cut last_digit
            number /= 10;
        }
        System.out.println(reveresed);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}