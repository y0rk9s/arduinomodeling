DSL org.gemoc.arduino.sequential.XArduino {
	abstract-syntax {
		ecore = "platform:/resource/org.gemoc.arduino.sequential.xarduino/model/XArduino.ecore"
	}
	semantics {
		k3 = "org.gemoc.arduino.sequential.xarduino.aspects.IntegerModuleGet_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.Delay_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.BooleanVariable_EvaluableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.BinaryIntegerExpression_EvaluableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.Project_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.While_EvaluableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.ModuleAssignment_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.IntegerVariable_EvaluableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.If_EvaluableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.ArduinoCommunicationModule_PushAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.Instruction_UtilitesAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.VariableAssignment_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.If_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.Pin_EvaluableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.While_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.BooleanModuleGet_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.IntegerConstant_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.ModuleInstruction_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.Repeat_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.BluetoothTransceiver_PushAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.VariableDeclaration_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.VariableRef_EvaluableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.BooleanConstant_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.Block_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.Constant_EvaluableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.Variable_EvaluableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.BinaryBooleanExpression_EvaluableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.Utilities_ExecutableAspect",
		"org.gemoc.arduino.sequential.xarduino.aspects.Control_ExecutableAspect"
	}
}
