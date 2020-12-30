package com.fitcrew.FitCrewAppModel.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractModel {
    protected String encryptedPassword;
}
