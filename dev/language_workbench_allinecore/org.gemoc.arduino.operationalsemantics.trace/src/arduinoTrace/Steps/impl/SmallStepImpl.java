/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.ArduinoTracePackage;
import arduinoTrace.State;

import arduinoTrace.Steps.SmallStep;
import arduinoTrace.Steps.StepsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Small Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.impl.SmallStepImpl#getPrecedingState <em>Preceding State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SmallStepImpl extends MinimalEObjectImpl.Container implements SmallStep {
	/**
	 * The cached value of the '{@link #getPrecedingState() <em>Preceding State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedingState()
	 * @generated
	 * @ordered
	 */
	protected State precedingState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmallStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.SMALL_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getPrecedingState() {
		if (precedingState != null && precedingState.eIsProxy()) {
			InternalEObject oldPrecedingState = (InternalEObject)precedingState;
			precedingState = (State)eResolveProxy(oldPrecedingState);
			if (precedingState != oldPrecedingState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.SMALL_STEP__PRECEDING_STATE, oldPrecedingState, precedingState));
			}
		}
		return precedingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetPrecedingState() {
		return precedingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedingState(State newPrecedingState, NotificationChain msgs) {
		State oldPrecedingState = precedingState;
		precedingState = newPrecedingState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StepsPackage.SMALL_STEP__PRECEDING_STATE, oldPrecedingState, newPrecedingState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedingState(State newPrecedingState) {
		if (newPrecedingState != precedingState) {
			NotificationChain msgs = null;
			if (precedingState != null)
				msgs = ((InternalEObject)precedingState).eInverseRemove(this, ArduinoTracePackage.STATE__FOLLOWING_STEP, State.class, msgs);
			if (newPrecedingState != null)
				msgs = ((InternalEObject)newPrecedingState).eInverseAdd(this, ArduinoTracePackage.STATE__FOLLOWING_STEP, State.class, msgs);
			msgs = basicSetPrecedingState(newPrecedingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.SMALL_STEP__PRECEDING_STATE, newPrecedingState, newPrecedingState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StepsPackage.SMALL_STEP__PRECEDING_STATE:
				if (precedingState != null)
					msgs = ((InternalEObject)precedingState).eInverseRemove(this, ArduinoTracePackage.STATE__FOLLOWING_STEP, State.class, msgs);
				return basicSetPrecedingState((State)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StepsPackage.SMALL_STEP__PRECEDING_STATE:
				return basicSetPrecedingState(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StepsPackage.SMALL_STEP__PRECEDING_STATE:
				if (resolve) return getPrecedingState();
				return basicGetPrecedingState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StepsPackage.SMALL_STEP__PRECEDING_STATE:
				setPrecedingState((State)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StepsPackage.SMALL_STEP__PRECEDING_STATE:
				setPrecedingState((State)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StepsPackage.SMALL_STEP__PRECEDING_STATE:
				return precedingState != null;
		}
		return super.eIsSet(featureID);
	}

} //SmallStepImpl