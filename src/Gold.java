public class Gold extends Item {
    private int amt;

    public Gold(int amt) {
        super("Gold", String.format("A round coin with %s stamp on the front.", String.valueOf(amt)), amt);
        this.amt = amt;
    }
}
