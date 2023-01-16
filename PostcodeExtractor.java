import java.util.regex.*;

public class PostcodeExtractor implements Postcode {

    private static final String POSTCODE_REGEX = "(\\d{5})";

    public String extract(String address) {

        // Regular expression to match postcodes in the range of 01000-98859
        Pattern p = Pattern.compile(POSTCODE_REGEX);
        Matcher m = p.matcher(address);
        
        if (m.find()) {
            return m.group();
        } else {
            return "";
        }

    }

}
