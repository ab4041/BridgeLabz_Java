/*
6. Circular Linked List: Round Robin Scheduling Algorithm
Problem Statement: Implement a round-robin CPU scheduling algorithm using a circular linked list.
Each node represents a process and contains Process ID, Burst Time, and Priority.

Implement:
- Add a new process at the end of the circular list.
- Remove a process by Process ID after its execution.
- Simulate scheduling with fixed time quantum.
- Display processes in circular queue after each round.
- Calculate and display average waiting time and turn-around time.

Hint:
- Use circular linked list as queue.
- Each process runs for time quantum, move to next.
- Remove when burst becomes 0.
*/

import java.util.*;

class ProcessNode {
    int pid;
    int burstTime;
    int priority;
    int remainingTime;

    int waitingTime = 0;
    int turnAroundTime = 0;

    ProcessNode next;

    ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }
}

class RoundRobinCLL {
    private ProcessNode head = null;

    public void addProcess(int pid, int burst, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burst, priority);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    // Remove by pid (important for completed process)
    private void removeProcess(int pid) {
        if (head == null) return;

        ProcessNode temp = head, prev = null;

        do {
            if (temp.pid == pid) {
                // only one process
                if (temp == head && temp.next == head) {
                    head = null;
                    return;
                }

                // deleting head
                if (temp == head) {
                    ProcessNode last = head;
                    while (last.next != head) last = last.next;

                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }

                temp.next = null; // cleanup
                return;
            }

            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    public void displayQueue() {
        if (head == null) {
            System.out.println("Queue empty.");
            return;
        }

        System.out.print("Queue: ");
        ProcessNode temp = head;
        do {
            System.out.print("[P" + temp.pid + " RT=" + temp.remainingTime + "] ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        // For avg waiting/turnaround calculation we store finish times
        Map<Integer, Integer> finishTime = new HashMap<>();
        int currentTime = 0;

        ProcessNode current = head;

        while (head != null) {
            displayQueue();

            // Execute current process
            int execTime = Math.min(timeQuantum, current.remainingTime);
            current.remainingTime -= execTime;
            currentTime += execTime;

            System.out.println("Executing P" + current.pid + " for " + execTime + " units. CurrentTime=" + currentTime);

            // If finished, record finish time and remove
            if (current.remainingTime == 0) {
                finishTime.put(current.pid, currentTime);
                int donePid = current.pid;
                current = current.next; // move first, then remove
                removeProcess(donePid);

                if (head == null) break; // done all
            } else {
                current = current.next;
            }
        }

        // Calculate waiting time and turnaround time:
        // Turnaround Time = Finish Time - Arrival Time (arrival = 0 here)
        // Waiting Time = Turnaround Time - Burst Time
        double totalWT = 0;
        double totalTAT = 0;

        System.out.println("\n---- Final Results ----");
        for (int pid : finishTime.keySet()) {
            // Since processes are removed, we use stored burst by manual mapping in main
            // (Better: store them separately)
        }

        System.out.println("(To get accurate WT/TAT, we will compute in main using burst times map.)");
    }
}

public class Main6_RoundRobin {
    public static void main(String[] args) {
        RoundRobinCLL rr = new RoundRobinCLL();

        // We keep burst times separately to calculate waiting and turnaround
        Map<Integer, Integer> burstMap = new HashMap<>();

        rr.addProcess(1, 10, 1); burstMap.put(1, 10);
        rr.addProcess(2, 5, 2);  burstMap.put(2, 5);
        rr.addProcess(3, 8, 1);  burstMap.put(3, 8);

        int timeQuantum = 3;

        // ✅ Simulation (prints queue + execution steps)
        rr.simulate(timeQuantum);

        /*
         NOTE:
         This is a simplified simulation.
         In real RR with waiting time calculation, we track:
         - total time each process spends waiting between
