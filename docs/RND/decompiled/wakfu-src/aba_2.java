/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBa
 */
public class aba_2
extends aam_2 {
    public static final int dxx = Integer.MIN_VALUE;
    private long dxy;
    private int dxz = 0;
    private long dxA;

    public long bUx() {
        return this.dxy;
    }

    public void hi(long l) {
        this.dxy = l;
    }

    public void wE(int n) {
        this.dxz = n;
    }

    public int bUy() {
        return this.dxz;
    }

    @Override
    public int d() {
        return Integer.MIN_VALUE;
    }

    public long bUz() {
        return this.dxA;
    }

    public void hj(long l) {
        this.dxA = l;
    }

    @Override
    public String toString() {
        return "ClockMessage clockId=" + this.dxy + ", subClockId=" + this.dxz + ", timestamp=" + this.dxA;
    }
}

