package tup.stockTracking.Usuarios.DTO;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

import java.util.Collection;

@Data
public class JwtDto {
    private String token;
    private String bearer = "Bearer";
    private String nombreUsuario;
    private Collection<? extends GrantedAuthority> authorities;

    // Constructor sin Bearer
    public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
        this.authorities = authorities;
    }

}
