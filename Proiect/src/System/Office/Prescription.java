package System.Office;

public class Prescription {
    private String date;
    private String diagnostic;
    private String medication;
    private String analysis;
    private String otherInvestigations;
    private static String csvPrescriptions = "Prescriptions.csv";

    public Prescription(String date, String diagnostic, String medication, String analysis, String otherInvestigations) {
        this.date = date;
        this.diagnostic = diagnostic;
        this.medication = medication;
        this.analysis = analysis;
        this.otherInvestigations = otherInvestigations;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getOtherInvestigations() {
        return otherInvestigations;
    }

    public void setOtherInvestigations(String otherInvestigations) {
        this.otherInvestigations = otherInvestigations;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "date='" + date + '\'' +
                ", diagnostic='" + diagnostic + '\'' +
                ", medication='" + medication + '\'' +
                ", analysis='" + analysis + '\'' +
                ", otherInvestigations='" + otherInvestigations + '\'' +
                '}';
    }

    public String toStringCsv(){
        return "" + getDate() + "," + getDiagnostic() + "," + getMedication() + "," + getAnalysis() + "," + getOtherInvestigations();
    }

}
