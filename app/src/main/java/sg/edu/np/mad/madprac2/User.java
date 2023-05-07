package sg.edu.np.mad.madprac2;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;

    public User(){
        this.name = "Zach";
        this.description = "idk what is";
        this.id = 123;
        this.followed = false;
    }

    public User(String name, String description, int id, boolean followed){
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public boolean isFollowed() {
        return followed;
    }
}
