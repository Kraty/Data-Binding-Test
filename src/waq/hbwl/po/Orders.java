package waq.hbwl.po;

public class Orders {

    private Integer oId;
    private User user;

    public String toString() {
        return "Orders{" +
                "oId=" + oId +
                ", user=" + user +
                '}';
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
