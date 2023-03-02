package Projekt;

public class OurNotebook {
    String serialNumber;
    String model;
    String colore;
    int ram;
    int hdd;
    String oSystem;    
    String cpu;
   

    public OurNotebook(String serialNumber, String model, String colore, int ram, int hdd, String oSystem, String cpu){
        this.serialNumber = serialNumber;
        this.model = model;
        this.colore = colore;
        this.ram = ram;
        this.hdd = hdd;
        this.oSystem = oSystem;    
        this.cpu = cpu; 
    }

    @Override
    public String toString(){
        return model + " цвет: " + colore + " ОС: " + oSystem + " " + ram + "Gb, " + hdd + "Gb, " + cpu + ", " + serialNumber;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof OurNotebook)){
            return false;
        }
        OurNotebook notebook = (OurNotebook) obj;
        if (oSystem.equals(notebook.oSystem) && cpu.equals(notebook.cpu)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equality(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof OurNotebook)){
            return false;
        }
        OurNotebook notebook = (OurNotebook) obj;
        if ((ram == notebook.ram) && (hdd == notebook.hdd)){
            return true;
        }
        else{
            return false;
        }
    }

}


