package com.bitwise.assignment2;

import java.util.HashMap;
import java.util.Map;

public class ValidateUserCredentials {
	  Map<String, String> userCredentials = new HashMap<String, String>();
	    private boolean isUserCredentialCorrect;

	    public void addUserCredentials() {
	        userCredentials.put("a@gmail.com", "1234");
	        userCredentials.put("b@gmail.com", "1234");
	    }

	    public boolean Validate(String userName, String password) {
	        return ((userCredentials.containsKey(userName)) && userCredentials.get(userName).toString().equals(password));
	    }
}
