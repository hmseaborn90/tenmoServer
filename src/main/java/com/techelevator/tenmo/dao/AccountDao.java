package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Account;

public interface AccountDao {

    Account getAccountByUsername(String username);

    Account getAccountByUserId(int userId);

    Account updateAccount(Account updatedAccount);

    Account getAccountById(int accountId);
}
