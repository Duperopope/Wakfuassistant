/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import org.apache.log4j.Logger;

/*
 * Renamed from fsM
 */
public class fsm_0 {
    private static final Logger tek = Logger.getLogger(fsm_0.class);
    private final faw_0 tel;
    private long tem;
    private int ten;
    private long teo;
    private long kYH;
    private int tep;
    private int teq;
    private int ter;
    private long aDL;
    private final TLongObjectHashMap<fam_0> tes = new TLongObjectHashMap();
    private int mgw;

    public fsm_0(faw_0 faw_02) {
        this.tel = faw_02;
    }

    public fsm_0(fsm_0 fsm_02) {
        this.tel = fsm_02.tel;
        this.tem = fsm_02.tem;
        this.ten = fsm_02.ten;
        this.teo = fsm_02.teo;
        this.kYH = fsm_02.kYH;
        this.tep = fsm_02.tep;
        this.teq = fsm_02.teq;
        this.ter = fsm_02.ter;
        this.mgw = fsm_02.mgw;
        this.aDL = fsm_02.aDL;
        this.tes.putAll(fsm_02.tes);
    }

    public long glp() {
        return this.tem;
    }

    public long glq() {
        return this.teo;
    }

    public long glr() {
        return this.glp() - this.glq();
    }

    public int fRn() {
        return this.ten + this.ter;
    }

    public int gls() {
        return this.tep;
    }

    public int glt() {
        return this.teq;
    }

    public int glu() {
        return this.fRn() - this.gls() - this.glt();
    }

    public int glv() {
        return this.fRn() - this.gls();
    }

    public long Ya() {
        return this.aDL;
    }

    public boolean O(TObjectProcedure<fam_0> tObjectProcedure) {
        return this.tes.forEachValue(tObjectProcedure);
    }

    public void g(faz_0 faz_02) {
        this.a(this.tem, faz_02);
    }

    public void a(long l, faz_0 faz_02) {
        this.tes.clear();
        this.tep = 0;
        this.ter = 0;
        this.teo = 0L;
        this.kYH = 0L;
        this.tem = l;
        this.ten = faz_02.fRn();
        this.mgw = faz_02.eAn();
        this.teo = 0L;
        this.kYH = 0L;
        this.teq = 0;
        faz_02.O((TObjectProcedure<fas_0>)((TObjectProcedure)fas_02 -> {
            far_0 far_02 = this.tel.b((fas_0)fas_02);
            this.tes.put(far_02.ZC(), (Object)far_02);
            this.tep += far_02.erN().fSc();
            return true;
        }));
        this.aDL = faz_02.Ya();
    }

    public void q(fam_0 fam_02) {
        fby_0 fby_02 = fam_02.fRh();
        this.teq += fby_02.fSq();
        this.ter += fby_02.fSd();
        fbk_0 fbk_02 = fam_02.erN();
        fbk_0 fbk_03 = fbo_0.f(fbk_02);
        this.teo += fsl_0.a(fbk_03, this.aDL);
        this.kYH += (long)fsl_0.b(fbk_03, this.aDL);
        this.tes.put(fam_02.ZC(), (Object)fam_02);
    }

    public boolean r(fam_0 fam_02) {
        long l = fam_02.ZC();
        fbk_0 fbk_02 = fam_02.erN();
        if (fam_02.fRa()) {
            fby_0 fby_02 = fam_02.fRh();
            this.teq -= fby_02.fSq();
            this.ter -= fby_02.fSd();
            fbk_0 fbk_03 = fbo_0.f(fbk_02);
            this.teo -= fsl_0.a(fbk_03, this.aDL);
            this.kYH -= (long)fsl_0.b(fbk_03, this.aDL);
        } else if (fbo_0.g(fam_02.erN()) != fbt_0.rSH) {
            this.tep -= fbk_02.fSc();
            this.ter -= fbk_02.fSd();
        }
        return this.tes.remove(l) != null;
    }

    public void d(fcb_0 fcb_02) {
        this.teo += (long)fcb_02.cmP();
    }

    public void b(fca_0 fca_02) {
        this.teo += (long)fca_02.cmP();
    }

    public long glw() {
        return this.kYH;
    }

    public int eAn() {
        return this.mgw;
    }

    public void TO(int n) {
        this.mgw = n;
    }

    public boolean aah(int n) {
        return (long)n <= this.glr();
    }
}

