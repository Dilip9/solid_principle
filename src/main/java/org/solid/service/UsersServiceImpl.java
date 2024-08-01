package org.solid.service;

import org.solid.model.Users;
import org.solid.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository usersRepository;
    @Override
    public Users save(Users usr) {
        return usersRepository.save(usr);
    }
}
