import java.util.regex.*;

public class ApartmentNumExtractor implements ApartmentNum {

    private static final String APT_NUM_REGEX = "(No|NO|no\\.)[\\s,]*(\\d+)";

    public String extract(String address) {

        // Regular expression to match "No" followed by numbers
        Pattern p = Pattern.compile(APT_NUM_REGEX, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(address);
        
        if (m.find()) {
            return m.group();
        } else {
            return "";

        }

    }

}
