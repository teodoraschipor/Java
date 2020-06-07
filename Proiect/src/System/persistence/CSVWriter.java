package System.persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CSVWriter {
   // private static CSVWriter single_instance = null;
    private FileWriter writer;
    private File file;
    private static final String path = "C:/Users/teo/IdeaProjects/Proiect/src/myData/";

    public CSVWriter(String filename) {
        try {

            // Get the file
            file = new File(path + filename);

            // Create new file
            if (file.exists()) {
                writer = new FileWriter(file, true);
            } else {
                file.createNewFile();
                writer = new FileWriter(file, true);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public CSVWriter(String fileName, Boolean append) {
        try {
            writer = new FileWriter((path + fileName), append);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

  /*  public static CSVWriter getInstance(String filename) throws IOException {
        if (single_instance == null)
            single_instance = new CSVWriter(filename);
        return single_instance;
    }*/

    public void write(String data) {
        try {
            writer.append(data);
            writer.flush();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFile() {
        try {
            writer.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public FileWriter getWriter() {
        return writer;
    }
}