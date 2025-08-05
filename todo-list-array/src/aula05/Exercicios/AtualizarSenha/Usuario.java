package aula05.Exercicios.AtualizarSenha;

import java.util.ArrayList;
import java.util.List;

    public class Usuario {
        private String senhas;
        private static List<String> registroSenhas = new ArrayList<>();




        public static String alterarSenha(String novaSenha) {
            for (int i = 0; i < registroSenhas.size(); i++) {
                String s = registroSenhas.get(i);
            }


            registroSenhas.add(novaSenha);
            return "";
        }

    }