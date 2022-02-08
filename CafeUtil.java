import java.util.ArrayList;

public class CafeUtil {

    
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (int i=0; i<prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    
    public void displayMenu(ArrayList<String> menuItems){
        for (int i=0; i<menuItems.size(); i++){
            System.out.println(i+ " " + menuItems.get(i));
        }
    }

    public void displayMenuAndPrices(ArrayList<String> menuItems, ArrayList<Double> prices){
        for (int i=0; i<menuItems.size(); i++){
            System.out.println(i+ " " + menuItems.get(i) + "--" + "$" + prices.get(i));
        }
    }

    public ArrayList<String> addCustomer(ArrayList <String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        customers.add(userName);
        System.out.println("Hello, " + userName + "!\r\n" + "There are " + (customers.size() - 1) + " people in front of you.");
        return customers;
    }

}



