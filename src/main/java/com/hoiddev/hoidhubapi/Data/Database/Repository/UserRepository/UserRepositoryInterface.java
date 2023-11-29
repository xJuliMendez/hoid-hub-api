package com.hoiddev.hoidhubapi.Data.Database.Repository.UserRepository;

import com.hoiddev.hoidhubapi.Data.Database.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepositoryInterface extends JpaRepository<User, UUID> {
}
