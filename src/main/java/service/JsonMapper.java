package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.JsonModel;

import java.io.IOException;

public class JsonMapper {
    ObjectMapper objectMapper = new ObjectMapper();

    public JsonModel[] getModels(String json) throws IOException {
        return objectMapper.readValue(json, JsonModel[].class);
    }
}
