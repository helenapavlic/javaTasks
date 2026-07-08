class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

//define the Warrior class
class Warrior extends Fighter{
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int damage = 6;
        if(fighter.isVulnerable()){
            damage = 10;
        }
        return damage;
    }

    @Override
    public String toString() {
        return "Fighter is a " + getClass().getSimpleName();
    }
}

// define the Wizard class
class Wizard extends Fighter{
    boolean spell = false;

    void prepareSpell(){
       spell = true;
    }

    @Override
    boolean isVulnerable() {
        return !spell;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int damage = 3;
        if(spell){
            damage = 12;
        }
        return damage;
    }

    @Override
    public String toString() {
        return "Fighter is a " + getClass().getSimpleName();
    }
}
