public class StaffHiring extends Staff {

    public StaffHiring(int StaffNumber, String Stafflocation) {
        super(StaffNumber, Stafflocation);
    }


    @Override
    public String getStaffHiringProcess() {
        if(StaffNumber<20){
            return "yes";
        }else {
            return "No";
        }

    }
    public String PrintHiringProcess() {
        System.out.println("Staff number: "+getStaffNumber());
        System.out.println("Staff number: "+getStaffLocation());
        System.out.println("Staff number: "+getStaffHiringProcess());
        return getStaffNumber()+ getStafflocation()+getStaffHiringProcess();
    }


}
