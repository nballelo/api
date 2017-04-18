package dsa;

/**
 * Created by Ignacio on 17/04/2017.
 */
public class User {
    String name;
    String correo;
    int id;

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}
