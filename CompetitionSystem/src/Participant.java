public class Participant {
    private int id;
    private String name;
    private int age;
    private double chanceToWin;
    private double betToWin;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getChanceToWin() {
        return chanceToWin;
    }
    public void setChanceToWin(double chanceToWin) {
        this.chanceToWin = chanceToWin;
    }

    public double getBetToWin() {
        return betToWin;
    }
    public void setBetToWin(double betToWin) {
        this.betToWin = betToWin;
    }
}