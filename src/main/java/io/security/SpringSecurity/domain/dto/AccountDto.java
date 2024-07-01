package io.security.SpringSecurity.domain.dto;

import lombok.Builder;
import lombok.Data;


// Data 어노테이션은 재고할 필요가 있음
@Data
@Builder
public class AccountDto {
    private String id;
    private String username;
    private String password;
    private int age;
    private String roles;
}
