package hm.questions;

public class Staff extends Person{
    String school;
    double pay;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
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

    public static void main(String args[])
    {
        Staff staff= new Staff();
        staff.setAddress("Dhapasi");
        staff.setName("Mohan Khati");
        staff.setSchool("TBC");
        staff.setPay(5000);

        System.out.println(staff.getAddress()+"\n"+ staff.getName()+"\n"+staff.getSchool()+"\n"+staff.pay);

    }
}
