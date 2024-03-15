package com.pegination.pegination.controller;


import com.pegination.pegination.domain.Student;
import com.pegination.pegination.dto.PageRequestDto;
import com.pegination.pegination.repo.StudentRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepositoy studentRepositoy;

    @PostMapping
    public Page<Student> getAllStudentPegination(@RequestBody PageRequestDto dto){
        PageRequest pageable = new PageRequestDto().getPageable(dto);
        Page<Student> studentPage= studentRepositoy.findAll((org.springframework.data.domain.Pageable) pageable);
        return studentPage;
    }

}
