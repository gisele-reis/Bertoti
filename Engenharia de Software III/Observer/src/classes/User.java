package classes;

import interfaces.Observer;

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " recebeu uma nova mensagem: " + message);
    }
}
