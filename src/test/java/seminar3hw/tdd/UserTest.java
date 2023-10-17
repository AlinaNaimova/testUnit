package seminar3hw.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User adminUser;
    User user1;
    User user2;
    User user3;
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        //cоздаём юзеров
        adminUser = new User("admin", "admin", true);
        user1 = new User("carina", "sdgf2", false);
        user2 = new User("andrew", "rewit", false);
        user3 = new User("peter", "evlsn", false);

        //добавляем юзеров в UserRepository
        userRepository = new UserRepository();
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);

        //юзеры проходят аутентификацию
        adminUser.authenticate("admin", "admin");
        user1.authenticate("carina", "sdgf2");
        user2.authenticate("andrew", "rewit");
        user3.authenticate("peter", "evlsn");
    }

    @Test
    @DisplayName("Все юзеры прошли аутентификацию успешно!")
    public void testAllUsersAuthenticate() {
        assertTrue(adminUser.authenticate("admin", "admin"));
        assertTrue(user1.authenticate("carina", "sdgf2"));
        assertTrue(user2.authenticate("andrew", "rewit"));
        assertTrue(user3.authenticate("peter", "evlsn"));
    }

    @Test
    @DisplayName("Все юзеры кроме админов разлогинились")
    public void testLogoutAllUsersExceptAdmins() {
        userRepository.logoutAllUsersExceptAdmins();
        for (User user : userRepository.data) {
            assertEquals(user.isAdmin, user.isAuthenticate);
            assertThat(user.isAdmin).isEqualTo(user.isAuthenticate);
        }
    }

}