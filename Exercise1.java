package vsoftlist;



public class Exercise1 {
    String DeveloperName;
    String ReportingManager;
    String Departmnet;

    static int noOfObjects = 0;

    {
        noOfObjects += 1;
    }

    public Exercise1(String dpnm, String Rpmnr, String depm) {
        this.DeveloperName = dpnm;
        this.ReportingManager = Rpmnr;
        this.Departmnet = depm;
    }

}
