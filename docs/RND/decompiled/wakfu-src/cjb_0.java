/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from cjb
 */
public class cjb_0
extends nv_0 {
    private byte lVL;
    private short lVM;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(3);
        azg_12.aF(this.lVL);
        azg_12.aG(this.lVM);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13580;
    }

    @Generated
    public void di(byte by) {
        this.lVL = by;
    }

    @Generated
    public void cz(short s) {
        this.lVM = s;
    }
}

