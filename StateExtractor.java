import java.util.regex.*;

public class StateExtractor implements State {

    private static final String STATE_REGEX = "(Selangor|Terengganu|Pahang|Kelantan|Melaka|Pulau Pinang|Kedah|Johor|Perlis|Sabah|Sarawak)";

    public String extract(String address) {

        // Use regular expression to match state names
        Pattern p = Pattern.compile(STATE_REGEX, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(address);
        
        if (m.find()) {
            return m.group();
        } else {
            return "";
        }

    }

}
