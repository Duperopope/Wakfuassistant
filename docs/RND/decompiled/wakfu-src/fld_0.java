/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fld
 */
public abstract class fld_0
extends fkx_0<fkD>
implements fkD,
fkE {
    protected static final Logger sDm = Logger.getLogger(fld_0.class);
    public static final TLongObjectIterator<fkw> sDn = new TLongObjectHashMap().iterator();
    public static final fkx sDo = new fkx();
    private final fle_0 sDp = new fle_0();
    protected boolean sDq = false;
    protected final uw_0 sDr = uw_0.bju();
    private final uw_0 sDs = uw_0.bju();
    protected final uz_0 sDt = new uz_0(uz_0.bwa);
    protected final uz_0 sDu = new uz_0(uz_0.bwa);
    protected final TLongObjectHashMap<fkw> sDv = new TLongObjectHashMap();
    protected final fkx sDw;
    protected final fni_0 sDx;
    protected final fkJ sDy;
    protected final fnf_0 sDz;
    protected final fku_0 sDA;
    protected final fky sDB;
    private final List<fkD> sDC = new ArrayList<fkD>();
    @Nullable
    protected flp_0 sDD = null;
    private final flf_0 sDE = new flf_0(this);
    private final fli_0 sDF = new fli_0(this);
    private final fll_0 sDG = new fll_0(this);
    private final flk_0 sDH = new flk_0(this);
    private final flh_0 sDI = new flh_0(this, true);
    private final flh_0 sDJ = new flh_0(this, false);
    private final flm_0 sDK = new flm_0(this);
    private final fln_0 sDL = new fln_0(this);
    private final flg_0 sDM = new flg_0(this);
    private final flj_0 sDN = new flj_0(this);
    protected flo_0 sDO = null;

    protected fld_0(fjo_0 fjo_02) {
        super(fjo_02);
        this.sDw = this.ekW();
        this.sDy = this.gcQ();
        this.sDz = new fnf_0(this.ems());
        this.sDA = this.gcP();
        this.sDx = new fni_0(this.ems());
        this.sDB = new fky(this);
    }

    protected fku_0 gcP() {
        return new fku_0(this.ems());
    }

    protected fkJ gcQ() {
        return new fkJ(this.ems());
    }

    protected fkx ekW() {
        return new fkx();
    }

    @Override
    public void gbf() {
    }

    public void c(@NotNull fkD fkD2) {
        this.sDC.add(fkD2);
    }

    public void d(fkD fkD2) {
        this.sDC.remove(fkD2);
    }

    public abstract long mn(long var1);

    public long emh() {
        return 3000L;
    }

    public fnf_0 gbC() {
        return this.sDz;
    }

    public fku_0 gbD() {
        return this.sDA;
    }

    public fni_0 gbE() {
        return this.sDx;
    }

    public abstract void d(long var1, String var3);

    public abstract void a(long var1, fkw var3);

    @Override
    public void b(fjc_0 fjc_02) {
        throw new UnsupportedOperationException();
    }

    public abstract void E(long var1, long var3);

    public void b(ux_0 ux_02, ua_0 ua_02, boolean bl) {
        throw new UnsupportedOperationException("Commande non impl\u00e9ment\u00e9e sur ce serveur ou ce client");
    }

    public boolean gcR() {
        throw new UnsupportedOperationException("Operation non authoris\u00e9e sur ce serveur ou ce client");
    }

    public boolean ekX() {
        throw new UnsupportedOperationException("Operation non authoris\u00e9e sur ce serveur ou ce client");
    }

    public boolean ug(long l) {
        throw new UnsupportedOperationException("Operation non authoris\u00e9e sur ce serveur ou ce client");
    }

    public boolean uh(long l) {
        throw new UnsupportedOperationException("Operation non authoris\u00e9e sur ce serveur ou ce client");
    }

    @Override
    public void a(fji_0 fji_02) {
        throw new UnsupportedOperationException();
    }

    public void a(long l, byte by, long l2) {
        throw new UnsupportedOperationException();
    }

    public void a(fkL fkL2, fkL fkL3, fkO fkO2) {
        throw new UnsupportedOperationException();
    }

    public void a(long l, fkL fkL2) {
        throw new UnsupportedOperationException();
    }

    public ux_0 eCK() {
        return this.sDr;
    }

    public ux_0 gcS() {
        return this.sDs;
    }

    public ua_0 eCS() {
        return this.sDt;
    }

    public uz_0 gcT() {
        return this.sDu;
    }

    public void a(ua_0 ua_02, ua_0 ua_03) {
        this.sDt.c(ua_02);
        this.sDu.c(ua_03);
    }

    public final boolean gcU() {
        return this.sDq;
    }

    public final boolean ui(long l) {
        return this.sDB.tP(l);
    }

    public boolean ab(@NotNull ux_0 ux_02) {
        if (fjo_0.a(this.ems(), fjo_0.sys) || this.ems().Xt() == 34) {
            this.sDr.f(uw_0.bvJ);
            return true;
        }
        if (ux_02.bjv()) {
            sDm.info((Object)("[NATION] La date de d\u00e9but de vote pour la nation " + String.valueOf(this.ems()) + " est d\u00e9finie \u00e0 null. Un nouveau vote va commencer d\u00e8s que possible."));
            ux_02 = ue_0.bjV().bjc();
        }
        this.sDr.f(ux_02);
        this.sDs.f(ux_02);
        this.sDs.a(this.sDt);
        return !this.sDr.bjv();
    }

    public boolean aL(long l, long l2) {
        fkw fkw2 = (fkw)this.sDv.get(l2);
        if (fkw2 == null) {
            return false;
        }
        fjm fjm2 = this.ems().tV(l);
        if (fjm2 == null) {
            return false;
        }
        fkw2.fn((short)(fkw2.gco() + 1));
        fjm2.ffF().Z(ue_0.bjV().bjm());
        fjm2.ffF().a(fng_0.sHX);
        for (int i = 0; i < this.sDC.size(); ++i) {
            fkD fkD2 = this.sDC.get(i);
            fkD2.D(l, l2);
        }
        return true;
    }

    public final void c(long l, fkw fkw2) {
        if (fkw2 == null) {
            sDm.error((Object)("[NATION] Tentative d'enregistrement d'un candidat null en tant que candidat. CharacterId : " + l + " Nation : " + String.valueOf(this.ems())), (Throwable)new IllegalArgumentException());
            return;
        }
        this.sDv.put(l, (Object)fkw2);
        for (int i = 0; i < this.sDC.size(); ++i) {
            fkD fkD2 = this.sDC.get(i);
            fkD2.mk(l);
        }
    }

    public final boolean uj(long l) {
        fkw fkw2 = (fkw)this.sDv.get(l);
        if (fkw2 == null) {
            sDm.info((Object)("[NATION] On demande le d\u00e9sistement du candidat " + l + " mais il n'est pas enregistr\u00e9 dans la nation " + String.valueOf(this.ems())));
            return false;
        }
        fkw2.nC(true);
        for (int i = 0; i < this.sDC.size(); ++i) {
            fkD fkD2 = this.sDC.get(i);
            fkD2.ml(l);
        }
        return true;
    }

    public final boolean uk(long l) {
        fkw fkw2 = (fkw)this.sDv.get(l);
        if (fkw2 == null) {
            sDm.info((Object)("[NATION] On demande la r\u00e9\u00e9ligibilit\u00e9 du candidat " + l + " mais il n'est pas enregistr\u00e9 dans la nation " + String.valueOf(this.ems())));
            return false;
        }
        fkw2.nC(false);
        for (int i = 0; i < this.sDC.size(); ++i) {
            fkD fkD2 = this.sDC.get(i);
            fkD2.mm(l);
        }
        return true;
    }

    public boolean tQ(long l) {
        return this.sDv.containsKey(l);
    }

    public fkw tR(long l) {
        return (fkw)this.sDv.get(l);
    }

    protected boolean gcV() {
        return !this.sDv.isEmpty();
    }

    protected void ekY() {
        this.sDv.clear();
    }

    public TLongObjectIterator<fkw> gcW() {
        return this.sDv.iterator();
    }

    public int ekU() {
        return this.sDv.size();
    }

    public int ekZ() {
        this.sDp.Yh = 0;
        this.sDv.forEachValue((TObjectProcedure)this.sDp);
        return this.sDp.Yh;
    }

    public void d(int n, int n2, ArrayList<fkw> arrayList) {
        int n3 = n + Math.min(n2, this.sDv.size() - n);
        Object[] objectArray = this.sDv.values();
        for (int i = n; i < n3; ++i) {
            arrayList.add((fkw)objectArray[i]);
        }
    }

    public void P(ArrayList<fkw> arrayList) {
        throw new UnsupportedOperationException();
    }

    public void dV(int n, int n2) {
        throw new UnsupportedOperationException();
    }

    public void l(fjo_0 fjo_02) {
        this.sDw.clear();
        this.sDw.p(fjo_02);
    }

    public fkx gbA() {
        return this.sDw;
    }

    public fkJ gbB() {
        return this.sDy;
    }

    @Override
    public void WF(int n) {
    }

    public fkl_0 gbi() {
        return this.sDO;
    }

    public fkl_0 gbj() {
        return this.sDE;
    }

    public fkl_0 gbk() {
        return this.sDF;
    }

    @NotNull
    public fkl_0 gbm() {
        if (this.sDD == null) {
            this.sDD = new flp_0(this);
        }
        return this.sDD;
    }

    public fkl_0 gbG() {
        return this.sDG;
    }

    public fkl_0 gbH() {
        return this.sDH;
    }

    public fkl_0 gbI() {
        return this.sDI;
    }

    public fkl_0 gbJ() {
        return this.sDJ;
    }

    public fkl_0 gbK() {
        return this.sDK;
    }

    public fkl_0 gbL() {
        return this.sDL;
    }

    public flg_0 gcX() {
        return this.sDM;
    }

    public fkl_0 gcY() {
        return this.sDN;
    }

    public void clear() {
        this.ekY();
    }

    @Override
    public /* synthetic */ void a(fkA fkA2) {
        this.d((fkD)fkA2);
    }

    @Override
    public /* synthetic */ void b(@NotNull fkA fkA2) {
        this.c((fkD)fkA2);
    }
}

