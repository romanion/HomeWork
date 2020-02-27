package obstacles;

import competitors.Competitor;

public class Wall implements Obstacle{

    public final int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public void onSuccess(Competitor competitor){
        System.out.println(competitor.getName() + " успешно перепрыгнул "+ height + "м");
    }

    @Override
    public void onFailur(Competitor competitor){
        System.out.println(competitor.getName() + " не перепрыгнул " + height + "м");
    }

    @Override
    public boolean compete(Competitor competitor){
        if(height >= competitor.getJumpLimit()){
            onFailur(competitor);
            return false;
        } else {
            onSuccess(competitor);
            return true;
        }
    }
}
