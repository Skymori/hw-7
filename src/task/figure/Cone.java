package task.figure;

import task.Shape;

public class Cone extends Shape {
    private String name;

    public Cone() {
        this.name = "Cone";
    }

    @Override
    public String getName() {
        return name;
    }
}
