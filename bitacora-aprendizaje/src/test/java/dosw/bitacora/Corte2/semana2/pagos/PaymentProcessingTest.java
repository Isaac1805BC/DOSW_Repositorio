package dosw.bitacora.Corte2.semana2.pagos;

import dosw.bitacora.Corte2.semana2.pagos.adapter.*;
import dosw.bitacora.Corte2.semana2.pagos.chain.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentProcessingTest {

    @Test
    void testPaymentValidationChainSuccess() {
        PaymentValidator chain = new BalanceValidator();
        PaymentValidator fraud = new FraudValidator();
        PaymentValidator limit = new LimitValidator();
        
        chain.setNext(fraud);
        fraud.setNext(limit);
        
        assertTrue(chain.validate(500, "normal_transaction"));
    }

    @Test
    void testPaymentValidationChainFraudFailure() {
        PaymentValidator chain = new BalanceValidator();
        chain.setNext(new FraudValidator());
        
        assertFalse(chain.validate(500, "suspicious_activity"));
    }

    @Test
    void testPayPalAdapter() {
        PaymentProcessor paypal = new PayPalAdapter();
        assertDoesNotThrow(() -> paypal.processPayment(100, "test@paypal.com"));
    }

    @Test
    void testStripeAdapter() {
        PaymentProcessor stripe = new StripeAdapter();
        assertDoesNotThrow(() -> stripe.processPayment(200, "tok_visa"));
    }
}
