package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private Properties prop = null;

    public ConfigFileReader(){
        FileInputStream inputFileStream = null;

        try {
            this.prop = new Properties();
            String propertyFilePath = System.getProperty("user.dir")+
                    "\\src\\test\\config\\configuration.properties";
            inputFileStream = new FileInputStream(propertyFilePath);
            prop.load(inputFileStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPropertyValue(String propertyName){
        return prop.getProperty(propertyName);
    }
}
