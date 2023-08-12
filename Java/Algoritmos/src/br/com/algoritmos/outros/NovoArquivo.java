package br.com.algoritmos.outros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NovoArquivo {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
                FileWriter fw = new FileWriter(file);
                fw.write("Teste 123\n");
                fw.write("Teste 432");
                fw.close();

                FileReader fr = new FileReader(file);

            }
            else {
                System.out.println("Arquivo já existe");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}