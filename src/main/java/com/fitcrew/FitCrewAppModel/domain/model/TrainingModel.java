package com.fitcrew.FitCrewAppModel.domain.model;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Builder(toBuilder = true)
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class TrainingModel implements Serializable {

    private String trainingName;
    private String description;
    private String training;
    private String trainerEmail;
    private List<String> clients;
}
