/*
 * Prompt.java
 * 02.20.23 by belicfr
 */
package prompt;

import lang.Variable;

import java.util.Scanner;

/**
 * Prompt class.
 * <p>
 *     The prompt is used to have a direct communication between
 *     user and interpreter. The user can type and submit lines
 *     of code directly to interpreter without create a file.
 * </p>
 * @author belicfr
 */
public class Prompt {
    /**
     * Scanner class instance for prompt class.
     */
    private final static Scanner INPUT_STREAM = new Scanner(System.in);

    /**
     * Run prompt in current output (console, etc.).
     */
    public static void run() {
        String line;

        do {
            line = INPUT_STREAM.nextLine();

            Variable.create("integer", "myNumber", "10");
            System.out.println(
                    Variable.isInteger(Variable.getVariableByName("myNumber"))
            );
        } while (!line.equals(":exit"));
    }
}
