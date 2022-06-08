package team06.utilities;
import org.bouncycastle.util.Properties;
import java.io.FileInputStream;

public class ConfigReader {
    //This class reads the configuration.properties file
    //Create Properties instance
    protected static Properties properties;
    static {
        //path of the configuration file
        String path="configuration.properties";
        try {
            //Opening configuration.properties file using FileInputStream
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
            //close the file
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //This method will get the key from properties file,
    //And return the value as String
    //We create this method to read the file
    public static String getProperty(String key){
        return properties.getPropertyValue(key);
    }
//    //TEST IF LOGIC WORKS
//    public static void main(String[] args) {
//        System.out.println(properties.getPropertyValue("techproed_url"));
//        System.out.println(properties.getPropertyValue("google_url"));
//        System.out.println(properties.getPropertyValue("username"));
//        System.out.println(properties.getPropertyValue("password"));
//        System.out.println(properties.getPropertyValue("kafiefiuwegfk")); //it gives null because we do not have key like this in configuration.preperties files
//    }

}