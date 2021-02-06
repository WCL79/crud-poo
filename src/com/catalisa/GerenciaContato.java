package com.catalisa;

import java.util.ArrayList;
import java.util.List;

public class GerenciaContato {

    static List<Contato> listaDeContatos = new ArrayList<>();

    public static void menu(){
        boolean continuar = true;

        while (continuar){
            IO.exibirDados("Digite a opção desejada:");
            int retorno = IO.lerDados().nextInt();
            if(retorno == 1){
                cadastrarContato();
            }else if(retorno == 2){
                pesquisarContato();
            }else if(retorno == 3){
                removerContato();
            }else if(retorno == 4) {
                listarContato();
            }else if(retorno == 5) {
                IO.exibirDados("O sistema será encerrado!");
                continuar = false;
            }
        }
    }
    private static List<Contato> cadastrarContato() {
        IO.exibirDados("Digite seu nome:");
        String nome = IO.lerDados().nextLine();
        IO.exibirDados("Digite seu e-mail:");
        String email = IO.lerDados().nextLine();
        IO.exibirDados("Digite seu tefone:");
        int fone = IO.lerDados().nextInt();

        Contato contato = new Contato(nome, email, fone);
        listaDeContatos.add(contato);
        return listaDeContatos;
    }
    private static void pesquisarContato() {
        IO.exibirDados("Para encontra o contato, digite o nome da pessoa desejada:");
        String nomePesquisado = IO.lerDados().nextLine();
        for(Contato contatos : listaDeContatos){
            if(contatos.getNome().equalsIgnoreCase(nomePesquisado)){
                IO.exibirDados("Nome do contato:"+nomePesquisado);
            }
        }
    }
    private static void removerContato() {
        IO.exibirDados("Informe o nome para que haja REMOÇÃO:");
        String nomeRemovido = IO.lerDados().nextLine();
        if(!listaDeContatos.contains(nomeRemovido)){
            listaDeContatos.remove(nomeRemovido);
        }else {
            IO.exibirDados("Nome não encontrado!");
        }
    }
    private static void listarContato() {
        for (Contato  contatos: listaDeContatos){
            IO.exibirDados(""+contatos);
        }
    }

}
