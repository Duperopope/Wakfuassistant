/*
 * Decompiled with CFR 0.152.
 */
public interface RT {
    public void aZp();

    public long LV();

    public int avr();

    public short bfd();

    public void ak(short var1);

    public void al(short var1);

    public boolean n(RT var1);

    public short bfe();

    public RT bff();

    public RT bfg();

    public boolean bfh();

    default public String bfi() {
        return "uid: " + this.LV() + " refId: " + this.avr() + " qty: " + this.bfd() + " data:" + this.bfj();
    }

    default public String bfj() {
        return this.toString();
    }
}

