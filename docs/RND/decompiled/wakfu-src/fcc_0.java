/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fcc
 */
public class fcc_0
extends RuntimeException {
    private final fbn rTh;

    public fcc_0(fbn fbn2, String string) {
        super(String.valueOf((Object)fbn2) + " : " + string);
        this.rTh = fbn2;
    }

    public fcc_0(fbn fbn2, String string, Throwable throwable) {
        super(String.valueOf((Object)fbn2) + " : " + string, throwable);
        this.rTh = fbn2;
    }

    public fbn eAk() {
        return this.rTh;
    }
}

