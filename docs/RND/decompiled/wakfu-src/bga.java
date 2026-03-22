/*
 * Decompiled with CFR 0.152.
 */
public class bga
extends bcw_1 {
    private final int hYT;

    public bga(int n) {
        this.hYT = n;
    }

    @Override
    public String getDescription() {
        bfU bfU2 = bgd.diV().Cs(this.hYT);
        return bga.b(bfU2);
    }

    @Override
    public String dak() {
        return bgd.diV().Cs(this.hYT).diC();
    }

    @Override
    protected long dbv() {
        return 0L;
    }

    @Override
    protected boolean daJ() {
        return false;
    }

    @Override
    protected boolean daI() {
        return false;
    }

    protected static String b(bfU bfU2) {
        String string = bfU2.diB();
        if (string != null && string.length() == 0) {
            return null;
        }
        return string;
    }

    @Override
    protected boolean dbw() {
        return false;
    }

    @Override
    protected boolean dbx() {
        return false;
    }

    @Override
    protected boolean dby() {
        return false;
    }
}

