package task.figure;

import task.Shape;

public class Circle extends Shape {
    private String name;
    public Circle() {
        this.name = "Circle";
    }

    @Override
    public String getName() {
        return name;
    }
}
