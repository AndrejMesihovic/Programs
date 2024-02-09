import java.util.Scanner;
public class rockPaperScissors2 {
public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);

int win = 0;
int tie = 0;
int loss = 0;
int win2 = 0;
int loss2 = 0;

System.out.println("This is a game of rock, paper, scissors. \nChoose the number of rounds you would like to play");
int x = scnr.nextInt();
for(int i = 0; i<=x-1; i++) {
System.out.println("Rock is 1.");
System.out.println("Paper is 2.");
System.out.println("Scissors is 3.");
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
tie++;
}
else if((player1 == 1) && (computer == 2)) {
System.out.println("Rock does not beat Paper, you lose.");
System.out.println();
loss++;
win2++;
}
else if((player1 == 1) && (computer == 3)) {
System.out.println("Rock beats Scissors, you win!");
System.out.println();
win++;
loss2++;
}
else if((player1 == 2) && (computer == 1)) {
System.out.println("Paper beats Rock, you win!");
System.out.println();
win++;
loss2++;
}
else if((player1 == 2) && (computer == 3)) {
System.out.println("Paper does not beat Scissors, you lose.");
System.out.println();
loss++;
win2++;

}
else if((player1 == 3) && (computer == 1)) {
System.out.println("Scissors does not beat Rock, you lose.");
System.out.println();
loss++;
win2++;
}
else if((player1 == 3) && (computer == 2)) {
System.out.println("Scissors beats Paper, you win!");
System.out.println();
win++;
loss2++;
}


}
System.out.println("You won " + win + " times.");
System.out.println("You lost " + loss + " times.");
System.out.println();
System.out.println("Your opponent won " + win2 + " times.");
System.out.println("Your opponent lost " + loss2 + " times.");
System.out.println();
System.out.println("You have tied " + tie + " times.");
}
}