class Badge {
    public String print(Integer id, String name, String department) {
        String stringToPrint;
        if (department == null){
            if(id == null){
                stringToPrint =  name + " - OWNER";   
            }else{
                stringToPrint = "[" + id + "] - " +  name + " - OWNER";
            }
        } else if (id != null){
            stringToPrint =  "[" + id + "] - " + name + " - " + department.toUpperCase();    
        } else{
             stringToPrint = name + " - " + department.toUpperCase();
        }
        return stringToPrint;
        
    }
}
