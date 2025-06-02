package ru.javadaddy.roadmap.step9_Test.topic2_Mockito.task3_AccountService;

/**
 * Метод withdraw проверяет, достаточно ли средств на балансе, и уменьшает его.
 * Используем Mockito для тестирования зависимостей AccountRepository.
 *
 * Написать тест на успешное снятие средств.
 * Написать тест на отказ при недостатке средств.
 * Написать тест на отказ, если аккаунт не найден.
 * Использовать Mockito.verify() для проверки вызовов методов.
 */
public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public boolean withdraw(String accountId, double amount) {
        Account account = accountRepository.findAccountById(accountId);
        if (account != null && account.getBalance() >= amount) {
            account.withdraw(amount);
            accountRepository.updateAccount(account);
            return true;
        }
        return false;
    }
}
