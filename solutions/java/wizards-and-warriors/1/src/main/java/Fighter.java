class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        }
        return 6;
    }
    
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
        
    @Override
    boolean isVulnerable() {
        return false;
    }
}

class Wizard extends Fighter {
    boolean spellStatus = false;
    
    @Override
    int getDamagePoints(Fighter fighter) {
        if (spellStatus) {
            return 12;
        }
        return 3;
    }
    
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
    
    @Override
    boolean isVulnerable() {
        return !spellStatus;
    }     
    void prepareSpell() {
        spellStatus = true;
    }
}
