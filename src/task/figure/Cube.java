package task.figure;

import task.Shape;

public class Cube extends Shape {
    private String name;

    public Cube() {
        this.name = "Cube";
    }

    @Override
    public String getName() {
        return name;
    }
}
