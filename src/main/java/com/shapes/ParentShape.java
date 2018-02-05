package com.shapes;

public class ParentShape {
 private String parentShape;
 public ParentShape()
 {
	 System.out.println("parentshape default constructor");
 }
public ParentShape(String parentShape) {
	super();
	this.parentShape = parentShape;
}

public String getParentShape() {
	return parentShape;
}

public void setParentShape(String parentShape) {
	System.out.println("setting parent shape");
	this.parentShape = parentShape;
}
 
}
