import java.io.File;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        String toFind = args[0];
        String fileToRead = args[1];

        File file = new File(fileToRead);
        try(Scanner reader = new Scanner(file)) {
            String line;
            int ctr = 0;
            while(reader.hasNextLine()){
                line = reader.nextLine();
                if(line.contains(pattern)){
                    System.out.println("\"" + toFind + "\"" + " found at line: " + ctr);
                }
                ctr++;
            }
        } catch(Exception e ){
            System.out.println("File not found");
        }
    }
} 