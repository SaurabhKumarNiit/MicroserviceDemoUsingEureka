package com.niit.UserAuthentication.service;

import com.niit.UserAuthentication.domain.UserModel;

import java.util.Map;

public interface SecurityTokenGenerator
{
    public abstract Map<String, String> generateToken(UserModel user);


}
