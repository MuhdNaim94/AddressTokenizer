import java.util.Scanner;

public class AddressTokenizer {

    public static void main(String[] args) {

        ApartmentNum apartmentNum = new ApartmentNumExtractor();
	Street street = new StreetExtractor();
        City city = new CityExtractor();
        State state = new StateExtractor();
        Postcode postcode = new PostcodeExtractor();
        AddressExtractor addressExtractor = new AddressExtractor(apartmentNum, street, city, state, postcode);

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter an address: ");
            String address = sc.nextLine();
            addressExtractor.extract(address);

        }

    }
    
}

