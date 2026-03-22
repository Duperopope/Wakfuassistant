/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bwV
 */
public class bwv_0
implements bwl_0 {
    public static final bwl_0 jAq = new bwv_0();
    private final bww_0 jAr = new bww_0();
    protected final st_0 jAs = new st_0();
    private final bwt_0 jAt = new bwt_0(anp_2.cKu, false);

    protected bwv_0() {
        this.jAs.bqN = 1000;
        this.jAs.bqP = false;
        this.jAs.bqO = -1;
        this.jAs.bqV = true;
        this.jAs.bqT = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public bwt_0 a(bgy bgy2, bdj_2 bdj_22, int n) {
        if (n <= 0) {
            return bwx_0.jAw.a(bgy2, bdj_22, n);
        }
        if (bgy2.fgX() != null) {
            return bwx_0.jAw.a(bgy2, bdj_22, n);
        }
        boolean bl = bgy2.i(exe_1.rEy);
        bsj_0 bsj_02 = bgy2.dkZ();
        List<eVo> list = bsj_02.fl(bgy2.bcP());
        if (list == null || list.isEmpty() || !eVo.a(bgy2.aZw(), list)) {
            if (bl) {
                return this.jAt;
            }
            return bwx_0.jAw.a(bgy2, bdj_22, n);
        }
        acd_1 acd_12 = this.a(bgy2, bdj_22, list);
        if (acd_12 == null) {
            if (bl) {
                return this.jAt;
            }
            return bwx_0.jAw.a(bgy2, bdj_22, n);
        }
        rh_0 rh_02 = bsj_02.bag();
        rh_02.b(bgy2);
        anp_2 anp_22 = null;
        try {
            this.jAr.a(bsj_02, bgy2.bcP(), list);
            anp_22 = aeO.a(bdj_22, cub_1.eSi().eSj(), this.jAs, rh_02, this.jAr);
        }
        finally {
            rh_02.bdF();
        }
        if (anp_22 != null && anp_22.bDV()) {
            boolean bl2 = bgy2.a(exe_1.rES);
            if (bl2 && n > 0) {
                return new bwt_0(anp_22, true);
            }
            int n2 = n * 3;
            if (anp_22.bDU() <= n2) {
                return new bwt_0(anp_22, true);
            }
        }
        if (bl) {
            return this.jAt;
        }
        return bwx_0.jAw.a(bgy2, bdj_22, n);
    }

    private acd_1 a(bgy bgy2, bdj_2 bdj_22, List<eVo> list) {
        int n;
        float f2 = 0.0f;
        float f3 = 0.0f;
        aam_0 aam_02 = aie_0.cfn().bmC();
        if (aam_02 == null) {
            return null;
        }
        int n2 = cub_1.eSi().bqM();
        ArrayList<DisplayedScreenElement> arrayList = aam_02.a(n2, n = cub_1.eSi().bqN(), bdj_22.getAltitude(), aar.bZk, 0.0f, 0.0f);
        int n3 = arrayList.size();
        if (n3 == 0) {
            return null;
        }
        acd_1 acd_12 = bgy2.eap();
        TLongHashSet tLongHashSet = new TLongHashSet(50);
        for (int i = 0; i < n3; ++i) {
            DisplayedScreenElement displayedScreenElement = arrayList.get(i);
            ScreenElement screenElement = displayedScreenElement.brk();
            if (!tLongHashSet.add(displayedScreenElement.brp()) || acd_12.equals(screenElement.bsx()) || !eVo.a(screenElement.bsx(), list)) continue;
            return new acd_1(screenElement.bsx());
        }
        return null;
    }
}

