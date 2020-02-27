package competitors;

public class Cat implements Competitor{

    private static final String catInRussian = "Кот";
    private final String name;
    private final int runLimit;
    private final int jumpLimit;

    public Cat(String name, int runLimit, int jumpLimit){
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
        System.out.println(catInRussian + " " + "прыгает");
    }

    @Override
    public void run(){
        System.out.println(catInRussian + " " + "бежит");
    }
}
