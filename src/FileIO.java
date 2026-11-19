import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {


    public static ArrayList<String> readData(String path) {
        File file = new File(path);
        ArrayList<String> data = new ArrayList<>();

        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();

            while(scan.hasNextLine()){
                data.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return data;
    }
}
