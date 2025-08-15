public class UnitConverter {

    public static String convert(String[] args) {
        // Validate number of arguments
        if (args.length != 3) {
            return "ERROR";
        }

        double value;
        try {
            value = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            return "ERROR";
        }

        if (args[0].equals("celsius") && args[1].equals("fahrenheit")) {
            return String.format("%.2f", value * 9.0 / 5.0 + 32);
        } else if (args[0].equals("fahrenheit") && args[1].equals("celsius")) {
            return String.format("%.2f", (value - 32) * 5.0 / 9.0);
        } else if (args[0].equals("kilometers") && args[1].equals("miles")) {
            return String.format("%.2f", value * 0.621371);
        } else if (args[0].equals("miles") && args[1].equals("kilometers")) {
            return String.format("%.2f", value * 1.60934);
        } else {
            return "ERROR";
        }
    }
}
