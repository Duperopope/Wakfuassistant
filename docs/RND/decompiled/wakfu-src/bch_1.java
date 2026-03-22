/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bch
 */
public class bch_1
extends bcv_1 {
    private final ewx_1 hDE;
    private final String hDF;

    public bch_1(int n, ewx_1 ewx_12, String string) {
        super(n);
        this.hDE = ewx_12;
        this.hDF = string;
    }

    @Override
    protected boolean daI() {
        return this.hDE == ewx_1.rCU;
    }

    @Override
    protected boolean daJ() {
        return this.hDE == ewx_1.rCT;
    }

    @Override
    public String daK() {
        return this.hDF;
    }
}

