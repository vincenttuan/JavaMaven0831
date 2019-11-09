package day09_csv;

import com.opencsv.bean.CsvBindByName;
import java.util.Objects;

public class User {
    @CsvBindByName
    private String name;
    @CsvBindByName
    private String email;
    @CsvBindByName
    private String phone;
    @CsvBindByName
    private String country;

    public User() {
    }

    public User(String name, String email, String phone, String country) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.country = country;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", email=" + email + ", phone=" + phone + ", country=" + country + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.email);
        hash = 47 * hash + Objects.hashCode(this.phone);
        hash = 47 * hash + Objects.hashCode(this.country);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        return true;
    }
    
}
