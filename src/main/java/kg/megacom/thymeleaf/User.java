package kg.megacom.thymeleaf;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class User {
    private Long id;

    @NotEmpty (message = "Имя не должен быть пустым")
    @Pattern(regexp = "[A-Za-z ]*", message = "Имя должен содержать только строки")
    private String name;

    @NotEmpty (message = "Поле email не должен быть пустым")
    @Email(message = "Введите валидный e-mail")
    private String email;

    @NotEmpty (message = "Пароль не должен быть пустым")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message = "Пароль должен содержать не менее 8 символов латинского алфавита (прописные и заглавные), цифры и спец. символы (!\"#$%&)")
    private String password;

    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}