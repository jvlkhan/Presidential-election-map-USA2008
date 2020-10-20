public class ElectionMap {
    public static void main(String[] args) {
        String filename = "USA.txt"; // coords
        In readFile = new In(filename);
        double minX = readFile.readDouble();
        double minY = readFile.readDouble();
        double maxX = readFile.readDouble();
        double maxY = readFile.readDouble();

        StdDraw.setXscale(minX, maxX);
        StdDraw.setYscale(minY, maxY);

        int regions = readFile.readInt(); // how many coords

        for (int i = 0; i < regions; i++) {
            readFile.readLine(); // skips line
            String state = readFile.readLine();
            String country = readFile.readString();
            Polygon p = new Polygon(readFile);
            Region r = new Region(state, country, p);
            VoteCount v = new VoteCount(state, country, 2008);
            StdDraw.setPenColor(v.getColor());
            r.draw();
        }
    }
}