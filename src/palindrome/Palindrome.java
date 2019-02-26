/*
 * This program was made by Misha Donais
 * On February 20 2019
 * To check for palindromes
 */

package palindrome;
//Import
import javax.swing.JOptionPane;

public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Initializing JOptionPane 
        JOptionPane pane = new JOptionPane();
        
        //Taking input from the JOptionPane
        String input = JOptionPane.showInputDialog("Enter a word, and the program will determine if it is a palindrome");
        
        //Empty string to hold the backwards word
        String backwardsWord = "";
        
        //Goes through the original string and reads it backwards into a new string one character at a time, making the second string the reverse of the first
        for (int pos = input.length()-1; pos >=0; pos--){
        backwardsWord += input.charAt(pos);
        }
        //If it is a palindrome (string 1 and string 2 are the same), output that it is a palindrome
        if (input.equals(backwardsWord)){
            JOptionPane.showMessageDialog(null, "This is a palindrome", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        //Otherwise, output that it is not a palindrome
        else{
            JOptionPane.showMessageDialog(null, "This is not palindrome", "Message", JOptionPane.INFORMATION_MESSAGE);
    
}
}
