package Intro;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    public static void main(String[] args) throws IOException {

        String path = "G:\\QA\\selenium-shenanigans\\src\\main\\java\\test.properties";

        Properties prop = new Properties();
        FileInputStream fs = new FileInputStream(path);

        prop.load(fs);

        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("course"));
        System.out.println(prop.getProperty("test"));
    }
}
