package model;

public class AbilityScores {
    private int strength, dex, con, intel, wis, cha, ac;

    public AbilityScores(int strength, int dex, int con, 
                            int intel, int wis, int cha, int ac) {
        this.strength = strength;
        this.dex = dex;
        this.con = con;
        this.intel = intel;
        this.wis = wis;
        this.cha = cha;
        this.ac = ac;
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

    public int getAC() {
        return ac;
    }

}
