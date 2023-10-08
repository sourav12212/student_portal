package com.geekster.WeeklyTest8102023.Repository;

import com.geekster.WeeklyTest8102023.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouseRepo extends JpaRepository<Course,String> {
}
