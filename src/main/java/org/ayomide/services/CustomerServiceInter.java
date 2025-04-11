package org.ayomide.services;

import org.ayomide.dto.request.LoginRequest;
import org.ayomide.dto.request.LogoutRequest;
import org.ayomide.dto.request.RegisterRequest;
import org.ayomide.dto.request.UpdateCustomerRequest;
import org.ayomide.dto.response.*;

public interface CustomerServiceInter {
    LoginResponse customerLogin(LoginRequest loginRequest);
    RegisterResponse customerRegister(RegisterRequest registerRequest);
    LogoutResponse customerLogout(LogoutRequest logoutRequest);

    UpdateCustomerResponse updateCustomer(UpdateCustomerRequest updateCustomer);
}
