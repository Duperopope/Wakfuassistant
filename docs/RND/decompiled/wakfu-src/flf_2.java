/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLF
 */
public abstract class flf_2
extends fiq_1 {
    protected int ofK;
    private static final int uIH = 512;
    private static final int uII = 8192;
    private static final int uIJ = 64;
    private static final int uIK = 128;
    private static final int uIL = 256;

    public int fcn() {
        return this.ofK;
    }

    public void abZ(int n) {
        this.ofK = n;
    }

    public boolean gDQ() {
        boolean bl = (this.ofK & 0x80) == 128;
        boolean bl2 = (this.ofK & 0x100) == 256;
        return bl || ady_1.bZa() && bl2;
    }

    public boolean gDR() {
        return (this.ofK & 0x200) == 512;
    }

    public boolean gDS() {
        return (this.ofK & 0x2000) == 8192;
    }

    public boolean gDT() {
        return (this.ofK & 0x40) == 64;
    }

    public boolean gDU() {
        return (this.ofK & 0x100) == 256;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.ofK = 0;
    }
}

