package com.ampta.authify.service;

import com.ampta.authify.io.ProfileRequest;
import com.ampta.authify.io.ProfileResponse;

public interface ProfileService {
    ProfileResponse createProfile(ProfileRequest profileRequest);

    ProfileResponse getProfile(String email);
}
