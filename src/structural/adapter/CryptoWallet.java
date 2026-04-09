package structural.adapter;

public class CryptoWallet {
    public void sendBitcoin(double btcAmount) {
        System.out.println("Оплата пройшла: відправлено " + btcAmount + " BTC.");
    }
}