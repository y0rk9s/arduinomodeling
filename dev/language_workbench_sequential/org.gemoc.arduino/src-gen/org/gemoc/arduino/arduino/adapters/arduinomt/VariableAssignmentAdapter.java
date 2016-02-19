package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.VariableAssignment;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.Expression;
import org.gemoc.arduino.arduinomt.arduino.Variable;

@SuppressWarnings("all")
public class VariableAssignmentAdapter extends EObjectAdapter<VariableAssignment> implements org.gemoc.arduino.arduinomt.arduino.VariableAssignment {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public VariableAssignmentAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public Expression getOperand() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getOperand(), eResource) ;
  }
  
  @Override
  public void setOperand(final Expression o) {
    if (o != null)
    	adaptee.setOperand(((org.gemoc.arduino.arduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
    else adaptee.setOperand(null) ;
  }
  
  @Override
  public Variable getVariable() {
    return (Variable) adaptersFactory.createAdapter(adaptee.getVariable(), eResource) ;
  }
  
  @Override
  public void setVariable(final Variable o) {
    if (o != null)
    	adaptee.setVariable(((org.gemoc.arduino.arduino.adapters.arduinomt.VariableAdapter) o).getAdaptee()) ;
    else adaptee.setVariable(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getVariableAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND:
    		return getOperand();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__VARIABLE:
    		return getVariable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND:
    		setOperand((org.gemoc.arduino.arduinomt.arduino.Expression) null);
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__VARIABLE:
    		setVariable((org.gemoc.arduino.arduinomt.arduino.Variable) null);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND:
    		return getOperand() != null;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__VARIABLE:
    		return getVariable() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.arduino.arduinomt.arduino.Assignment.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND:
    			return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.arduino.arduinomt.arduino.Assignment.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND:
    			return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND:
    		setOperand((org.gemoc.arduino.arduinomt.arduino.Expression) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__VARIABLE:
    		setVariable((org.gemoc.arduino.arduinomt.arduino.Variable) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
