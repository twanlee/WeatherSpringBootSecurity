package com.demo.repository;

import com.demo.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends PagingAndSortingRepository<Account,Long> {
    public Account findAccountByUsername(String username);
}
