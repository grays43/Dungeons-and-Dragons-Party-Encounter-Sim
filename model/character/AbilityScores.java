package model.character;

public class AbilityScores {
    private int strength, dex, con, intel, wis, cha;
    private int strMod, dexMod, conMod, intelMod, wisMod, chaMod;

    public AbilityScores(int strength, int dex, int con, 
                            int intel, int wis, int cha) {
        this.strength = strength;
        this.dex = dex;
        this.con = con;
        this.intel = intel;
        this.wis = wis;
        this.cha = cha;        
        this.strMod = Math.floorDiv(this.strength - 10, 2);
        this.dexMod = Math.floorDiv(this.dex - 10, 2);
        this.conMod = Math.floorDiv(this.con - 10, 2);
        this.intelMod = Math.floorDiv(this.intel - 10, 2);
        this.wisMod = Math.floorDiv(this.wis - 10, 2);
        this.chaMod = Math.floorDiv(this.cha - 10, 2);                
    }

    public int getStrMod() {
        return strMod;
    }

    public int getDexMod() {
        return dexMod;
    }

    public int getConMod() {
        return conMod;
    }

    public int getIntelMod() {
        return intelMod;
    }

    public int getWisMod() {
        return wisMod;
    }

    public int getChaMod() {
        return chaMod;
    }     

    public int getStrength() {
        return strength;
    }

    public int getDex() {
        return dex;
    }

    public int getCon() {
        return con;
    }

    public int getIntelligence() {
        return intel;
    }

    public int getWisdom() {
        return wis;
    }

    public int getCharisma() {
        return cha;
    }

}
