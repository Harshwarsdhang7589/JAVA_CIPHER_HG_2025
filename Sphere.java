package Q10;
class Sphere {
    double radius;
    
    // Method to calculate and display the volume of the sphere
    void volume() {
        double sphereVolume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("Volume of sphere with radius " + radius + ": " + sphereVolume);
    }
    
    // Method to display the radius of the sphere
    void displayRadius() {
        System.out.println("Radius: " + radius);
    }
}

// SphereDemo class with main method
class Demo
{
    public static void main(String[] args) {
        // Create two Sphere objects
        Sphere sphere1 = new Sphere();
        Sphere sphere2 = new Sphere();
        
        // Assign radius values
        sphere1.radius = 4.0;
        sphere2.radius = 2.5;
        
        // Display details for sphere1
        System.out.println("\n--- Sphere 1 ---");
        sphere1.displayRadius();
        sphere1.volume();
        
        // Display details for sphere2
        System.out.println("\n--- Sphere 2 ---");
        sphere2.displayRadius();
        sphere2.volume();
        
        // Find and display the sphere with the largest volume
        double volume1 = (4.0 / 3.0) * Math.PI * sphere1.radius * sphere1.radius * sphere1.radius;
        double volume2 = (4.0 / 3.0) * Math.PI * sphere2.radius * sphere2.radius * sphere2.radius;
        
        System.out.println("\n--- Comparison ---");
        if (volume1 > volume2) {
            System.out.println("Sphere 1 has the largest volume: " + volume1);
        } else if (volume2 > volume1) {
            System.out.println("Sphere 2 has the largest volume: " + volume2);
        } else {
            System.out.println("Both spheres have the same volume: " + volume1);
        }
    }
}

