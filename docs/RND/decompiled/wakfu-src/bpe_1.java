/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.EnumMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpE
 */
public class bpe_1
extends bpb_1
implements bek_0,
fgf_0 {
    public static final String iWU = "acquisitions";
    public static final String[] iWV = new String[]{"id", "name", "acquisitions"};
    @NotNull
    private final bgv_2 iWW;
    private final Map<fja, Integer> iWX;
    private final bpd_1[] iWY;
    @Nullable
    private ffV iWZ;

    public bpe_1(@NotNull bgv_2 bgv_22) {
        this.iWW = bgv_22;
        this.iWX = bpe_1.l(bgv_22);
        this.iWY = bpe_1.dDs();
    }

    @NotNull
    private static bpd_1[] dDs() {
        bpd_1[] bpd_1Array = new bpd_1[bpr_0.iYm];
        for (bpr_0 bpr_02 : bpr_0.iYl) {
            bpd_1Array[bpr_02.wp()] = new bpd_1(bpr_02);
        }
        return bpd_1Array;
    }

    public void a(bpr_0 bpr_02) {
        this.iWY[bpr_02.wp()].bVd();
    }

    private static Map<fja, Integer> l(@NotNull bgv_2 bgv_22) {
        short s = bpe_1.m(bgv_22);
        EnumMap<fja, Integer> enumMap = new EnumMap<fja, Integer>(fja.class);
        for (enk_0 enk_02 : bgv_22.bcx()) {
            Map<Integer, Integer> map = fja.Wr(enk_02.avZ());
            if (map == null && (map = ffo_0.B(enk_02)) == null) continue;
            int n = ffo_0.d(enk_02, s);
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int n2 = entry.getKey();
                fja fja2 = fja.Wp(n2);
                int n3 = entry.getValue();
                int n4 = n3 * n + enumMap.getOrDefault((Object)fja2, 0);
                if (n4 == 0) continue;
                enumMap.put(fja2, n4);
            }
            if (enk_02.avZ() == enf_0.qPQ.d()) {
                for (fja fja3 : fja.swb) {
                    enumMap.merge(fja3, n, Integer::sum);
                }
                continue;
            }
            if (enk_02.avZ() != enf_0.qPR.d()) continue;
            for (fja fja4 : fja.swc) {
                enumMap.merge(fja4, n, Integer::sum);
            }
        }
        return enumMap;
    }

    private static short m(@NotNull bgv_2 bgv_22) {
        fov_0 fov_02 = foy_0.sLJ.XQ(bgv_22.d());
        if (fov_02 != null) {
            return fov_02.aVe();
        }
        fim_0 fim_02 = fin_0.srJ.VL(bgv_22.fYx());
        if (fim_02 != null) {
            return fir_0.c(fim_02).aVe();
        }
        return 0;
    }

    public int a(@NotNull fja fja2) {
        return this.iWX.getOrDefault((Object)fja2, 0);
    }

    @Override
    public int d() {
        return this.iWW.d();
    }

    @Override
    public String dDp() {
        return this.iWW.getName();
    }

    @Override
    public String a(Mt mt, Mv mv) {
        return mt.a(mv, 15, this.iWW.d(), new Object[0]);
    }

    @Override
    public String dDq() {
        return bEm.dSb().Gq(this.iWW.d());
    }

    @Override
    public short aVf() {
        return this.iWW.cmL();
    }

    @Override
    public short aVe() {
        return this.iWW.cmL();
    }

    public boolean b(@NotNull bpr_0 bpr_02) {
        return this.iWY[bpr_02.wp()].isEnabled();
    }

    @Override
    @Nullable
    public Object eu(String string) {
        Object object = switch (string) {
            case iWU -> this.iWY;
            default -> super.eu(string);
        };
        return object != null ? object : this.iWW.eu(string);
    }

    public int dDt() {
        return this.iWW.dwg().fWK();
    }

    @Override
    public String[] bxk() {
        return iWV;
    }

    @Override
    public ffV getItem() {
        Object object;
        if (this.iWZ != null) {
            return this.iWZ;
        }
        this.iWZ = ffV.k(this.iWW);
        if (this.iWZ.adO()) {
            object = this.iWZ.ead().geL();
            ((fnr_0)this.iWZ.ead()).lQ(object.csH() * object.aVe());
        }
        if (this.iWZ.pe()) {
            object = this.iWZ.fVV().dnH();
            ((fir_0)this.iWZ.fVV()).ij(object.aVj());
        }
        return this.iWZ;
    }

    @Override
    @NotNull
    public bgv_2 duo() {
        return this.iWW;
    }
}

