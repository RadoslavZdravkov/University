import java.util.Scanner;

public class CreateEvent {
    private String typeOfEvent;

    public String getTypeOfEvent() {
        return typeOfEvent;
    }
    public void setTypeOfEvent(String typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }

    Competition getEvent(String competitionType)throws EventException{
        if(competitionType.equalsIgnoreCase("Football competition")){
            return new FootballCompetition();
        }
        else if(competitionType.equalsIgnoreCase("Horse competition")){
            return new HorseCompetition();
        }
        else if(competitionType.equalsIgnoreCase("Formula1 competition")){
            return new Formula1Competition();
        }
        else throw new EventException();
    }

    public void fillSchedule(Competition ob, Participant[] schedule, Scanner sc){
        int len = ob.getSchedule().length;
        int count=0;
        Participant[] newSchedule = new Participant[len];
        for(Participant p: schedule){
            System.out.println("Enter participant id: ");
            p.setId(sc.nextInt());
            System.out.println("Enter participant name: ");
            p.setName(sc.nextLine());
            System.out.println("Enter participant age: ");
            p.setAge(sc.nextInt());
            System.out.println("Enter participant chance to win: ");
            p.setChanceToWin(sc.nextDouble());
            System.out.println("Enter participant bet for win: ");
            p.setBetToWin(sc.nextDouble());
            newSchedule[count]=p;
            count++;
        }
    }
}
