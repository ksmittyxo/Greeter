public class Greeter {
    public static void main(String[] args) {
        
        String nameToGreet = 
            args.length > 0 ? args[0] : "people of planet Earth";
        
        System.out.printf("Greetings, %s!\n", nameToGreet);
    }
}