import java.util.HashMap;

public class Cars {

    public int BasicServicing;
    public int EngineFixing;
    public int ClutchFixing;
    public int BrakeFixing;
    public int GearFixing;
    public int TotalBill;
    public HashMap<String, String> CandS = new HashMap<>();

    Cars()
    {
        CandS.put("BS01" , "Basic Servicing");
        CandS.put("EF01" , "Engine Fixing");
        CandS.put("CF01" , "Clutch Fixing");
        CandS.put("BF01" , "Brake Fixing");
        CandS.put("GF01" , "Gear Fixing");
    }

    public int getBasicServicing()
    {
        return this.BasicServicing;
    }

    public int getEngineFixing()
    {
        return this.EngineFixing;
    }
    public int getClutchFixing()
    {
        return this.ClutchFixing;
    }
    public int getBrakeFixing()
    {
        return this.BrakeFixing;
    }
    public int getGearFixing()
    {
        return this.GearFixing;
    }

    public void generateBill(String [] Codes){

        for (String code : Codes) {
            System.out.print("Charges for " + CandS.get(code) + " - ");
            if (code.equals("BS01")) {
                TotalBill += this.getBasicServicing();
                System.out.println(this.getBasicServicing());
            }
            if (code.equals("EF01")) {
                TotalBill += this.getEngineFixing();
                System.out.println(this.getEngineFixing());
            }
            if (code.equals("CF01")) {
                TotalBill += this.getClutchFixing();
                System.out.println(this.getClutchFixing());
            }
            if (code.equals("BF01")) {
                TotalBill += this.getBrakeFixing();
                System.out.println(this.getBrakeFixing());
            }
            if (code.equals("GF01")) {
                TotalBill += this.getGearFixing();
                System.out.println(this.getGearFixing());
            }
        }

        System.out.println("Total Bill - " + TotalBill);
        if(TotalBill > 10000)
            System.out.println("Complimentary Cleaning Provided");
    }
}
