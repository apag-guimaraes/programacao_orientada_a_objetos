import java.util.ArrayList;

import java.util.Collections;

import java.util.List;


public class Principal {

   public static void main(String[] args) {

       List dados = new ArrayList();

       dados.add("nome");

       dados.add(12);

       dados.add(true);

       for(int i =0 ;i<dados.size();i++){

           System.out.println(dados.get(i));

       }

       Collections.sort(dados);  //problemas aqui

   }

}
