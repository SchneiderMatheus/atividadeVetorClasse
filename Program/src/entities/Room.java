package entities;

public class Room {
    private int [] quartos = new int[10];
    private String name;
    private String email;
    
    public Room(int [] quartos, String name, String email) {
        this.name = name;
        this.email = email;
        this.quartos = quartos;
    }

    public int[] getQuartos() {
        return quartos;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setQuartos(int[] quartos) {
        this.quartos = quartos;
    }

    
}
