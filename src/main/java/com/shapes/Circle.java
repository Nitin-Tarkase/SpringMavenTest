package com.shapes;

public class Circle {
private String shape;
private String parentShape;
static
{
	System.out.println("static blook");
}
public Circle()
{
	System.out.println("cirecle defaul const");
}
public Circle(String shape) {
	super();
	System.out.println("in circele shaape");
	this.shape = shape;
}

public String getShape() {
	return shape;
}

public void setShape(String shape) {
	this.shape = shape;
}

public String getParentShape() {
	return parentShape;
}

public void setParentShape(String parentShape) {
	System.out.println("setting circle shape"+parentShape);
	this.parentShape = parentShape;
}

}
