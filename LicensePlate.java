
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if (!(getClass() == object.getClass())){
            return false;
        }
        LicensePlate licenceToCompare = (LicensePlate) object;

        if(!(this.country.equals(licenceToCompare.country))){
            return false;
        }
        if(!(this.liNumber.equals(licenceToCompare.liNumber))){
            return false;
        }
        return true;
    }

    public int hashCode(){
        return this.country.hashCode()+this.liNumber.hashCode();
    }

}
