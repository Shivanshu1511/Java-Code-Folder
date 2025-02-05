import java.util.Scanner;

class VehiclesDetails {
    Scanner sc = new Scanner(System.in);
    String model;
    int mileage;
    String rating;

    public void vehicles_rating() {
        System.out.println("Enter Vehicle Name:");
        model = sc.nextLine();
        System.out.println("Enter mileage:");
        mileage = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline character after reading the int

        if (mileage > 50) {
            rating = "Perfect";
            System.out.println("Rating :"+rating);
        } else if (mileage >= 30) {
            rating = "Good";
               System.out.println("Rating :"+rating);
        } else {
            rating = "Poor";
             System.out.println("Rating :"+rating);
        }
    }
}

class VehiclesRating {
    public static void main(String[] args) {
        VehiclesDetails getd = new VehiclesDetails();
        getd.vehicles_rating(); // Correct method call, removing "void"
    }
}
