/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.EnumMap;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public abstract class eyi<TCollect extends eKO>
implements eyp {
    private static final Logger phv = Logger.getLogger(eyi.class);
    public static final byte phw = 6;
    private static final TIntObjectHashMap phx = new TIntObjectHashMap();
    protected final exd_2 phy;
    private final short phz;
    private final int phA;
    private final short phB;
    private final short phC;
    private TIntObjectHashMap<TCollect> phD;
    private final int[] phE;
    private final int[] phF;
    private final short phG;
    private final short phH;
    private final byte phI;
    private final short[] phJ;
    private final int phK;
    private final sm_0 phL;
    private final sm_0 phM;
    private final int phN;
    private final int phO;
    private int eou = 1;
    private int[] phP;
    private int eow;

    protected eyi(short s, int n, short s2, short s3, EnumMap<exx_2, azx_1<Integer, Float>> enumMap, int[] nArray, int[] nArray2, short[] sArray, short s4, short s5, byte by, int n2, sm_0 sm_02, sm_0 sm_03, int n3, int n4, frz_0 frz_02) {
        this.phz = s;
        this.phA = n;
        this.phB = s2;
        this.phC = s3;
        this.phG = s4;
        this.phH = s5;
        this.phI = by;
        this.phy = new exd_2(this.phB);
        for (Map.Entry<exx_2, azx_1<Integer, Float>> entry : enumMap.entrySet()) {
            azx_1<Integer, Float> azx_12 = entry.getValue();
            this.phy.a(entry.getKey(), azx_12.getFirst(), azx_12.aHI().floatValue());
        }
        this.phF = nArray;
        this.phE = nArray2;
        if (sArray.length % 3 == 0) {
            this.phJ = sArray;
        } else {
            phv.error((Object)("INITIALISATION ERROR : the natural states array is not well built (%3 != 0 : all entries are not a stateId/level pair) sur la breed " + s));
            this.phJ = null;
        }
        this.phK = n2;
        this.phL = sm_02;
        this.phM = sm_03;
        this.phN = n3;
        this.phO = n4;
    }

    @Override
    public int k(exx_2 exx_22) {
        return this.phy.i(exx_22);
    }

    @Override
    public int fhJ() {
        return this.phy.i(exx_2.rGs);
    }

    @Override
    public eSM fhK() {
        return null;
    }

    @Override
    public float a(eyq eyq2) {
        return 1.0f;
    }

    @Override
    public byte bcN() {
        return 6;
    }

    @Override
    public int a(int n, exx_2 exx_22) {
        return this.phy.b(exx_22, n);
    }

    public void a(TCollect TCollect) {
        if (this.phD == null) {
            this.phD = new TIntObjectHashMap();
        }
        this.phD.put(((eKO)TCollect).d(), TCollect);
    }

    @Nullable
    public TCollect OP(int n) {
        return (TCollect)(this.phD == null ? null : (eKO)this.phD.get(n));
    }

    public TIntObjectIterator<TCollect> fhL() {
        return this.phD == null ? phx.iterator() : this.phD.iterator();
    }

    public int[] fhM() {
        return this.phD == null ? ArrayUtils.EMPTY_INT_ARRAY : this.phD.keys();
    }

    @Override
    public int[] fhN() {
        return this.phF;
    }

    @Override
    public int[] fhO() {
        return this.phE;
    }

    public boolean c(exe_1 exe_12) {
        for (int n : this.phF) {
            if (n != exe_12.aJr()) continue;
            return true;
        }
        return false;
    }

    public boolean c(ezj_0 ezj_02) {
        for (int n : this.phE) {
            if (n != ezj_02.aJr()) continue;
            return true;
        }
        return false;
    }

    @Override
    public short aWP() {
        return this.phz;
    }

    @Override
    public int cqy() {
        return this.phA;
    }

    public short cqA() {
        return this.phC;
    }

    public short cqz() {
        return this.phB;
    }

    @Override
    public short[] ckM() {
        return this.phJ;
    }

    public short crL() {
        return this.phH;
    }

    public short doN() {
        return this.phG;
    }

    @Override
    public byte bcO() {
        return this.phI;
    }

    public exd_2 fhP() {
        return this.phy;
    }

    @Override
    public int csf() {
        return this.phK;
    }

    @Override
    public int bvM() {
        return this.phN;
    }

    @Override
    public int fhQ() {
        return this.phO;
    }

    @Override
    public sm_0 bvR() {
        return this.phL;
    }

    @Override
    public sm_0 bvP() {
        return this.phM;
    }

    public int crZ() {
        return this.eou;
    }

    protected void Dq(int n) {
        this.eou = n;
    }

    public int[] fhR() {
        return this.phP;
    }

    public void I(int[] nArray) {
        this.phP = nArray;
    }

    public int csc() {
        return this.eow;
    }

    public void OQ(int n) {
        this.eow = n;
    }

    public String toString() {
        return "AbstractMonsterBreed{m_breedId=" + this.phz + ", m_familyId=" + this.phA + "} ";
    }
}

