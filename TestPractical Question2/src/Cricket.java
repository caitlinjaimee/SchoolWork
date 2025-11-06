public abstract class Cricket implements iCricket {

    String BatmansName;
    String StadiumName;
    int RunsScored;

    public Cricket(String BatmansName, String StadiumName, int RunsScored) {
        this.BatmansName = BatmansName;
        this.StadiumName = StadiumName;
        this.RunsScored = RunsScored;
    }

    public String getBatmansName() {
        return BatmansName;
    }

    public String getStadiumName() {
        return StadiumName;
    }

    public int getRunsScored() {
        return RunsScored;
    }


}