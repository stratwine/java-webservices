
package com.github.jws.services;

import javax.jws.WebService;

import com.github.stratwine.domain.Circle;

/**
 *
 * @author John Doe
 */

@WebService
public class CircleFunctions {

   public double getArea(double r) {
        return java.lang.Math.PI * (r * r);
    }

   public double getCircumference(double r) {
        return 2 * java.lang.Math.PI * r;
    }
   
   public Circle getCircle()
   {
	  Circle circle = new Circle();
	  circle.setDescription("test");
	  circle.setRadius(5);
	  return circle;
   }
}