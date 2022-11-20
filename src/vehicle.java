
public class vehicle extends Product implements Comparable<vehicle>{
    String model;
      vehicle(String model, int dataFabricari,int pret,String manufacture ) {
         super(manufacture, dataFabricari, pret);
         this.model = model;
     }

     public void dispaly(){
         System.out.println(model + " " + Data_Fabrcarii + " " + Pret + " " + Manufacture);
     }

    @Override
    public int compareTo(vehicle veh) {
        if (this.Data_Fabrcarii == veh.Data_Fabrcarii) {
            if(this.model == veh.model) return 0;
            else return 1;
        } else if (this.Data_Fabrcarii > veh.Data_Fabrcarii) return 1;
        else return -1;
    }
}

