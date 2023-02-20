/*
 * Exceptions.java
 * 02.20.23 by belicfr
 */
package dictionnaries;

public class Exceptions {
    public final static String ERROR_BODY_LINE_AND_FILE
            = "Exception occured: %s\nLine: %s\tFile: %s";

    public final static String ERROR_BODY_LINE_ONLY
            = "Exception occured: %s\nLine: %s";

    public final static String ERROR_BODY_FILE_ONLY
            = "Exception occured: %s\nFile: %s";

    public final static String ERROR_BODY_WITHOUT_DETAILS
            = "Exception occured: %s";

    public final static String INVALID_INTERPRETER_ARGUMENTS_COUNT
            = "Incorrect arguments count: there can only be between 0 and 1 "
            + "arguments.";

    public final static String VARIABLE_NOT_FOUND
            = "Given variable does not exist.";
}