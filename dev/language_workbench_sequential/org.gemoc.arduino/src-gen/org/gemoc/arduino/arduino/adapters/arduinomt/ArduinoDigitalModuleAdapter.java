package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.ArduinoDigitalModule;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ArduinoDigitalModuleAdapter extends EObjectAdapter<ArduinoDigitalModule> implements org.gemoc.arduino.arduinomt.arduino.ArduinoDigitalModule {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public ArduinoDigitalModuleAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  @Override
  public boolean isLevel() {
    return adaptee.isLevel() ;
  }
  
  @Override
  public void setLevel(final boolean o) {
    adaptee.setLevel(o) ;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean LEVEL_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getArduinoDigitalModule();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_DIGITAL_MODULE__NAME:
    		return getName();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_DIGITAL_MODULE__LEVEL:
    		return isLevel() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_DIGITAL_MODULE__NAME:
    		setName(NAME_EDEFAULT);
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_DIGITAL_MODULE__LEVEL:
    		setLevel(LEVEL_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_DIGITAL_MODULE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_DIGITAL_MODULE__LEVEL:
    		return isLevel() != LEVEL_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_DIGITAL_MODULE__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_DIGITAL_MODULE__LEVEL:
    		setLevel(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
