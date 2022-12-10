import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day4 {

    public Day4() throws FileNotFoundException {
    }

    public static void main(String [] args) throws FileNotFoundException {
        new Day4().program();
    }
    File file = new File("input_day4");
    Scanner sc = new Scanner(file);

    public void program(){
        int overlaps = 0;
        while(sc.hasNextLine()){
            String pairs = sc.nextLine();
            String [] nocomma = pairs.split(",");
            String[][] noline = new String[2][2];
            for(int i = 0;  i < 2; i++){
                noline[i] = nocomma[i].split("-");
            }
            int [][] sections = new int[2][2];
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < 2; j++){
                    sections[i][j]= Integer.valueOf(noline[i][j]);
                }
            }
            int start1 = sections[0][0];
            int stop1 = sections[0][1];
            int start2 = sections[1][0];
            int stop2 = sections[1][1];
            if(isCovered(start1, stop1, start2, stop2) ||
                isOverlap(start1, stop1, start2, stop2)){
                overlaps++;
            }






        }
        System.out.print(overlaps);
    }
    public boolean isCovered(int start1, int stop1, int start2, int stop2 ){
        return (start1 <= start2 && stop1 >= stop2) || (start2 <= start1 && stop2 >= stop1);
    }
    public boolean isOverlap(int start1, int stop1, int start2, int stop2){
        return(start1 >= start2 && start1 <= stop2) || (stop1 >= start2 && stop1 <= stop2)
                || (start2 >= start1 && start2 <= stop1) || (stop2 >= start1 && stop2 <= stop1);
    }
}


