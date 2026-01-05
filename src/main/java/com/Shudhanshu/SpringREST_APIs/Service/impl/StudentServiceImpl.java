package com.Shudhanshu.SpringREST_APIs.Service.impl;

import com.Shudhanshu.SpringREST_APIs.DTO.CreateStudentDTO;
import com.Shudhanshu.SpringREST_APIs.DTO.StudentDTO;
import com.Shudhanshu.SpringREST_APIs.Entity.Student;
import com.Shudhanshu.SpringREST_APIs.Repository.StudentRepository;
import com.Shudhanshu.SpringREST_APIs.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> students = repository.findAll();
        return students.stream()
                .map(student -> modelMapper.map(student,StudentDTO.class))
                .toList();
    }

    @Override
    public StudentDTO getStudentById(Long id) {
        Student student = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with id: "+id));
        return modelMapper.map(student,StudentDTO.class);
    }

    @Override
    public StudentDTO createStudent(CreateStudentDTO createStudentDTO) {
        Student newStudent = modelMapper.map(createStudentDTO,Student.class);
        Student student = repository.save(newStudent);
        return modelMapper.map(student,StudentDTO.class);
    }

    @Override
    public void deleteStudentById(Long id) {
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Student not exists by id : "+id);
        }
        repository.deleteById(id);
    }

    @Override
    public StudentDTO updateStudent(Long id, CreateStudentDTO updateStudent) {
        Student student = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with id: "+id));
        modelMapper.map(updateStudent,student);
        student = repository.save(student);
        return modelMapper.map(student,StudentDTO.class);
    }

    @Override
    public StudentDTO updatePartialStudent(Long id, Map<String, Object> updates) {
        Student student = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with id: "+id));
        updates.forEach((field,value) -> {
            switch (field){
                case "name" :
                    student.setName((String) value);
                    break;
                case "email" :
                    student.setEmail((String) value);
                    break;
                default:
                    throw new IllegalArgumentException("Field not supported");

            }
        });
        Student newStudent = repository.save(student);
        return modelMapper.map(newStudent,StudentDTO.class);
    }
}
