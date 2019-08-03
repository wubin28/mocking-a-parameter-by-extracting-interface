package kata.taminglegacycode.tlc1;

import java.sql.Date;
import java.util.Iterator;

public class PaydayTransaction extends Transaction {
    public PaydayTransaction(PayrollDatabase db, TransactionLog log) {
        super(db, log);
    }

    public void run(Date date) {
        if (db.getEmployees() != null) {
            for (Iterator it = super.db.getEmployees(); it.hasNext(); ) {
                Employee e = (Employee) it.next();
                if (e.isPayday(date)) {
                    e.pay();
                }
            }
        }
        log.saveTransaction(this);
    }

}
