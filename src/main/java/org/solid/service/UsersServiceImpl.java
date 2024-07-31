package org.solid.service;

import org.solid.model.Users;
import org.solid.repository.UsersRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UsersServiceImpl implements UsersService {
    private UsersRepository usersRepository;
    @Override
    public Users save(Users usr) {
        return usersRepository.save(usr);
    }
}
