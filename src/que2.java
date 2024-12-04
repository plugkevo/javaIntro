public class que2 {
    public static void main(String[] args) {
        //Write a Java class that use at least two methods to calculate and prints the area and
        //perimeter of a rectangle
        int totalArea =recArea(25,30);
        int totalPerimeter = recperimeter(25, 30);

        System.out.println("The area is" + totalArea);
        System.out.println("The perimeter is" + totalPerimeter);


    }
    public static int recArea(int length, int width){

        int area = length * width;
        return area;
    }
    public static int recperimeter(int length, int width){

        int perimeter = length + width;
        return perimeter;
    }
}
