package ClassExercises.Account;

import java.util.ArrayList;

public class Bank {
    private String name;
    private String sourceCode;
    private ArrayList<Customer> customer;
//    private String[] customer;

    Bank(String name, String sourceCode, ArrayList<Customer> customer) {
        this.name = name;
        this.sourceCode = sourceCode;
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public ArrayList<Customer> customer() {
        return customer;
    }


    }

