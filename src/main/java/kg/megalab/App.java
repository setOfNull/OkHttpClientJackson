package kg.megalab;

import model.JsonModel;
import service.JsonMapper;
import service.RestService;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        RestService restService = new RestService();
        JsonMapper jsonMapper = new JsonMapper();
        String response =  restService.run("https://cat-fact.herokuapp.com/facts");
        System.out.println(response);
        JsonModel[] jsonModels = jsonMapper.getModels(response);
        for (JsonModel model: jsonModels){
            System.out.println(model.toString());
        }

    }
}
