package com.fitcrew.FitCrewAppModel.domain.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Builder(toBuilder = true)
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class ClientModel extends AbstractModel implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String dateOfBirth;
    private String clientId;
    private String encryptedPassword;
}
