import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class FileMaker {
    private int numberOfStudies;
    private String path;
    private boolean appendValue = false;
    FileWriter fw;
    PrintWriter pl;
    private ArrayList<String> tempDataGroup = new ArrayList<>();
    Random rand = new Random();


    String test = "777777722222222.7777777";

    public FileMaker(int numberOfStudies, String filePath)throws IOException{
        this.numberOfStudies = numberOfStudies;
        path = filePath;
        fw = new FileWriter(path, appendValue);
        pl = new PrintWriter(fw);
        this.generateFile();
    }

    public FileMaker(int numberOfStudies, String filePath, boolean appendValue)throws IOException{
        this.appendValue = appendValue;
        this.numberOfStudies = numberOfStudies;
        path = filePath;
        fw = new FileWriter(path, appendValue);
        pl = new PrintWriter(fw);
        this.generateFile();

    }


    private void generateFile(){
        for (int i = 0; i < numberOfStudies; i++){
            this.generateStudy();
            for (String id: tempDataGroup){
                pl.printf("%s" + "%n", id);
            }
            tempDataGroup.clear();
        }

        pl.close();

    }

    private void generateStudy(){
        tempDataGroup.add(test);

    }

}
