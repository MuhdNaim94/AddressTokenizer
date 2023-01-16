import java.util.regex.*;

public class CityExtractor implements City {

    private static final String CITY_REGEX = "(Kuala Terengganu|Kuala Lumpur|Klang|Kajang|Bangi|Damansara|Petaling Jaya|Puchong|Subang Jaya|Cyberjaya|Putrajaya|Mantin|Kuching|Seremban)";

    public String extract(String address) {

        // Regular expression to match city names
        Pattern p = Pattern.compile(CITY_REGEX, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(address);
        
        if (m.find()) {
            return m.group();
        } else {
            return "";
        }

    }

}
