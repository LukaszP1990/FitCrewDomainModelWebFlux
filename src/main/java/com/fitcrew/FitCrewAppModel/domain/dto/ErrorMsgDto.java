package com.fitcrew.FitCrewAppModel.domain.dto;

import lombok.*;

@Getter
@Builder(toBuilder = true)
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class ErrorMsgDto {

    private String text;
}
