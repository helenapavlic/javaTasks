public class Lasagna {
    //define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    //define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int min){
        int remaining = expectedMinutesInOven() - min;
        return remaining;
    }

    //define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }

    //define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minInOven){
        return preparationTimeInMinutes(layers) + minInOven ;
    }
}
