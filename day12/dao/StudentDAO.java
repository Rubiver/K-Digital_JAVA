package day12.dao;

import day12.dto.StudentDTO;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    List<StudentDTO> student = new ArrayList<>();

    public void setStudent(StudentDTO stList) {
        this.student.add(stList);
    }
    public List<StudentDTO> getStudent(){
        return student;
    }
    public boolean searchByName(String name){
        for(StudentDTO stu : student){
            if(stu.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    public boolean deleteById(String id){
        for(StudentDTO stu : student){
            if(stu.getId().equals(id)){
                student.remove(stu);
                return true;
            }
        }
        return false;
    }
    public void updateStudent(String id, String name, int kor, int eng, int math){
        for(StudentDTO stu : student){
            if(stu.getId().equals(id)){
                stu.setName(name);
                stu.setKor(kor);
                stu.setEng(eng);
                stu.setMath(math);
            }
        }
    }
}
