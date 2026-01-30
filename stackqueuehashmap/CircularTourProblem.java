/*
Circular Tour Problem
Problem:
Given a set of petrol pumps with petrol and distance to the next pump,
determine the starting point for completing a circular tour.
Hint:
Use a queue idea / maintain surplus petrol while traversing.
*/

public class CircularTourProblem {

    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    // Returns starting index, or -1 if not possible
    static int findStartPoint(PetrolPump[] pumps) {
        int totalSurplus = 0;   // total petrol - distance across all pumps
        int currentSurplus = 0; // current surplus while scanning
        int start = 0;

        for (int i = 0; i < pumps.length; i++) {
            int gain = pumps[i].petrol - pumps[i].distance;

            totalSurplus += gain;
            currentSurplus += gain;

            // If currentSurplus becomes negative, start can't be from previous start
            if (currentSurplus < 0) {
                start = i + 1;
                currentSurplus = 0; // reset for new start
            }
        }

        return (totalSurplus >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };

        int start = findStartPoint(pumps);

        if (start == -1) {
            System.out.println("No possible tour.");
        } else {
            System.out.println("Start at petrol pump index: " + start);
        }
    }
}
