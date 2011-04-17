
package com.github.jws.services;

import javax.jws.WebService;

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
}