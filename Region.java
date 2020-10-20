public class Region {
    private String name, code;
    private Polygon poly;

    public Region(String name, String code, Polygon poly) {
        this.name = name;
        this.code = code;
        this.poly = poly;
    }

    public void draw() {
        poly.draw();
    }

    public String toString() {
        return name + " " + code;
    }

    public static void main(String[] args) {
        Region r = new Region("Square", "center", new Polygon(new In("points")));
        System.out.println(r);
        r.draw();
    }
}