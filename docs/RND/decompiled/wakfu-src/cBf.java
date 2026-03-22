/*
 * Decompiled with CFR 0.152.
 */
public final class cBf
implements Runnable {
    private final long mtJ;
    private final boolean mtK;
    final /* synthetic */ cAY mtL;

    public cBf(cAY cAY2, long l, boolean bl) {
        this.mtL = cAY2;
        this.mtJ = l;
        this.mtK = bl;
    }

    @Override
    public void run() {
        this.mtL.r(this.mtJ, this.mtK);
    }
}

