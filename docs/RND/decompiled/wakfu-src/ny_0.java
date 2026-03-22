/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ny
 */
public class ny_0
extends nr_0 {
    private byte aYH = (byte)-1;
    private byte aYh = (byte)-1;

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 2, true)) {
            return false;
        }
        this.aYh = byArray[0];
        this.aYH = byArray[1];
        return true;
    }

    @Override
    public int d() {
        return 15;
    }

    public byte aWp() {
        return this.aYH;
    }

    public byte aVT() {
        return this.aYh;
    }
}

