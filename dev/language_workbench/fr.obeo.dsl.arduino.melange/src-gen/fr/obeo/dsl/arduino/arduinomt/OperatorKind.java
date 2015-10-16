package fr.obeo.dsl.arduino.arduinomt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;

@SuppressWarnings("all")
public enum OperatorKind implements Enumerator {
  EQUAL,
  
  MINUS,
  
  UPPER,
  
  LOWER,
  
  PLUS,
  
  DIFF,
  
  UPPEROREQUAL,
  
  LOWEROREQUAL,
  
  MUL,
  
  DIV,
  
  MIN,
  
  MAX,
  
  POURCENT,
  
  AND,
  
  OR,
  
  NOT;
  public final static int EQUAL_VALUE = 0;
  
  public final static int MINUS_VALUE = 0;
  
  public final static int UPPER_VALUE = 0;
  
  public final static int LOWER_VALUE = 0;
  
  public final static int PLUS_VALUE = 0;
  
  public final static int DIFF_VALUE = 0;
  
  public final static int UPPEROREQUAL_VALUE = 0;
  
  public final static int LOWEROREQUAL_VALUE = 0;
  
  public final static int MUL_VALUE = 0;
  
  public final static int DIV_VALUE = 0;
  
  public final static int MIN_VALUE = 0;
  
  public final static int MAX_VALUE = 0;
  
  public final static int POURCENT_VALUE = 0;
  
  public final static int AND_VALUE = 0;
  
  public final static int OR_VALUE = 0;
  
  public final static int NOT_VALUE = 0;
  
  private final static OperatorKind[] VALUES_ARRAY = new OperatorKind[] {
    	EQUAL,
    	MINUS,
    	UPPER,
    	LOWER,
    	PLUS,
    	DIFF,
    	UPPEROREQUAL,
    	LOWEROREQUAL,
    	MUL,
    	DIV,
    	MIN,
    	MAX,
    	POURCENT,
    	AND,
    	OR,
    	NOT,
    };;
  
  private final static List<OperatorKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));;
  
  public static OperatorKind get(final String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
    	OperatorKind result = VALUES_ARRAY[i];
    	if (result.toString().equals(literal)) {
    		return result;
    	}
    }
    return null;
  }
  
  public static OperatorKind getByName(final String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
    	OperatorKind result = VALUES_ARRAY[i];
    	if (result.getName().equals(name)) {
    		return result;
    	}
    }
    return null;
  }
  
  public static OperatorKind get(final int value) {
    switch (value) {
    	/* true */
    	case EQUAL_VALUE: return EQUAL;
    }
    return null;
  }
  
  private final int value;
  
  private final String name;
  
  private final String literal;
  
  private OperatorKind() {
    this.value = 0;
    this.name = "";
    this.literal = "";
  }
  
  private OperatorKind(final int value, final String name, final String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }
  
  public String getName() {
    return name;
  }
  
  public int getValue() {
    return value;
  }
  
  public String getLiteral() {
    return literal;
  }
  
  public String toString() {
    return literal;
  }
}
