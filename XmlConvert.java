public class XmlConvert {
    public static void main(String[] args) {
        In readFile = new In(args[0]);
        String text = readFile.readAll();
        int begin = 0;
        int end = 0;
        for(int i = 0; i < 51; i++) {
            begin = text.indexOf("return true", begin);
            begin = begin + 16;
            end = text.indexOf("</b", begin);
            String state = text.substring(begin, end);

            begin = text.indexOf("dat\">", end);
            end = text.indexOf("<", begin);
            String democraticVotes = text.substring(begin + 5, end);

            begin = text.indexOf("dat\">", begin);
            end = text.indexOf("<", begin);
            String republicanVotes = text.substring(begin + 5, end);

            begin = text.indexOf("dat\">", begin);
            end = text.indexOf("<", begin);
            String independentVotes = text.substring(begin + 5, end);
            System.out.println(state + ", " + democraticVotes + ", " + republicanVotes + ", " + independentVotes);
        }
    }
}