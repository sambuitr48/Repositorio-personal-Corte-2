package ejercicioCrud;

public class CatDTO {
    public Integer Id;
    private String name;
    private String color;

    public CatDTO(Integer id, String name, String color) {
        Id = id;
        this.name = name;
        this.color = color;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CatDTO{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
