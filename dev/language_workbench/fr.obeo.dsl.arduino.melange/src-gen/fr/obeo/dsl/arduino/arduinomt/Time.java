package fr.obeo.dsl.arduino.arduinomt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;

@SuppressWarnings("all")
public enum Time implements Enumerator {
  MILLISECOND,
  
  MICROSECOND;
  public final static int MILLISECOND_VALUE = 0;
  
  public final static int MICROSECOND_VALUE = 0;
  
  private final static Time[] VALUES_ARRAY = new Time[] {
    	MILLISECOND,
    	MICROSECOND,
    };;
  
  private final static List<Time> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));;
  
  public static Time get(final String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
    	Time result = VALUES_ARRAY[i];
    	if (result.toString().equals(literal)) {
    		return result;
    	}
    }
    return null;
  }
  
  public static Time getByName(final String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
    	Time result = VALUES_ARRAY[i];
    	if (result.getName().equals(name)) {
    		return result;
    	}
    }
    return null;
  }
  
  public static Time get(final int value) {
    switch (value) {
    	/* true */
    	case MILLISECOND_VALUE: return MILLISECOND;
    }
    return null;
  }
  
  private final int value;
  
  private final String name;
  
  private final String literal;
  
  private Time() {
    this.value = 0;
    this.name = "";
    this.literal = "";
  }
  
  private Time(final int value, final String name, final String literal) {
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