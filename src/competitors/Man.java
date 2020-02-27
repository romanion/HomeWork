package competitors;

public class Man implements Competitor {
    private static final String manInRussian = "Человек";
    private final String name;
    private final int runLimit;
    private final int jumpLimit;

    public Man(String name, int runLimit, int jumpLimit){
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRunLimit() {
        return runLimit;
    }

    @Override
    public int getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public void jump(){
        System.out.println(manInRussian + " " + "прыгает");
    }

    @Override
    public void run(){
        System.out.println(manInRussian + " " + "бежит");
    }
}
