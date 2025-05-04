package com.abuzar.springsecurity.service;


import com.abuzar.springsecurity.io.ProfileRequest;
import com.abuzar.springsecurity.io.ProfileResponse;

public interface ProfileService {

    ProfileResponse createProfile(ProfileRequest request);
}
