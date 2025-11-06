public class CricketRunsScored extends Cricket{
    public CricketRunsScored(String BatmansName, String StadiumName, int RunsScored) {
        super(BatmansName, StadiumName, RunsScored);
    }


    public String printRunsScored(){

            System.out.println("Staff number: "+ getBatmansName());
            System.out.println("Staff number: "+getStadiumName());
            System.out.println("Staff number: "+getRunsScored());
        return getBatmansName()+ getStadiumName()+getRunsScored();
    }


}
