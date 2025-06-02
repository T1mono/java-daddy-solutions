package ru.javadaddy.roadmap.step9_Test.topic2_Mockito.task2_AuthService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AuthServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private AuthService authService;

    private User user;

    @BeforeEach
    void setUp() {
        user = new User(
                "Vasya",
                "qwerty123"
        );
    }

    @Test
    void testAuthenticateUserSuccess() {
        when(userRepository.findUserByUsername(user.getUsername())).thenReturn(user);

        assertTrue(authService.authenticateUser(user.getUsername(), user.getPassword()));

        verify(userRepository, times(1)).findUserByUsername(user.getUsername());
    }

    @Test
    void testAuthenticateUserFailedPassword() {
        when(userRepository.findUserByUsername(user.getUsername())).thenReturn(user);

        assertFalse(authService.authenticateUser(user.getUsername(), "qwerty124"));

        verify(userRepository, times(1)).findUserByUsername(user.getUsername());

    }
    @Test
    void testAuthenticateUserFailedUserName() {
        when(userRepository.findUserByUsername(anyString())).thenReturn(null);

        assertFalse(authService.authenticateUser("Petya", "123fasdf"));

        verify(userRepository, times(1)).findUserByUsername("Petya");
    }

}