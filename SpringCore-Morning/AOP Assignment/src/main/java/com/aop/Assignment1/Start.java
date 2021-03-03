package com.aop.Assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Start {

    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);

        Rectangle rectangle = (Rectangle)context.getBean("Rectangle");

        System.out.println("Height of the Rectangle Is: " + rectangle.getHeight());
        System.out.println("Width of the Rectangle Is: " + rectangle.getWidth());
        System.out.println("Coordinates of the Point point1 are: " + rectangle.getPoint1().getX_axis() + " , " + rectangle.getPoint1().getY_axis());
        System.out.println("Coordinates of the Point point2 are: " + rectangle.getPoint2().getX_axis() + " , " + rectangle.getPoint2().getY_axis());
        System.out.println("Coordinates of the Point point3 are: " + rectangle.getPoint3().getX_axis() + " , " + rectangle.getPoint3().getY_axis());
        System.out.println("Coordinates of the Point point4 are: " + rectangle.getPoint4().getX_axis() + " , " + rectangle.getPoint4().getY_axis());

        List<String> quadrilaterals = rectangle.getAllQuadrilaterals();
        System.out.println("List of All Quadrilaterals is: ");

        for (int i = 0; i < quadrilaterals.size() ; i++) {
            System.out.println(quadrilaterals.get(i));
        }
       
    }
}