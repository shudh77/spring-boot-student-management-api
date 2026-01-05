package com.Shudhanshu.SpringREST_APIs.Controller;

import com.Shudhanshu.SpringREST_APIs.DTO.CreateStudentDTO;
import com.Shudhanshu.SpringREST_APIs.DTO.StudentDTO;
import com.Shudhanshu.SpringREST_APIs.Service.StudentService;
import com.Shudhanshu.SpringREST_APIs.Service.impl.StudentServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    @GetMapping
    public ResponseEntity<List<StudentDTO>> getStudent(){
        return ResponseEntity.ok(service.getAllStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable Long id){
        return ResponseEntity.ok(service.getStudentById(id));
    }

    @PostMapping
    public ResponseEntity<StudentDTO> createStudent(@RequestBody @Valid CreateStudentDTO createStudentDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createStudent(createStudentDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
        service.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDTO> updateStudent(@PathVariable Long id, @RequestBody @Valid CreateStudentDTO updateStudent){
        return ResponseEntity.ok(service.updateStudent(id,updateStudent));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<StudentDTO> updatePartialStudent(@PathVariable Long id, @RequestBody Map<String , Object> updates){
        return ResponseEntity.ok(service.updatePartialStudent(id,updates));
    }

}
