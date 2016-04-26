package tables;

import java.util.Objects;

/**
 * Created by Eugeny on 23.04.2016.
 */
public class Star {
    private int id;
    private String name;

    public Star( int id, String name) {
        this.name = name;
        this.id = id;
    }

    public Star() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Star)) return false;
        Star star = (Star) o;
        return id == star.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Star{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
