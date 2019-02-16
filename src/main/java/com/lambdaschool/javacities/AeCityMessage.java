package com.lambdaschool.javacities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

// Serializable makes data from object blob readable
import java.io.Serializable;

// makes getters and setters
@Data
class AeCityMessage implements Serializable
{
    private final String text;
    private final int priority;
    private final boolean secret;

    // @JsonProperty takes json property and maps it into a java object?
    public AeCityMessage(@JsonProperty("text") String text,
                         @JsonProperty("priority") int priority,
                         @JsonProperty("secret") boolean secret)
    {
        this.text = text;
        this.priority = priority;
        this.secret = secret;
    }
}
