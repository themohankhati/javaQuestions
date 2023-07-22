package hm.questions;

public class Student extends Person{
    String program;
    long year;
    double fee;

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

//    public Student(String name, String address, String program, long year, double fee) {
//        super(name, address);
//        this.program=program;
//        this.fee=fee;
//        this.year=year;
//    }

    public static void main(String args[])
    {
//        Student student= new Student("Mohan","dhapasi","Bsc computing",2023, 13.2);
//        student.setAddress("dhapasi");
        Student student= new Student();
        student.setAddress("Dhapasi");
        student.setName("Mohan Khati");
        student.setFee(12);
        student.setYear(2023);

        System.out.println(student.getAddress()+"\n"+ student.getName()+"\n"+student.getFee()+"\n"+student.getYear());
    }
}
