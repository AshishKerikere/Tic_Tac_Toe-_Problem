import java.util.Scanner;
public class TicTacToeGame {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

         char userCharacter = ' ';
         char computerCharacter = ' ';

         userCharacter = userCharSelection(userCharacter);
         computerCharacter = computerCharSelection(userCharacter);

        System.out.println("The Selected User Character is = " +userCharacter);
        System.out.println("The Selected Computer Character is = " +computerCharacter);


        char[] boardArray = {'a',' ', ' ', 'X', 'O', ' ', ' ', ' ', 'X', 'O'};  // Sample foe UC7
        displayBoard(boardArray);
        statusCheckIsWin(boardArray, userCharacter, computerCharacter);

    }

    public static char userCharSelection(char userCharacter){

        do{
            System.out.println("Please Enter either X or O character");
            userCharacter = scanner.next().charAt(0);
        }while (userCharacter != 'O' && userCharacter != 'X');
        return userCharacter;
    }

    public static char computerCharSelection(char userCharacter){
        char computerCharacter;
        if (userCharacter == 'X'){
            computerCharacter = 'O';
        }
        else {
            computerCharacter = 'X';
        }
        return computerCharacter;
    }

    public static void displayBoard(char[] boardArray){
        char[][] showBoardArray = new char[3][3];
        for (int i = 0; i < showBoardArray.length; i++){
            for (int j = 0; j < showBoardArray[0].length; j++){
                showBoardArray[i][j] = boardArray[3*i + j + 1];
                System.out.print(showBoardArray[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static char[] positionInput(char[] boardArray, char userCharacter){
        System.out.println("Enter the position in which You want to enter your character");
        int userInputPosition = scanner.nextInt();
        if (userInputPosition >= 1 && userInputPosition <= 9) {
            if (boardArray[userInputPosition] == ' ') {
                boardArray[userInputPosition] = userCharacter;
            } else {
                positionInput(boardArray, userCharacter);
            }
        }
        else {
            positionInput(boardArray, userCharacter);
        }
        return boardArray;
    }

    public static void userToss(){
        System.out.println("Enter either H for Heads or T for Tails");
        char userChoice = scanner.next().charAt(0);
        if (userChoice == 'H' || userChoice == 'T') {

            int random = (int) Math.floor(Math.random() * 2 + 1);
            char tossResult;
            if (random == 1) {
                tossResult = 'H';
            } else {
                tossResult = 'T';
            }

            if (userChoice == tossResult) {
                //return true;
                System.out.println("User will start first");
            } else {
                //return false;
                System.out.println("The Computer will start first");
            }
        }
        else {
            userToss();
        }
    }

    public static void statusCheckIsWin(char[] boardArray, char userCharacter, char computerCharacter){
        char lineOfWin1[] = {boardArray[1], boardArray[2], boardArray[3]};
        char lineOfWin2[] = {boardArray[4], boardArray[5], boardArray[6]};
        char lineOfWin3[] = {boardArray[7], boardArray[8], boardArray[9]};
        char lineOfWin4[] = {boardArray[1], boardArray[4], boardArray[7]};
        char lineOfWin5[] = {boardArray[2], boardArray[5], boardArray[8]};
        char lineOfWin6[] = {boardArray[3], boardArray[6], boardArray[9]};
        char lineOfWin7[] = {boardArray[1], boardArray[5], boardArray[9]};
        char lineOfWin8[] = {boardArray[3], boardArray[5], boardArray[7]};

        char A = userCharacter;
        char B = computerCharacter;


        if (lineOfWin1[0] == A && lineOfWin1[1] == A && lineOfWin1[2] == A ){
            System.out.println("User wins");
        }
        else if (lineOfWin2[0] == A && lineOfWin2[1] == A && lineOfWin3[2] == A ){
            System.out.println("User wins");
        }
        else if (lineOfWin3[0] == A && lineOfWin3[1] == A && lineOfWin3[2] == A ){
            System.out.println("User wins");
        }
        else if (lineOfWin4[0] == A && lineOfWin4[1] == A && lineOfWin4[2] == A ){
            System.out.println("User wins");
        }
        else if (lineOfWin5[0] == A && lineOfWin5[1] == A && lineOfWin5[2] == A ){
            System.out.println("User wins");
        }
        else if (lineOfWin6[0] == A && lineOfWin6[1] == A && lineOfWin6[2] == A ){
            System.out.println("User wins");
        }
        else if (lineOfWin7[0] == A && lineOfWin7[1] == A && lineOfWin7[2] == A ){
            System.out.println("User wins");
        }
        else if (lineOfWin8[0] == A && lineOfWin8[1] == A && lineOfWin8[2] == A ){
            System.out.println("User wins");
        }

        else if (lineOfWin1[0] == B && lineOfWin1[1] == B && lineOfWin1[2] == B ){
            System.out.println("Computer wins");
        }
        else if (lineOfWin2[0] == B && lineOfWin2[1] == B && lineOfWin3[2] == B ){
            System.out.println("Computer wins");
        }
        else if (lineOfWin3[0] == B && lineOfWin3[1] == B && lineOfWin3[2] == B ){
            System.out.println("Computer wins");
        }
        else if (lineOfWin4[0] == B && lineOfWin4[1] == B && lineOfWin4[2] == B ){
            System.out.println("Computer wins");
        }
        else if (lineOfWin5[0] == B && lineOfWin5[1] == B && lineOfWin5[2] == B ){
            System.out.println("Computer wins");
        }
        else if (lineOfWin6[0] == B && lineOfWin6[1] == B && lineOfWin6[2] == B ){
            System.out.println("Computer wins");
        }
        else if (lineOfWin7[0] == B && lineOfWin7[1] == B && lineOfWin7[2] == B ){
            System.out.println("Computer wins");
        }
        else if (lineOfWin8[0] == B && lineOfWin8[1] == B && lineOfWin8[2] == B ){
            System.out.println("Computer wins");
        }

        else {
            statusCheckIsDraw(boardArray, userCharacter, computerCharacter);
            //System.out.println("It is a draw");
        }

    }

    public static void statusCheckIsDraw(char[] boardArray, char userCharacter, char computerCharacter){
        int filledCharacters = 0;
        for (int i = 1; i < boardArray.length; i++){
            if (boardArray[i] == 'X' || boardArray[i] == 'O'){
                filledCharacters++;
            }
        }

        if (filledCharacters == 9){
            System.out.println("The game is a Draw");
        }
        else {
            statusCheckToContinuePlay(boardArray, userCharacter, computerCharacter);
        }
    }

    public static void statusCheckToContinuePlay(char[] boardArray, char userCharacter, char computerCharacter){
        System.out.println("Continue Playing");
    }
}
