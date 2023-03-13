public class Formula1Competition implements Competition{
    private double winnersTime;
    public static Participant[]schedule;

    public Formula1Competition(double winnersTime) {
        this.winnersTime = winnersTime;
    }
    public Formula1Competition(){}

    public double getWinnersTime() {
        return winnersTime;
    }
    public void setWinnersTime(double winnersTime) {
        this.winnersTime = winnersTime;
    }

    public Participant[] getSchedule(){
        return Formula1Competition.schedule;
    }
}
