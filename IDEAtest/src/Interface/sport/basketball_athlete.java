package Interface.sport;

public class basketball_athlete extends athlete{
    @Override
    public void game() {
        System.out.println("打篮球比赛");
    }

    public basketball_athlete(String name, int age) {
        super(name, age);
    }

    public basketball_athlete() {
    }
}
