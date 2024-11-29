public class circle {
    public static void main(String[] args) {

        double totalArea = areaCircle(7);
        double totalPerimeter = periCircle(14);

        System.out.println(totalArea);
        System.out.println(totalPerimeter);

    }
    public static double areaCircle(int radius){

        double area = 3.14 *radius * radius;
        return area;

    }
    public static double periCircle(int diameter){
        double perimeter = 3.14 * diameter;
        return perimeter;
    }
}
