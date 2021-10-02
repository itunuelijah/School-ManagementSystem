package services;
// we have this services because we may want to creat multiple schools
//to creat new school, delete, previous school and so on so as to save in your data base.

import exceptions.SchoolNotFoundException;
import models.School;

import java.util.List;

public interface SchoolService {
      void add(School school);
      void delete(School school);
      School update(long id, School school) throws SchoolNotFoundException;
      School findById(long id) throws SchoolNotFoundException;
      List<School>getAll();
}
