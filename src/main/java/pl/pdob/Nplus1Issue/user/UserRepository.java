package pl.pdob.Nplus1Issue.user;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Entity;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

  @Query("Select distinct u From User u left join fetch u.address")
    public List<User> findAllUsers();

  @Override
  @EntityGraph(attributePaths = {"address"})
  public List<User> findAll();

}