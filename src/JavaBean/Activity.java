package JavaBean;

public class Activity {
    private static String name=null;
    private static String time=null;
    private static String place=null;
    private static String content=null;

    public Activity() {
    }
    public Activity(String name,String time,String place,String content){
        this.name=name;
        this.time=time;
        this.place=place;
        this.content=content;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Activity.name = name;
    }

    public static String getTime() {
        return time;
    }

    public static void setTime(String time) {
        Activity.time = time;
    }

    public static String getPlace() {
        return place;
    }

    public static void setPlace(String place) {
        Activity.place = place;
    }

    public static String getContent() {
        return content;
    }

    public static void setContent(String content) {
        Activity.content = content;
    }
}
