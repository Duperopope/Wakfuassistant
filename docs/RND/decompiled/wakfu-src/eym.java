/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;

public final class eym
extends Enum<eym>
implements eyp {
    public static final /* enum */ eym phU = new eym(-2);
    public static final /* enum */ eym phV = new eym(-1);
    public static final /* enum */ eym phW = new eym(1);
    public static final /* enum */ eym phX = new eym(2);
    public static final /* enum */ eym phY = new eym(3);
    public static final /* enum */ eym phZ = new eym(4);
    public static final /* enum */ eym pia = new eym(5);
    public static final /* enum */ eym pib = new eym(6);
    public static final /* enum */ eym pic = new eym(7);
    public static final /* enum */ eym pid = new eym(8);
    public static final /* enum */ eym pie = new eym(9);
    public static final /* enum */ eym pif = new eym(10);
    public static final /* enum */ eym pig = new eym(11);
    public static final /* enum */ eym pih = new eym(12);
    public static final /* enum */ eym pii = new eym(13);
    public static final /* enum */ eym pij = new eym(14);
    public static final /* enum */ eym pik = new eym(15);
    public static final /* enum */ eym pil = new eym(16);
    public static final /* enum */ eym pim = new eym(17);
    public static final /* enum */ eym pin = new eym(18);
    public static final /* enum */ eym pio = new eym(19);
    private static final int pip = -1;
    public static final int piq = 6;
    public static final int pir = 0;
    private static final Logger pis;
    private final short pit;
    private eyo piu;
    private static final /* synthetic */ eym[] piv;

    public static eym[] values() {
        return (eym[])piv.clone();
    }

    public static eym valueOf(String string) {
        return Enum.valueOf(eym.class, string);
    }

    private eym(int n2) {
        this.pit = (short)n2;
        this.piu = eyo.piE;
    }

    public List<eyA> fhU() {
        return this.piu != null ? this.piu.fhU() : Collections.emptyList();
    }

    @Override
    public short[] drx() {
        return this.piu != null ? this.piu.ckO() : Bv.auw;
    }

    public int[] ckN() {
        return this.piu != null ? this.piu.fia() : Bv.auu;
    }

    public short ckP() {
        return this.piu != null ? this.piu.ckP() : (short)1;
    }

    public static eym OR(int n) {
        for (eym eym2 : eym.values()) {
            if (eym2.aWP() != n) continue;
            return eym2;
        }
        return phV;
    }

    public boolean isInitialized() {
        return this.piu != null;
    }

    public static eym rN(String string) {
        String string2 = string.toUpperCase();
        for (eym eym2 : eym.values()) {
            if (!eym2.toString().equals(string2)) continue;
            return eym2;
        }
        pis.warn((Object)("breed inconnue " + string2), (Throwable)new Exception(""));
        return phV;
    }

    public void a(eyo eyo2) {
        this.piu = eyo2;
    }

    public String toString() {
        return this.name();
    }

    @Override
    public short aWP() {
        return this.pit;
    }

    @Override
    public int cqy() {
        return -1;
    }

    @Override
    public int k(exx_2 exx_22) {
        return this.piu.k(exx_22);
    }

    @Override
    public float a(eyq eyq2) {
        return this.piu.a(eyq2);
    }

    @Override
    public int fhJ() {
        return this.piu.fhJ();
    }

    @Override
    public eSM fhK() {
        return this.piu.fhK();
    }

    @Override
    public int[] fhN() {
        return Bv.auu;
    }

    @Override
    public int[] fhO() {
        return Bv.auu;
    }

    @Override
    public byte bcN() {
        return 6;
    }

    @Override
    public byte bcO() {
        return 0;
    }

    @Override
    public int bvM() {
        return 0;
    }

    @Override
    public int fhQ() {
        return 0;
    }

    @Override
    public sm_0 bvR() {
        return sm_0.bpt;
    }

    @Override
    public sm_0 bvP() {
        return sm_0.bps;
    }

    @Override
    public int csf() {
        throw new UnsupportedOperationException("Pas de script de mort pour les perso joueurs");
    }

    @Override
    public int a(int n, exx_2 exx_22) {
        return this.piu.a(n, exx_22);
    }

    public eyD fhV() {
        return this.piu.fhV();
    }

    public void d(HashMap<Byte, Float> hashMap) {
        this.piu.d(hashMap);
    }

    public void C(TObjectProcedure<eNd> tObjectProcedure) {
        this.piu.C(tObjectProcedure);
    }

    public boolean i(eNd eNd2) {
        return this.piu.i(eNd2);
    }

    public String aXA() {
        return Short.toString(this.aWP());
    }

    public void a(exx_2 exx_22, int n) {
        this.piu.a(exx_22, n);
    }

    @Override
    public short[] ckM() {
        return this.piu.ckM();
    }

    private static /* synthetic */ eym[] fhW() {
        return new eym[]{phU, phV, phW, phX, phY, phZ, pia, pib, pic, pid, pie, pif, pig, pih, pii, pij, pik, pil, pim, pin, pio};
    }

    static {
        piv = eym.fhW();
        pis = Logger.getLogger(eym.class);
    }
}

