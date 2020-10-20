import java.awt.Color;

public class VoteCount {
    private String regionName, enclosingName;
    private int year;

    public VoteCount(String regionName, String enclosingName, int year) {
        this.regionName = regionName;
        this.enclosingName = enclosingName;
        this.year = year;
    }

    public Color getColor() {
        In readFile = new In(enclosingName + year);
        String text = readFile.readAll();
        int begin = 0;
        int end = 0;

        begin = text.indexOf(regionName, begin);
        begin = text.indexOf(",", begin);
        end = text.indexOf(",", begin + 1);
        int democraticVotes = Integer.parseInt(text.substring(begin + 2, end));

        begin = end + 2;
        end = text.indexOf(",", begin + 1);
        int republicanVotes = Integer.parseInt(text.substring(begin, end));

        if (democraticVotes > republicanVotes) {
            return new Color(255, 0, 0);
        }

        else {
            return new Color(0, 0, 255);
        }
    }

    public static void main(String[] args) {
        VoteCount vc = new VoteCount("first state", "USA", 1234);
        System.out.println(vc.getColor());
        vc = new VoteCount("second state", "USA", 1234);
        System.out.println(vc.getColor());
        vc = new VoteCount("third state", "USA", 1234);
        System.out.println(vc.getColor());
    }
}