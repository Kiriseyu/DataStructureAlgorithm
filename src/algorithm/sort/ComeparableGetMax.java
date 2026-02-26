package algorithm.sort;

public class ComeparableGetMax implements Comparable<ComeparableGetMax> {
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ComeparableGetMax{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(ComeparableGetMax o) {
        return this.age - o.age;
    }

}
