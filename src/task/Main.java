package task;

import task.figure.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle();
        shapes[1] = new Cone();
        shapes[2] = new Cube();
        shapes[3] = new Oval();
        shapes[4] = new Quad();
        for (Shape shape: shapes){
            new PrintFigure(shape).printName();
        }
    }
}
