package System.persistence;


import java.io.IOException;
import java.sql.Timestamp;


public class Audit extends CSVWriter {

   // private static Audit single_instance = null;
    private static final String filename = "Audit.csv";
    //private File file;

    public Audit() {
        super(filename);
    }

    /*public static Audit getInstance() throws IOException {
        if (single_instance == null)
            single_instance = new Audit();
        return single_instance;
    }
*/
    public void insertAction(String data, String Location){
        try {
            this.getWriter().append("Inserted " + data + " to " + Location + ", " + (new Timestamp(System.currentTimeMillis())).toString());
            this.getWriter().append("\n");
            this.getWriter().flush();
        } catch (IOException e) {
            System.out.println("ERROR Audit: insert action unsuccessful");
            e.printStackTrace();
        }
    }

    public void deleteAction(String data, String location){
        try{
            this.getWriter().append("Deleted " + data + " from " + location + ", " + (new Timestamp(System.currentTimeMillis())).toString());
            this.getWriter().append("\n");
            this.getWriter().flush();
        } catch (IOException e){
            System.out.println("ERROR Audit: delete action unsuccessful");
        }
    }
    public static String getFilename() {
        return filename;
    }

    public void closeAudit() {
        this.closeFile();
    }


}