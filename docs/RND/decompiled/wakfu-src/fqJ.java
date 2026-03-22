/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class fqJ {
    private final short sVz;
    private final int[] sVA;

    public fqJ(short s, int[] nArray) {
        this.sVz = s;
        this.sVA = Arrays.copyOf(nArray, nArray.length);
    }

    public short cwi() {
        return this.sVz;
    }

    public int[] cwj() {
        return Arrays.copyOf(this.sVA, this.sVA.length);
    }
}

