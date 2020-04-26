package persistence;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.time.LocalDateTime;

/// SINGLETON CLASS
public class Audit {

    private static Audit audit = null;
    private File file;
    private FileWriter csvWriter;
    private String path = "./src/myData/";
    private String filename = "audit.csv";

    private Audit() throws IOException {
        file = new File(path + filename);
        if (file.exists()){
            csvWriter = new FileWriter(file, true);
        }
        else{
            file.createNewFile();
            csvWriter = new FileWriter(file, true);
        }
    }

    // static method to create instance of Audit class
    public static Audit getInstance() throws IOException {
        if (audit == null)
            audit = new Audit();
        return audit;
    }

    public void Audit(String s) throws IOException{
        String stringLog = (LocalDateTime.now().toString()) + "," + s;
        csvWriter.append(stringLog);
        csvWriter.append("\n");
        csvWriter.flush();
    }
}