package org.ayomide.services;

import org.ayomide.dto.request.*;
import org.ayomide.dto.response.*;

public interface CustomerServiceInter {
    LoginResponse customerLogin(LoginRequest loginRequest);
    RegisterResponse customerRegister(RegisterRequest registerRequest);
    LogoutResponse customerLogout(LogoutRequest logoutRequest);
    UpdateCustomerResponse updateCustomer(UpdateCustomerRequest updateCustomer);
    DeleteCustomerResponse deleteCustomerResponse(DeleteCustomerRequest deleteCustomerRequest);

}
