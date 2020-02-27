package competitors;

public interface Competitor {

    public String getName();

    public int getRunLimit();

    public int getJumpLimit();

    public void jump();

    public void run();
}
