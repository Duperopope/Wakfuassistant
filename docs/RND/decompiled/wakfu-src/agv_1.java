/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aGV
 */
public class agv_1
extends agw_1 {
    public agv_1(ahk_1 ahk_12, agn_1 agn_12, float f2, boolean bl, float f3) {
        super(ahk_12, agn_12, f2, bl, f3);
    }

    @Override
    public void p(acp_1 acp_12) {
        float f2 = acp_12.aSc();
        float f3 = f2 > 2.0f ? f2 - 2.0f : (f2 < -2.0f ? f2 + 2.0f : 0.0f);
        float f4 = acp_12.aSd();
        float f5 = f4 > 2.0f ? f4 - 2.0f : (f4 < -2.0f ? f4 + 2.0f : 0.0f);
        float f6 = acp_12.aSe();
        float f7 = f6 > 2.0f ? f6 - 2.0f : (f6 < -2.0f ? f6 + 2.0f : 1.0f);
        this.dNm.r(f3, f5, f7);
    }
}

