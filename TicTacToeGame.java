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
}
