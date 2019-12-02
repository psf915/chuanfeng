package JavaBean;

public class Painting {
    private static String name=null;
    private static String kind=null;
    private static String length=null;
    private static String width=null;
    private static String author=null;

    public Painting() {
    }

    public Painting(String name, String kind, String length, String width, String author) {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Painting.name = name;
    }

    public static String getKind() {
        return kind;
    }

    public static void setKind(String kind) {
        Painting.kind = kind;
    }

    public static String getLength() {
        return length;
    }

    public static void setLength(String length) {
        Painting.length = length;
    }

    public static String getWidth() {
        return width;
    }

    public static void setWidth(String width) {
        Painting.width = width;
    }

    public static String getAuthor() {
        return author;
    }

    public static void setAuthor(String author) {
        Painting.author = author;
    }
}
