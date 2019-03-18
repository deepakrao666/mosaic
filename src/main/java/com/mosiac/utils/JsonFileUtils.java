package com.mosiac.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class JsonFileUtils {

    public static void readJson(){
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("D:\\Dev\\gitCloneMain\\mosiac\\src\\main\\resources\\dataset.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray array = (JSONArray) obj;
            System.out.println(array);

            //Iterate over employee array
            array.forEach( arr -> parseMyJson( (JSONObject) arr ) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
//
//    private static void parseMyJson(JSONObject json)
//    {
//        //Get employee object within list
//        JSONObject jsonObject = (JSONObject) json.get("employee");
//
//        //Get employee first name
//        String firstName = (String) employeeObject.get("firstName");
//        System.out.println(firstName);
//
//        //Get employee last name
//        String lastName = (String) employeeObject.get("lastName");
//        System.out.println(lastName);
//
//        //Get employee website name
//        String website = (String) employeeObject.get("website");
//        System.out.println(website);
//    }
}
