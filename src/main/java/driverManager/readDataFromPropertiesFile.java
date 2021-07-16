package driverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readDataFromPropertiesFile {
    private Properties properties;

    public readDataFromPropertiesFile(){
        try(InputStream input = new FileInputStream("src/main/resources/testData/testData.properties")){
            properties = new Properties();
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "properties=" + properties;
    }
}
