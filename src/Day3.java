import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3 {
    public Day3() throws FileNotFoundException {
    }

    public static void main(String[]args) throws FileNotFoundException {
        new Day3().program();
    }
    File file = new File("input_day3");
    Scanner sc = new Scanner(file);

    public void program(){
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        while(sc.hasNextLine()){
            cnt++;
            //String[] elf1_2_3 = new String[3];
            String backpack_1  = sc.nextLine();
            String backpack_2 = sc.nextLine();
            String backpack_3 = sc.nextLine();
            //int half = backpack.length() /2;
            //comp1comp2[0] = backpack.substring(0,half);
            //comp1comp2[1] = backpack.substring(half, backpack.length());
            boolean stop = false;
            for(int i = 0 ; i < backpack_1.length(); i++){
                for(int j = 0; j < backpack_2.length(); j++){
                    char a = backpack_1.charAt(i);
                    char b = backpack_2.charAt(j);
                    if(a == b){
                        for(int k = 0; k < backpack_3.length(); k++){
                            char c = backpack_3.charAt(k);
                            if(a == c){
                                sb.append(a);
                                System.out.println(a + " " + cnt);
                                stop = true;
                                break;
                            }
                        }
                    }
                    if(stop){
                        break;
                    }
                }
                if(stop){

                    break;
                }
            }


        }
        String doubles = sb.toString();
        System.out.println(doubles);
        char a = 'a';
        //System.out.println(doubles.length());
        System.out.println(getSum(doubles));


    }



    public void prob1(){
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        while(sc.hasNextLine()){
            cnt++;
            String[] comp1comp2 = new String[2];
            String backpack  = sc.nextLine();
            int half = backpack.length() /2;
            comp1comp2[0] = backpack.substring(0,half);
            comp1comp2[1] = backpack.substring(half, backpack.length());
            boolean stop = false;
            for(int i = 0 ; i < comp1comp2[0].length(); i++){
                for(int j = 0; j < comp1comp2[1].length(); j++){
                    char a = comp1comp2[0].charAt(i);
                    char b = comp1comp2[1].charAt(j);
                    if(a == b){
                        sb.append(a);
                        System.out.println(a + " " + cnt);
                        stop = true;
                        break;
                    }
                }
                if(stop){

                    break;
                }
            }


        }
        String doubles = sb.toString();
        System.out.println(doubles);
        char a = 'a';
        //System.out.println(doubles.length());
        System.out.println(getSum(doubles));
    }

    public int getSum(String str){
        int sum = 0;
        int priority;
        for(int i = 0; i  < str.length(); i++){
            char a = str.charAt(i);
            if(a >= 65 && a <= 90){
                priority = a - 38;

            } else {
             priority = a - 96;
            }
            sum += priority;
        }
        return sum;
    }



}
