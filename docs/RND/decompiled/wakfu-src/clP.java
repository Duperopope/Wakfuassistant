/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class clP
extends nv_0 {
    private List<Mv> ezD;
    private vb_0 ezE;

    public void l(List<Mv> list) {
        this.ezD = list;
    }

    public void b(vb_0 vb_02) {
        this.ezE = vb_02;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.aF(Mv.aJ(this.ezD));
        azg_12.aF((byte)this.ezE.d());
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13144;
    }
}

