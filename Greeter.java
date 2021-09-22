public class Greeter {
    public static void main(String[] args) {
        
        
        String nameToGreet = 
            args.length > 0 ? args[0] : "Earthlings";
        
        GreetMachine gm = new GreetMachine(nameToGreet);
        System.out.println(gm);
    }
}