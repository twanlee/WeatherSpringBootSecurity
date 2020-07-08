package com.demo.service;

import com.demo.model.Account;

import java.util.Optional;

public interface AccountService {
    Optional<Account> findOne(Long id);
    void remove(Long id);
    void edit(Account account);
    void add(Account account);
}
