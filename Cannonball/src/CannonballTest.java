import javax.swing.JOptionPane;

public class CannonballTest {
    public static void main(String[] args) {
        double initialVelocity = Double.parseDouble(JOptionPane.showInputDialog("Enter the initial velocity: "));
        Cannonball ball = new Cannonball(initialVelocity);

        double deltaT = 0.01;
        double maxH = 0;
        double totalTime = 0;

        while (ball.getHeight() >= 0) {
            ball.update(deltaT);
            totalTime += deltaT;

            if (ball.getHeight() > maxH) {
                maxH = ball.getHeight();
            }

            if (totalTime % 1 < deltaT) {
                double formulaHeight = -0.5 * 9.81 * totalTime * totalTime + initialVelocity * totalTime;
                System.out.printf("Time = %d seconds\t Velocity = %-10d Height = %-10d Formula = %-10d\n", (int)totalTime, (int)ball.getVelocity(), (int)ball.getHeight(), (int)formulaHeight);
               
            }
        }

        System.out.printf("Total time = %.1f seconds\n", totalTime);
        System.out.printf("Maximum height reached = %.1f meters\n", maxH);
    }
}

