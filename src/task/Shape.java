package task;

public abstract class Shape implements Print{
    @Override
    public void printName() {
        System.out.println("Figure :" + getName());
    }

    public abstract String getName();
}
