package com.Shudhanshu.SpringREST_APIs.Repository;

import com.Shudhanshu.SpringREST_APIs.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
