public abstract class Staff implements iStaff {
   public int StaffNumber;
    public String Stafflocation;


    public Staff(int StaffNumber, String Stafflocation) {
        this.StaffNumber = StaffNumber;
        this.Stafflocation = Stafflocation;
    }


    public int getStaffNumber() {
        return StaffNumber;
    }
public String getStafflocation(){
        return Stafflocation;
}

}