public class User {
    private String username;
    private String password;
    private Profile profile;
    private List<HealthRecord> healthRecords;
    private List<Appointment> appointments;
    private AIChatbot chatbot;
    private Locator locator;
    private List<EmergencyService> emergencyServices;
    private OfflineAccess offlineAccess;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        // Initialize other fields
    }

    public boolean login() {
        // Implementation
    }

    public void editProfile(Profile profileData) {
        // Implementation
    }

    // Additional getters and setters
}
