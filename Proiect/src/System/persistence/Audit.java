package System.persistence;


import java.io.IOException;


public class Audit extends CSVWriter {

    private static Audit single_instance = null;
    private static final String filename = "Audit.csv";
    //private File file;

    public Audit() {
        super(filename);
    }

    public static Audit getInstance() throws IOException {
        if (single_instance == null)
            single_instance = new Audit();
        return single_instance;
    }

    public static String getFilename() {
        return filename;
    }

    public void closeAudit() {
        this.closeFile();
    }


}