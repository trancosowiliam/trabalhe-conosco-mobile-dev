package br.com.dalcim.picpay.data;

/**
 * @author Wiliam
 * @since 29/08/2017
 */

public class CreditCard {
    private String cardNumber;
    private int cvv;
    private String expiryData;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getExpiryData() {
        return expiryData;
    }

    public void setExpiryData(String expiryData) {
        this.expiryData = expiryData;
    }
}