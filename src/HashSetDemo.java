import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File inputfilename = new File("Invitation.txt");

        Scanner input = null;


        Set<String> name = new HashSet<String>();

        try {
            input = new Scanner(inputfilename);
        }

        catch (FileNotFoundException e) {
        }



        while (input.hasNextLine()) {
            name.add(input.nextLine());



        }
        System.out.println(name);
        for (String s: name){
            System.out.println(s + ", you are cordially invited.");
        }

        input.close();
    }



}