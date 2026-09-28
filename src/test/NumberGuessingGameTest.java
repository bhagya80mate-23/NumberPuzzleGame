public class NumberGuessingGameTest {

    public static void main(String[] args) {

        boolean passed = true;

        System.out.println("Running Tests...");
        System.out.println();

        // Test 1
        if (NumberGuessingGame.checkGuess(10, 50).equals("Too Low")) {
            System.out.println("Test 1 Passed");
        } else {
            System.out.println("Test 1 Failed");
            passed = false;
        }

        // Test 2
        if (NumberGuessingGame.checkGuess(80, 50).equals("Too High")) {
            System.out.println("Test 2 Passed");
        } else {
            System.out.println("Test 2 Failed");
            passed = false;
        }

        // Test 3
        if (NumberGuessingGame.checkGuess(50, 50).equals("Correct")) {
            System.out.println("Test 3 Passed");
        } else {
            System.out.println("Test 3 Failed");
            passed = false;
        }

        System.out.println();

        if (passed) {
            System.out.println("ALL TESTS PASSED!");
        } else {
            System.out.println("TESTS FAILED!");
            System.exit(1);
        }
    }
}
