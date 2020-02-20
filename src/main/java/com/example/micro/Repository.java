package com.example.micro;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by emujica on 19/02/2020.
 */
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Item, String> {
}
