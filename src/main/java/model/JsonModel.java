package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonModel {

    private Status status;
    @JsonProperty("_id")
    private String _id;
    private String user;
    private String text;
    @JsonProperty("_v")
    private int _v;
    private String source;
    private String updatedAt;
    private String type;
    private String createdAt;
    private boolean deleted;
    private boolean used;

    @Data
    static class Status{
        private boolean verified;
        private int sentCount;

    }
}
