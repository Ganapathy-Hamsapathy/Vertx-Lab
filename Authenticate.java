package com.ibm.lab1;

@FunctionalInterface
interface Resolve {
    void success();
}

@FunctionalInterface
interface Reject {
    void fail();
}

class Login {
    public void validate(Resolve usrResolve, Reject usrReject, String usr, String pass) {
    	if (usr == "user" && pass == "password"){
    		usrResolve.success();
    	}else{
    		usrReject.fail();
    	}
    }
}


public class Authenticate {
	public static void main(String[] args) {
		
		Login login = new Login();
		login.validate(() -> System.out.println("Login success"), () -> System.out.println("Login failed"), "user", "password");
		login.validate(() -> System.out.println("Login success"), () -> System.out.println("Login failed"), "user1", "password1");
	}
	
}
