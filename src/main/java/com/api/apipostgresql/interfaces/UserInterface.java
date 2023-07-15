package com.api.apipostgresql.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.apipostgresql.models.UserModel;

public interface UserInterface extends JpaRepository<UserModel, Long>{

}
