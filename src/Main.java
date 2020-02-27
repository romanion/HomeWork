import competitors.Cat;
import competitors.Competitor;
import competitors.Man;
import competitors.Robot;
import obstacles.Obstacle;
import obstacles.Treadmill;
import obstacles.Wall;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Competitor> winnersList = new ArrayList<>();
        Competitor[] competitors = new Competitor[3];
        competitors[0] = new Cat("Барсик", 1000, 15);
        competitors[1] = new Man("Толя", 3500, 10);
        competitors[2] = new Robot("Алёша", 500, 1);

        Obstacle[] obstacles = new Obstacle[2];
        Obstacle wall = new Wall(7);
        Obstacle treadmill = new Treadmill(900);
        obstacles[0] = wall;
        obstacles[1] = treadmill;

        int winCounter = 0;
        for(Competitor competitor: competitors){
            for(Obstacle obstacle: obstacles){
                if(obstacle.compete(competitor)){
                    winCounter++;
                }else {
                    break;
                }
            }

            if(winCounter == 2){
                winnersList.add(competitor);
            }
            winCounter = 0;
        }

        for (Competitor winner: winnersList){
            System.out.println("Победитель - " + winner.getName());
        }

    }
}
