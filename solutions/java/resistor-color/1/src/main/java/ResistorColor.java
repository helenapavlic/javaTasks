class ResistorColor {
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

    String[] colors() {
        return colors;
    }
}
