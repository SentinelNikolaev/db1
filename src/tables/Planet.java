package tables;

import java.util.Objects;

/**
 * Created by Eugeny on 26.04.2016.
 */
public class Planet {
    private int id;
    private int starId;
    private String name;
    private int radius;
    private int temp;
    private boolean life;
    private boolean atm;

    public Planet(int id, int starId, String name, int radius, int temp, boolean life, boolean atm) {
        this.id = id;
        this.starId = starId;
        this.name = name;
        this.radius = radius;
        this.temp = temp;
        this.life = life;
        this.atm = atm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStarId() {
        return starId;
    }

    public void setStarId(int starId) {
        this.starId = starId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public boolean isAtm() {
        return atm;
    }

    public void setAtm(boolean atm) {
        this.atm = atm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planet)) return false;
        Planet planet = (Planet) o;
        return id == planet.id &&
                starId == planet.starId &&
                radius == planet.radius &&
                temp == planet.temp &&
                life == planet.life &&
                atm == planet.atm &&
                Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, starId, name, radius, temp, life, atm);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", starId=" + starId +
                ", name='" + name + '\'' +
                ", radius=" + radius +
                ", temp=" + temp +
                ", life=" + life +
                ", atm=" + atm +
                '}';
    }
}
