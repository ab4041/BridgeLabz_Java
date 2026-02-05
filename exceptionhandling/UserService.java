/*
Problem Statement:
1. registerUser() throws UserAlreadyExistsException
2. checkUserExistence() throws UserNotFoundException
3. Handle exceptions in main()
*/

public class UserService {

    static void checkUserExistence(String username) throws UserNotFoundException {

        if (!username.equals("admin")) {
            throw new UserNotFoundException("User not found");
        }
    }

    static void registerUser(String username) throws UserAlreadyExistsException {

        if (username.equals("admin")) {
            throw new UserAlreadyExistsException("User already exists");
        }

        System.out.println("User registered successfully");
    }

    public static void main(String[] args) {

        try {
            checkUserExistence("admin");
            registerUser("admin");

        } catch (UserNotFoundException | UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
    }
}
