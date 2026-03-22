/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public class aMS
implements aqz_2 {
    protected int o;
    protected short elD;
    protected short aXk;
    protected int bap;
    protected int baq;
    protected short ban;
    protected short bat;
    protected boolean bau;
    protected boolean bav;
    protected boolean baw;
    protected boolean bax;
    protected byte bay;
    protected short baz;
    protected String baB;
    protected int baC;
    protected int[] baD;
    protected aMT[] elE;
    protected HashMap<Short, Integer> elF;
    protected int[] cjr;

    public int d() {
        return this.o;
    }

    public short coV() {
        return this.elD;
    }

    public short bdL() {
        return this.aXk;
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public short bdi() {
        return this.ban;
    }

    public short coW() {
        return this.bat;
    }

    public boolean coX() {
        return this.bau;
    }

    public boolean coY() {
        return this.bav;
    }

    public boolean bcS() {
        return this.baw;
    }

    public boolean coZ() {
        return this.bax;
    }

    public byte coI() {
        return this.bay;
    }

    public short bei() {
        return this.baz;
    }

    public String cpa() {
        return this.baB;
    }

    public int cor() {
        return this.baC;
    }

    public int[] ckm() {
        return this.baD;
    }

    public aMT[] cpb() {
        return this.elE;
    }

    public HashMap<Short, Integer> cpc() {
        return this.elF;
    }

    public int[] cpd() {
        return this.cjr;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.elD = 0;
        this.aXk = 0;
        this.bap = 0;
        this.baq = 0;
        this.ban = 0;
        this.bat = 0;
        this.bau = false;
        this.bav = false;
        this.baw = false;
        this.bax = false;
        this.bay = 0;
        this.baz = 0;
        this.baB = null;
        this.baC = 0;
        this.baD = null;
        this.elE = null;
        this.elF = null;
        this.cjr = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.elD = aqh_12.bGG();
        this.aXk = aqh_12.bGG();
        this.bap = aqh_12.bGI();
        this.baq = aqh_12.bGI();
        this.ban = aqh_12.bGG();
        this.bat = aqh_12.bGG();
        this.bau = aqh_12.bxv();
        this.bav = aqh_12.bxv();
        this.baw = aqh_12.bxv();
        this.bax = aqh_12.bxv();
        this.bay = aqh_12.aTf();
        this.baz = aqh_12.bGG();
        this.baB = aqh_12.bGL().intern();
        this.baC = aqh_12.bGI();
        this.baD = aqh_12.bGM();
        int n2 = aqh_12.bGI();
        this.elE = new aMT[n2];
        for (n = 0; n < n2; ++n) {
            this.elE[n] = new aMT();
            this.elE[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.elF = new HashMap(n);
        for (int i = 0; i < n; ++i) {
            short s = aqh_12.bGG();
            int n3 = aqh_12.bGI();
            this.elF.put(s, n3);
        }
        this.cjr = aqh_12.bGM();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAL.d();
    }
}

