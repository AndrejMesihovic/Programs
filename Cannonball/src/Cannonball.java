public class Cannonball {

    private double v;
    private double s;  
    private double initialVelocity;
    private final double g = 9.81;  

    public Cannonball(double initialVelocity) {
        this.v = initialVelocity;
        this.s = 0;
        this.initialVelocity = initialVelocity;
    }

    public void update(double deltaT) {
        this.v = this.v - this.g * deltaT;
        this.s = this.s + this.v * deltaT;
    }

    public double getHeight() {
        return this.s;
    }

    public double getVelocity() {
        return this.v;
    }

    public double getInitialVelocity() {
        return this.initialVelocity;
    }
}