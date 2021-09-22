public class GreetMachine {
    
    private String DEFAULT_NAME = "Earthlings";
    private String name;
    
    public GreetMachine() {
        name = DEFAULT_NAME;
    }
    
    public GreetMachine(String name_in) {
        name = name_in;
    }
    
    public String toString() {
        return "Greetings, " + name;
    }
}