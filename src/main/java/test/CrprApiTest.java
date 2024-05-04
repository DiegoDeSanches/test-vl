package test;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CrprApiTest {
    public static void main(String[] args) throws IOException {
        var crptApi = new CrptApi(TimeUnit.MINUTES, 10);

        var document = new ObjectMapper().readValue(getTestDocument(), CrptApi.Document.class);

        crptApi.createDocumentForNewRussianProduct(document, "signature");

        System.out.println("finished");
        System.exit(0);
    }

    static String getTestDocument() {
        return "{\n" +
                "                  \"description\": {\n" +
                "                    \"participantInn\": \"string\"\n" +
                "                  },\n" +
                "                  \"doc_id\": \"string\",\n" +
                "                  \"doc_status\": \"string\",\n" +
                "                  \"doc_type\": \"LP_INTRODUCE_GOODS\",\n" +
                "                  \"importRequest\": true,\n" +
                "                  \"owner_inn\": \"string\",\n" +
                "                  \"participant_inn\": \"string\",\n" +
                "                  \"producer_inn\": \"string\",\n" +
                "                  \"production_date\": \"2020-01-23\",\n" +
                "                  \"production_type\": \"string\",\n" +
                "                  \"products\": [\n" +
                "                    {\n" +
                "                      \"certificate_document\": \"string\",\n" +
                "                      \"certificate_document_date\": \"2020-01-23\",\n" +
                "                      \"certificate_document_number\": \"string\",\n" +
                "                      \"owner_inn\": \"string\",\n" +
                "                      \"producer_inn\": \"string\",\n" +
                "                      \"production_date\": \"2020-01-23\",\n" +
                "                      \"tnved_code\": \"string\",\n" +
                "                      \"uit_code\": \"string\",\n" +
                "                      \"uitu_code\": \"string\"\n" +
                "                    }\n" +
                "                  ],\n" +
                "                  \"reg_date\": \"2020-01-23\",\n" +
                "                  \"reg_number\": \"string\"\n" +
                "                }";
    }
}
