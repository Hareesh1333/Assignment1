package vsoftlist;

import Vsofthierarchy.Manager;

public class main {

    public static void main(String[] args) {

            CEO c1 = new CEO("Poorna Veer");
            System.out.println("Ceo of V-Soft company is " + c1.Ceo);
        System.out.println(" ");

        Manager m1 = new Manager("Umakanth" , "Enterprise");
        Manager m2 = new Manager("Raja" , "Engagement");
        Manager m3 = new Manager("Srinivas pabba" , "Developing life");

        System.out.println(m1.managername + " is a manager of " + m1.departmnt + " Department");
        System.out.println(m2.managername +" is a manager of "+ m2.departmnt + " Department");
        System.out.println(m3.managername+" is a manager of "+m3.departmnt + " Department");
        System.out.println(" ");
        Exercise1 d1 = new Exercise1("Hareesh", "Umakanth", "Enterprise");
        Exercise1 d2 = new Exercise1("Venkata sai", "Raja", "Engagement");
        Exercise1 d3 = new Exercise1("eshwar", "Raja", "Engagement");
        Exercise1 d4 = new Exercise1("Mallika", "Srinivas pabba", "Developing life");
        Exercise1 d5 = new Exercise1("Kishore", "Srinivas pabba", "Developing life");
        Exercise1 d6 = new Exercise1("Praveen", "Umakanth", "Enterprise");


        System.out.println("Below given list of Developers ");

        System.out.println(" ");
        System.out.println(d1.DeveloperName + " is reporting to Manager "+ d1.ReportingManager + " in " + d1.Departmnet +" Department");
        System.out.println(d2.DeveloperName + " is reporting to Manager "+ d2.ReportingManager + " in " + d2.Departmnet +" Department");
        System.out.println(d3.DeveloperName + " is reporting to Manager "+ d3.ReportingManager + " in " + d3.Departmnet +" Department");
        System.out.println(d4.DeveloperName + " is reporting to Manager "+ d4.ReportingManager + " in " + d4.Departmnet +" Department");
        System.out.println(d5.DeveloperName + " is reporting to Manager "+ d5.ReportingManager + " in " + d5.Departmnet +" Department");
        System.out.println(d6.DeveloperName + " is reporting to Manager "+ d6.ReportingManager + " in " + d6.Departmnet +" Department");

        System.out.println(" ");
        System.out.println("Total Number of Developers Together all Departments "+ " : " + Exercise1.noOfObjects);



    }
    }

