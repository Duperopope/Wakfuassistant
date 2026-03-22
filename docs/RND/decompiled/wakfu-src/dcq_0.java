/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dcq
 */
public class dcq_0
extends dae_0 {
    private final double ofd;
    private final int ofe;

    public dcq_0(short s, double d2, int n) {
        super(s);
        this.ofd = d2;
        this.ofe = n;
    }

    public double fbL() {
        return this.ofd;
    }

    public int fbM() {
        return this.ofe;
    }
}

