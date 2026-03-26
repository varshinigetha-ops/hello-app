public class UC4_HelloApp {
    public static void main(String[] args) {
        String names = (args.length > 0) ? String.join(", ", args) : "World";
        System.out.println("Hello, " + names + "!");
    }
}