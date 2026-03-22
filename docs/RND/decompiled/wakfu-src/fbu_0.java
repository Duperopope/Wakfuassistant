/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fbU
 */
public class fbu_0
implements Comparable<fbu_0> {
    private final short rSJ;
    private final short rSK;
    private final ua_0 rSL;
    private final short rSM;
    private final byte rSN;

    public fbu_0(short s, short s2, short s3, long l, byte by) {
        this.rSM = s;
        this.rSJ = s2;
        this.rSK = s3;
        this.rSL = uz_0.fp(l);
        this.rSN = by;
    }

    public short coj() {
        return this.rSM;
    }

    public short fSj() {
        return this.rSJ;
    }

    public short fSk() {
        return this.rSK;
    }

    public ua_0 fSl() {
        return this.rSL;
    }

    public boolean fSm() {
        return !this.rSL.aYI();
    }

    public int a(@NotNull fbu_0 fbu_02) {
        return this.rSN - fbu_02.rSN;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((fbu_0)object);
    }
}

