package answers.types;

public class Account {

    private String email;
    private String password;

    public Account(final String email, final String password) {
        this.email = email;
        this.password = password;
    }

    public Account() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
