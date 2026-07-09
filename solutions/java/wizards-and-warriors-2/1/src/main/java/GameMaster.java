public class GameMaster {

    //method that returns a description of a Character
        public String describe(Character character){
        return String.format("You're a level %d %s with %d hit points.",character.getLevel(),character.getCharacterClass(),character.getHitPoints());
    }

    //method that returns a description of a Destination
     public String describe(Destination destination){
        
    return String.format("You've arrived at %s, which has %d inhabitants.",destination.getName(),destination.getInhabitants());
    }

    // method that returns a description of a TravelMethod
    public String describe(TravelMethod travelMethod){
        String connector = travelMethod == TravelMethod.WALKING ? "by" : "on";
        return String.format("You're traveling to your destination %s %s.",connector,travelMethod.name().toLowerCase());
    }

    //method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character, Destination destination,TravelMethod travelMethod){
    return describe(character) + " " + describe(travelMethod)+ " " + describe(destination);
    }

    //method that returns a description of a Character and Destination
    public String describe(Character character, Destination destination){
    return describe(character)+ " " + describe(TravelMethod.WALKING) + " " + describe(destination);
    }
}
