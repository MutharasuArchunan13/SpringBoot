package com.example.restdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restdemo.model.CloudUsers;

@RestController
@RequestMapping("/CloudUsers")
public class CloudAPIService {
    CloudUsers cloudUsers;

    @GetMapping("{userId}")
    public CloudUsers getCloudUsersDetails() {
        if (cloudUsers != null) {
            return cloudUsers;
        } else {
            return new CloudUsers("No data's found", "", "", ""); // Return a message when no data is found
        }
    }

    @PostMapping
    public String createCloudUsers(@RequestBody CloudUsers CloudUsers) {
        this.cloudUsers = CloudUsers;
        return "cloud user created successfully";
    }

    @PutMapping("{userId}")
    public String updateCloudUsers(@RequestBody CloudUsers CloudUsers) {
        this.cloudUsers = CloudUsers;
        return "cloud user updated";
    }

    @DeleteMapping("{usersId}")
    public String deleteCloudUsers(String usersId) {
        this.cloudUsers = null;
        return "deleted successfully";
    }

}
