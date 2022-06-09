package TLocal;

// ThreadLocal simply helps when you need smth like thread per request
public class Main {
    private final static ThreadLocal<Transaction> local = new ThreadLocal<>();
    public void doTransaction(){
        // do some ops
        Transaction transaction = new Transaction();
        local.set(transaction);
    }

    public void getTransactions(){
        Transaction transaction =  local.get();
        // do more ops if you want
    }


    // if there is more threads each will preserve its state everytime you need it
}

class Transaction{

}
