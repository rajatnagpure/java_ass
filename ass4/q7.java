import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

class DB {
    public void Write(String stdName, String StdBranch, String stdClass, int stdRollNo) {
        try {
            FileWriter fw = new FileWriter("database.txt", true);
            fw.write(stdName + " | ");
            fw.write(StdBranch + " | ");
            fw.write(stdClass + " | ");
            fw.write(stdRollNo);
            fw.write("\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Cannot Open File : " + e);
        }
    }

    public void search(String stdName) {
        try {
            File file = new File("database.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String temp = scanner.nextLine();
                if ((temp.indexOf(stdName)) != -1) {
                    System.out.println(temp);
                    return;
                }
            }
            scanner.close();
            throw new Exception("Unknown Object");
        } catch (IOException e) {
            System.out.println("Cannot Open File : " + e);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}

class q7 {
    public static void main(String[] args) {
        DB a = new DB();
        a.Write("R1", "B1", "3rd year", 2);
        a.Write("R2", "B2", "2rd year", 3);
        a.Write("R3", "B3", "1rd year", 4);
        a.Write("R4", "B4", "4rd year", 1);
        a.search(System.console().readLine());
    }
}