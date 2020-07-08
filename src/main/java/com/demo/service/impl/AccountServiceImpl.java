package com.demo.service.impl;

import com.demo.model.Account;
import com.demo.model.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.demo.repository.AccountRepo;
import com.demo.service.AccountService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class AccountServiceImpl implements AccountService, UserDetailsService {
    @Autowired
    private AccountRepo accountRepo;

    @Override
    public Optional<Account> findOne(Long id) {
        return accountRepo.findById(id);
    }

    @Override
    public void remove(Long id) {

        accountRepo.deleteById(id);
    }

    @Override
    public void edit(Account account) {
        accountRepo.save(account);
    }

    @Override
    public void add(Account account) {
        accountRepo.save(account);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepo.findAccountByUsername(username);
        List<GrantedAuthority> roles = new ArrayList<>();
        Set<Roles> rolesSet = account.getRoles();
        for (Roles r : rolesSet) {
            roles.add(new SimpleGrantedAuthority(r.getRole()));
        }
        User user = new User(account.getUsername(), account.getPassword(), roles);
        return user;
    }
}
