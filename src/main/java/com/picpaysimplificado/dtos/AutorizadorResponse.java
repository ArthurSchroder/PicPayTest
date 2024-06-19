package com.picpaysimplificado.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutorizadorResponse {
    private String status;
    private AutorizadorResponseData data;
}
