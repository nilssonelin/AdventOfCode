import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {
    public Day2() throws FileNotFoundException {
    }

    public static void main(String[]args) throws FileNotFoundException {
        new Day2().program();
    }
    File file = new File("input_day2");
    Scanner sc = new Scanner(file);
    public void program(){
        int totalPoints = 0;
        while(sc.hasNext()) {
            int roundPoints = 0;
            int shapePoints = 0;
            int result = 0;
            String opp = sc.next();
            String howRoundEnds = sc.next();
            String myMove = "";
            switch (howRoundEnds) {
                case "X" :  // you need to loose
                    if(opp.equals("A")){
                        myMove = "scissor";
                        shapePoints = 3;

                    } else if(opp.equals("B")){
                        myMove = "rock";
                        shapePoints = 1;
                    } else {
                        myMove = "paper";
                        shapePoints = 2;
                    }
                    roundPoints = 0;
                    break;
                case "Y" : // you need to draw
                    if(opp.equals("A")){
                        myMove = "rock";
                        shapePoints = 1;
                    } else if (opp.equals("B")){
                        myMove = "paper";
                        shapePoints = 2;
                    } else {
                        myMove = "scissor";
                        shapePoints = 3;
                    }
                    roundPoints = 3;
                    break;

                case "Z" :  // you need to win
                    if(opp.equals("A")){
                        myMove = "paper";
                        shapePoints = 2;
                    } else if(opp.equals("B")){
                        myMove = "scissor";
                        shapePoints = 3;
                    } else {
                        myMove = "rock";
                        shapePoints = 1;
                    }
                    roundPoints = 6;
                    break;

            }
            result = roundPoints + shapePoints;
            totalPoints += result;

        }
        System.out.print(totalPoints);

    }

    // A=X=Rock   B=Y=Paper   C=Z=Scissor
    public boolean loose(String opp, String my){
        return (opp.equals("A") && my.equals("Z")) || (opp.equals("B") && my.equals("X")) || (opp.equals("C") && my.equals("Y"));
    }
    public boolean win(String opp, String my){
        return (opp.equals("A") && my.equals("Y")) ||(opp.equals("B") && my.equals("Z")) || (opp.equals("C") && my.equals("X"));
    }
    public boolean draw(String opp, String my){
        return !loose(opp,my) && !win(opp,my);
    }


}
