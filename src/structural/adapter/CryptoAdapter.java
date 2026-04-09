package structural.adapter;

public class CryptoAdapter implements UAPayment {
    private CryptoWallet wallet;

    public CryptoAdapter(CryptoWallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public void payInUAH(double amount) {
        double btc = amount / 100000.0;
        System.out.print("Адаптер конвертує " + amount + " грн у криптовалюту... ");
        wallet.sendBitcoin(btc);
    }
}