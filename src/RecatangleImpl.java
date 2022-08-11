public class RecatangleImpl {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(4,40);
        Rectangle obj2 = new Rectangle(3.5,35.9);
        double result_1 = obj1.getArea();
        System.out.println("Area = "+result_1);
        double result_2 = obj1.getPerimeter();
        System.out.println("Perimeter = "+result_2);
        double result_3 = obj2.getArea();
        System.out.println("Area = "+result_3);
        double result_4 = obj1.getPerimeter();
        System.out.println("Perimeter = "+result_4);
    }
}
