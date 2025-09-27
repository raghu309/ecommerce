package com.sb.ecom.security.response;

import lombok.Data;

import java.util.List;

@Data
public class UserInfoResponse {
    private Long id;
    private String username;
    private String jwtToken;
    private List<String> roles;

    public UserInfoResponse(Long id, String username, String jwtToken, List<String> roles) {
        this.id = id;
        this.jwtToken = jwtToken;
        this.username = username;
        this.roles = roles;
    }

}
