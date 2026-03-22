/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.util.List;
import lombok.Generated;

/*
 * Renamed from cnY
 */
public class cny_0
extends nv_0 {
    private final long mcu;
    private final List<Integer> mcv;
    private final List<Integer> mcw;

    @Override
    public byte[] aVX() {
        short s = (short)this.mcv.size();
        short s2 = (short)this.mcw.size();
        int n = 10 + s * 4 + 2 + s2 * 4;
        azg_1 azg_12 = new azg_1(n);
        azg_12.gK(this.mcu);
        azg_12.aG(s);
        for (Integer n2 : this.mcv) {
            azg_12.vC(n2);
        }
        azg_12.aG(s2);
        for (Integer n2 : this.mcw) {
            azg_12.vC(n2);
        }
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12932;
    }

    @Generated
    public cny_0(long l, List<Integer> list, List<Integer> list2) {
        this.mcu = l;
        this.mcv = list;
        this.mcw = list2;
    }
}

