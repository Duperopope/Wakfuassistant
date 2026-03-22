/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntFloatHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntFloatHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class eyo {
    private static final Logger piD = Logger.getLogger(eyo.class);
    public static final eyo piE = new eyo(eyD.pjX);
    private final int piF;
    private final float[] piG = new float[eyq.values().length];
    private final byte[] piH;
    private final short[] piI;
    private eyD piJ = eyD.pjX;
    private final ewz_2 piK = new ewz_2();
    private final TIntFloatHashMap piL = new TIntFloatHashMap();
    private int[] piM = Bv.auu;
    private short[] ehy = Bv.auw;
    private List<eyA> piN = Collections.emptyList();
    private short ehz = 1;

    public eyo(int n, float[] fArray, byte[] byArray, short[] sArray) {
        this.piF = n;
        this.piH = byArray;
        if (this.piG.length == fArray.length) {
            System.arraycopy(fArray, 0, this.piG, 0, this.piG.length);
        }
        if (sArray.length % 3 == 0) {
            this.piI = sArray;
        } else {
            piD.error((Object)"INITIALISATION ERROR : the natural states array is not well built (%3 != 0 : all entries are not a stateId/level pair) sur une avatarBreed");
            this.piI = null;
        }
    }

    public eyo(eyD eyD2) {
        this(46, new float[]{1.0f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f}, Bv.auq, Bv.auw);
        this.piJ = eyD2;
    }

    void d(HashMap<Byte, Float> hashMap) {
        for (Map.Entry<Byte, Float> entry : hashMap.entrySet()) {
            Byte by = entry.getKey();
            this.piL.put((int)by.byteValue(), entry.getValue().floatValue());
        }
        this.piJ = new eyF(hashMap);
    }

    int k(exx_2 exx_22) {
        return this.piK.i(exx_22);
    }

    public float a(eyq eyq2) {
        return this.piG[eyq2.ordinal()];
    }

    public int fhJ() {
        return this.piK.i(exx_2.rGs);
    }

    public eSM fhK() {
        return eTo.fIZ().iU(this.piF);
    }

    int a(int n, exx_2 exx_22) {
        int n2 = this.piK.i(exx_22);
        float f2 = this.piL.get((int)exx_22.aJr());
        return n2 + (int)Math.floor((float)n * f2);
    }

    eyD fhV() {
        return this.piJ;
    }

    private eNd eC(byte by) {
        assert (by >= 0 && by < this.piH.length) : "Index de spellElement invalide";
        return eNd.ff(this.piH[by]);
    }

    public boolean i(eNd eNd2) {
        for (int i = 0; i < this.piH.length; ++i) {
            if (this.piH[i] != eNd2.aJr()) continue;
            return true;
        }
        return false;
    }

    public void C(TObjectProcedure<eNd> tObjectProcedure) {
        for (int i = 0; i < this.piH.length; ++i) {
            eNd eNd2 = this.eC((byte)i);
            if (tObjectProcedure.execute((Object)eNd2)) continue;
            return;
        }
    }

    public void a(exx_2 exx_22, int n) {
        this.piK.a(exx_22, n);
    }

    public short[] ckM() {
        return this.piI;
    }

    public int[] fia() {
        return this.piM;
    }

    public void J(int ... nArray) {
        this.piM = nArray;
    }

    public short[] ckO() {
        return this.ehy;
    }

    public List<eyA> fhU() {
        return Collections.unmodifiableList(this.piN);
    }

    public void o(short ... sArray) {
        this.ehy = sArray;
        this.piN = new ArrayList<eyA>(sArray.length);
        for (int i = 0; i < sArray.length; ++i) {
            if (sArray[i] < 3) continue;
            eyA.OY(i).ifPresent(this.piN::add);
        }
    }

    public short ckP() {
        return this.ehz;
    }

    public void do(short s) {
        this.ehz = s;
    }
}

