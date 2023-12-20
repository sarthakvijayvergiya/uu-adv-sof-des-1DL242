public interface AuthMethod {
    boolean authenticate();
}

public class SMSAuth implements AuthMethod {
    public String sendCode(String phoneNumber) {
        // Implementation
    }

    public boolean verifyCode(String code) {
        // Implementation
    }
}

public class BankIDAuth implements AuthMethod {
    public boolean requestAuth(String userId) {
        // Implementation
    }

    public boolean validateAuth(String token) {
        // Implementation
    }
}
