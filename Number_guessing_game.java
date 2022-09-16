import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int inputnumber;
    public int noOfGuesses=0;

 
    public int getnumguesses(){
        return noOfGuesses;
    }
    public void setnumguesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }
 Game(){
        Random rand=new Random();
        this.number=rand.nextInt(100);
        
    }
 void takeUserInput(){
        System.out.println("guess the number");
        Scanner sc=new Scanner(System.in);
inputnumber=sc.nextInt();
 }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputnumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputnumber<number){
            System.out.println("Too low...");
        }
        else if(inputnumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
 
}
public class NumberGussing_Game{
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while(!b){
        g.takeUserInput();
        b=g.isCorrectNumber();
  
        }

    }
}
