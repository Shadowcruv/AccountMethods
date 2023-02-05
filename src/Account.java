public class Account {// Data Members

    private String ownerName;
    private double balance;
    private boolean active;
    //Constructor
    public Account(String name, double startingBalance ) {
        ownerName = name;
        balance = startingBalance;
      setActive(true);
    }
    //Adds the passed amount to the balance
    public void add(double amt) {
//add if amt is positive; do nothing otherwise
        if (isActive() && amt > 0) {
            balance = balance + amt;
        }
    }
    //Closes the account; set 'active' to false
    public void close( ) {
        setActive(false);
    }
    //Deducts the passed amount from the balance
    public void deduct(double amt) {
//deduct if amt is positive; do nothing otherwise
        if (isActive() && amt > 0) {
            double newbalance = balance - amt;
            if (newbalance >= 0) { //don't let the balance become negative
                balance = newbalance;
            }
        }
    }
//Returns the current balance of this account
        public double getCurrentBalance( ) {
            return balance;
        }
//Returns the name of this account's owner
        public String getOwnerName( ) {
            return ownerName;
        }
//Is the account active?
        public boolean isActive( ) {
            return active;
        }
//Assigns the name of this account's owner
        public void setOwnerName(String name) {
            ownerName = name;
        }
//Sets 'active' to true or false
        private void setActive(boolean state) {
            active = state;
        }
    }

