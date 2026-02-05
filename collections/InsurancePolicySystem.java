/*
Insurance Policy Management System
*/

import java.time.LocalDate;
import java.util.*;

class Policy {
    String number;
    String holder;
    LocalDate expiry;

    Policy(String number, String holder, LocalDate expiry) {
        this.number = number;
        this.holder = holder;
        this.expiry = expiry;
    }
}

public class InsurancePolicySystem {

    Map<String, Policy> policies = new HashMap<>();

    public void addPolicy(Policy p) {
        policies.put(p.number, p);
    }

    public void removeExpired() {
        policies.values().removeIf(p -> p.expiry.isBefore(LocalDate.now()));
    }

    public static void main(String[] args) {
        InsurancePolicySystem system = new InsurancePolicySystem();
        system.addPolicy(new Policy("P1","Alice",LocalDate.now().plusDays(20)));
        system.addPolicy(new Policy("P2","Bob",LocalDate.now().minusDays(1)));

        system.removeExpired();
        System.out.println(system.policies.size());
    }
}
