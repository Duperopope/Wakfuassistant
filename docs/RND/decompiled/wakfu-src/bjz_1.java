/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TByteIntHashMap;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Objects;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bjz
 */
public class bjz_1
extends eyi<bmv_2>
implements ejl_0 {
    public static final bjz_1 ioB = new bjz_1(-2, 0, false, 0, 0, new EnumMap<exx_2, azx_1<Integer, Float>>(exx_2.class), 0, 0, new int[0], new int[0], new int[0], 0, new short[0], 0, 0, 0, 0, 30000, sm_0.bpt, sm_0.bps, 5, 0, frz_0.taJ, 1.0f, new fiN().gae());
    private static final Logger ioC = Logger.getLogger(bjz_1.class);
    private final boolean ioD;
    private final int ioE;
    private final int ioF;
    private final byte ioG;
    private final TByteIntHashMap ioH;
    private final ArrayList<azr_1<bmt_0>> ioI = new ArrayList();
    private final eyy ioJ;
    private final float ioK;
    private final fhw ioL;
    private bjf_2 ioM;
    private final ArrayList<bjo_2> ioN = new ArrayList();
    private String eoF;

    public bjz_1(short s, int n, boolean bl, short s2, short s3, EnumMap<exx_2, azx_1<Integer, Float>> enumMap, int n2, int n3, int[] nArray, int[] nArray2, int[] nArray3, int n4, short[] sArray, short s4, short s5, byte by, byte by2, int n5, sm_0 sm_02, sm_0 sm_03, int n6, int n7, frz_0 frz_02, float f2, fhw fhw2) {
        super(s, n, s2, s3, enumMap, nArray2, nArray, sArray, s4, s5, by, n5, sm_02, sm_03, n6, n7, frz_02);
        this.ioE = n2;
        this.ioF = n3;
        if (!bdh_1.BC(this.ioE) && nArray3 != null && nArray3.length != 0) {
            if (nArray3.length % 2 != 0) {
                ioC.error((Object)" le tableau d'\u00e9quippement doit contenir des paires Id / Nombre");
            }
            this.ioH = new TByteIntHashMap(nArray3.length / 2);
            for (int i = 0; i < nArray3.length; i += 2) {
                this.ioH.put((byte)nArray3[i + 2], nArray3[i]);
            }
        } else {
            this.ioH = null;
            if (bdh_1.BC(this.ioE) && nArray3 != null && nArray3.length != 0) {
                ioC.error((Object)("ON TENTE DE METTRE DES EQUIPEMENTS (VISUEL) SUR UN GFX DE TYPE MONSTER (>1000), monsterId=" + s));
            }
        }
        this.ioG = (byte)n4;
        this.ioD = bl;
        this.ioJ = eyy.eE(by2);
        this.ioK = f2;
        this.ioL = fhw2;
    }

    public boolean crI() {
        return this.ioD;
    }

    public int aGs() {
        return this.ioE;
    }

    public int csk() {
        return this.ioF;
    }

    @Override
    public byte bcN() {
        return this.ioG;
    }

    @Override
    public short[] drx() {
        return Bv.auw;
    }

    @Nullable
    public TByteIntHashMap dkE() {
        return this.ioH;
    }

    public String getName() {
        return bjz_1.Dm(this.aWP());
    }

    public static String Dm(int n) {
        if (n == ioB.aWP()) {
            return "";
        }
        if (!bjz_1.Do(n)) {
            return "";
        }
        return aum_0.cWf().a(7, (long)n, new Object[0]);
    }

    public String dah() {
        return bjz_1.Dn(this.aWP());
    }

    public static String Dn(int n) {
        if (n == ioB.aWP()) {
            return "";
        }
        if (!bjz_1.Do(n)) {
            return "";
        }
        return aum_0.cWf().b(7, (long)n, new Object[0]);
    }

    public boolean wq() {
        return bjz_1.Do(this.aWP());
    }

    public static boolean Do(int n) {
        return aum_0.cWf().e(7, n);
    }

    public ArrayList<azr_1<bmt_0>> dry() {
        return this.ioI;
    }

    public boolean Dp(int n) {
        return !this.ioI.isEmpty();
    }

    public void ds(int n, int n2) {
        bmt_0 bmt_02 = bmb_0.eeV().If(n);
        if (bmt_02 != null) {
            this.ioI.add(new azr_1<bmt_0>(n2, bmt_02));
        }
    }

    @Override
    public void a(bjo_2 bjo_22) {
        this.ioN.add(bjo_22);
    }

    public ArrayList<bjo_2> aGT() {
        return this.ioN;
    }

    @Nullable
    public bjo_2 jT(long l) {
        for (int i = 0; i < this.ioN.size(); ++i) {
            bjo_2 bjo_22 = this.ioN.get(i);
            if (bjo_22.Sn() != l) continue;
            return bjo_22;
        }
        return null;
    }

    public eyy drz() {
        return this.ioJ;
    }

    public bjf_2 drA() {
        return this.ioM;
    }

    public void b(bjf_2 bjf_22) {
        this.ioM = bjf_22;
    }

    public String csl() {
        return this.eoF;
    }

    public void lN(@NotNull String string) {
        this.eoF = Objects.requireNonNull(string);
    }

    @Override
    public void Dq(int n) {
        super.Dq(n);
    }

    public float drB() {
        return this.ioK;
    }

    public fhw drC() {
        return this.ioL;
    }

    public boolean drD() {
        return bjz_1.Dr(this.cqy());
    }

    public static boolean Dr(int n) {
        return aum_0.cWf().e(38, n);
    }

    @NotNull
    public String drE() {
        return bjz_1.Ds(this.cqy());
    }

    @NotNull
    public String drF() {
        return bjz_1.Dt(this.cqy());
    }

    @NotNull
    public static String Ds(int n) {
        if (!bjz_1.Dr(n)) {
            return "";
        }
        return aum_0.cWf().a(38, (long)n, new Object[0]);
    }

    @NotNull
    public static String Dt(int n) {
        if (!bjz_1.Dr(n)) {
            return "";
        }
        return aum_0.cWf().b(38, (long)n, new Object[0]);
    }

    @Override
    @Nullable
    public ejm_0 drG() {
        return ejm_0.qyX;
    }

    @Override
    @Nullable
    public Object drH() {
        return this.aWP();
    }

    @Override
    public String drI() {
        return this.getName();
    }
}

