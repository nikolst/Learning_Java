/*Напишете функция, която по даден символен низ да капитализира буквите,
които се намират между квадратни скоби. Самите скоби да бъдат изтрити.
Функцията трябва да променя подадения й низ, а не да създава нов.

Пример: "Make this [word] upper case. This [one] too."
-> "Make this WORD upper case. This ONE too."*/

package planet;

import java.lang.Character;

public class StringTransformation {

    public static void main(String[] args) {
        
	    String ourString = "Make this [word] upper case. This [one] too.";
        System.out.println("Our string is: " + ourString);

	    char[] charArray = ourString.toCharArray(); //превръщаме низа в масив от символи

	    for(int i = 0; i < charArray.length; i++)
        {
            if (charArray[i] == '[')
            {
                for(int j = i; charArray[j] != ']'; j++)
                {
                    charArray[j] = Character.toUpperCase(charArray[j]);
                }
            }

            if(charArray[i] != ']' && charArray[i] != '[')
            {
                System.out.print(charArray[i]);
            }
        }

	    //Друг възможен вариант е да преобразуаме char в string и тогава да заменим скобите
       // ourString = ourString.replace("]", "").replace("[", "");
        // System.out.println("\n" + ourString);
    }
}
