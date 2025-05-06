package org.aplccation;

import org.aplccation.Dto.EnderecoDto;
import org.aplccation.service.APIservice;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        APIservice apiService = new APIservice();

        try {
            EnderecoDto endereco = apiService.getEndereco("06787020");
            System.out.println(endereco);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}