class SqueakyClean {
    static String clean(String identifier) { 
        StringBuilder builder = new StringBuilder(identifier);

        if(identifier.isEmpty()){
            return "";
        }

        for (int i = 0; i < builder.length(); i++){
            if(builder.charAt(i) == ' '){
                builder.deleteCharAt(i);
                builder.insert(i,'_');
            }
        }

        int f = 0;
        while(f < builder.length()){
            if(builder.charAt(f) == '-'){
                builder.deleteCharAt(f);
                builder.setCharAt(f,Character.toUpperCase(builder.charAt(f)));
            } else{
                f++;
            }
        }
        
        for(int i = 0; i< builder.length(); i++){
            switch(builder.charAt(i)){
                case '4':
                    builder.setCharAt(i,'a');
                    break;
                case '3':
                    builder.setCharAt(i,'e');
                    break;
                case '0':
                    builder.setCharAt(i,'o');
                    break;
                case '1':
                    builder.setCharAt(i,'l');
                    break;
                case '7':
                    builder.setCharAt(i,'t');
                    break;
                default:
                    break;
            }
        }

        int t = 0;
        while(t < builder.length()){
            if(!Character.isLetter(builder.charAt(t)) && builder.charAt(t) != '_'){
                builder.deleteCharAt(t);
            } else{
                t++;
            }
        }
        return builder.toString();   
    }
}
