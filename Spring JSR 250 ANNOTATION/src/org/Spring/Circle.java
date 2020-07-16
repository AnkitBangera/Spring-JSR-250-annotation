package org.Spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape {
	private Point center;



	public Point getCenter() {
		return center;
	}

	//if the name parameter not mentioned in the @Resource then 
	@Resource (name="pointA")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle [centre=" + center + "]");
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("Initialized circle");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroyed circle");
	}
	
}
