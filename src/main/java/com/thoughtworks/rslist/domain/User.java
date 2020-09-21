package com.thoughtworks.rslist.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotNull
    @Size(max = 8)
    private String userName;
    private String gender;
    @Min(18)
    @Max(100)
    private int age;
    @Email
    private String email;
    @NotNull
    @Pattern(regexp = "1\\d{10}")
    private String phone;
    @JsonIgnore
    private int voteNum = 10;
}
