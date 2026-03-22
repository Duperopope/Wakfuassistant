/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bvF
 */
class bvf_0
implements aeL {
    final /* synthetic */ long juW;
    final /* synthetic */ bve_0 juX;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bvf_0(bve_0 bve_02, long l) {
        this.juX = bve_02;
        this.juW = l;
    }

    @Override
    public void du(byte[] byArray) {
        axc_2 axc_22 = this.a(byArray, this.juW);
        if (axc_22 == null) {
            return;
        }
        long l = this.dhO();
        awk_1 awk_12 = awm_1.bPn().b((art_1)aru_2.cVG.bIv(), l, axc_22, true);
        this.juX.juS.i(this.juW, l);
        axc_22.bsI();
        this.a(this.juW, awk_12, null);
    }

    private long dhO() {
        return arn_2.fX("CharacterImage-" + bve_0.juP++);
    }

    private axc_2 a(byte[] byArray, long l) {
        axc_2 axc_22 = axc_2.a(byArray, "PNG");
        if (axc_22 == null) {
            this.a(l, null, "Impossible de charger l'image.");
            return null;
        }
        return axc_22;
    }

    private void a(long l, awk_1 awk_12, String string) {
        ArrayList<bvg_0> arrayList = this.juX.juR.hd(l);
        if (arrayList == null) {
            return;
        }
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            bvg_0 bvg_02 = arrayList.get(i);
            bvg_02.a(awk_12, string);
        }
    }
}

