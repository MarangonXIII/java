package Principal;

import Conexao.Conexao;

public class Principal {
    public static void main(String[] args){
        try{
            Conexao con = new Conexao();
            con.getConnection();
            System.out.println("Conectado com sucesso");
        }catch(Exception e){
            System.out.println("Erro de conexão");
        }
    }
}
