package ru.javadaddy.roadmap.step9_Test.topic2_Mockito.task3_AccountService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AccountServiceTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountService accountService;

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account(
                "111",
                250_000.25
        );
    }

    @Test
    void testWithdrawSuccess() {
        when(accountRepository.findAccountById(account.getAccountId())).thenReturn(account);
        boolean result = accountService.withdraw(account.getAccountId(), account.getBalance());
        assertTrue(result);
        verify(accountRepository, times(1)).findAccountById(account.getAccountId());
    }

    @Test
    void testWithdrawFailed() {
        when(accountRepository.findAccountById(account.getAccountId())).thenReturn(account);
        boolean result = accountService.withdraw(account.getAccountId(), 260_000.12);
        assertFalse(result);
        verify(accountRepository, times(1)).findAccountById(account.getAccountId());
    }

    @Test
    void testWithdrawFailedAccountId() {
        when(accountRepository.findAccountById("222")).thenReturn(account);
        boolean result = accountService.withdraw("222", 260_000.12);
        assertFalse(result);
        verify(accountRepository, times(1)).findAccountById("222");
    }
}