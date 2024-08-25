import javax.swing.JOptionPane;
//import javax.swing.JOptionsPane;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args){
        //String name = JOptionPane.showInputDialog("Enter name");
        //JOptionPane.showMessageDialog(null, "Hello " + name);

        //String age = JOptionPane.showInputDialog("Enter the age");

        //Scanner myName = new Scanner(System.in);

        //Integer mark = 5;
        //System.out.println(mark);

   //String sch=myName.nextLine();
   //System.out.println(sch);;


   /// regex

  
   Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
   Matcher matcher = pattern.matcher("Visit W3Schools!");
   boolean found= matcher.find();
   if (found) {
    System.out.println("found");
   }
   else{
    System.err.println("error occured");
    
   }
   
    }
}