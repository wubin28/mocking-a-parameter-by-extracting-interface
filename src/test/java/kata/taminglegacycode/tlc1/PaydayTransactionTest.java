package kata.taminglegacycode.tlc1;

import org.junit.Test;

import java.sql.Date;

import static org.mockito.Mockito.*;

public class PaydayTransactionTest {
    @Test
    public void save_transaction_should_be_logged_after_running() {
        TransactionRecorder log = mock(TransactionRecorder.class);
        PayrollDatabase db = new PayrollDatabase();
        PaydayTransaction paydayTransaction = new PaydayTransaction(db, log);
        Date date = new Date(System.currentTimeMillis());

        paydayTransaction.run(date);

        verify(log, times(1)).saveTransaction(any(PaydayTransaction.class));
    }
}
