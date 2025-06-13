//TODO: Something Interesting
//TODO: Can we pass Arguments in Main Method?
public class CommandLineExample {
    public static void main(String[] args) {
        // Check if arguments are passed
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No arguments were passed.");
        }
    }
}
// javac CommandLineExample.java
// java CommandLineExample arg1 arg2 arg3

// If you are using IntelliJ Idea pass arguments by clicking 3 dots -> debug/run config