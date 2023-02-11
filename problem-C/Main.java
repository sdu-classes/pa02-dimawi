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
class Person{
    String name;
    String address;
    public Person(){

    }
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String toString(){
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
class Student extends Person{
    String program ;
    int year;
    double fee;
    public Student(){

    }
    public Student(String name, String address, String program, int year, double fee){
        super.name=name;
        super.address = address;
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram(){
        return program;
    }
    public void setProgram(String program){
        this.program = program;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public double getFee(){
        return fee;
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    public String toString(){
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";

    }
}
class Staff extends Person{
    String school;
    double pay;
    public Staff(){

    }
    public Staff(String name, String address, String school, double pay){
        super.name = name;
        super.address = address;
        this.school = school;
        this.pay = pay;
    }
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public double getPay(){
        return pay;
    }
    public void setPay(double pay){
        this.pay = pay;
    }
    public String toString(){
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}
