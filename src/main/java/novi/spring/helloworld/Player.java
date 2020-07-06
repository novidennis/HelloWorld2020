package novi.spring.helloworld;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {
    @Id
    @GeneratedValue
    private int playerNumber;

    private String name;
    private int score;

    public Player() {

    }

    public Player(String playerName) {
        this.name = playerName;
        score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        score++;
    }
}
