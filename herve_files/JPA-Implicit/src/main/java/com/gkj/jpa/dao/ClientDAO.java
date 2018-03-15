package com.gkj.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gkj.jpa.model.Client;

public interface ClientDAO extends JpaRepository<Client, Integer> {

}
