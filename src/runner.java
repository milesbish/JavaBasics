public class runner {
    public static void main(String[] args) {
        Car ferrari = new Car (2018,"Ferrari", 8000, "Dino");
        System.out.println(ferrari.toString());
        ferrari.drive(12000);
        System.out.println(ferrari.toString());

        Rectangle rect = new Rectangle (31, 481);
        System.out.println(rect.getArea());
        System.out.println(rect.getDiagonal());
        System.out.println(rect.getSquare());
    }
}

