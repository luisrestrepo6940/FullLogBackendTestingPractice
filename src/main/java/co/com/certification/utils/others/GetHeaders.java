package co.com.certification.utils.others;

import co.com.certification.utils.constants.Constants;
import io.restassured.http.ContentType;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
public class GetHeaders {
    public Map<String, String> getHeader() {
        Map<String, String> myHeader = new HashMap<>();
        myHeader.put(Constants.ACCEPT, String.valueOf(ContentType.JSON));
        myHeader.put(Constants.CONTENT_TYPE, String.valueOf(ContentType.JSON));
        return myHeader;
    }
}