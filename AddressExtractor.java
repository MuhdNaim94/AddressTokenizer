public class AddressExtractor {

    private ApartmentNum apartmentNum;
    private Street street;
    private City city;
    private State state;
    private Postcode postcode;
    
    public AddressExtractor(ApartmentNum apartmentNum, Street street, City city, State state, Postcode postcode) {

        this.apartmentNum = apartmentNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postcode = postcode;

    }
    
    public void extract(String address) {

        String aptNum = apartmentNum.extract(address);
        String streetName = street.extract(address);
        String cityName = city.extract(address);
        String postcodeNum = postcode.extract(address);
        String stateName = state.extract(address);
        String section = address.replaceAll(aptNum, "").replaceAll(streetName, "").replaceAll(cityName, "")
        .replaceAll(postcodeNum, "").replaceAll(stateName, "").trim();
        section = section.replaceAll("[\\s,]+[\\.]", " ").trim();   

        System.out.println("Apartment : " + aptNum);
        System.out.println("Street : " + streetName);
        System.out.println("City : " + cityName);
        System.out.println("State : " + stateName);
        System.out.println("Postcode : " + postcodeNum);
        System.out.println("Section : " + section);
        
    }

}
