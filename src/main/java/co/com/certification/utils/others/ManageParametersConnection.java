package co.com.certification.utils.others;

import lombok.Getter;
import lombok.Setter;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

@Getter
@Setter
public class ManageParametersConnection {
    static Properties properties = new Properties();

    public static String getUrlBase(String url) {
        String urlBase = "";
        String fileName = "./parameters.properties";
        try (FileReader fileReader = new FileReader(fileName)) {
            properties.load(fileReader);
            urlBase = properties.getProperty(url);
        } catch (IOException ioException) {
            ioException.printStackTrace(System.err);
        }
        return urlBase;
    }
}