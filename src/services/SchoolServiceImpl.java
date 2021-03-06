package services;


import db.SchoolDb;
import exceptions.SchoolNotFoundException;
import models.School;

import java.util.List;
//todo: http/: readme.so
//todo: codeburst.io/solid-design-principle-usingswift-fa67443672b8

public class SchoolServiceImpl implements SchoolService{
    private final SchoolDb schoolDb;

public SchoolServiceImpl(SchoolDb schoolDb){
    this.schoolDb = schoolDb;
}
    @Override
    public void add(School school) {
        schoolDb.add(school);
    }

    @Override
    public void delete(School school) {
        schoolDb.delete(school);
    }

    @Override
    public School update(long id, School school) throws SchoolNotFoundException {
        School foundSchool = schoolDb.findById(id);
       return school;
    }

    @Override
    public School findById(long id) throws SchoolNotFoundException {
        School foundSchool = schoolDb.findById(id);
        if(foundSchool == null){
//            to creat custom exception
            throw new SchoolNotFoundException("School with this id is not present");
        }

        return foundSchool;
    }

    @Override
    public List<School> getAll() {
        return schoolDb.getAll();
    }

    @Override
    public void addAll(School ...school){
        for(School sch: school){
            schoolDb.add(sch);
        }
    }
}
