package co.com.certification.utils.others;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

@Getter
@Setter
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ManageParametersConnection {
    static Properties properties = new Properties();

    public static String getUrlBase(String url) {
        String urlBase = "";
        String fileName = "parameters.properties";
        try (FileReader fileReader = new FileReader(fileName)) {
            properties.load(fileReader);
            urlBase = properties.getProperty(url);
        } catch (IOException ioException) {
            log.error(String.valueOf(ioException));
        }
        return urlBase;
    }
}