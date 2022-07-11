
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
        LicensePlate li4 = new LicensePlate("ES", "XXXXX69");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("Finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg
        
        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jurgen");
        owners.put(new LicensePlate("GE", "XXX2"),"Pedro");
        //owners.put(li4, null);

        System.out.println("owners:");
        System.out.println(owners);
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        System.out.println(owners.get(new LicensePlate("GE", "XXX2")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found
        VehicleRegistry registro = new VehicleRegistry();
        System.out.println(registro.add(li1, "rollo"));
        //System.out.println(registro.remove(li1));
        System.out.println(registro.add(li4, "Ury"));
        System.out.println(registro.add(li3, "Sara"));
        System.out.println(registro.add(li2, "Ury"));

        //System.out.println(registro.remove(li4));
        //System.out.println(registro.get(li2));
        //System.out.println(registro.get(li4));
        registro.printLicensePlates();
        registro.printOwners();

        //System.out.println(registro);
    }
}
