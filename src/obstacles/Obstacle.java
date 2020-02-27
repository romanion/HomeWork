package obstacles;

import competitors.Competitor;

public interface Obstacle {

    public void onSuccess(Competitor competitor);

    public void onFailur(Competitor competitor);

    public boolean compete(Competitor competitor);
}
