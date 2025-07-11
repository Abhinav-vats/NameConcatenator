package com.centime.concatenator.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DetailVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("Name")
    private String Name;
    @JsonProperty("Surname")
    private String Surname;

}
