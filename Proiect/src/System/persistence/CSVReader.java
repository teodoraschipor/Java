package System.persistence;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {

    private static final String BASE_PATH = "C:/Users/teo/IdeaProjects/Proiect/src/myData/";
//    private static CSVReader single_instance = null;
    private File file;
    private FileReader reader;
    private List<String[]> data = new ArrayList<>();
    private String lineSplit = ",";


    public CSVReader(String filename) {
        try {

            // Get the file
            file = new File(BASE_PATH + filename);

            // Create new file
            if (file.exists()) {
                reader = new FileReader(BASE_PATH + filename);
            } else {
                file.createNewFile();
                reader = new FileReader(BASE_PATH + filename);
            }
        } catch (Exception e) {
            System.err.println(e);
        }


    }
/*    public static CSVReader getInstance(String filename) throws IOException {
        if (single_instance == null)
            single_instance = new CSVReader(filename);
        return single_instance;

    }*/
    public void readCSV() {
        String line;
        try(BufferedReader br = new BufferedReader(reader)) {
            //br.readLine(); // skip the header row
            while((line = br.readLine()) != null) {
                data.add(line.split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

       // Audit a = Audit.getInstance();
       // a.log("Read from csv");
       // return values;
    public static String getBasePath() {
        return BASE_PATH;
    }

    public FileReader getReader() {
        return reader;
    }

    public String getLineSplit() {
        return lineSplit;
    }

    public List<String[]> getData() {
        return data;
    }

    public void printData() {
        for(String[] str : data) {
            System.out.println(Arrays.toString(str));
        }
    }
}