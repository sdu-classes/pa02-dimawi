package OOPperson;

public class smw {
    public static void main(String[] args){
        Student Dimash = new Student("Dinmukhamed", "Zhanatas", "IT", 1, 0);
        System.out.println(Dimash.getFee());
        System.out.println(Dimash.getProgram());
        System.out.println(Dimash.getYear());
        System.out.println(Dimash.getAddress());
        System.out.println(Dimash.getName());
        System.out.println(Dimash.toString());
        Staff Z = new Staff("Zhalgas", "Kumzhota", "BIL", 30000.0);
        System.out.println(Z.getName());
        System.out.println(Z.getAddress());
        System.out.println(Z.getSchool());
        System.out.println(Z.getPay());
        System.out.println(Z.toString());


    }
}
