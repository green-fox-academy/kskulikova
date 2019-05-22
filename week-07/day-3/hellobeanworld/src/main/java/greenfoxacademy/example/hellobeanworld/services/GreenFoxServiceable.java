package greenfoxacademy.example.hellobeanworld.services;

import java.util.List;

//Create an interface containing the same method definitions as the service
//Make the service implement that (the methods already done, so just add it)
//Create another implementation of the service where you store the names in names.txt instead of a list
//Use the file saving service for the application
public interface GreenFoxServiceable {

  List<String> findAll();

  int count();

  String check(String student);

  void save(String student);
}
