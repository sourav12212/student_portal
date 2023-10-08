package com.geekster.WeeklyTest8102023.Repository;

import com.geekster.WeeklyTest8102023.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop,String> {
}
