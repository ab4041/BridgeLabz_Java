import java.util.*;
import java.util.stream.Collectors;

/*
Problem:
Perform multiple stream operations on insurance policies
*/

class InsurancePolicy {
    String policyNumber;
    String holderName;
    double premium;

    InsurancePolicy(String policyNumber, String holderName, double premium) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.premium = premium;
    }
}

public class InsurancePolicyOperations {

    public static void main(String[] args) {

        List<InsurancePolicy> policies = List.of(
            new InsurancePolicy("P1", "Smith", 1500),
            new InsurancePolicy("P2", "John", 2500),
            new InsurancePolicy("P3", "Sam", 900)
        );

        // Filter premium > 1200
        policies.stream()
                .filter(p -> p.premium > 1200)
                .forEach(p -> System.out.println(p.policyNumber));

        // Highest premium
        policies.stream()
                .max(Comparator.comparingDouble(p -> p.premium))
                .ifPresent(p -> System.out.println("Highest: " + p.policyNumber));

        // Group by initial
        Map<Character, List<InsurancePolicy>> grouped =
                policies.stream().collect(
                        Collectors.groupingBy(p -> p.holderName.charAt(0)));

        System.out.println(grouped);
    }
}
