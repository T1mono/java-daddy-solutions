package ru.javadaddy.roadmap.step9_Test.topic2_Mockito.task2_AuthService;

/**
 * Метод authenticateUser проверяет логин и пароль пользователя.
 * Используем Mockito для тестирования зависимостей UserRepository.
 *
 * Написать тест на успешную авторизацию.
 * Написать тест на отказ в авторизации при неверном пароле.
 * Написать тест на отказ в авторизации, если пользователя не существует.
 * Использовать Mockito.verify() для проверки вызова findUserByUsername().
 */
public class AuthService {
    private UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticateUser(String username, String password) {
        User user = userRepository.findUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
