package utils;

public class CommonActions {

    public void waitFor(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
