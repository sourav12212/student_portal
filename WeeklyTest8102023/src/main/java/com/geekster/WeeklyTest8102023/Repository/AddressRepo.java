package com.geekster.WeeklyTest8102023.Repository;

import com.geekster.WeeklyTest8102023.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address,Long> {
}
