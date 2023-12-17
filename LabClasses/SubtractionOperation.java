package LabClasses;

import LabInterfaces.MathOperation;

public class SubtractionOperation implements MathOperation {
	
	@Override
	public double evaluate(double d1, double d2) {
		return d1 - d2;
	}
	
}
