//Create an enum Season with values WINTER, SPRING, SUMMER, and FALL.
// Add a method getAverageTemperature() to return an average temperature for each season.


package Day5.Enum;

public class Season1 {
    public enum Season {
        Winter(new int[]{30, 32, 28}),
        Spring(new int[]{60, 65, 58}),
        Summer(new int[]{85, 90, 88}),
        Fall(new int[]{55, 50, 52});

        private int[] temperatures;
        private Season(int[] temperatures) {
            this.temperatures = temperatures;
        }
        public float getAverage() {
            int sum = 0;
            for (int temp : this.temperatures) {
                sum += temp;
            }
            return (float) sum / this.temperatures.length; // Use float division
        }
    }

    public static void main(String[] args) {
        Season season = Season.Fall;
        System.out.printf("The average temperature of "+season+" season is :"+season.getAverage());
    }
}
