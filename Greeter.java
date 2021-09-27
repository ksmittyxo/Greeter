public class Greeter {
    public static void main(String[] args) {
        
        
        String nameToGreet = 
            args.length > 0 ? args[0] : "Residents of Earth";
        
        GreetMachine gmDefalut = new GreetMachine();
        System.out.println(gmDefalut);
        GreetMachine gm = new GreetMachine(nameToGreet);
        System.out.println(gm);
    }
}