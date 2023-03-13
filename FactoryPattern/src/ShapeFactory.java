public class ShapeFactory {
    public Shape createShape(String command){
        if(command.equalsIgnoreCase("Square")){
            Shape figure = new Square(3);
            return figure;
        }
        else if(command.equalsIgnoreCase("Rectangle")){
            Shape figure = new Rectangle(3,4);
            return figure;
        }
        else if(command.equalsIgnoreCase("Circle")){
            Shape figure = new Circle(3);
            return figure;
        }
        else if(command.equalsIgnoreCase("Triangle")){
            Shape figure = new Triangle(3,4);
            return figure;
        }
        else return null;
    }
}
