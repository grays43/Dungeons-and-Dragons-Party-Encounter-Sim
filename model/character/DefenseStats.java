package model.character;

public class DefenseStats {
    private int ac;
    private int strengthSave, dexSave, conSave, intelSave, wisSave, chaSave;

    public DefenseStats(int ac, int strengthSave, int dexSave, 
                        int conSave, int intelSave, int wisSave, int chaSave) {
        this.ac = ac;
        this.strengthSave = strengthSave;
        this.dexSave = dexSave;
        this.conSave = conSave;
        this.intelSave = intelSave;
        this.wisSave = wisSave;
        this.chaSave = chaSave;
    }
    

    public int getAC() {
        return ac;
    }

    public int getStrengthSave() {
        return strengthSave;
    }

    public int getDexSave() {
        return dexSave;
    }

    public int getConSave() {
        return conSave;
    }

    public int getIntelSave() {
        return intelSave;
    }

    public int getWisSave() {
        return wisSave;
    }

    public int getChaSave() {
        return chaSave;
    }
    
}
