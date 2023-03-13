public class FootballCompetition implements Competition{
    private double fastestGoal;
    public static Participant[]schedule;
    public FootballCompetition(double fastestGoal){
        this.fastestGoal=fastestGoal;
    }
    public FootballCompetition(){}

    public double getFastestGoal() {
        return fastestGoal;
    }
    public void setFastestGoal(double fastestGoal) {
        this.fastestGoal = fastestGoal;
    }

    public Participant[] getSchedule(){
        return FootballCompetition.schedule;
    }
}
