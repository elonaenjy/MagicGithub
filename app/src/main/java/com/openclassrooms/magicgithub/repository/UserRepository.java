package com.openclassrooms.magicgithub.repository;

import androidx.annotation.Nullable;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.api.FakeApiService;
import com.openclassrooms.magicgithub.model.User;
import com.openclassrooms.magicgithub.ui.user_list.ListUserActivity;
import com.openclassrooms.magicgithub.ui.user_list.ListUserActivity;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

import java.util.ArrayList;
import java.util.List;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.nonAfficheUsers;

public class UserRepository {

    private final ApiService apiService; //
    // TODO: A utiliser --> OK
    private List<User> users = generateUsers();
    private List<User> usersNonAffiche = nonAfficheUsers();


    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: ==> ok
        List<User> liste = new ArrayList<User>();
        liste = users;
        return liste;
    }

    public void generateRandomUser() {
        // TODO: ok
        User personne = User.random();
        List<User> liste = new ArrayList<User>();
        liste = users;
        liste.add(personne);
    }

    public void deleteUser(User user) {
        // TODO: ok
        List<User> liste = new ArrayList<User>();
        liste = users;
        liste.remove( user);

    }

}

