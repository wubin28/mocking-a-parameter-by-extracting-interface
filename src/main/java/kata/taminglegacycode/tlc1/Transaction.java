package kata.taminglegacycode.tlc1;

public class Transaction {
    final PayrollDatabase db;
    final TransactionRecorder log;

    public Transaction(PayrollDatabase db, TransactionRecorder log) {
        this.db = db;
        this.log = log;
    }
}
