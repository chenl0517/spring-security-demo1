package com.greencloud.userdetailService;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		 Collection<GrantedAuthority> auths=new ArrayList<GrantedAuthority>(); ;
		 if(username.equals("chenl")){
		             SimpleGrantedAuthority auth1=new SimpleGrantedAuthority("ROLE_USER");
		             auths.add(auth1);
		             User user = new User(username,
		        			 "12345", true,true, true, true, auths);
		             return user;
		         }else if(username.equals("js")){
		        	 SimpleGrantedAuthority auth2=new SimpleGrantedAuthority("ROLE_ADMIN");
		        	 auths.add(auth2);
		        	 User user = new User(username,
		        			 "789", true,true, true, true, auths);
		        	 return user;
		         }
		         return null;
	}
}
