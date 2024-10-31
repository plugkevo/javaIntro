public class classAnimal {
    public static void main(String[] args){
        String color = makeSound("brown");
        String size = Move("Small");

        System.out.println(color);
        System.out.println(size);
    }
 public static String makeSound(String color){

     return color;
 }
    public static String Move(String size){

        return size;
    }

}
class Human{
    String color = "Black";
    String Size = "small";

    public static String makeSound(String color){

        return color;
    }
    public static String Move(String size){

        return size;
    }
}