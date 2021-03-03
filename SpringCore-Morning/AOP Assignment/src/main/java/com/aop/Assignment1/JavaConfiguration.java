package com.aop.Assignment1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class JavaConfiguration {
    @Bean(name="Point 1")
    public Point getPoint1() {
        return new Point(4,8);
    }

    @Bean(name="Point 2")
    public Point getPoint2() {
        return new Point(8,8);
    }

    @Bean(name="Point 3")
    public Point getPoint3() {
        return new Point(9,5);
    }

    @Bean(name="Point 4")
    public Point getPoint4() {
        return new Point(5,5);
    }

    @Bean(name="Rectangle")
    public Rectangle buildRectangle() {
        List<String> quadrilaterals = new ArrayList<>();
        quadrilaterals.add("Rectangle");
        quadrilaterals.add("Square");
        quadrilaterals.add("Rhombus");
        quadrilaterals.add("Parallelogram");
        quadrilaterals.add("Trapezium");

        return new Rectangle(this.getPoint1(), this.getPoint2(), this.getPoint3(), this.getPoint4(), quadrilaterals);
    }
}