/*
 * ExceptionsUsage.java
 * 02.20.23 by belicfr
 */
package exceptions;

import dictionnaries.Exceptions;

import java.util.Formatter;

/**
 * Utility methods to use exceptions system.
 * @author belicfr
 */
public class ExceptionsUsage {
    /**
     * Print an exception message. With line and file name.
     * @param error The exception reason
     * @param line The expression location in the file (line)
     * @param file The expression location (file)
     */
    public static void print(String error,
                             int line,
                             String file,
                             String[] args) {

        System.out.printf(
                Exceptions.ERROR_BODY_LINE_AND_FILE + '\n',
                error,
                line,
                file
        );

    }

    /**
     * Print an exception message. With only line.
     * @param error The exception reason
     * @param line The expression location in the file (line)
     */
    public static void print(String error,
                             int line,
                             String[] args) {

        System.out.printf(Exceptions.ERROR_BODY_LINE_ONLY + '\n', error, line);

    }

    /**
     * Print an exception message. With only file name.
     * @param error The exception reason
     * @param file The expression location (file)
     */
    public static void print(String error,
                             String file,
                             String[] args) {

        System.out.printf(Exceptions.ERROR_BODY_FILE_ONLY + '\n', error, file);

    }

    /**
     * Print an exception message. Without any details.
     * @param error The exception reason
     */
    public static void print(String error,
                             String[] args) {

        System.out.printf(Exceptions.ERROR_BODY_WITHOUT_DETAILS + '\n', error);

    }
}
