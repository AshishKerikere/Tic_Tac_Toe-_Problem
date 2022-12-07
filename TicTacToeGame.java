import java.util.Scanner;
public class TicTacToeGame {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        char[] boardArray = new char[10];
        for (int i = 1; i < boardArray.length; i++){
            boardArray[i] = ' ';
        }

         char userCharacter = ' ';
         char computerCharacter = ' ';

         userCharacter = userCharSelection(userCharacter);
         computerCharacter = computerCharSelection(userCharacter);

        System.out.println("The Selected User Character is = " +userCharacter);
        System.out.println("The Selected Computer Character is = " +computerCharacter);

        boardArray = positionInput(boardArray, userCharacter);
        displayBoard(boardArray);
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

}
