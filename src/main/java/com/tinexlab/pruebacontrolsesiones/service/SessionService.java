package com.tinexlab.pruebacontrolsesiones.service;

import com.tinexlab.pruebacontrolsesiones.model.dto.request.AuthenticationRequest;
import com.tinexlab.pruebacontrolsesiones.model.entity.Session;
import com.tinexlab.pruebacontrolsesiones.model.entity.User;
import com.tinexlab.pruebacontrolsesiones.repository.SessionRepository;
import com.tinexlab.pruebacontrolsesiones.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    private UserRepository userRepository;

    public void creaSesion(AuthenticationRequest authRequest) {
        Session session = new Session();
        User user = userRepository.findByUsername(authRequest.getUsername()).get();
        session.setUser(user);
        session.setFechaInicioSesion(new Date());
        sessionRepository.save(session);
    }

    public void finSesion(){

    }
}
