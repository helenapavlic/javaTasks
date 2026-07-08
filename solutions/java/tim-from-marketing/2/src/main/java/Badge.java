class Badge {
    public String print(Integer id, String name, String department) {
        String stringToPrint;

        if(department == null){
            department = "owner";
        }

        if(id == null){
            stringToPrint = String.format("%s - %s",name,department.toUpperCase());
        } else{
            stringToPrint = String.format("[%d] - %s - %s",id,name,department.toUpperCase()); 
        }

        return stringToPrint;
    }
}
