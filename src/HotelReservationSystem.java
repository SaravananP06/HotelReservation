import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystem {

    ArrayList<Hotels> listOfHotels = new ArrayList<Hotels>();

    public void createHotels() {
        Scanner sc = new Scanner(System.in);
        Hotels objHotels = new Hotels();
        System.out.print("Enter Hotel Name: ");
        objHotels.setName(sc.nextLine());

        System.out.print("Enter Rate: ");
        objHotels.setRate(sc.nextInt());

        listOfHotels.add(objHotels);
    }


    public void showHotels() {
        for (int i = 0; i < listOfHotels.size(); i++) {
            System.out.println("Hotel Name: " + listOfHotels.get(i).getName());
            System.out.println("Hotel rate: " + listOfHotels.get(i).getRate());
        }
    }
}
