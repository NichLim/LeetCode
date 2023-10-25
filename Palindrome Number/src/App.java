import java.util.Arrays;

public class App {
    public static void printArray(char[] array){
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static boolean isPalindrome(int x){
        char[] intToArray = (""+x).toCharArray();
        char[] reversedInt = new char[intToArray.length];
        int j = 1;
        for (int i = 0; i <= intToArray.length-1; i++) {
            int lastArrayItem = intToArray.length-j;
            reversedInt[i] = intToArray[lastArrayItem];
            j++;
        }
        return Arrays.equals(reversedInt, intToArray);
    }
    public static void main(String[] args) throws Exception {
        int x = 150;
        System.out.println(isPalindrome(x));
    }
}