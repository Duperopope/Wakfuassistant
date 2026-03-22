/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYF
 */
public class cyf_1 {
    private final String nYX;
    private final long nYY;
    private final bjb_0 nYZ;
    private final boolean nZa;

    cyf_1(String string, boolean bl, long l, bjb_0 bjb_02) {
        this.nYX = string;
        this.nZa = bl;
        this.nYY = Math.max(0L, l);
        this.nYZ = bjb_02;
    }

    cyf_1(String string, boolean bl, long l) {
        this(string, bl, l, bjb_0.kkb);
    }

    cyf_1(String string, long l) {
        this(string, l <= 0L, l);
    }

    cyf_1(String string) {
        this(string, 0L);
    }

    public boolean bKa() {
        return this.nZa;
    }

    public long Tz() {
        return this.nYY;
    }

    public String getText() {
        return this.nYX;
    }

    public bjb_0 eYr() {
        return this.nYZ;
    }
}

