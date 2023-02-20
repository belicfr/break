/*
 * Interpreter.java
 * 02.20.23 by belicfr
 */
package main;

import dictionnaries.Exceptions;
import exceptions.ExceptionsUsage;
import prompt.Prompt;

/**
 * Main interpreter class.
 * <p>
 *     This class is the conductor of interpreter systems.
 * </p>
 * @author belicfr
 * @version 0.1a (PUBLIC AND DEVELOPMENT VERSION)
 */
class Interpreter {
    /**
     * Main method from Interpreter class.
     * <p>
     *     User can give one parameter: the file path to run with
     *     interpreter.
     * </p>
     * <ul>
     *     <li>
     *         One parameter given: the interpreter will open and
     *         run the given file path.
     *     </li>
     *     <li>
     *         No one parameter given: the interpreter will open
     *         prompt to interact with user.
     *     </li>
     *     <li>
     *         Else, an error occured: 0 or 1 parameter is required,
     *         not more.
     *     </li>
     * </ul>
     * @param args one parameter: the file path to run
     */
    public static void main(String[] args) {
        if (args.length == 1) {
            // TODO: open file in args[0]
        } else if (args.length == 0) {
            Prompt.run();
        } else {
            ExceptionsUsage.print(
                    Exceptions.INVALID_INTERPRETER_ARGUMENTS_COUNT,
                    new String[] {
                            "0", "1"
                    }
            );
        }
    }
}