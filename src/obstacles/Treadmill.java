package obstacles;

import competitors.Competitor;

public class Treadmill implements Obstacle{

    public final int distance;

    public Treadmill(int distance){
        this.distance = distance;
    }

    @Override
    public void onSuccess(Competitor competitor){
            System.out.println(competitor.getName() + " успешно пробежал "+ distance+"м");
        }

    @Override
    public void onFailur(Competitor competitor){
            System.out.println(competitor.getName() + " не пробежал "+ distance+"м");
        }

    @Override
    public boolean compete(Competitor competitor){
        if(distance > competitor.getRunLimit()){
            onFailur(competitor);
            return false;
        } else {
            onSuccess(competitor);
            return true;
        }
    }
}
