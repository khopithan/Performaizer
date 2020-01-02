
package Views;

/**
 *
 * @author khopi
 */
public class User3 {
   
    public String FULL_NAME;
    public String First_month_performance;
    public String Second_month_performance;
    public float PERFORMANCE_CHANGE;
    public int FIRST_MONTH_RATE;
    public int SECOND_MONTH_RATE;
    public float RATE_CHANGE;
    public String finalPerformance;

    public User3(String FULL_NAME,String First_month_performance,String Second_month_performance, float PERFORMANCE_CHANGE, int FIRST_MONTH_RATE,int SECOND_MONTH_RATE, float RATE_CHANGE, String finalPerformance)
    {
        this.FULL_NAME = FULL_NAME;
        this.First_month_performance = First_month_performance;
        this.Second_month_performance = Second_month_performance;
        this.PERFORMANCE_CHANGE = PERFORMANCE_CHANGE;
        this.FIRST_MONTH_RATE = FIRST_MONTH_RATE;
        this.SECOND_MONTH_RATE = SECOND_MONTH_RATE;
        this.RATE_CHANGE = RATE_CHANGE;
        this.finalPerformance = finalPerformance;

    }
    
}
