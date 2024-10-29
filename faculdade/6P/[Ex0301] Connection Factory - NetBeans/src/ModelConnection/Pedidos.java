package ModelConnection;

import java.math.BigDecimal;
import java.util.Date;

public class Pedidos {
    private int id;
    private int cliente_id;
    private Date data_pedido;
    private BigDecimal total;
    
    public Pedidos(){
        //Construtor Vazio
    }
    
    public Pedidos(int cliente_id, Date data_pedido, BigDecimal total){
      this.cliente_id = cliente_id;
      this.data_pedido = data_pedido;
      this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteId() {
        return cliente_id;
    }

    public void setClienteId(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Date getDataPedido() {
        return data_pedido;
    }

    public void setDataPedido(Date data_pedido) {
        this.data_pedido = data_pedido;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
