class HomeWorkTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape point = new Point();
        Shape square = new Square();
//        Shape quad = new Quad();

        PrintNameOfShape.printNameOfShape(circle);
        PrintNameOfShape.printNameOfShape(triangle);
        PrintNameOfShape.printNameOfShape(point);
        PrintNameOfShape.printNameOfShape(square);
//        PrintNameOfShape.printNameOfShape(quad);
        PrintNameOfShape.printNameOfShape(new Quad());
        
    }
}