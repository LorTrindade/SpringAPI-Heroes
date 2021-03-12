package com.trindade.api.heroes.gateway.http_client.json;

import lombok.Data;

@Data
public class Character {

    private int id;
    private String name;
    private String description;
}
