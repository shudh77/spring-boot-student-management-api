package com.Shudhanshu.SpringREST_APIs.Service;

import com.Shudhanshu.SpringREST_APIs.DTO.CreateStudentDTO;
import com.Shudhanshu.SpringREST_APIs.DTO.StudentDTO;
import org.jspecify.annotations.Nullable;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<StudentDTO> getAllStudents();

    StudentDTO createStudent(CreateStudentDTO createStudentDTO);

    StudentDTO getStudentById(Long id);

    void deleteStudentById(Long id);

    StudentDTO updateStudent(Long id, CreateStudentDTO updateStudent);

     StudentDTO updatePartialStudent(Long id, Map<String, Object> updates);
}
