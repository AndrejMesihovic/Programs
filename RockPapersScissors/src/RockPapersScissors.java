import java.util.Scanner;

public class RockPapersScissors {
public static void main(String[] args) {
System.out.println("Rock is 1.");
System.out.println("Paper is 2.");
System.out.println("Scissors is 3.");
Scanner scnr = new Scanner(System.in);
System.out.println("Enter your choice: ");
int player1 = scnr.nextInt();
int computer = (int) (3*Math.random()+1);
System.out.println("The Computer chose: " + computer);
String letter;
String choice;
if(computer == 1) {
choice = "Rock";
}
else if(computer == 2) {
choice = "Paper";
}
else if(computer ==3){
choice = "Scissors";
}
if(player1 == computer) {
System.out.println("Tie.");
}
else if((player1 == 1) && (computer == 2)) {
System.out.println("Rock does not beat Paper, you lose.");
}
else if((player1 == 1) && (computer == 3)) {
System.out.println("Rock beats scissors, because rock can break a pair of scissors, you win!");
}
else if((player1 == 2) && (computer == 1)) {
System.out.println(" Paper beats rock, because a piece of paper can cover a rock, you win!!");
}
else if((player1 == 2) && (computer == 3)) {
System.out.println("Paper does not beat Scissors, you lose.");
}
else if((player1 == 3) && (computer == 1)) {
System.out.println("Scissors does not beat Rock, you lose.");
}
else if((player1 == 3) && (computer == 2)) {
System.out.println("Scissors beats paper, because scissors can cut paper! you win!");
}
}
}