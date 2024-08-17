package day17_customClass;

public class RectangleClients {
    public static void main(String[] args) {
        System.out.println();


        Rectangle rectangle= new Rectangle();
        rectangle.width=3;
        rectangle.length=8;


        System.out.println("rectangle = " + rectangle);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        System.out.println("*****************");

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 15;
        rectangle2.length = 25.2;

        System.out.println("rectangle2" + rectangle2);
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());


    }
}
