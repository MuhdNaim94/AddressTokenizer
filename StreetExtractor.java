import java.util.regex.*;

public class StreetExtractor implements Street {

    private static final String STREET_REGEX = "(Jalan|Jln|Lorong|Persiaran|Taman|Tmn|Lrg)[\\s,]*(\\w+)*[\\s,](\\d+)(\\/)(\\d+)";

    public String extract(String address) {

        // Regular expression to match street prefixes and street names
        Pattern p = Pattern.compile(STREET_REGEX, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(address);
        if (m.find()) {
            return m.group();
        } else {
            return "";
        }

    }

}
