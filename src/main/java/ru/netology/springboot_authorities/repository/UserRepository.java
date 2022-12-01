package ru.netology.springboot_authorities.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springboot_authorities.data.Authorities;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

    private final Map<String, Map<String, List<Authorities>>> userData = new HashMap<>();
    private final Map<String, List<Authorities>> listPasswordsAuthorities = new HashMap<>();

    void init() {
        listPasswordsAuthorities.put("BorisSecret", Arrays.asList(Authorities.READ, Authorities.WRITE));
        userData.put("Boris", listPasswordsAuthorities);
        listPasswordsAuthorities.put("IraSecret", Arrays.asList(Authorities.DELETE));
        userData.put("Ira", listPasswordsAuthorities);
        listPasswordsAuthorities.put("AlexeySecret", Arrays.asList());
        userData.put("Alexey", listPasswordsAuthorities);
    }

    public UserRepository() {
        init();
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        return userData.get(user).get(password);
    }
}
