/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from awY
 */
public abstract class awy_2
implements awz_2 {
    protected byte dog;
    protected byte doh;
    protected byte doi;
    protected byte doj;
    protected byte dok;
    protected byte dol;
    protected byte dom;
    protected byte don;
    protected boolean doo = false;

    protected awy_2(byte by, byte by2, byte by3, byte by4, byte by5, byte by6, byte by7, byte by8, boolean bl) {
        this.dog = by;
        this.doh = by2;
        this.doi = by3;
        this.doj = by4;
        this.dok = by5;
        this.dol = by6;
        this.dom = by7;
        this.don = by8;
        this.doo = bl;
    }

    @Override
    public void c(byte by, byte by2, byte by3, byte by4) {
        this.dog = by;
        this.doh = by2;
        this.doi = by3;
        this.doj = by4;
    }

    @Override
    public void d(byte by, byte by2, byte by3, byte by4) {
        this.dok = by;
        this.dol = by2;
        this.dom = by3;
        this.don = by4;
    }

    @Override
    public void uY(int n) {
        if (n == 32) {
            this.doo = true;
        }
    }
}

