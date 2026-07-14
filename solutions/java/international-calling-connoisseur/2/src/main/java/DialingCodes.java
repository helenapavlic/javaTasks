import java.util.Map;
import java.util.HashMap;


public class DialingCodes {
    private Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return codes;
    }

    public void setDialingCode(Integer code, String country) {
        codes.put(code,country);
    }

    public String getCountry(Integer code) {
        return codes.containsKey(code) ? codes.get(code) : null;
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!codes.containsKey(code) && !codes.containsValue(country)){
            codes.put(code,country);
        }
    }

    public Integer findDialingCode(String country) {
        Integer code = null;
        for (Map.Entry<Integer, String> entry : codes.entrySet()){
            if (entry.getValue().equals(country)) {
                code = entry.getKey();
            }
        }
        return code;
    }

    public void updateCountryDialingCode(Integer code, String country) {
       Integer currentCode = findDialingCode(country);
        if(codes.containsKey(currentCode)){
            codes.remove(currentCode);
            codes.put(code,country);
        }
    }
}
