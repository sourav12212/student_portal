package com.geekster.WeeklyTest8102023.Repository;

import com.geekster.WeeklyTest8102023.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,String> {
}
