package com.pegination.pegination;

import com.pegination.pegination.domain.Student;
import com.pegination.pegination.repo.StudentRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PeginationApplication implements CommandLineRunner {

	@Autowired
	private StudentRepositoy studentRepository;


	public static void main(String[] args) {
		SpringApplication.run(PeginationApplication.class, args);
	}


	public void run(String...args)throws Exception{

		List<Student> students= new ArrayList<>();
		students.add(Student.builder().name("lakshay").city("Jaipur").build());
		students.add(Student.builder().name("Kavita").city("Delhi").build());
		students.add(Student.builder().name("Ravinder").city("Gudganv").build());
		students.add(Student.builder().name("Praduman").city("Goa").build());
		students.add(Student.builder().name("upendra").city("Ratangarh").build());
		students.add(Student.builder().name("Anushka").city("Sardarshahar").build());
		students.add(Student.builder().name("Puneet").city("Banglore").build());
		students.add(Student.builder().name("Amisha").city("Udaipur").build());
		students.add(Student.builder().name("Ritk").city("Delhi").build());
		students.add(Student.builder().name("Harshal").city("Banswara").build());
		students.add(Student.builder().name("Yuvraj").city("Sujangarh").build());
		students.add(Student.builder().name("Parteek").city("Churu").build());
		students.add(Student.builder().name("Dinesh").city("Sikar").build());
		students.add(Student.builder().name("Rahul").city("Ringus").build());
		students.add(Student.builder().name("Ashok").city("Palsana").build());
		students.add(Student.builder().name("vipul").city("Laxmangarh").build());

		studentRepository.saveAll(students);
	}
}
