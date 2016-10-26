/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sphereclass;

/**
 *
 * @author DaTho7561
 */
public class Sphere {
    
    // The radius of the Sphere
    double radius;
    
    // The default radius of the Sphere
    public static final double DEFAULT_RADIUS = 1;
    
    /**
     * Creates a new Sphere with the specified radius.
     * pre: <tt>r</tt> is a positive double.
     * post: A new Sphere is created.
     * @param r The radius of the Sphere.
     */
    public Sphere(double r) {
        radius = r;
    }
    
    /**
     * Creates a new Sphere with the default radius of 1.
     * pre: none
     * post: A new Sphere is created.
     */
    public Sphere() {
        this(DEFAULT_RADIUS);
    }
    
    /**
     * Returns the surface area of this sphere.
     * pre: none
     * post: The surface area of the sphere is returned.
     * @return The surface area of the sphere.
     */
    public double getSurfaceArea() {
        double surfaceArea = radius * radius * Math.PI * 4;
        return surfaceArea;
    }
    
    /**
     * Returns the volume of this sphere.
     * pre: none
     * post: The volume of the sphere is returned.
     * @return The volume of the sphere.
     */
    public double getVolume() {
        double volume = radius * radius * radius * (4.0/3) * Math.PI;
        return volume;
    }
    
    /**
     * Gives this sphere a new radius.
     * pre: r is a positive real number.
     * post: the sphere has a new radius.
     * @param r The new radius for the sphere.
     */
    public void setRadius(double r) {
        radius = r;
    }
    
    /**
     * Returns the radius of the sphere as a double.
     * pre: none
     * post: radius returned
     * @return The radius of the Sphere.
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Returns a String that contains important information about the Sphere.
     * pre: none
     * post: String representing Sphere returned.
     * @return A String holding the radius, volume, and surface area of the sphere.
     */
    @Override
    public String toString() {
        String strRep = 
                "Radius: " + radius
                + "; Volume: " + getVolume()
                + "; Surface Area: " + getSurfaceArea();
        
        return strRep;
    }
    
}
