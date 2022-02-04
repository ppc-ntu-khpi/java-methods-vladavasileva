//package domain;
/**
 * Гловний клас, який обраховує суму всіх чисел, та зводить її до однієї цифри. 
 * @author Влада
 */
public class Exercise {
    public static String Calculate(String date){
        while(date.length()>1){/**
         * цикл який вираховує довжину рядку
         */
            int sum = 0;
            /**
             * цикл який перетворює символ в число та рахує суму 
             */
            for(char c: date.toCharArray()){
                if(Character.isDigit(c)){
                    sum+=(c-'0');
                }
             date = String.valueOf(sum);
} 
        }
        return date;
    }
}