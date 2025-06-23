import java.util.Arrays;

public class Array {
    public static void main(String [] args){
        int [] numbers = {100, 75, 2, 12, 21, 34, 45, 56, 67, 78, 89, 90}; 
        System.out.println(numbers.length);
        Arrays.sort(numbers);

    //     for (int i = 0; i < numbers.length; i++){
    //         System.out.println(numbers[i]);
            
    //     }
    // }
        for (int number : numbers){
            System.out.println(number);
        }
    }
}
