package interview;

public class cleanMotorPowerData {

    public static void main(String[] args) {
        System.out.println("------Valid Input-------");
        System.out.println(power_conversion("1W"));
        System.out.println(power_conversion("1e1W"));
        System.out.println(power_conversion("1e7W"));
        System.out.println("---------");
        System.out.println(power_conversion("1KW"));
        System.out.println(power_conversion("1e1KW"));
        System.out.println(power_conversion("1e7KW"));
        System.out.println("-------------");
        System.out.println(power_conversion("1GW"));
        System.out.println(power_conversion("1e1GW"));
        System.out.println(power_conversion("1e7GW"));
        System.out.println("------Invalid Input-------");
        System.out.println(power_conversion("1CW"));
    }

    public static String power_conversion(String raw_power){

        String reading = "";
        String raw_pwer_l=raw_power.toLowerCase();
        String in_unit = "";
        if(raw_pwer_l.contains("k"))
        {
          in_unit ="k";
          reading = raw_pwer_l.replaceAll("kw","");
        }
        else if(raw_pwer_l.contains("m"))
        {
            in_unit ="m";
            reading = raw_pwer_l.replaceAll("mw","");}
        else if(raw_pwer_l.contains("g"))
        {
            in_unit ="g";
            reading = raw_pwer_l.replaceAll("gw","");}
        else {
            in_unit ="w";
            reading = raw_pwer_l.replaceAll("w","");
        }

        double value = 0;
        if(reading.contains("e")){
            int digi = Integer.parseInt(reading.split("e")[0]);
            int power = Integer.parseInt(reading.split("e")[1]);

             value = digi * Math.pow(10,power);
        }
        else if(reading.matches("^[0-9]$")){
            value = Double.parseDouble(reading);
        }
        else
        {
            return "Invalid";
        }

            return  String.format("%.0f\n", value * to_watt( in_unit));
    }

    public static double to_watt(String unit){
        int in_watts = 1;
        switch (unit){
            case "k" : in_watts = 1000;
            break;
            case "m" : in_watts = 1000000;
            break;
            case "g" : in_watts = 1000000000;
            break;
            default : in_watts =1;
        }
        return in_watts ;
    }
}
