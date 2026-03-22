/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public class ftO {
    public static final Supplier<ftO> tgA = () -> new ftO(0L, 0);
    public static final int tgB = 10;
    private final long tgC;
    private long tgD;
    private final short tgE;

    public ftO(long l, short s) {
        this.tgE = s;
        this.tgC = l;
        this.tgD = l;
    }

    public short gmw() {
        return this.tgE;
    }

    public long gmx() {
        return this.tgC;
    }

    public long gmy() {
        return Math.max(0L, this.tgC);
    }

    public long gmz() {
        return this.tgD;
    }

    public void uR(long l) {
        this.tgD = l;
    }

    public boolean gmA() {
        return this.tgE > 0;
    }

    public boolean gmB() {
        return this.tgE != 0 || this.tgC != 0L;
    }
}

