/*
7. Singly Linked List: Social Media Friend Connections
Problem Statement: Create a system to manage social media friend connections using a singly linked list.
Each node represents a user with User ID, Name, Age, and List of Friend IDs.

Operations:
- Add a friend connection between two users.
- Remove a friend connection.
- Find mutual friends between two users.
- Display all friends of a specific user.
- Search for a user by Name or User ID.
- Count the number of friends for each user.

Hint:
- Each user node contains a list of friends (array or linked list).
- For mutual friends, compare friend ID lists.
*/

import java.util.*;

class UserNode {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friends; // friend IDs list
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
    }
}

class SocialMediaSLL {
    private UserNode head;

    public void addUser(int id, String name, int age) {
        UserNode newNode = new UserNode(id, name, age);

        if (head == null) {
            head = newNode;
            return;
        }

        UserNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    private UserNode getUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void addFriendConnection(int u1, int u2) {
        UserNode user1 = getUserById(u1);
        UserNode user2 = getUserById(u2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found.");
            return;
        }

        // Avoid duplicate connections
        if (!user1.friends.contains(u2)) user1.friends.add(u2);
        if (!user2.friends.contains(u1)) user2.friends.add(u1);

        System.out.println("Friend connection added between " + u1 + " and " + u2);
    }

    public void removeFriendConnection(int u1, int u2) {
        UserNode user1 = getUserById(u1);
        UserNode user2 = getUserById(u2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found.");
            return;
        }

        user1.friends.remove(Integer.valueOf(u2));
        user2.friends.remove(Integer.valueOf(u1));

        System.out.println("Friend connection removed between " + u1 + " and " + u2);
    }

    public void displayFriends(int userId) {
        UserNode user = getUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + " (ID=" + user.userId + "): " + user.friends);
    }

    public void searchUserByName(String name) {
        UserNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Found User: ID=" + temp.userId + ", Name=" + temp.name + ", Age=" + temp.age);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("No user found with name: " + name);
    }

    public void searchUserById(int id) {
        UserNode user = getUserById(id);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        System.out.println("Found User: ID=" + user.userId + ", Name=" + user.name + ", Age=" + user.age);
    }

    public void mutualFriends(int u1, int u2) {
        UserNode user1 = getUserById(u1);
        UserNode user2 = getUserById(u2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found.");
            return;
        }

        ArrayList<Integer> mutual = new ArrayList<>();
        for (int f : user1.friends) {
            if (user2.friends.contains(f)) mutual.add(f);
        }

        System.out.println("Mutual Friends between " + u1 + " and " + u2 + ": " + mutual);
    }

    public void countFriendsForAllUsers() {
        UserNode temp = head;
        System.out.println("---- Friends Count ----");
        while (temp != null) {
            System.out.println(temp.name + " (ID=" + temp.userId + ") -> " + temp.friends.size() + " friends");
            temp = temp.next;
        }
    }
}

public class Main7_SocialMedia {
    public static void main(String[] args) {
        SocialMediaSLL sm = new SocialMediaSLL();

        sm.addUser(1, "Varun", 21);
        sm.addUser(2, "Rahul", 20);
        sm.addUser(3, "Asha", 19);
        sm.addUser(4, "Kiran", 22);

        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);
        sm.addFriendConnection(3, 4);

        sm.displayFriends(1);
        sm.mutualFriends(1, 2);

        sm.countFriendsForAllUsers();

        sm.removeFriendConnection(1, 2);
        sm.displayFriends(1);
    }
}
