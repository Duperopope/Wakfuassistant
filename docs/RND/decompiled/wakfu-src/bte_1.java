/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TByteArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TByteArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from btE
 */
abstract class bte_1
implements btd_1 {
    static final Logger jlY = Logger.getLogger(bte_1.class);
    private final btl_1 jlZ = new btl_1();
    @NotNull
    final bsS jma;
    @NotNull
    final bgt_0 jmb;
    Byte jmc;
    bgy jmd;
    boolean jme = false;
    private boolean jmf;
    private static final int jmg = 20;
    private boolean jmh;

    bte_1(@NotNull bsS bsS2, @NotNull bgt_0 bgt_02) {
        this.jma = bsS2;
        this.jmb = bgt_02;
    }

    @Override
    public final euf_0 dHT() {
        euf_0 euf_02 = this.dId();
        if (euf_02 != euf_0.rxi) {
            return euf_02;
        }
        euf_0 euf_03 = this.dIc();
        if (euf_03 != euf_0.rxi) {
            return euf_03;
        }
        return this.dHS();
    }

    @Override
    public final euf_0 dHU() {
        this.jme = true;
        try {
            euf_0 euf_02 = this.dHT();
            return euf_02;
        }
        finally {
            this.jme = false;
        }
    }

    @Override
    public final void dHV() {
        this.jmf = true;
    }

    abstract euf_0 dHS();

    void by(@NotNull bgy bgy2) {
        this.jmd = bgy2;
        if (this.jmc == null) {
            this.jmc = this.jmd.bcP();
        }
    }

    euf_0 dHX() {
        btf_1 btf_12;
        euf_0 euf_02 = this.jlZ.a(this.jma, this.jmc).dIg();
        if (euf_02 != euf_0.rxi) {
            return euf_02;
        }
        euf_0 euf_03 = this.dIe();
        if (euf_03 != euf_0.rxi) {
            return euf_03;
        }
        if (!this.jmf && (btf_12 = new btf_1(this)).dIf()) {
            this.jmh = true;
            return euf_0.rxi;
        }
        return this.dHZ();
    }

    euf_0 dHY() {
        euf_0 euf_02 = this.dIa();
        if (euf_02 != euf_0.rxi) {
            return euf_02;
        }
        return this.dIb();
    }

    private euf_0 dHZ() {
        if (!this.jme) {
            boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljb);
            ckt ckt2 = new ckt(this.jmd.Sn(), bl);
            aue_0.cVJ().etu().d(ckt2);
        }
        return euf_0.rxi;
    }

    private euf_0 dIa() {
        TByteArrayList tByteArrayList = new TByteArrayList();
        for (byte by = 0; by < this.jma.dGo().fJZ(); by = (byte)(by + 1)) {
            if (this.jlZ.a(this.jma, by).dIg() != euf_0.rxi || tByteArrayList.contains(by)) continue;
            tByteArrayList.add(by);
        }
        if (tByteArrayList.size() != 1) {
            return euf_0.rxO;
        }
        this.jmc = tByteArrayList.getQuick(0);
        return euf_0.rxi;
    }

    private euf_0 dIb() {
        Collection collection = this.jma.dGs();
        for (bgy bgy2 : collection) {
            if (bgy2.bcP() != this.jmc.byteValue()) continue;
            this.jmd = bgy2;
            euf_0 euf_02 = this.dHX();
            if (euf_02 != euf_0.rxi) continue;
            return euf_02;
        }
        return euf_0.rxO;
    }

    private euf_0 dIc() {
        if (this.jmb.djT()) {
            return euf_0.rxj;
        }
        if (this.jmb.b(ezj_0.psx) > 0) {
            return euf_0.rxs;
        }
        if (this.jmb.dnj()) {
            return euf_0.rxN;
        }
        if (bsl_0.jfZ.dFs()) {
            return euf_0.rxL;
        }
        if (aue_0.cVJ().cVK().dnC()) {
            return euf_0.rxM;
        }
        if (this.jma instanceof bsi_0 && this.jma.dGo() == eUw.rva) {
            bsi_0 bsi_02 = (bsi_0)this.jma;
            bgy bgy2 = bsi_02.dGB();
            bgy bgy3 = bsi_02.dGC();
            if (!(bgy2 instanceof bhJ) || !(bgy3 instanceof bhJ)) {
                return euf_0.rxH;
            }
            fpu_0 fpu_02 = this.jmb.dkC();
            fpu_0 fpu_03 = bgy2.dkC();
            fpu_0 fpu_04 = bgy3.dkC();
            if (fpu_03 != fpu_0.sRd && fpu_04 != fpu_0.sRd && fpu_02 == fpu_0.sRd) {
                return euf_0.rxE;
            }
        }
        return euf_0.rxi;
    }

    private euf_0 dId() {
        etw_0 etw_02 = this.jma.dGp();
        if (etw_02 != etw_0.rqT && etw_02 != etw_0.rqV) {
            return euf_0.rxy;
        }
        return euf_0.rxi;
    }

    private euf_0 dIe() {
        if (!this.jmd.djT()) {
            return euf_0.rxv;
        }
        if (this.jmd.b(ezj_0.psB) > 0) {
            return euf_0.rxu;
        }
        int n = this.Fv(20);
        if (n != 0) {
            return euf_0.rxK;
        }
        return euf_0.rxi;
    }

    private int Fv(int n) {
        bdj_2 bdj_22 = this.jmb.ddI();
        int n2 = bdj_22.bvI();
        int n3 = bdj_22.bvJ();
        short s = bdj_22.bvK();
        int n4 = this.jmd.bcC();
        int n5 = this.jmd.bcD();
        short s2 = this.jmd.bcE();
        st_0 st_02 = new st_0();
        st_02.bqN = n * n;
        st_02.bqR = true;
        st_02.bqM = false;
        st_02.bqY = false;
        st_02.bqZ = false;
        st_02.bra = false;
        wz_0 wz_02 = new wz_0();
        wa_0.a(n2, n3, n4, n5, wz_02);
        sr_0 sr_02 = sr_0.bgd();
        sr_02.p(n2, n3, s);
        sr_02.q(n4, n5, s2);
        sr_02.a((int)bdj_22.aKu(), bdj_22.bcO(), bdj_22.bvy());
        sr_02.a(st_02);
        sr_02.b(wz_02);
        int n6 = sr_02.bgj();
        sr_02.aZp();
        if (n6 == -1) {
            return 1026;
        }
        if (n6 >= n) {
            return 1042;
        }
        return 0;
    }

    @Override
    public boolean dHW() {
        return this.jmh;
    }
}

