package com.empleo.sofware.Repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import com.empleo.sofware.Entidades.User;
public interface UserRepository extends JpaRepository<User, Long> {}
