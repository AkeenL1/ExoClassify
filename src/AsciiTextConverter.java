public class AsciiTextConverter {

    String textSource;

    public AsciiTextConverter(String textSource) {
        this.textSource = textSource;
    }

    public void displayAsciiArt() {
        System.out.println(textSource);
    }
}
