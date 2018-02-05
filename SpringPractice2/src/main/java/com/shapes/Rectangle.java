package com.shapes;

public class Rectangle {
private String shape;
private String parentShape;
public Rectangle()
{
	System.out.println("rectangle defaul const");
}
public Rectangle(String shape) {
	super();
	System.out.println("in rectangle shaape");
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
	System.out.println("setting rectangle shape");
	this.parentShape = parentShape;
}

}
