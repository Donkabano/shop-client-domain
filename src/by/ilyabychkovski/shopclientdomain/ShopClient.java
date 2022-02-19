package by.ilyabychkovski.shopclientdomain;

import java.util.Objects;

public class ShopClient {

    private static int maxSalesAmount;

    private long id;
    private String firstName;
    private String lastName;

    static {
        maxSalesAmount = 20;
    }

    public ShopClient(long id,
                      String firstName,
                      String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShopClient that = (ShopClient) o;
        return id == that.id && firstName.equals(that.firstName) && lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return "ShopClient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
