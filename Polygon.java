import java.awt.Color;

public class Polygon {
    double[] xCoords;
    double[] yCoords;

    public Polygon(In in) {
        int N = in.readInt(); // how many coords
        xCoords = new double[N];
        yCoords = new double[N];
        for (int i = 0; i < N; i++) {
            xCoords[i] = in.readDouble();
            yCoords[i] = in.readDouble();
        }
    }

    public void draw() {
        StdDraw.filledPolygon(xCoords, yCoords);
        StdDraw.filledPolygon(xCoords, yCoords);
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.setPenRadius(0.0025);
        StdDraw.polygon(xCoords, yCoords);

    }

    public static void main(String[] args) {
        Polygon p = new Polygon(new In("points"));
        p.draw();
    }
}