package com.tinexlab.pruebacontrolsesiones.repository;

import com.tinexlab.pruebacontrolsesiones.model.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
