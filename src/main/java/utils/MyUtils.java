package utils;

public class MyUtils {

    public void waitFor(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
