import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Day1 {
    public Day1() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        new Day1().program();
    }

    File file = new File("input");
    Scanner sc = new Scanner(file);

    public void program() throws IOException {

        int [] topThreeCalories = {0,0,0};
        while(sc.hasNextLine()) {
            int tmp = 0;
            String next;
            while (!(next = sc.nextLine()).equals("") && sc.hasNextLine()) {
                tmp += Integer.parseInt(next);
            }
            int smallest = findSmallest(topThreeCalories);
            if(tmp > topThreeCalories[smallest]){
                topThreeCalories[smallest] = tmp;
            }
        }
        System.out.println(topThreeCalories[0] + topThreeCalories[1] + topThreeCalories[2]);


    }
    public int findSmallest(int[] arr){

        int smallest = arr[0];
        int index = 0;
        for(int i = 1; i < arr.length; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
                index = i;
            }
        }return index;
    }



}
