class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean canAttack = false;
        if (!knightIsAwake){
            return true;
        }
        return canAttack;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSpy = false;
        if (knightIsAwake || archerIsAwake || prisonerIsAwake){
            canSpy = true;
        }
        return canSpy;
        
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSignal = false;
        if (!archerIsAwake && prisonerIsAwake){
            canSignal = true;
        } 
        return canSignal;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean canFree = false;
        if ((petDogIsPresent && !archerIsAwake) || (!petDogIsPresent && prisonerIsAwake && !archerIsAwake &&  !knightIsAwake)){
            canFree = true;
        }
        return canFree;    
    }
}

