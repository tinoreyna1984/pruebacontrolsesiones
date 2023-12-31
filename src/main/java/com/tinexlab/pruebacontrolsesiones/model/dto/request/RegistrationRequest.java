package com.tinexlab.pruebacontrolsesiones.model.dto.request;

import com.tinexlab.pruebacontrolsesiones.util.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationRequest {
    private String username;
    private String password;
    private String accessId;
    //private String email;
    private String name;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Role role;
}
