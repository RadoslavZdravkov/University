public class HorseCompetition implements Competition{
    private String breed;
    public static Participant[]schedule;

    public HorseCompetition(String breed) {
        this.breed = breed;
    }
    public HorseCompetition(){}

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Participant[] getSchedule(){
        return HorseCompetition.schedule;
    }
}
