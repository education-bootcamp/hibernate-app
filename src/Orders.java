import javax.persistence.*;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    private double cost;

    /*=============*/
    @ManyToOne
    private Customer customer;
    /*=============*/


    public Orders(long orderId, double cost) {
        this.orderId = orderId;
        this.cost = cost;
    }

    public Orders() {
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
