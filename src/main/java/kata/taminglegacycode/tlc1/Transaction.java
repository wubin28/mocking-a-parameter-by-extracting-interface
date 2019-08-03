package kata.taminglegacycode.tlc1;

public class Transaction {
    final PayrollDatabase db;
    final TransactionLog log;

    public Transaction(PayrollDatabase db, TransactionLog log) {
        this.db = db;
        this.log = log;
    }
}
