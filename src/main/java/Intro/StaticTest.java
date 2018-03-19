package Intro;

public class StaticTest {

    private String model;
    private static int instanceNum = 0;

    public StaticTest(String model) {
        this.model = model;
        instanceNum++;
    }

    public static int getInstanceNum() {
        return instanceNum;
    }

    public String getModel() {
        return model;
    }

}
