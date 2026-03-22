/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ffU
 */
public class ffu_0
extends ffV {
    private ffV shl;

    public ffu_0(long l, fhc_0 fhc_02, ffV ffV2) {
        super(l);
        this.shl = ffV2;
        this.l(fhc_02);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.shl = null;
    }

    @Override
    public void aZp() {
        this.shl = null;
    }

    public ffV fVS() {
        return this.shl;
    }

    @Override
    public boolean apo() {
        return false;
    }
}

