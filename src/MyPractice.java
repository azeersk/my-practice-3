import java.util.Locale;
import java.util.Scanner;

public class MyPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Given an integer N, write a program which reads N inputs and prints the sum of the given input integers.
Note: Use For Loop
        int a = input.nextInt();
        int b =0;
        for(int i=0; i<a; i++){
            int c = input.nextInt();
            b = b+c;
        }
        System.out.println(b);

        Write a program to print the factorial of N.
                Factorial is the product of all positive integers less than or equal to N.
        int a = input.nextInt();
        int b = 1;
        for (int i=1; i<=a; i++){
            b = b*i;
        }
        System.out.println(b);

        Given an integer (N) as input, write a program to print the sum of even numbers in the first N natural numbers.
        int a = input.nextInt();
        int b = 0;
        for(int i=1; i<=a; i++){
            if (i%2==0)
                b = b+i;
        }
        System.out.println(b);

        Given three integers, write a program to print the sum of the numbers divisible by the given number T from M to N.
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = 0;
        for (int i=b; i<=c; i++){
            if (i%a==0)
                d = d+i;
        }
        System.out.println(d);

        Write a program to print the sum of the squares of the first N natural numbers.
        int a = input.nextInt();
        double b = 0;
        for(int i=1; i<=a; i++){
            b = b+Math.pow(i,2);
        }
        System.out.println(b);

        Write a program to print the sum and average of the given ten numbers.
        Average is the sum of the given numbers divided by the number of given numbers.
        int a = input.nextInt();
        int b = 0;
        for(int i=1; i<=a; i++){
            int c = input.nextInt();
            b = b+c;
        }
        double d = b/10;
        System.out.println(b);
        System.out.println(d);

        Write a program to print the sum of all the digits in the given number.
        String a = input.nextLine();
        int b = 0;
        for(int i=0; i<a.length(); i++){
            int c = Integer.parseInt(String.valueOf(a.charAt(i)));
            b = b+c;
        }
        System.out.println(b);

        Write a program to print the multiplication table of the given number (N) up to ten multiples in the format "N x i = M".
        int a = input.nextInt();
        for(int i=0; i<=10; i++){
            System.out.println(a+" x "+i +" = " +(a*i));
        }

        Write a program to print the reverse of the given string.
        String a = input.nextLine();
        String b ="";
        for(int i=1; i<=a.length();i++){
            b = b + String.valueOf(a.charAt((a.length())-i));
        }
        System.out.println(b);

        Given a string, write a program to check if it is a palindrome or not.
        Palindrome is a string that remains the same when written in reverse.
        Note: Ignore the case difference (uppercase and lowercase) when comparing letters.

        String a = (input.nextLine()).toLowerCase();
        String b = "";
        int len = a.length();
        for(int i=1; i<=len; i++){
            b = b+(String.valueOf(a.charAt(len-i)));
        }
        if (a.equals(b))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    Write a program to print the greatest among the given N numbers.
        int a = input.nextInt();
        int b = 0;
        for(int i=0; i<a; i++){
            int c = input.nextInt();
            if (c > b){
                b = c;
            }
        }
        System.out.println(b);

        Write a program to check whether the given number is a perfect number or not.
A number is considered as a Perfect number if sum of all factors excluding itself is equal to the number.
        int a = input.nextInt();
        int b = 0;
        for(int i=1; i<a; i++){
            if (a%i==0){
                b = b + i;
            }
        }
        if (a == b)
            System.out.println("Perfect number.");
        else
            System.out.println("Not Perfect number");

    Write a program to check if a number N is an armstrong number or not.
    a N-digit number is called armstrong number if the number is equal to the sum of the Nth power of its digits.
        String a = input.nextLine();
        int d = Integer.parseInt(a);
        int len = a.length();
        double  b = 0;
        for(int i=0; i<len; i++){
            int c = Integer.parseInt(String.valueOf(a.charAt(i)));
            b = b +Math.pow(c,3);
        }
        if (d==b)
            System.out.println("Armstrong!");
        else
            System.out.println("Not Armstrong!");

    Write a program to print a hollow square pattern of N rows and N columns using the asterisk character (*),
    where integer N is given as an input.
        int a = input.nextInt();
        int b = 0;
        for(int i=1; i<=a; i++){
            if ((i==1) || (i==a))
                System.out.println("# ".repeat(a));
            else
                System.out.println("# "+"  ".repeat(a-2)+"#");
            }

    Write a program to convert the date from "dd-mm-yy" format to "dd/mm/yy" format.
        String a = input.nextLine();
        System.out.println(a.replace("-","/"));

    Write a program that prints the given word in two variants. First Variant: Convert all the letters in the given word to lowercase.
    Second Variant: Convert all the letters in the given word to uppercase.
        String a = input.nextLine();
        System.out.println(a.toLowerCase(Locale.ROOT));
        System.out.println(a.toUpperCase(Locale.ROOT));

    Write a program to check whether the given password is valid or not.
    Consider the password to be valid if it contains at least one digit.
        String a = input.nextLine();
        boolean b = false;
        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            if (Character.isDigit(c))
                b = true;
        }
        if (b){
            System.out.println("Valid Password!");
        }
        else
            System.out.println("Invalid Password!");


    Given a word, write a program to convert all the uppercase letters to lowercase letters and vice versa.
        String a = input.nextLine();
        String c ="";
        for(int i=0; i<a.length(); i++){
            String b = String.valueOf(a.charAt(i));
            if (b.toLowerCase().equals(b)){
                c = c+b.toUpperCase();
            }
            else
                c = c+b.toLowerCase();
        }
        System.out.println(c);


    Given a word, write a program to print substrings in the expected pattern of N rows, where N is the length of the word.
        String a = input.nextLine();
        int len = a.length();
        String b = "";
        for(int i=0; i<len; i++){
            b =b+" "+String.valueOf(a.charAt(i));
            System.out.println(b);
        }


        Given a string and N integers, where N is the length of the string, write a program to print the string after
        shuffling the characters as per the order of the integers given.
        String a = input.nextLine();
        int len = a.length();
        String c = "";
        for(int i=0; i<len; i++){
            int b = input.nextInt();
            c = c+String.valueOf(a.charAt(b));
        }
        System.out.println(c);

    Write a program to check whether the given number is a Prime number or not.
    A Prime Number is a number that is divisible only by itself and one.
        int a = input.nextInt();
        boolean b = true;
        for(int i=2; i<a; i++){
            if (a%i==0){
                b = false;
            }
        }
        if (b)
            System.out.println("Prime number");
        else
            System.out.println("Not a Prime number");

    Given two integers M and N, write a program to print a hollow rectangle pattern
    of M rows and N columns using the asterisk character (*).
        int a = input.nextInt();
        int b = input.nextInt();
        for(int i=0; i<b; i++){
            if (i==0 || i==(b-1)){
                String c = "* ".repeat(a);
                System.out.println(c);
            }
            else{
                String d = "* "+"  ".repeat(a-2)+"*";
                System.out.println(d);
            }
        }

    Write a program to print numbers from 1 to N in each row forming a square pattern of N rows and N columns.
        int a = input.nextInt();
        for (int i=1; i<=a; i++){
            for (int j=1; j<=a; j++){
                System.out.print(String.valueOf(j)+" ");
            }
            System.out.println();
        }

    Write a program to print numbers from 1 to N in each column forming a square pattern of N rows and N columns.
        int a = input.nextInt();
        for(int i=1; i<=a; i++){
            System.out.println((String.valueOf(i)+" ").repeat(a));
        }

    Write a program to print numbers from 1 to N in each row forming a rectangular pattern of M rows and N columns.
        int a = input.nextInt();
        int b = input.nextInt();
        for(int i=1; i<=b; i++){
            for (int j=1; j<=a; j++){
                System.out.print(String.valueOf(j)+" ");
            }
            System.out.println();
        }

    Write a program to print a solid diamond pattern of 2N - 1 rows using the asterisk character (*).
        int a = input.nextInt();
        for(int i=1; i<=a; i++){
            System.out.println(" ".repeat(a-i)+"* ".repeat(i));
        }
        for(int j=1; j<=a; j++){
            System.out.println(" ".repeat(j)+"* ".repeat(a-j));
        }


    Write a program to find the first prime number in the given range of M to N.
        int a=input.nextInt();
        int b = input.nextInt();
        boolean c = true;
        for(int j=a; j<b; j++){
            boolean d = true;
            for(int i=2; i<j; i++){
                if (j%i == 0){
                    d = false;
                    break;
                }
            }
            if (d) {
                System.out.println(j);
                c = false;
                break;
            }
        }
        if(c)
            System.out.println("no prime numbers in given.");

    Given N inputs, write a program to print the first negative number.*/
        int a = input.nextInt();
        for(int i=0; i<a; i++){
            int b = input.nextInt();
            if (b<0) {
                System.out.println(b);
                break;
            }
        }
    }
}
