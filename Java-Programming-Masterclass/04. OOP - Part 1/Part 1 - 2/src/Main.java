public class Main {
    public static void main(String[] args) {

        /*Animal animal = new Animal("Animal", 1, 1, 66, 32);
        Dog dog = new Dog("Corgi", 23, 2, 2, 4, 1, 24, "brown");
        //dog.eat();
        dog.run();*/


        /*Tesla tesla = new Tesla("USA");
        System.out.println(tesla.getEngine());
        System.out.println(tesla.getType());
        tesla.changeGear();
        tesla.movement(-30);
        System.out.println();
        tesla.changeGear(4);
        tesla.movement(60);*/


        /*Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());*/

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}