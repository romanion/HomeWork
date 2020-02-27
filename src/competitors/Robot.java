package competitors;

public class Robot implements Competitor{

    private final String robotInRussian = "Робот";
    private final String name;
    private final int runLimit;
    private final int jumpLimit;

    public Robot(String name, int runLimit, int jumpLimit){
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }



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
        System.out.println(robotInRussian + " " + "прыгает");
    }

    @Override
    public void run(){
        System.out.println(robotInRussian + " " + "бежит");
    }
}
