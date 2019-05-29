

public class May31_2019 {
    public static void main(String args[]) {
        /**
         * Exercise 2: Create a two-dimensional array with 12 rows and 2 columns.
         * The first column will correspond to a month of the year such as
         * Januaray = 1, and December = 12.
         * The second column will be the revenue that a lemonade stand makes in that month.
         * Load the array with the following information
         *
         * Jan = 34
         * Feb = 44
         * Mar = 23
         * Apr = 76
         * May = 65
         * June = 98
         * July = 123
         * Aug = 102
         * Sept = 87
         * Oct = 43
         * Nov = 23
         * Dec = 33
         */

        // Declare a two-dimensional array with 12 rows and 2 cols
        int [][] revenueArray = new int [12][2];

        // plug in the revenues in the second column
        revenueArray[0][1] = 34; // revenue in Januaray is 34
        revenueArray[1][1] = 44;
        revenueArray[2][1] = 23;
        revenueArray[3][1] = 76;
        // continue and finish this

        // plug in the monts in the first column
        revenueArray[0][0] = 1; // row 0 will have Jan (month 1)
        revenueArray[1][0] = 2;
        revenueArray[2][0] = 3;
        revenueArray[3][0] = 4;
        // continue and finish this
        // Can you think of an easier way to put in the months? Loop?

        for (int i = 0; i < revenueArray.length; i++) {
            System.out.println("For month number" + revenueArray[i][0] + ", revenue was $" +
                    revenueArray[i][1]);
        }

        /**
         * Exercise 3: Find what is the total revenue this year.
         * Add together revenues of every month
         */

    }

}
