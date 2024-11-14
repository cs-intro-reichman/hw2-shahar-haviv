public class TimeCalc {
    public static void main(String[] args) {
        String[] baseTimeElements = args[0].split(":");
        int totalMints = (Integer.parseInt(baseTimeElements[0]) * 60) + Integer.parseInt(baseTimeElements[1])
                + Integer.parseInt(args[1]);
        // System.out.println(totalMints);
        Integer totalHours = totalMints / 60;
        Integer newHours = totalHours % 24;
        Integer newMinutes = totalMints % 60;
        String newHoursString = (newHours < 10) ? "0" + newHours : newHours.toString();
        String newMinutesString = (newMinutes < 10) ? "0" + newMinutes : newMinutes.toString();
        System.out.println(newHoursString + ":" + newMinutesString);
    }
}
