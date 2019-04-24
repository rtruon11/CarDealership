/*
Project: Team Project Design: Car Dealership Create the Java Classes
Purpose Details: Sales Lead Java Class
Course: IST 242
Team:  4
Date Developed: 02/17/2019
Last Date Changed: 02/17/2019
Rev:
*/

public class Salesperson {
    //---- Data Members ----//

    //ListenToTheCustomersNeeds
    private String PriceRange;
    private String VehicleType;
    private String Color;
    private String Payment;
    private String Need;

    //CustomerSelectedVehicle
    private String FitsTheNeed;

    //CheckInvetory
    public String YearMadeAndModel;
    public float Price;
    public String VehicleColor;

    //Payment
    private float Cash;
    private String Financing;
    private String Leasing;

    //TestDrive
    private String SetATime;

    
    //---- Method Members ----//

    //--ListenToTheCustomersNeeds--//
    //Setter and Getter for PriceRange
    public String getPriceRange() { return PriceRange; }
    public void setPriceRange(String _PriceRange) {this.PriceRange = _PriceRange;}
    //Setter and Getter for VehicleType
    public String getVehicleType() { return VehicleType; }
    public void setVehicleType(String _VehicleType) {this.VehicleType = _VehicleType;}
    //Setter and Getter for Color
    public String getColor() { return Color; }
    public void setColor(String _Color) {this.Color = _Color;}
    //Setter and Getter for Hybrid
    public String getPayment() { return Payment; }
    public void setPayment(String _Payment) {this.Payment = _Payment;}
    //Setter and Getter for Need
    public String getNeed() { return Need; }
    public void setNeed(String _Need) {this.Need = _Need;}


    //--CustomerSelectedVehicle--//
    //Setter and Getter for FitsTheNeed
    public String getFitsTheNeed() { return FitsTheNeed; }
    public void setFitsTheNeed(String _FitsTheNeed) {this.FitsTheNeed = _FitsTheNeed;}


    //--CheckInvetory--//
    //Setter and Getter for YearMadeAndModel
    public String getYearMadeAndModel() { return YearMadeAndModel; }
    public void setYearMadeAndModel(String _YearMadeAndModel) {this.YearMadeAndModel = _YearMadeAndModel;}
    //Setter and Getter for Price
    public float getPrice() { return Price; }
    public void setPrice(float _Price) {this.Price = _Price;}
    //Setter and Getter for VehicleColor
    public String getVehicleColor() { return VehicleColor; }
    public void setVehicleColor(String _VehicleColor) {this.VehicleColor = _VehicleColor;}

    //--Payment--//
    //Setter and Getter for Cash
    public float getCash() { return Cash; }
    public void setCash(float _Cash) {this.Cash = _Cash;}
    //Setter and Getter for Financing
    public String getFinancing() { return Financing; }
    public void setFinancing(String _Financing) {this.Financing = _Financing;}
    //Setter and Getter for Optima
    public String getLeasing() { return Leasing; }
    public void setLeasing(String _Leasing) {this.Leasing = _Leasing;}

    //--TestDrive--//
    //Setter and Getter for Goodyear
    public String getSetATime() { return SetATime; }
    public void setSetATime(String _SetATime) {this.SetATime = _SetATime;}

}