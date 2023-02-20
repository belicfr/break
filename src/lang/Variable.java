/*
 * Variable.java
 * 02.20.23 by belicfr
 */
package lang;

import dictionnaries.Exceptions;
import dictionnaries.InternalSyntaxes;
import dictionnaries.JavaTypesInformation;
import exceptions.ExceptionsUsage;

public class Variable {
    /**
     * Variable storing.
     * Syntax: TYPE_NAME_VALUE
     * Example: STRING_helloWorld_Hello, World!
     */
    private final static String[] variables
            = new String[JavaTypesInformation.ARRAY_MAX_LENGTH];

    private static int variablesArrayLength = 0;

    private static String[] getVariableComponents(int variableIndex) {
        for (int p = 0; p < variables.length; p++)
            System.out.println(p + " | " + variables[p]);

        return variables[variableIndex]
                .split(InternalSyntaxes.VARIABLE_DELIMITER);
    }

    public static boolean isInteger(String variableName) {
        String variableType;

        variableType = getVariableComponents(
                getVariableIndexByName(variableName)
        )[0];

        return variableType.equals("INTEGER");
    }

    public static void create(String type, String name, String value) {
        type = type.toUpperCase();

        variables[variablesArrayLength] = type + '_' + name + '_' + value;

        variablesArrayLength++;
    }

    public static String getVariableByName(String name) {
        for (int variableIndex = 0;
             variableIndex < variables.length;
             variableIndex++) {

            if (getVariableComponents(variableIndex)[1].equals(name)) {
                return variables[variableIndex];
            }

        }

        ExceptionsUsage.print(Exceptions.VARIABLE_NOT_FOUND, new String[]{});
        return "";
    }

    public static int getVariableIndexByName(String name) {
        for (int variableIndex = 0;
             variableIndex < variables.length;
             variableIndex++) {

            if (getVariableComponents(variableIndex)[1].equals(name)) {
                return variableIndex;
            }

        }

        ExceptionsUsage.print(Exceptions.VARIABLE_NOT_FOUND, new String[]{});
        return 0;
    }
}
