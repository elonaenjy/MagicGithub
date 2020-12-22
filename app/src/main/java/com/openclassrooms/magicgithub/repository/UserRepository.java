package com.openclassrooms.magicgithub.repository;

import androidx.annotation.Nullable;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.api.FakeApiService;
import com.openclassrooms.magicgithub.model.User;
import com.openclassrooms.magicgithub.ui.user_list.ListUserActivity;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

import java.util.ArrayList;
import java.util.List;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class UserRepository {

    private final ApiService apiService; //
    //
    private List<User> users = generateUsers();

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        //
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        //
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        //
        apiService.deleteUser(user);
    }
}

