package DAOEvento;

import ConexaoEvento.ConexaoEvento;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ModelEvento.Evento;

public class EventoDAO {
    private Connection con;
    
    public EventoDAO(){
        this.con = new ConexaoEvento().getConnection();
    }
    
    public List<Evento> listarEvento(){
        try{
            List<Evento> evento = new ArrayList<>();
            String select = "SELECT * FROM Evento";
            PreparedStatement pst = con.prepareStatement(select);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Evento eventos = new Evento();
                eventos.setId(rs.getInt("id"));
                eventos.setTitulo(rs.getString("titulo"));
                eventos.setDescricao(rs.getString("descricao"));
                eventos.setPromotor(rs.getString("promotor"));
                
                evento.add(eventos);
                System.out.println("\n\nID: " + eventos.getId() +
                                    "\nTitulo: " + eventos.getTitulo() + 
                                    "\nDescricao: " + eventos.getDescricao() + 
                                    "\nPromotor: " + eventos.getPromotor());
            }
            rs.close();
            pst.close();
        }
        catch(SQLException e){
            System.out.println("Erro na consulta");
        }
        return null;
    }
    public void cadastrarEvento (Evento eventos){
        String insert = "INSERT INTO Evento (titulo, descricao, promotor)VALUES (?, ?, ?)";
        try{
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setString(1, eventos.getTitulo());
            pst.setString(2, eventos.getDescricao());
            pst.setString(3, eventos.getPromotor());
            pst.execute();

        }catch (Exception e){
            System.out.println("Erro ao inserir Evento!");
        }
    }
}