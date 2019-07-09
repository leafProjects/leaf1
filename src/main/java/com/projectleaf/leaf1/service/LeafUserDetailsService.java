package com.projectleaf.leaf1.service;

import java.util.ArrayList;

import com.projectleaf.leaf1.entity.LeafUser;
import com.projectleaf.leaf1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LeafUserDetailsService implements UserDetailsService {

	private final UserRepository userRepository;

	@Autowired
	public LeafUserDetailsService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		LeafUser leafUser = userRepository.findByUsername(username);

		if (leafUser == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return leafUser;
	}
}