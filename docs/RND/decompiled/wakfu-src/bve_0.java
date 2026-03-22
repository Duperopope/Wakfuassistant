/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bvE
 */
public class bve_0 {
    private static final Logger juD = Logger.getLogger(bve_0.class);
    private static final bve_0 juE = new bve_0();
    private static final String[] juF = (String[])ArrayUtils.addAll((Object[])ary_2.fT("JAMBE"), (Object[])ary_2.fT("PIED"));
    public static final float juG = 0.7f;
    public static final float juH = -6.0f;
    public static final float juI = 2.0f;
    public static final float juJ = -0.5f;
    public static final int juK = -3;
    public static final float juL = 2.0f;
    public static final float juM = 0.3f;
    public static final int juN = -1;
    public static final float juO = 2.0f;
    static long juP = Long.MIN_VALUE;
    private static final long juQ = arn_2.fX("CharacterImage-Default");
    final aaq_1<ArrayList<bvg_0>> juR = new aaq_1();
    final aap_1 juS = new aap_1();
    private static final int[] juT = new int[]{1036, 1037, 1038, 1039, 1040};
    private static final int[] juU = new int[]{1007, 1011, 1051};
    private static final int[] juV = new int[0];

    private bve_0() {
    }

    public static bve_0 dKK() {
        return juE;
    }

    public void a(long l, bvg_0 bvg_02) {
        ArrayList<bvg_0> arrayList = this.juR.hd(l);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.juR.a(l, arrayList);
        }
        if (!arrayList.contains(bvg_02)) {
            arrayList.add(bvg_02);
        }
    }

    public void b(long l, bvg_0 bvg_02) {
        ArrayList<bvg_0> arrayList = this.juR.hd(l);
        if (arrayList == null) {
            return;
        }
        arrayList.remove(bvg_02);
        if (arrayList.isEmpty()) {
            this.juR.hc(l);
        }
    }

    public awk_1 kM(long l) {
        return this.i(l, false);
    }

    @Nullable
    public awk_1 i(long l, boolean bl) {
        Object object;
        if (!bl && this.juS.gR(l) && (object = awm_1.bPn().gB(this.juS.hb(l))) != null) {
            return object;
        }
        object = bvz_0.ju(l);
        if (object == null) {
            awk_1 awk_12 = awm_1.bPn().gB(juQ);
            if (awk_12 != null) {
                return awk_12;
            }
            String string = auc_0.cVq().a("defaultSmallMonsterIllustrationPath", "defaultIconPath", new Object[0]);
            return awm_1.bPn().b((art_1)aru_2.cVG.bIv(), juQ, string, false);
        }
        bve_0.a(((bgy)object).ddI(), new bvf_0(this, l));
        return null;
    }

    private static void a(ZC zC, aeL aeL2) {
        float f2 = 0.7f;
        float f3 = -6.0f;
        float f4 = 2.0f;
        int n = Bw.m(zC.aXE());
        if (Arrays.binarySearch(juT, n) >= 0) {
            f2 = -0.5f;
            f3 = -3.0f;
            f4 = 2.0f;
        }
        if (Arrays.binarySearch(juU, n) >= 0) {
            f2 = 0.3f;
            f3 = -1.0f;
            f4 = 2.0f;
        }
        bve_0.a(zC, (byte)1, aeL2, new bvn_0(f4, f2, f3), juF);
    }

    public static void a(ZC zC, byte by, aeL aeL2, aeM aeM2, String ... stringArray) {
        aeJ aeJ2 = new aeJ(aie_0.cfn().bmE(), aeM2);
        String string = Arrays.binarySearch(juV, Bw.m(zC.aXE())) >= 0 ? by + "_AnimStatique-HorsCombat" : by + "_AnimStatique";
        aro_1 aro_12 = zC.bqd();
        if (aro_12 == null) {
            Object object;
            String string2 = "";
            if (zC instanceof bdj_2) {
                object = ((bdj_2)zC).dcP();
                string2 = ((bgy)object).toString();
            }
            juD.error((Object)("Null anm while generating image for actor " + zC.Sn() + " / " + string2));
            object = zC.aXE();
            ((bdj_2)zC).B((String)object, true);
            aro_12 = zC.bqd();
            if (aro_12 == null) {
                return;
            }
        }
        aeJ2.a(aro_12, string, stringArray);
        aeJ2.a("png", aeL2);
    }

    public void kN(long l) {
        if (this.juR.gR(l)) {
            this.i(l, true);
        }
    }
}

