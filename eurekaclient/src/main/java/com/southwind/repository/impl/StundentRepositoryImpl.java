package com.southwind.repository.impl;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class StundentRepositoryImpl implements StudentRepository {
    private static Map<Long,Student> studentMap;
    static {
        studentMap=new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",22));
        studentMap.put(2L,new Student(2L,"李四",33));
        studentMap.put(3l,new Student(3L,"王五",44));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void deleteById(long id) {
    studentMap.remove(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
    studentMap.put(student.getId(),student);
    }
}