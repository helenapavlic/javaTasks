class ResistorColorDuo {
    String[] colors = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    
    int colorCode(String color) {
        int code = -1;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals(color)){
                code = i;
            }
        }
        return code;
    }


    int value(String[] colors) {
        String digits = "";
        for (int i = 0; i < 2; i++) {
            String color = colors[i];
            digits += String.valueOf(colorCode(color));
        }
       return Integer.parseInt(digits);
    }
}
