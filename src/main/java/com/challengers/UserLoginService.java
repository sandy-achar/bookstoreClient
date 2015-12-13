package com.challengers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * Created by Malika(mxp134930) on 12/13/2015.
 */

@Service
public class UserLoginService implements UserDetailsService {

    @Autowired
    private UserControllerMethods userControllerMethods;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userControllerMethods.userLogin(s);
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority(user.getRole())));
    }
}
