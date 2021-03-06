/**
 */
package org.gemoc.arduino.concurrent.xarduino.arduino.tests;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Infra Red Sensor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfraRedSensorTest extends ArduinoDigitalModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InfraRedSensorTest.class);
	}

	/**
	 * Constructs a new Infra Red Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfraRedSensorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Infra Red Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.gemoc.arduino.concurrent.xarduino.arduino.InfraRedSensor getFixture() {
		return (org.gemoc.arduino.concurrent.xarduino.arduino.InfraRedSensor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoFactory.eINSTANCE.createInfraRedSensor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //InfraRedSensorTest
