package com.alkemy.wallet;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class encoder {

        public static void main(String[] args) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String rawPassword = "user";
            String encodedPassword = encoder.encode(rawPassword);
            System.out.println(encodedPassword);
        }


}
