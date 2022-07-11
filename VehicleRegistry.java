import java.util.HashMap;
import java.util.ArrayList;
public class VehicleRegistry {
    private HashMap<LicensePlate,String> cars;
    //private HashMap<String,LicensePlate> ownerList;

    public VehicleRegistry(){//HashMap<LicensePlate,String> carros){
        this.cars = new HashMap<>();
        //this.ownerList = new HashMap<>();
    }

    public boolean add(LicensePlate licenseP,String owner){
        //for(Object licensia :this.cars.keySet()){
        //ArrayList<String> ownerList = new ArrayList<>();
        //if(!(this.ownerList.contains(owner))){
        //    this.ownerList.add(owner);
        //}
        if(!(this.cars.containsKey(licenseP))){
            this.cars.put(licenseP, owner);
            //this.ownerList.put(owner, licenseP);
            return true;
        } return false;

        //}
    }
    public void printLicensePlates(){
        for(LicensePlate license : this.cars.keySet()){
            System.out.println(license);
        }
    }
    public void printOwners(){
        ArrayList<String> ownersList = new ArrayList<>();
        for(String owner : this.cars.values()){
            if(!(ownersList.contains(owner))){
                ownersList.add(owner);
                System.out.println(owner);
            }
        }
    }
    

    public String get(LicensePlate licensePlate){
        return this.cars.get(licensePlate);
    }
    public boolean remove(LicensePlate licensePlate){
        if(this.cars.containsKey(licensePlate)){
            this.cars.remove(licensePlate);
            return true;
        }
        //this.cars.remove(licensePlate);
        return false;
    }
}
