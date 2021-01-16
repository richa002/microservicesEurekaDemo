package com.example.authorizationserver;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class MyUserDetails  extends User implements UserDetails {
    public MyUserDetails() {
    }

    public MyUserDetails(User user) {
        super(user);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<SimpleGrantedAuthority> grantedAuthorities=new ArrayList<>();
        super.getRoles().forEach(role->{
           grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
           role.getPermissions().forEach(permission ->
                                           { grantedAuthorities.add(new SimpleGrantedAuthority(permission.getName()));
                                              });

        });
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
      return  super.getPassword();
    }

    @Override
    public String getUsername() {
      return   super.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
      return  super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
      return  super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return super.isEnabled();
    }
}
