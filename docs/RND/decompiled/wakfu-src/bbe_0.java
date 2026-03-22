/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.List;

/*
 * Renamed from bbE
 */
public class bbe_0
implements aeh_2 {
    public static final float[] hAG = new float[]{0.0f, 1.0f, 0.0f, 0.5f};
    public static final float[] hAH = new float[]{1.0f, 0.0f, 0.0f, 0.5f};
    public static final String hAI = "emotesWithTarget";
    public static final String hAJ = "emotes";
    public static final String hAK = "listFilter";
    public static final String hAL = "smileys";
    public static final String[] hAM = new String[]{"emotesWithTarget", "emotes", "listFilter", "smileys"};
    private final TIntObjectHashMap<bbi_0> hAN = new TIntObjectHashMap();
    private final fez_1 hAO = new fez_1();
    public static final bbe_0 hAP = new bbe_0();
    private eTp hAQ = new eTp();

    private bbe_0() {
        for (VI vI : VI.values()) {
            int n = vI.d();
            this.hAN.put(n, (Object)new bbo_0(n, vI.bkG()));
        }
        this.aPc();
        this.hAO.z(string -> fse_1.gFu().a((aef_2)this, hAJ, hAI));
    }

    public void clear() {
        this.hAO.bc("");
        this.hAQ = new eTp();
    }

    public void aPc() {
        bbs_2.a(eva_1.owA).ifPresent(evv_22 -> {
            this.hAQ = (eTp)evv_22;
        });
        this.hAO.bc("");
        this.hAQ.fJd().forEach(hd_02 -> {
            int n = hd_02.d();
            bbf_0 bbf_02 = bbl_0.hBr.AH(n);
            if (bbf_02 != null) {
                bbf_02.dag();
            }
        });
    }

    public boolean AB(int n) {
        if (this.hAQ.Su(n)) {
            return false;
        }
        bbf_0 bbf_02 = bbl_0.hBr.AH(n);
        if (bbf_02 == null || !this.hAQ.Ss(n)) {
            return false;
        }
        bbf_02.dag();
        return true;
    }

    @Override
    public String[] bxk() {
        return hAM;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hAI)) {
            String string2 = this.hAO.gvA() != null ? (String)this.hAO.gvA() : "";
            List<bbf_0> list = bbl_0.hBr.lo(string2);
            for (bbf_0 bbf_02 : list) {
                bbf_02.fj(this.hAQ.Su(bbf_02.d()));
            }
            return list;
        }
        if (string.equals(hAJ)) {
            String string3 = this.hAO.gvA() != null ? (String)this.hAO.gvA() : "";
            List<bbf_0> list = bbl_0.hBr.ln(string3);
            for (bbf_0 bbf_03 : list) {
                bbf_03.fj(this.hAQ.Su(bbf_03.d()));
            }
            return list;
        }
        if (string.equals(hAL)) {
            return this.hAN.values();
        }
        if (hAK.equals(string)) {
            return this.hAO;
        }
        return null;
    }

    public boolean a(int n, bbg_0 bbg_02) {
        bbi_0 bbi_02 = (bbi_0)this.hAN.get(n);
        if (bbi_02 != null) {
            return this.AC(n);
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bbf_0 bbf_02 = bbl_0.hBr.AH(n);
        if (!bgt_02.a(evv_1.oxf)) {
            return false;
        }
        if (bbf_02.bdo() != null && !bbf_02.bdo().b(bgt_02, bgt_02.aZw(), bbf_02, bgt_02.bdV())) {
            aPd.e("emote.error.requirements", new Object[0]);
            return false;
        }
        if (bbf_02.cnd()) {
            bbj_0.hBi.b(bbf_02, bbg_02);
            return true;
        }
        if (this.a(bbf_02, bbg_02)) {
            bbg_02.a(bbf_02, -1L);
            return true;
        }
        return false;
    }

    private boolean AC(int n) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return false;
        }
        VI vI = VI.pX(n);
        if (vI == null) {
            return false;
        }
        daw daw2 = new daw();
        daw2.co(vI.bkH());
        aaw_1.bUq().h(daw2);
        return true;
    }

    public boolean AD(int n) {
        return this.hAQ.Su(n);
    }

    public boolean a(bbf_0 bbf_02, bbg_0 bbg_02) {
        int n = bbf_02.d();
        if (bbg_02.daj() && !this.hAQ.Su(n)) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02 != null && (!bkb_02.dsi() || bbf_02.cne() || bbf_02.cnd())) {
            return false;
        }
        bdj_2 bdj_22 = bgt_02.ddI();
        if (bdj_22.bvF() != null) {
            return false;
        }
        if (bdj_22.bvW()) {
            aPd.e("error.action.impossible.swimming", new Object[0]);
            return false;
        }
        return true;
    }

    public bbi_0 AE(int n) {
        return bbl_0.hBr.AF(n);
    }
}

