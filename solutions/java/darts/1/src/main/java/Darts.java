class Darts {
    int score(double xOfDart, double yOfDart) {
        int scoreInt = 0;
        
        if(xOfDart * xOfDart + yOfDart * yOfDart <= 1){
            scoreInt += 10;
        } else if(xOfDart * xOfDart + yOfDart * yOfDart <= 25){
            scoreInt += 5;
        } else if(xOfDart * xOfDart + yOfDart * yOfDart <= 100){
            scoreInt += 1;
        }
        
        return scoreInt;
    }
}
