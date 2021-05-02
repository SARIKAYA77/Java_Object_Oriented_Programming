public class Customer {
    private int id;
    private String name;
    private String surname;
    private String nationalityId;
    private int coffeeCount;


    public int getCoffeeCount() {
        return coffeeCount;
    }

    public void setCoffeeCount(int coffeeCount) {
        this.coffeeCount = coffeeCount;
    }

    public Customer(int id, String name, String surname, String nationalityId, int coffeeCount) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.nationalityId = nationalityId;
        this.coffeeCount = coffeeCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return name;
    }

    public void setFirstName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return surname;
    }

    public void setLastName(String surname) {
        this.surname = surname;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }




}