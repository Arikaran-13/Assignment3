package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question7 {
    public static void main(String[] args) {


        Parked_CarOwner_Detail owner1 = new Parked_CarOwner_Detail("jonathan", "BMW7", 1302, 9600271302l, "new york");
        Parked_CarOwner_Detail owner2 = new Parked_CarOwner_Detail("Andrew", "hundai", 9863, 7726799278l, "Georgia");
        Parked_CarOwner_Detail owner3 = new Parked_CarOwner_Detail("Lorna", "Audi", 9783, 3837336372l, "Alaska");
        Parked_CarOwner_Detail owner4 = new Parked_CarOwner_Detail("Steve", "ferrari", 0162, 82672522233l, "texas");

        Parked_CarownerList pcl = new Parked_CarownerList();
        pcl.add_new_car(owner1);
        pcl.add_new_car(owner2);
        pcl.add_new_car(owner3);
        pcl.add_new_car(owner4);
        pcl.get_parked_car_location(2);
        pcl.remove_car(3);
        pcl.display();

    }
}
class Parked_CarOwner_Detail{
    @Override
    public String toString() {
        return "Parked_CarOwner_Detail{" +
                "ownerName='" + ownerName + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carNo=" + carNo +
                '}';
    }

    private String ownerName;
    private String carModel;
    private int carNo;
    private long mobileNo;
    private String address;

    public Parked_CarOwner_Detail(String ownerName, String carModel, int carNo, long mobileNo, String address) {
        this.ownerName = ownerName;
        this.carModel = carModel;
        this.carNo = carNo;
        this.mobileNo = mobileNo;
        this.address = address;
    }
}
class Parked_CarownerList{
   Map<Integer,Parked_CarOwner_Detail> hm = new HashMap<>();
   int token=-1;
    public void add_new_car(Parked_CarOwner_Detail owner){
       hm.put(++token , owner);
        System.out.println("Car added in the data");
    }
    public void remove_car(int token){
        try {
            hm.remove(token);
            System.out.println("Car removed successfully");
        }catch(Exception e){
            throw new RuntimeException("Please provide correct token number to remove");
        }
    }
    public void get_parked_car_location(int token){

        if(token %2 ==0){
            System.out.println("you car location is 2nd floor 3 section");
        }
        else if ( token %2 !=0){
            System.out.println("Your car location is 1st floor 2 section");
        }

    }
   public void display(){
       System.out.println(hm);
    }

}