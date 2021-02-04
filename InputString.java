package planet;

import java.util.Scanner;

public class InputString {

    //извежда дължината на низа с помощта на метод length()
    static  void stringLength(String str)
    {
        System.out.println("The length of the string is " + str.length());
    }

    //намира на коя позиция е даден символ с помощта на метод indexOf()
    static void searchIndex(String str, char c)
    {
        int index = str.indexOf(c);
        System.out.println("The index of " + c + " is " + index);
    }

    //принтира низа в обратен ред с помощта на цикъл
   static void reverseString(String str)
   {
       System.out.print("The reversed string is: ");
       for(int i = str.length() - 1; i >= 0; i--)
       {
           System.out.print(str.charAt(i));
       }
   }

   //проверява дали нашият низ е същия като посочения в метода с помощта на equal()
   static void checkEquality(String str)
   {
       String str2 = "hello";
       if (str.equals(str2)) // str.equalsIgnoreCase(str2) ще игнорира главните и малки букви
       {
           System.out.println("\nOur string matches the string " + str2);
       } else {
           System.out.println("\nOur string do NOT matches string " + str2);
       }
   }

   //проверява дали низа започва с конкрестна стойност/и и извежда подходящо съобщение
    //аналогично и за край endsWith()
    static void checkStart(String str)
    {
        if (str.startsWith("Hell"))
        {
            System.out.println("Yes, it starts with hell :)");
        } else
        {
            System.out.println("It does NOT start with hell :/");
        }
    }

    //извежда подмножеството от низа м/у индексите 2 и 5
    static void stringSubstring(String str)
    {
        System.out.println("The substring is: " + str.substring(2, 5));
    }

    //обединява два низа в един
    static void stringConcatenation(String str)
    {
        String name = "Nikol";
        String strConcat = str.concat(name);
        System.out.println(strConcat);
    }

    //преобразува всички букви от низа в малки
    static void stringToLowerCase(String str)
    {
        System.out.println(str.toLowerCase());
    }

    //преобразува всички букви от низа в главни
    static void stringToUpperCase(String str)
    {
        System.out.println(str.toUpperCase());
    }

    public static void main(String[] args) {

        String str;
        char c = 'o'; //символът, който търсим в низа/
        Scanner input = new Scanner(System.in);
        //въвеждаме низ от клавиатурата
        System.out.println("Enter your string: ");
        str = input.nextLine();

        stringLength(str);
        searchIndex(str, c);
        reverseString(str);
        checkEquality(str);
        checkStart(str);
        stringSubstring(str);
        stringConcatenation(str);
        stringToLowerCase(str);
        stringToUpperCase(str);
    }
}
