/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingwhile;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class CountingWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it several times. " );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
                System.out.print("How many times do you want the message to repeat? ");
                int times = keyboard.nextInt();
		int n = 0;
		int a = 10;
                
                while ( n < times )
		{
			System.out.println( a  + ". " + message );
			n ++;
                        a += 10;
		}

    }
    
}
