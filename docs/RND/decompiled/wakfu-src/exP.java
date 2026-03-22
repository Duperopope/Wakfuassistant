/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Shorts
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.iterator.TLongShortIterator
 *  gnu.trove.map.hash.TLongShortHashMap
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.google.common.primitives.Shorts;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.iterator.TLongShortIterator;
import gnu.trove.map.hash.TLongShortHashMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public abstract class exP
implements pw_0,
ru_0,
azd_2,
eum_0,
euc_1,
ewy_2,
eyo_0,
eza_0,
ezz,
fjm,
fpr_0,
fqg_0,
ftf_0 {
    private static final boolean pfS = false;
    public static final exx_2[] pfT = new exx_2[]{exx_2.rGi, exx_2.rGj, exx_2.rGk, exx_2.rGl, exx_2.rHH, exx_2.rHT, exx_2.rHN, exx_2.rGI, exx_2.rGx, exx_2.rGy, exx_2.rGz, exx_2.rGA, exx_2.rGB, exx_2.rGC, exx_2.rGD, exx_2.rGE, exx_2.rGF, exx_2.rGm, exx_2.rGn, exx_2.rHu, exx_2.rGT, exx_2.rGU, exx_2.rGV, exx_2.rGW, exx_2.rGX, exx_2.rGY, exx_2.rGZ, exx_2.rHa, exx_2.rHb, exx_2.rHc, exx_2.rHd, exx_2.rHe, exx_2.rHf, exx_2.rHg, exx_2.rHh};
    public static final exx_2[] pfU = new exx_2[]{exx_2.rGJ, exx_2.rGH, exx_2.rGq, exx_2.rGo, exx_2.rGp, exx_2.rGv, exx_2.rGr, exx_2.rGt, exx_2.rGw, exx_2.rGx, exx_2.rGy, exx_2.rGz, exx_2.rGA, exx_2.rHu};
    public static final exx_2[] pfV = new exx_2[]{exx_2.rGi, exx_2.rGj, exx_2.rGk, exx_2.rGl, exx_2.rHH, exx_2.rHT, exx_2.rHN, exx_2.rGI, exx_2.rGB, exx_2.rGC, exx_2.rGD, exx_2.rGE, exx_2.rGF, exx_2.rGm, exx_2.rGn, exx_2.rGt, exx_2.rGw, exx_2.rGx, exx_2.rGy, exx_2.rGz, exx_2.rGA, exx_2.rGo, exx_2.rGp, exx_2.rGv, exx_2.rHu, exx_2.rHQ, exx_2.rHR, exx_2.rHi, exx_2.rHS, exx_2.rHj, exx_2.rHk, exx_2.rHp, exx_2.rHq, exx_2.rGT, exx_2.rGU, exx_2.rGV, exx_2.rGW, exx_2.rGX, exx_2.rGY, exx_2.rGZ, exx_2.rHa, exx_2.rHb, exx_2.rHc, exx_2.rHd, exx_2.rHe, exx_2.rHf, exx_2.rHg, exx_2.rHh};
    private static final int pfW = 5;
    protected static final Logger pfX = Logger.getLogger(exP.class);
    protected boolean pfY = true;
    private String pfZ;
    protected final Collection<eyk_0> pga = new ArrayList<eyk_0>();
    protected boolean pgb;
    protected long aXv;
    protected long ePP;
    protected byte asf = (byte)-1;
    protected String p;
    protected long aHT;
    protected byte aZm;
    protected abi_1 bmk = abi_1.dzq;
    protected boolean pgc;
    protected exa_1<exf_2> pgd;
    private eyh_0<? extends exP> pge = eyh_0.pka;
    protected final ern_0 pgf = new ern_0(this, 3);
    protected final ern_0 pgg = new ern_0(this, 4);
    protected eyp ltt = eym.phV;
    protected final acd_1 pgh = new acd_1();
    private ers_0 pgi;
    ezg_0<exe_1> pgj;
    ezg_0<ezj_0> pgk;
    private abi_1 pgl;
    private boolean pgm;
    private final fjn_0 pgn;
    private final eyr_0 pgo = new eyr_0(this);
    private exP pgp;
    private final BitSet pgq = new BitSet();
    private final List<euf_1> pgr = new ArrayList<euf_1>();
    private final List<euf_1> pgs = new ArrayList<euf_1>();
    private final eyu_0 pgt = new eyu_0();
    protected boolean ieM;
    private frr pgu;
    private int pgv;
    protected int pgw = -1;
    protected eza_0 pgx;
    protected ezz pgy;
    private eye_0 pgz;
    private byte pgA = 0;
    private TLongShortHashMap pgB;

    protected exP() {
        this.pgn = this.dkb();
    }

    public void a(ezw ezw2) {
        this.pge.a(ezw2);
    }

    public ezw ffE() {
        return this.pge.fhH();
    }

    public void c(tw_0 tw_02) {
        this.pge.c(tw_02);
    }

    public tw_0 eyB() {
        return this.pge.eyB();
    }

    public abstract long jx(long var1);

    public abstract eyg_0 djD();

    public abstract Collection<? extends exP> aZn();

    public abstract exP js(long var1);

    public abstract fgD dkc();

    public abstract ffb_0 dlJ();

    public abstract long dmi();

    public abstract eyl_0 dmj();

    public abstract void dmg();

    public abstract boolean dmh();

    protected abstract fjn_0 dkb();

    @Override
    @NotNull
    public fjn_0 ffF() {
        return this.pgn;
    }

    @Override
    public long Ya() {
        return 0L;
    }

    public boolean a(euf_1 euf_12) {
        return !this.pgr.contains(euf_12) && this.pgr.add(euf_12);
    }

    public boolean b(euf_1 euf_12) {
        return this.pgs.add(euf_12);
    }

    private void ffG() {
        this.pgr.removeAll(this.pgs);
        this.pgs.clear();
    }

    private void ffH() {
        for (int i = 0; i < this.pgr.size(); ++i) {
            try {
                this.pgr.get(i).Z(this);
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                pfX.error((Object)("[Character] No listener at index " + i + " to notify fight join: " + String.valueOf(this)), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                pfX.error((Object)("[Character] An error occurred while notifying listener " + this.pgr.get(i).getClass().getSimpleName() + " of fight join: " + String.valueOf(this)), (Throwable)exception);
            }
        }
        this.ffG();
    }

    private void ffI() {
        for (int i = 0; i < this.pgr.size(); ++i) {
            try {
                this.pgr.get(i).aa(this);
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                pfX.error((Object)("[Character] No listener at index " + i + " to notify fight leave: " + String.valueOf(this)), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                pfX.error((Object)("[Character] An error occurred while notifying listener " + this.pgr.get(i).getClass().getSimpleName() + " of fight leave: " + String.valueOf(this)), (Throwable)exception);
            }
        }
        this.ffG();
    }

    protected void ffJ() {
        for (int i = 0; i < this.pgr.size(); ++i) {
            try {
                this.pgr.get(i).ab(this);
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                pfX.error((Object)("[Character] No listener at index " + i + " to notify fight won: " + String.valueOf(this)), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                pfX.error((Object)("[Character] An error occurred while notifying listener " + this.pgr.get(i).getClass().getSimpleName() + " of fight won: " + String.valueOf(this)), (Throwable)exception);
            }
        }
        this.ffG();
    }

    protected void ffK() {
        for (int i = 0; i < this.pgr.size(); ++i) {
            try {
                this.pgr.get(i).ac(this);
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                pfX.error((Object)("[Character] No listener at index " + i + " to notify fight lost: " + String.valueOf(this)), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                pfX.error((Object)("[Character] An error occurred while notifying listener " + this.pgr.get(i).getClass().getSimpleName() + " of fight lost: " + String.valueOf(this)), (Throwable)exception);
            }
        }
        this.ffG();
    }

    public fjo_0 ffL() {
        return fjt.syH.WG(this.dlo());
    }

    public int ffM() {
        fjo_0 fjo_02 = this.ffL();
        return fjo_02 == null ? -1 : fjo_02.Xt();
    }

    protected void ffN() {
        exf_2 exf_22;
        exf_2 exf_23;
        exf_2 exf_24;
        exf_2 exf_25;
        exf_2 exf_26;
        exf_2 exf_27;
        exf_2 exf_28;
        exf_2 exf_29;
        exf_2 exf_210;
        exf_2 exf_211;
        exa_1<exf_2> exa_12 = this.pgd;
        if (!(exa_12 instanceof exh_1)) {
            pfX.error((Object)"Les NPCs ont des caract\u00e9ristiques paresseuses. Les proc\u00e9dures doivent \u00eatre ajout\u00e9es sur la breed.");
            return;
        }
        exh_1 exh_12 = (exh_1)exa_12;
        exf_2 exf_212 = exh_12.e(exx_2.rGL);
        if (exf_212 != null) {
            exf_212.a(new exo_1(exh_12, exx_2.rGA, 1.0f, 0));
        }
        if ((exf_211 = exh_12.e(exx_2.rGM)) != null) {
            exf_211.a(new exo_1(exh_12, exx_2.rGz, 1.0f, 0));
        }
        if ((exf_210 = exh_12.e(exx_2.rGN)) != null) {
            exf_210.a(new exo_1(exh_12, exx_2.rGx, 1.0f, 0));
        }
        if ((exf_29 = exh_12.e(exx_2.rGK)) != null) {
            exf_29.a(new exo_1(exh_12, exx_2.rGy, 1.0f, 0));
        }
        if ((exf_28 = exh_12.e(exx_2.rGy)) != null) {
            exf_28.a(new exw_2(exh_12, this));
            exf_28.a(new exu_2(exh_12, this));
        }
        if ((exf_27 = exh_12.e(exx_2.rGx)) != null) {
            exf_27.a(new exw_2(exh_12, this));
            exf_27.a(new exu_2(exh_12, this));
        }
        if ((exf_26 = exh_12.e(exx_2.rGz)) != null) {
            exf_26.a(new exw_2(exh_12, this));
            exf_26.a(new exu_2(exh_12, this));
        }
        if ((exf_25 = exh_12.e(exx_2.rGA)) != null) {
            exf_25.a(new exw_2(exh_12, this));
            exf_25.a(new exu_2(exh_12, this));
        }
        if ((exf_24 = exh_12.e(exx_2.rHv)) != null) {
            exf_24.a(new exw_2(exh_12, this));
        }
        if ((exf_23 = exh_12.e(exx_2.rHE)) != null) {
            exf_23.a(new exu_2(exh_12, this));
        }
        if ((exf_22 = exh_12.e(exx_2.rGl)) != null) {
            exf_22.a(new exv_2(exh_12));
        }
        if (this.djT()) {
            this.ffO();
        }
    }

    public void ffO() {
        if (this.doV() != eym.pig) {
            return;
        }
        exf_2 exf_22 = this.pgd.b(exx_2.rGi);
        exf_2 exf_23 = this.pgd.b(exx_2.rHp);
        exf_2 exf_24 = this.pgd.b(exx_2.rGQ);
        if (exf_24 == null) {
            return;
        }
        ext_2 ext_22 = new ext_2((exh_1)this.pgd, 0.8f);
        if (exf_22 != null) {
            exf_22.a(ext_22);
        }
        if (exf_23 != null) {
            exf_23.a(ext_22);
        }
    }

    public abstract void CI(int var1);

    public abstract long jw(long var1);

    public abstract exP b(long var1, acd_1 var3, short var4, ezw var5, tw_0 var6, boolean var7, ezg_0<exe_1> var8);

    public boolean ffP() {
        return false;
    }

    public void aVI() {
        this.pfY = false;
        this.pfZ = null;
        this.aXv = 0L;
        this.ePP = 0L;
        this.asf = this.dml();
        this.aHT = 0L;
        this.aZm = 0;
        this.p = "<undefined>";
        this.ltt = this.dmk();
        this.bmk = abi_1.dzq;
        this.pga.clear();
        this.pgy = null;
        this.pgx = null;
        this.pgn.reset();
        this.pge = eyh_0.pka;
    }

    public void aVH() {
        this.pgv = 0;
        this.pgc = false;
        this.pgB = null;
        this.pga.clear();
        this.bmk = abi_1.dzq;
        this.aXv = 0L;
        this.pgm = false;
        this.pgb = false;
        this.pgl = null;
        this.ePP = -1L;
        if (ewo_0.oBF.k(ewr_0.oEo)) {
            this.p = "<undefined trunk>";
        } else {
            this.pgh.Q(-32000, -32000, (short)-1);
            this.p = "<undefined>";
        }
        if (this.pgi != null) {
            this.pgi.bch();
            this.pgi = null;
        }
        this.pgt.clear();
        this.aZm = (byte)-1;
        this.asf = (byte)-1;
        this.pgk = null;
        if (this.pgy != null) {
            this.pgy.djX();
        }
        this.pgy = null;
        if (this.pgx != null) {
            this.pgx.cZG();
        }
        this.pgx = null;
        this.fgJ();
        this.pfY = true;
        this.pgn.reset();
        this.pgz = null;
        this.pgA = 0;
        this.pgB = null;
        this.pgv = 0;
        this.ieM = false;
        this.pge = eyh_0.pka;
        if (this.pgu != null) {
            this.pgu.cancel();
            this.pgu = null;
        }
    }

    @Override
    public void aZp() {
        this.aVH();
    }

    protected abstract eyp dmk();

    protected abstract byte dml();

    public boolean ffQ() {
        return this.pfY;
    }

    public String ffR() {
        return this.pfZ;
    }

    @Override
    public void a(ety_0 ety_02) {
        ety_02.w(this);
        if (this.asf == 5) {
            this.fhp().lk(false);
        }
        this.pgb = true;
        this.ffH();
    }

    @Override
    public void dkf() {
        this.pgb = false;
        this.pgx = null;
        this.pgy = null;
        if (this.ffS()) {
            this.d(this.pgf);
        }
        this.ffI();
        this.pge = eyh_0.pka;
    }

    private boolean ffS() {
        return !this.ffT();
    }

    protected boolean ffT() {
        ety_0 ety_02 = this.dlK();
        return ety_02 == null || ety_02.aZ(this);
    }

    protected final void d(qm_0 qm_02) {
        this.a(qm_02, null);
    }

    protected final void a(qm_0 qm_02, List<erh_0> list) {
        this.a(qm_02, list, true);
    }

    protected void a(qm_0 qm_02, List<erh_0> list, boolean bl) {
        try {
            if (list == null) {
                list = this.g(qm_02);
            }
            int n = this.e(exx_2.rGi).aYC();
            ezg_0<exe_1> ezg_02 = this.pgj;
            if (ezg_02 != null) {
                ezg_02.reset();
            }
            if (bl) {
                this.doc().aY(true);
                try {
                    this.doc().clear();
                }
                catch (Exception exception) {
                    pfX.error((Object)("[Character] Error while clearing running effect manager of " + String.valueOf(this)), (Throwable)exception);
                }
                this.doc().aY(false);
            }
            this.a((eyh_0)((Object)new exf_1()));
            if (!this.dOp()) {
                this.dmg();
            }
            this.e(qm_02);
            this.aH(list);
            this.OC(Math.min(n, this.e(exx_2.rGi).aYD()));
        }
        catch (Exception exception) {
            pfX.error((Object)("Exception levee lors du rechargment d'un perso " + String.valueOf(this)), (Throwable)exception);
        }
    }

    public void OC(int n) {
        this.e(exx_2.rGi).op(n);
    }

    public int EY() {
        return this.e(exx_2.rGi).aYB();
    }

    public abstract void aZh();

    protected static <C extends exP> void a(ety_0<C> ety_02, C c2) {
        if (ety_02 == null) {
            return;
        }
        ety_02.aY(c2);
    }

    public void p(long l, long l2) {
        if (this.dlK() == null) {
            return;
        }
        this.dlK().p(l, l2);
    }

    @Override
    public void N(byte by) {
        this.pge.N(by);
    }

    @Override
    public byte bcQ() {
        return this.pge.bcQ();
    }

    @Override
    public boolean bcR() {
        return true;
    }

    @Override
    public boolean bcS() {
        return true;
    }

    @Override
    public boolean bcT() {
        return !this.a(exe_1.rDs) && (this.a(exe_1.rDh) || !this.a(exe_1.rDg)) && !this.a(exe_1.rEb);
    }

    public long dnV() {
        return 0L;
    }

    @Override
    public acd_1 aZw() {
        return this.pgh != null ? new acd_1(this.pgh) : null;
    }

    public acd_1 ffU() {
        long l = fcK.rUe.sq(this.Xi());
        Object t = fcL.rUh.sw(l);
        return t == null ? null : new acd_1(((exP)t).pgh);
    }

    @Override
    public void a(int n, int n2, short s) {
        assert (s >= -512 && s <= 511) : "Altitude of the position is out of bounds : " + s;
        rh_0 rh_02 = this.bag();
        if (rh_02 != null && !this.buW() && rh_02.R(this.pge.bcQ())) {
            rh_02.a(this, n, n2);
        }
        this.pgh.Q(n, n2, s);
        if (this.aXv != -1L && !this.ffV()) {
            pfX.error((Object)("Position invalide pour un BasicCharacterInfo : " + String.valueOf(this.pgh) + " worldId=" + this.aHT));
        }
        if (this.pgx != null) {
            this.pgx.a(n, n2, s);
            this.pgx.bpP();
        }
    }

    @Override
    public void b(acd_1 acd_12) {
        this.a(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    private rh_0 bag() {
        ety_0 ety_02 = this.dlK();
        if (ety_02 == null) {
            return null;
        }
        return ety_02.bag();
    }

    protected boolean ffV() {
        return true;
    }

    @Override
    public void b(int n, int n2, short s) {
        throw new UnsupportedOperationException("Not implemented - this method must be overloaded");
    }

    @Nullable
    public foP doW() {
        return null;
    }

    @Override
    public boolean a(pt_0 pt_02) {
        return this.pgd != null && this.pgd.g(pt_02);
    }

    public eiz_0<? extends exP> dnl() {
        return null;
    }

    public exf_2 e(pt_0 pt_02) {
        return this.pgd.b(pt_02);
    }

    @Override
    public int c(pt_0 pt_02) {
        return this.pgd == null ? 0 : this.pgd.c(pt_02);
    }

    @Override
    public int d(pt_0 pt_02) {
        return this.pgd.h(pt_02);
    }

    @Override
    public int ffW() {
        return this.c(exx_2.rGn);
    }

    @Override
    public int ffX() {
        return this.c(exx_2.rGm);
    }

    @Override
    public boolean ffY() {
        return !this.a(exe_1.rDp);
    }

    @Override
    public void a(abi_1 abi_12) {
        int n = abi_12.dzy - this.bmk.dzy;
        this.bmk = abi_12;
        if (this.pgx != null) {
            this.pgx.a(this.pgx.bcB().wH(n));
        }
    }

    @Override
    public void b(abi_1 abi_12) {
        this.pgl = abi_12;
    }

    @Override
    public abi_1 baC() {
        return this.pgl == null ? this.bmk : this.pgl;
    }

    public boolean bwb() {
        return false;
    }

    public void dni() {
        throw new UnsupportedOperationException("Not implemented - this method must be overloaded or otherwise not used");
    }

    public void dnh() {
        throw new UnsupportedOperationException("Not implemented - this method must be overloaded or otherwise not used");
    }

    @Override
    public byte bcN() {
        if (this.ltt != null) {
            return this.ltt.bcN();
        }
        return 6;
    }

    @Override
    public boolean bEf() {
        return !this.a(exe_1.rDQ);
    }

    @Override
    public byte bcO() {
        if (this.ltt != null) {
            return this.ltt.bcO();
        }
        return 0;
    }

    @Override
    public short bvy() {
        return 4;
    }

    @Override
    public boolean a(pv_0 pv_02) {
        switch (pv_02.aZd()) {
            case 1: {
                if (this.pgj == null) break;
                return ((ps_0)this.pgj).a((exe_1)pv_02);
            }
            case 0: {
                if (this.pgk == null) break;
                return ((ps_0)this.pgk).a((ezj_0)pv_02);
            }
        }
        return false;
    }

    @Override
    public boolean i(pv_0 pv_02) {
        return this.a(pv_02);
    }

    public boolean cyi() {
        return this.a(exe_1.rDg) || this.a(exe_1.rDs);
    }

    @Override
    public byte b(pv_0 pv_02) {
        switch (pv_02.aZd()) {
            case 1: {
                if (this.pgj == null) break;
                return this.pgj.b((exe_1)pv_02);
            }
            case 0: {
                if (this.pgk == null) break;
                return this.pgk.b((ezj_0)pv_02);
            }
        }
        return 0;
    }

    @Override
    public void a(pv_0 pv_02, byte by) {
        switch (pv_02.aZd()) {
            case 1: {
                if (this.pgj != null) {
                    this.pgj.c((exe_1)pv_02);
                }
                if (this.pgj == null) break;
                this.pgj.a((exe_1)pv_02, by);
                break;
            }
            case 0: {
                if (this.pgk == null) {
                    this.pgk = ezg_0.a((byte)0, this);
                }
                if (this.pgk == null) break;
                this.pgk.a((ezj_0)pv_02, by);
            }
        }
    }

    @Override
    public void f(pv_0 pv_02) {
        switch (pv_02.aZd()) {
            case 1: {
                if (this.pgj == null) break;
                this.pgj.c((exe_1)pv_02);
                break;
            }
            case 0: {
                if (this.pgk == null) {
                    this.pgk = ezg_0.a((byte)0, this);
                }
                if (this.pgk == null) break;
                this.pgk.c((ezj_0)pv_02);
            }
        }
    }

    @Override
    public void g(pv_0 pv_02) {
        if (pv_02 == null) {
            return;
        }
        switch (pv_02.aZd()) {
            case 1: {
                if (this.pgj == null) break;
                this.pgj.d((exe_1)pv_02);
                break;
            }
            case 0: {
                if (this.pgk == null) break;
                this.pgk.d((ezj_0)pv_02);
                if (!this.pgk.aJG()) break;
                this.pgk = null;
            }
        }
    }

    @Override
    public void h(pv_0 pv_02) {
        switch (pv_02.aZd()) {
            case 1: {
                if (this.doc() != null) {
                    this.doc().d((exe_1)pv_02);
                }
                if (this.pgj == null) break;
                this.pgj.e((exe_1)pv_02);
                break;
            }
            case 0: {
                if (this.pgk == null) break;
                this.pgk.e((ezj_0)pv_02);
                if (!this.pgk.aJG()) break;
                this.pgk = null;
            }
        }
    }

    @Override
    public void a(pv_0 pv_02, px_0 px_02) {
    }

    @Override
    public boolean a(BitSet bitSet, QD qD, byte by) {
        return this.doc() != null && this.doc().a(bitSet, qD, by);
    }

    @Override
    public boolean bay() {
        return true;
    }

    @Override
    public void b(qu_0 qu_02) {
    }

    @Override
    public void c(qu_0 qu_02) {
    }

    @Override
    public void d(qu_0 qu_02) {
    }

    @Override
    public boolean baF() {
        ety_0 ety_02 = this.dlK();
        if (ety_02 != null && !ety_02.dGo().fLb() && ety_02.fKj() < 2) {
            return false;
        }
        return this.djT() && this.e(exx_2.rGi).aYK() && !this.doP() && !this.fgU();
    }

    @Override
    public boolean baE() {
        return this.djT() && this.e(exx_2.rGi).aYB() > 0 && this.pge.fhE();
    }

    @Override
    public boolean baK() {
        return this.djT() && (this.e(exx_2.rGs).aYK() || this.dlK() != null && this.dlK().fz(this.bcP()).isEmpty()) && this.fgU() && this.e(exx_2.rGi).aYB() <= 0;
    }

    @Override
    public boolean baI() {
        return this.djT() && this.dlK() != null && this.dlK().bb(this);
    }

    @Override
    public boolean baM() {
        return this.djT() && this.dlK() != null && this.dlK().bc(this);
    }

    @Override
    public boolean baH() {
        return this.djT() && this.dlK() != null && this.dlK().ba(this);
    }

    @Override
    public void baG() {
        this.pge.lt(true);
    }

    @Override
    public void baJ() {
        this.pge.lt(false);
    }

    public void lf(boolean bl) {
        this.pge.lf(bl);
    }

    public boolean ffZ() {
        return this.pge.fhG();
    }

    @Override
    public void baL() {
        if (this.fga()) {
            return;
        }
        if (!this.a(exe_1.rDn) && !this.pge.fhf()) {
            this.gf(true);
        }
    }

    private boolean fga() {
        ety_0 ety_02;
        if (this.pgy != null) {
            this.pgy.djX();
        }
        if ((ety_02 = this.dlK()) == null) {
            return true;
        }
        Collection collection = ety_02.dGs();
        for (exP exP2 : collection) {
            this.doc().i(exP2);
        }
        return false;
    }

    @Override
    public boolean baN() {
        return !this.pgm;
    }

    @Override
    public void aT(boolean bl) {
        this.pgm = bl;
    }

    @Override
    public byte[] fgb() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fgb();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgc() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fgc();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgd() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fgd();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fge() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fge();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    @Override
    public void eu(byte[] byArray) {
        this.fgJ();
        this.fgl();
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            eyl_02.ev(byArray);
        } else {
            pfX.error((Object)"Impossible de d\u00e9s\u00e9rialioser les donn\u00e9es binaire du fighter : pas de s\u00e9rialiseur d\u00e9fini.");
        }
    }

    @Override
    public byte[] baB() {
        return this.doc().ml(false);
    }

    public byte[] lg(boolean bl) {
        return this.doc().ml(bl);
    }

    @Override
    public void dp(byte[] byArray) {
        this.doc().a(byArray, this.fgg());
    }

    @Override
    public byte bcP() {
        if (this.dlK() == null) {
            return -1;
        }
        return this.dlK().aS(this);
    }

    @Override
    public void az(byte by) {
        if (this.dlK() == null) {
            return;
        }
        this.dlK().b(this, by);
    }

    @Override
    public qm_0<enk_0> bdV() {
        ern_0 ern_02 = this.fgg();
        if (ern_02 == null || ern_02.baj() == 0) {
            ern_02 = this.pgf;
        }
        return ern_02;
    }

    public ern_0 fgf() {
        return this.pgg;
    }

    public void a(int n, acd_1 acd_12, boolean bl) {
    }

    public void as(byte[] byArray) {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            eyl_02.ev(byArray);
        } else {
            pfX.error((Object)"Impossible de d\u00e9coder les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        }
    }

    @Override
    public short bcE() {
        return this.pgh.bdi();
    }

    public void bF(short s) {
        this.pgh.aM(s);
        if (this.pgx != null) {
            this.pgx.a(this.pgh.getX(), this.pgh.getY(), s);
        }
    }

    public fft_0 dod() {
        return null;
    }

    public String aZk() {
        return this.getName();
    }

    public final qm_0<enk_0> fgg() {
        return this.pgb && this.dlK() != null ? this.dkd() : this.dke();
    }

    @Nullable
    public fgd_0 doC() {
        return null;
    }

    public fhk dmL() {
        return null;
    }

    public fhk CL(int n) {
        return null;
    }

    @Nullable
    public fqw_0 a(fqt_0 fqt_02, byte by) {
        return null;
    }

    public fqr_0 a(byte by, short s, fqE fqE2) {
        return null;
    }

    public void a(byte by, short s, fqr_0 fqr_02) {
    }

    public qm_0<enk_0> dkd() {
        if (this.dlK() != null) {
            return this.dlK().bbh();
        }
        return null;
    }

    public String arb() {
        return null;
    }

    public short dnE() {
        return this.cmL();
    }

    @Override
    public short cmL() {
        return 0;
    }

    @Override
    public short dnG() {
        return this.cmL();
    }

    public abstract float dmm();

    @Override
    public String getName() {
        return this.p != null ? this.p : "UNDEFINED";
    }

    @Override
    public final acd_1 eap() {
        return this.pgh;
    }

    public fqP<? extends fqE> dkB() {
        return null;
    }

    public Iterable<? extends fqE> doM() {
        return null;
    }

    public boolean CX(int n) {
        return false;
    }

    public fqQ fgh() {
        return this.pge.fgh();
    }

    @Override
    public int dOm() {
        return this.Gc(eym.phV.aWP());
    }

    @Override
    public int Gc(int n) {
        int n2 = 0;
        if (this.dlK() != null) {
            for (Object f2 : this.dlK().dGs()) {
                exP exP2;
                euc_1 euc_12 = (euc_1)f2;
                if (!(euc_12 instanceof exP) || !(exP2 = (exP)euc_12).dOp() || exP2.doP() || exP2.dlI() != this || exP2 == this || exP2.i(exe_1.rEX) || n != eym.phV.aWP() && exP2.aWP() != n) continue;
                ++n2;
            }
        } else {
            for (exP exP3 : this.aZn()) {
                if (!exP3.dOp() || exP3.fhp().doP() || n != eym.phV.aWP() && (exP3.aWP() != n || exP3.i(exe_1.rEX))) continue;
                ++n2;
            }
        }
        return n2;
    }

    public int dlr() {
        int n = 0;
        if (this.dlK() != null) {
            for (Object f2 : this.dlK().dGs()) {
                exP exP2;
                euc_1 euc_12 = (euc_1)f2;
                if (!(euc_12 instanceof exP) || !(exP2 = (exP)euc_12).dOp() || exP2.fhp().doP() || exP2.dlI() != this || exP2.i(exe_1.rEX)) continue;
                n += ((eyi)exP2.doV()).cqA();
            }
        } else {
            for (exP exP3 : this.aZn()) {
                if (!exP3.dOp() || exP3.fhp().doP() || exP3.i(exe_1.rEX)) continue;
                n += ((eyi)exP3.doV()).cqA();
            }
        }
        return n;
    }

    public int fgi() {
        ezn_0 ezn_02 = this.dob();
        if (ezn_02 == null) {
            return 0;
        }
        ezw ezw2 = ezn_02.fmP();
        if (ezw2 == null) {
            return 0;
        }
        return ezw2.fmD();
    }

    public exP fgj() {
        exP exP2;
        exP exP3 = this;
        ety_0 ety_02 = this.dlK();
        int n = 0;
        do {
            exP3 = exP.c(ety_02, exP3);
            exP2 = exP.c(ety_02, exP3);
            if (++n <= 10) continue;
            pfX.error((Object)("On est en train de tourner pour trouver le root Controller, il doit y avoir une boucle, breed : " + this.aWP()));
            return exP3;
        } while (exP3 != exP2);
        return exP3;
    }

    public qm_0<enk_0> dke() {
        return null;
    }

    @Override
    public int bcC() {
        return this.pgh.getX();
    }

    @Override
    public int bcD() {
        return this.pgh.getY();
    }

    @Override
    public float getWorldX() {
        return this.bcC();
    }

    @Override
    public float getWorldY() {
        return this.bcD();
    }

    @Override
    public float getAltitude() {
        return this.bcE();
    }

    protected void dmI() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            new exW(this, eyl_02.fis());
            new exX(this, eyl_02.fir());
            new exY(this, eyl_02.fiq());
            new exR(this, eyl_02.fit());
            new eya_0(this, eyl_02.fiu());
            new exZ(this, eyl_02.fiv());
            new exT(this, eyl_02.fiw());
            new exU(this, eyl_02.fix());
            new exQ(this, eyl_02.fiy());
            new eyb_0(this, eyl_02.fiA());
            new exV(this, eyl_02.fiB());
            new exS(this, eyl_02.fiC());
            new eyd_0(this, eyl_02.fiD());
        } else {
            pfX.error((Object)"Pas de s\u00e9rialiseur \u00e0 initialiser : le personnage ne sera pas s\u00e9rialisable !");
        }
    }

    public boolean fgk() {
        return this.pge.fgk();
    }

    @Override
    public boolean dOp() {
        return this.pge.dOp();
    }

    @Override
    public boolean dOn() {
        return this.pge.dOn();
    }

    public boolean doE() {
        return this.dOp() || this.a(ezj_0.pta);
    }

    public void fgl() {
        if (this.pgj == null) {
            this.pgj = ezg_0.a((byte)1, this);
        }
    }

    public void a(eyk_0 eyk_02) {
        if (!this.pga.contains(eyk_02)) {
            this.pga.add(eyk_02);
        }
    }

    public void dlk() {
        this.pgo.dlk();
    }

    public void fgm() {
        this.b(this.e(exx_2.rGj));
        this.b(this.e(exx_2.rGk));
        this.b(this.e(exx_2.rGl));
    }

    private void b(pr_0 pr_02) {
        if (pr_02 != null) {
            pr_02.aYO();
        }
    }

    public void b(qm_0 qm_02, boolean bl) {
        ehy_0 ehy_02 = this.dnp();
        if (ehy_02 == null) {
            return;
        }
        if (!ehy_02.al(this)) {
            return;
        }
        this.doc().b(36, true, false);
        short s2 = this.cmL();
        int n2 = eIp.q(ehy_02);
        if (n2 > s2) {
            pfX.warn((Object)("[Build] Aptitude sheet of character " + this.Sn() + " has too many points for level, its effects are not applied " + s2 + " (minLevel=" + n2 + ",sheet=" + String.valueOf(ehy_02) + ")"));
            return;
        }
        if (bl) {
            this.e(exx_2.rGi).fOA();
        }
        ehy_02.g((Integer n, Short s) -> {
            Object t = eHJ.qsV.Py((int)n);
            if (t == null) {
                return;
            }
            int n2 = ((ehw_0)t).aZH();
            enk_0 enk_02 = (enk_0)eHI.qsU.oy(n2);
            if (enk_02 == null) {
                return;
            }
            eHH eHH2 = new eHH((ehw_0)t, (short)s);
            exP exP2 = this;
            enk_02.a(eHH2, exP2, qm_02, enf_0.fBb(), exP2.bcC(), exP2.bcD(), exP2.bcE(), exP2, null, false);
        });
        if (bl) {
            this.e(exx_2.rGi).fOB();
        }
    }

    public void fgn() {
        this.doc().Se(19);
    }

    public Collection<ftQ> dnS() {
        return null;
    }

    public final String fgo() {
        Object object = "";
        for (QD qD : this.doc().oG(18)) {
            object = (String)object + qD.getClass().getSimpleName() + " zoneBuffId=" + qD.bbf().QF() + "\n";
        }
        return object;
    }

    public void lh(boolean bl) {
        this.doc().Se(18);
        Collection<ftQ> collection = this.dnS();
        if (collection != null) {
            if (bl) {
                this.e(exx_2.rGi).fOA();
            }
            for (ftQ ftQ2 : collection) {
                for (enk_0 enk_02 : ftQ2.gmH()) {
                    if (enk_02.aZG() != 0) continue;
                    enk_02.a(ftQ2.gmH(), this, this.pgf, enf_0.fBb(), this.bcC(), this.bcD(), this.bcE(), this, null, false);
                }
            }
            if (bl) {
                this.e(exx_2.rGi).fOB();
            }
        }
    }

    public void a(int n, fjn_0 fjn_02, fkd_0 fkd_02, int n2, int n3) {
        if (fjn_02.Xt() != n) {
            return;
        }
        fkd_0 fkd_03 = fkf_0.gcc().WJ(n2);
        if (fkd_03 == fkd_02) {
            return;
        }
        if (this.djT()) {
            return;
        }
        if (fkd_02.b(fkj_0.sAL) && !fkd_03.b(fkj_0.sAL)) {
            this.fgn();
        }
        if (fkd_03.b(fkj_0.sAL) && !fkd_02.b(fkj_0.sAL)) {
            this.a(this.bdV(), true);
        }
    }

    public void a(qm_0 qm_02, boolean bl) {
        if (this.asf != 0 && this.asf != 5) {
            return;
        }
        erh_0 erh_02 = this.doc().Sg(5355);
        if (erh_02 != null) {
            erh_02.mi(true);
        }
        this.doc().Sf(5355);
        if (this.pgn == null) {
            return;
        }
        if (this.pgn.Xt() == -1) {
            return;
        }
        if (this.pgn.Xt() == 0) {
            return;
        }
        if (!this.a(fkj_0.sAL)) {
            return;
        }
        fjo_0 fjo_02 = this.pgn.ems();
        fnf_0 fnf_02 = fjo_02.gbC();
        if (fnf_02 == null) {
            return;
        }
        if (bl) {
            this.e(exx_2.rGi).fOA();
        }
        short s = 0;
        TIntObjectIterator<fnd_0> tIntObjectIterator = fnf_02.bgC();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fnd_0 fnd_02 = (fnd_0)tIntObjectIterator.value();
            int n = fnd_02.emO();
            int n2 = fnd_02.emM();
            fpb fpb2 = fpb.gj(n, n2);
            s = (short)(s + Shorts.saturatedCast((long)fpb2.ggd()));
        }
        if (ena_0.qOK.contains((Comparable)Short.valueOf(s))) {
            this.a((short)5357, s, qm_02);
        }
        if (bl) {
            this.e(exx_2.rGi).fOB();
        }
    }

    public void li(boolean bl) {
        this.a(this.bdV(), bl);
    }

    public void ga(boolean bl) {
    }

    public void gb(boolean bl) {
    }

    public void dnr() {
    }

    protected void a(eyp eyp2, qm_0 qm_02, boolean bl) {
    }

    private boolean a(fkj_0 fkj_02) {
        fjo_0 fjo_02 = this.pgn.ems();
        int n = this.pgn.WA(fjo_02.Xt());
        return fkf_0.gcc().WJ(n).b(fkj_02);
    }

    public ehy_0 dnp() {
        return null;
    }

    public ehy_0 CO(int n) {
        return null;
    }

    public void reset() {
        this.aXv = -1L;
        this.ePP = -1L;
        this.p = "";
        this.pga.clear();
        this.aZm = 0;
        this.bmk = abi_1.dzq;
    }

    public byte[] apI() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.apI();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgp() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fgp();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgq() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fgq();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgr() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fjU();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgs() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fgs();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgt() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fjX();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgu() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fjY();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgv() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fjZ();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgw() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fka();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgx() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fjR();
        }
        pfX.error((Object)"Failed to serialize cosmetics: no serializer");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgy() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fjS();
        }
        pfX.error((Object)"Failed to serialize cosmetics: no serializer");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgz() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fgz();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] lj(boolean bl) {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.lj(bl);
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgA() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            String string = null;
            if (this.ffP()) {
                string = this.getName();
                this.setName("[STAFF] " + string);
            }
            byte[] byArray = eyl_02.fgA();
            if (this.ffP()) {
                this.setName(string);
            }
            return byArray;
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgB() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            String string = null;
            if (this.ffP()) {
                string = this.getName();
                this.setName("[STAFF] " + string);
            }
            byte[] byArray = eyl_02.fgB();
            if (this.ffP()) {
                this.setName(string);
            }
            return byArray;
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgC() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fkg();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgD() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fgD();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgE() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fgE();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgF() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fgF();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgG() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fgG();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgH() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fjW();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fgI() {
        eyl_0 eyl_02 = this.dmj();
        if (eyl_02 != null) {
            return eyl_02.fki();
        }
        pfX.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public void d(int n, Object object) {
    }

    public void e(int n, Object object) {
    }

    public void lk(boolean bl) {
        this.pge.lk(bl);
    }

    public void of(String string) {
    }

    public void CK(int n) {
        this.pgv = n;
    }

    public void OD(int n) {
        this.pgw = n;
    }

    public int aVt() {
        return this.pgv;
    }

    public void CV(int n) {
    }

    public void bw(short s) {
        throw new UnsupportedOperationException("Only monsters can set level");
    }

    public void a(int n, int n2, Object object) {
    }

    public void ll(boolean bl) {
        this.pge.lu(bl);
    }

    public void bX(ffV ffV2) {
        this.pgo.bX(ffV2);
    }

    public void d(fhk fhk2) {
        this.pgo.e(fhk2);
    }

    public void a(ffV ffV2, ffa_0 ffa_02) {
        this.pgo.a(ffV2, ffa_02);
    }

    public void fgJ() {
        this.pgj = null;
        this.pgm = false;
        this.fht();
    }

    public void fgK() {
        this.pga.clear();
    }

    protected void fgL() {
        for (eyr eyr2 : eys.fid().fie()) {
            byte by = eyr2.fic();
            int n = eyr2.OT(this.cmL());
            exx_2 exx_22 = exx_2.c(by);
            if (exx_22 == null || !this.a(exx_22)) continue;
            this.e(exx_22).Tg(n);
        }
    }

    public void a(byte by, acd_1 acd_12, boolean bl, fqE fqE2) {
    }

    @Override
    public eyp doV() {
        return this.ltt;
    }

    @Override
    public short aWP() {
        if (this.ltt != null) {
            return this.ltt.aWP();
        }
        return -1;
    }

    public exa_1<exf_2> fgM() {
        return this.pgd;
    }

    @Override
    public abi_1 bcB() {
        return this.bmk;
    }

    @Nullable
    public ezg_0<exe_1> fgN() {
        return this.pgj;
    }

    @Override
    public long Sn() {
        return this.aXv;
    }

    @Override
    public byte bax() {
        return 20;
    }

    public long aqZ() {
        return this.aHT;
    }

    public boolean fgO() {
        return exc.oTO.contains(this.aHT);
    }

    public int cln() {
        return 0;
    }

    @Nullable
    protected acd_1 fgP() {
        return null;
    }

    public void fK(long l) {
        this.aHT = l;
    }

    protected void ao(acd_1 acd_12) {
    }

    protected long fgQ() {
        return -1L;
    }

    @Override
    public long Xi() {
        return this.ePP;
    }

    @Override
    @Nullable
    public sp_0 baD() {
        if (this.a(exe_1.rDV)) {
            return null;
        }
        sp_0 sp_02 = this.pge.baD();
        if (sp_02 == null) {
            return null;
        }
        sp_02.a(this.bcC(), this.bcD(), this.bcE(), this.bmk);
        return sp_02;
    }

    @Nullable
    public so_0 d(anz_1 anz_12) {
        sp_0 sp_02 = this.baD();
        if (sp_02 == null) {
            return null;
        }
        return sp_02.o(anz_12.bcC(), anz_12.bcD(), anz_12.bcE());
    }

    public ers_0 doc() {
        this.fgS();
        return this.pgi;
    }

    @Override
    public boolean baA() {
        return true;
    }

    public boolean fgR() {
        return this.pgi != null;
    }

    public void fgS() {
        if (this.pgi == null) {
            this.pgi = new ers_0(this);
        }
    }

    @Override
    public byte aWO() {
        return this.aZm;
    }

    @Override
    public byte aFW() {
        return this.asf;
    }

    @Nullable
    public ezg_0<ezj_0> fgT() {
        return this.pgk;
    }

    public void gf(boolean bl) {
        if (this.doP() != bl) {
            this.pge.gf(bl);
            this.dpE();
        }
    }

    public boolean doP() {
        return this.pge.doP() || this.dpX() != null && this.dpX().dsm() == 4 || this.i(ezj_0.psF);
    }

    public boolean fgU() {
        return this.pge.fhF();
    }

    public void lm(boolean bl) {
        this.pge.lt(bl);
    }

    protected void dpE() {
    }

    public boolean fgV() {
        return this.pgc;
    }

    public void c(eyp eyp2) {
        this.ltt = eyp2;
    }

    @Override
    public void dC(long l) {
        this.aXv = l;
    }

    public void ln(boolean bl) {
        this.pgc = bl;
    }

    protected void ph(long l) {
    }

    public void setName(String string) {
        this.p = string;
    }

    public void lo(boolean bl) {
        this.pgb = bl;
    }

    public void pi(long l) {
        this.ePP = l;
    }

    public void aQ(byte by) {
        this.aZm = by;
    }

    public void a(byte by) {
        this.asf = by;
    }

    public void ad(exP exP2) {
        if (exP2 == null) {
            return;
        }
        this.pgp = exP2;
    }

    public void fgW() {
        this.pgp = null;
    }

    public exP fgX() {
        return this.pgp;
    }

    @Override
    public eza_0 fgY() {
        return this.pgx;
    }

    @Override
    public ezz fgZ() {
        return this.pgy;
    }

    @Override
    public boolean fha() {
        return this.pgx != null;
    }

    @Override
    public boolean buW() {
        return this.pgy != null;
    }

    @Override
    public boolean fhb() {
        return !this.a(exe_1.rEA);
    }

    @Override
    public boolean c(ezz ezz2) {
        return !this.fha() && !this.buW();
    }

    @Override
    public boolean b(eza_0 eza_02) {
        if (eza_02 == null) {
            return false;
        }
        if (this.fha()) {
            return false;
        }
        if (this.buW()) {
            return false;
        }
        if (eza_02 == this) {
            return false;
        }
        if (!eza_02.c(this)) {
            return false;
        }
        if (eza_02.bcE() <= this.bcE() + this.bcN() / 2) {
            return true;
        }
        return eza_02.bcE() >= this.bcE() - this.bcN() / 2;
    }

    @Override
    public boolean a(eza_0 eza_02) {
        if (!this.b(eza_02)) {
            return false;
        }
        if (eza_02 == null) {
            return false;
        }
        acd_1 acd_12 = this.aZw();
        this.pgx = eza_02;
        eza_02.a(this);
        eza_02.a(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        eza_02.bpP();
        return true;
    }

    @Override
    public void a(ezz ezz2) {
        this.pgy = ezz2;
        rh_0 rh_02 = this.bag();
        if (rh_02 != null) {
            rh_02.a(this, false);
        }
    }

    @Override
    public void cZG() {
        this.pgy = null;
        rh_0 rh_02 = this.bag();
        if (rh_02 != null) {
            rh_02.a(this, true);
        }
    }

    @Override
    public boolean R(acd_1 acd_12) {
        if (this.pgx != null) {
            if (!this.pgh.equals(acd_12) && !this.a(exe_1.rDZ)) {
                abi_1 abi_12 = new acq_1(acd_12.getX() - this.pgh.getX(), acd_12.getY() - this.pgh.getY(), 0).bXb();
                this.a(abi_12);
            }
            this.pgx.a(acd_12.getX(), acd_12.getY(), acd_12.bdi());
            this.pgx.cZG();
            this.pgx = null;
            return true;
        }
        return false;
    }

    @Override
    public boolean Q(acd_1 acd_12) {
        return this.R(acd_12);
    }

    @Override
    public void djX() {
        if (this.pgx != null) {
            acd_1 acd_12 = this.aZw();
            this.R(acd_12);
        }
    }

    public void ge(boolean bl) {
        this.doc().Se(25);
        if (this.dkB() == null) {
            return;
        }
        if (this.djT() && this.dlK() != null && !this.dlK().dGo().fLm()) {
            return;
        }
        List<Long> list = ewo_0.oBF.o(ewr_0.oDD);
        if (this.asf == 0) {
            frf frf2 = this.dnJ();
            if (frf2 == null) {
                pfX.error((Object)("Deck set unknown , playerId=" + this.aXv));
                return;
            }
            eIm eIm2 = this.dnK();
            frd frd2 = frf2.Zx(eIm2.fwt().wp());
            if (frd2 == null) {
                pfX.error((Object)("Active Deck unknown , playerId=" + this.aXv));
                return;
            }
            ArrayList<Integer> arrayList = frd2.eEv();
            if (bl) {
                this.e(exx_2.rGi).fOA();
            }
            for (Integer n : arrayList) {
                if (n == null || n == 0 || list.contains(n.longValue())) continue;
                fqE fqE2 = (fqE)this.dkB().pc(n);
                if (fqE2 == null) {
                    return;
                }
                int n2 = frh.a(n, frd2, this);
                if (n2 == fqE2.cmL()) {
                    this.c(fqE2);
                    continue;
                }
                fqE fqE3 = (fqE)fqE2.bff();
                fqE3.cj((short)n2);
                this.c(fqE3);
            }
            if (bl) {
                this.e(exx_2.rGi).fOB();
            }
        } else {
            if (bl) {
                this.e(exx_2.rGi).fOA();
            }
            this.aG(list);
            if (bl) {
                this.e(exx_2.rGi).fOB();
            }
        }
    }

    private void aG(List<Long> list) {
        for (fqE fqE2 : this.dkB()) {
            if (fqE2 == null || list.contains(fqE2.axA())) continue;
            this.c(fqE2);
        }
    }

    private void c(fqE<fqD> fqE2) {
        if (fqE2 == null) {
            return;
        }
        fqD fqD2 = fqE2.giP();
        if (fqE2.cmL() <= 0 && !fqD2.giL()) {
            return;
        }
        if (fqD2.eeY()) {
            for (enk_0 enk_02 : fqE2) {
                enk_02.a(fqE2, this, this.bdV(), enf_0.fBb(), this.bcC(), this.bcD(), this.bcE(), this, null, false);
            }
        }
    }

    public final void e(qm_0 qm_02) {
        this.fhn();
        try {
            this.a(this.doV(), qm_02, false);
            this.b(qm_02, false);
            this.ge(false);
            this.lh(false);
            this.a(qm_02, false);
            this.ga(false);
            this.gb(false);
            this.dlk();
            this.dnr();
            this.dpF();
        }
        finally {
            this.fho();
        }
    }

    public void dpF() {
    }

    public void f(qm_0 qm_02) {
        exf_2 exf_22 = this.e(exx_2.rGi);
        int n = exf_22.aYC();
        this.e(qm_02);
        this.OC(Math.min(n, exf_22.aYD()));
    }

    protected final void fhc() {
        this.doc().a((qu_0)this, this.fgg());
        this.e(this.pgf);
    }

    protected final List<erh_0> g(qm_0 qm_02) {
        List<erh_0> list = this.doc().fHG();
        Iterator<erh_0> iterator = list.iterator();
        ArrayList<erh_0> arrayList = new ArrayList<erh_0>();
        while (iterator.hasNext()) {
            erh_0 erh_02 = iterator.next();
            if (!erh_02.fGk().cwt()) continue;
            erh_0 erh_03 = erh_02.h(qm_02);
            arrayList.add(erh_03);
        }
        return arrayList;
    }

    protected void aH(List<erh_0> list) {
        for (erh_0 erh_02 : list) {
            QD.baX();
            erh_0 erh_03 = erh_02;
            erh_03.mk(true);
            erh_03.e(this);
            erh_03.f(this);
            erh_03.bbs();
            erh_03.g(this);
            erh_03.aZp();
        }
    }

    @Deprecated
    public void a(short s, short s2, int n, enk_0 enk_02) {
        this.a(s, s2, n, enk_02, false);
    }

    @Deprecated
    public void a(short s, short s2, int n, enk_0 enk_02, boolean bl) {
        qm_0 qm_02 = this.dlK() != null ? this.dlK().bbh() : this.dke();
        enm_0 enm_02 = new enm_0();
        QD.baX();
        eor_0 eor_02 = eor_0.a(qm_02, this, s, s2, false);
        eor_02.e(this);
        eor_02.mh(bl);
        enm_02.RR(n).qt(eor_02.d());
        eor_02.a(enm_02.fBe());
        eor_02.b(enk_02);
        eor_02.a(null, false);
    }

    public void dm(short s) {
        this.a(s, (short)0, this.dke());
    }

    public void U(short s, short s2) {
        this.a(s, s2, this.dke());
    }

    public void a(short s, short s2, qm_0 qm_02) {
        fqU fqU2 = fqX.gjM().Zr(s);
        fqU fqU3 = fqU2.cm(s2);
        ArrayList<enk_0> arrayList = fqU2.fB(s2);
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            enk_0 enk_02 = arrayList.get(i);
            enk_02.a(fqU3, this, qm_02, enf_0.fBb(), this.bcC(), this.bcD(), this.bcE(), this, null, false);
        }
    }

    public void dn(short s) {
        this.doc().Sf(s);
    }

    public int doZ() {
        return 0;
    }

    public int dpR() {
        return 0;
    }

    public @Unmodifiable Collection<Integer> dpS() {
        return Collections.emptyList();
    }

    public int dpT() {
        return 0;
    }

    public boolean doJ() {
        return true;
    }

    public short dpD() {
        return 0;
    }

    public void OE(int n) {
        if (n == 0) {
            return;
        }
        Object r = fgD.fXh().Vd(n);
        if (r == null) {
            return;
        }
        ffV ffV2 = ffV.k(r);
        for (enk_0 enk_02 : ffV2) {
            enk_02.a(ffV2, this, this.bdV(), enf_0.fBb(), this.bcC(), this.bcD(), this.bcE(), this, null, false);
        }
    }

    public long b(ezw ezw2) {
        return this.dlr() + ezw2.fmD();
    }

    public long fhd() {
        return this.dlr() + this.fgi();
    }

    public void fhe() {
    }

    @Override
    public boolean v(long l, long l2) {
        for (QD qD : this.doc()) {
            if (qD.d() != enf_0.qPC.d() || (long)((erh_0)qD).fGk().gjy() != l) continue;
            return l2 == (long)((erh_0)qD).fGk().cmL();
        }
        return false;
    }

    @Override
    public boolean w(long l, long l2) {
        for (QD qD : this.doc()) {
            if (qD.d() != enf_0.qPC.d() || (long)((erh_0)qD).fGk().gjy() != l) continue;
            return l2 <= (long)((erh_0)qD).fGk().cmL();
        }
        return false;
    }

    @Override
    public boolean a(long l, long l2, eyo_0 eyo_02) {
        if (this.doc() == null) {
            return false;
        }
        if (eyo_02 == null) {
            return false;
        }
        for (QD qD : this.doc()) {
            fqU fqU2;
            if (qD.d() != enf_0.qPC.d() || (long)(fqU2 = ((erh_0)qD).fGk()).gjy() != l) continue;
            if ((long)fqU2.cmL() != l2) {
                return false;
            }
            if (qD.bbc() == null) {
                return false;
            }
            return qD.bbc().Sn() == eyo_02.Sn();
        }
        return false;
    }

    @Override
    public boolean a(long l, eyo_0 eyo_02) {
        if (this.doc() == null) {
            return false;
        }
        if (eyo_02 == null) {
            return false;
        }
        for (QD qD : this.doc()) {
            fqU fqU2;
            if (qD.d() != enf_0.qPC.d() || (long)(fqU2 = ((erh_0)qD).fGk()).gjy() != l) continue;
            if (qD.bbc() == null) {
                return false;
            }
            return qD.bbc().Sn() == eyo_02.Sn();
        }
        return false;
    }

    @Override
    public boolean b(long l, long l2, eyo_0 eyo_02) {
        if (this.doc() == null) {
            return false;
        }
        if (eyo_02 == null) {
            return false;
        }
        for (QD qD : this.doc()) {
            fqU fqU2;
            if (qD.d() != enf_0.qPC.d() || (long)(fqU2 = ((erh_0)qD).fGk()).gjy() != l) continue;
            if ((long)fqU2.cmL() != l2) {
                return false;
            }
            if (qD.bbc() == null) {
                return false;
            }
            if (!(qD.bbc() instanceof euc_1)) {
                return false;
            }
            return ((euc_1)qD.bbc()).dlK().kp(qD.bbc().Sn()) == eyo_02.bcP();
        }
        return false;
    }

    @Override
    public boolean b(long l, eyo_0 eyo_02) {
        if (this.doc() == null) {
            return false;
        }
        if (eyo_02 == null) {
            return false;
        }
        for (QD qD : this.doc()) {
            fqU fqU2;
            if (qD.d() != enf_0.qPC.d() || (long)(fqU2 = ((erh_0)qD).fGk()).gjy() != l) continue;
            if (qD.bbc() == null) {
                return false;
            }
            if (!(qD.bbc() instanceof euc_1)) {
                return false;
            }
            return ((euc_1)qD.bbc()).dlK().kp(qD.bbc().Sn()) == eyo_02.bcP();
        }
        return false;
    }

    @Override
    public boolean kW(long l) {
        for (QD qD : this.doc()) {
            if (qD.d() != enf_0.qPC.d() || (long)((erh_0)qD).fGk().gjy() != l) continue;
            return true;
        }
        return false;
    }

    @Override
    public int dh(long l) {
        for (QD qD : this.doc()) {
            if (qD.d() != enf_0.qPC.d() || (long)((erh_0)qD).fGk().gjy() != l) continue;
            return ((erh_0)qD).fGk().cmL();
        }
        return -1;
    }

    public boolean OF(int n) {
        return this.OH(n) != null;
    }

    public boolean OG(int n) {
        return this.OI(n) != null;
    }

    public QD OH(int n) {
        for (QD qD : this.doc()) {
            if (qD.d() != n) continue;
            return qD;
        }
        return null;
    }

    public QD OI(int n) {
        for (QD qD : this.doc()) {
            if (qD.aZH() != n) continue;
            return qD;
        }
        return null;
    }

    public boolean fhf() {
        return this.pge.fhf();
    }

    public void lp(boolean bl) {
        this.pge.lw(bl);
    }

    public void f(zk_2 zk_22) {
    }

    public byte fhg() {
        return this.dlL() == null ? this.bcP() : this.dlL().bcP();
    }

    public void lq(boolean bl) {
        this.pge.lq(bl);
    }

    public boolean fhh() {
        return this.pge.fhh();
    }

    public void doB() {
        int n = this.c(exx_2.rGl);
        int n2 = this.d(exx_2.rGl);
        int n3 = this.c(exx_2.rGj);
        int n4 = this.d(exx_2.rGj);
        int n5 = this.c(exx_2.rGk);
        int n6 = this.d(exx_2.rGk);
        this.dmg();
        int n7 = this.d(exx_2.rGl);
        int n8 = n7 - n2;
        int n9 = this.d(exx_2.rGj);
        int n10 = n9 - n4;
        int n11 = this.d(exx_2.rGk);
        int n12 = n11 - n6;
        this.e(exx_2.rGl).op(n + n8);
        this.e(exx_2.rGj).op(n3 + n10);
        this.e(exx_2.rGk).op(n5 + n12);
    }

    public void lr(boolean bl) {
        this.pge.lv(bl);
    }

    protected void ae(exP exP2) {
        ezn_0 ezn_02 = exP2.dob();
        if (ezn_02 == null) {
            return;
        }
        ezn_02.py(this.aXv);
    }

    public void OJ(int n) {
        if (this.asf != 0 && this.asf != 5 && !this.i(ezj_0.puv)) {
            return;
        }
        ety_0 ety_02 = this.dlK();
        if (!this.djT() || ety_02 != null && ety_02.dGp() != etw_0.rqU) {
            return;
        }
        int n2 = this.d(exx_2.rGi);
        if (this.a(exx_2.rGG)) {
            exf_2 exf_22 = this.e(exx_2.rGG);
            float f2 = (float)n / (float)n2;
            float f3 = f2 / 5.0f * 1000.0f;
            exf_22.op((int)((float)exf_22.aYB() + f3));
        }
    }

    public float fhi() {
        if (this.a(exx_2.rGG)) {
            return (float)this.e(exx_2.rGG).aYB() / 10.0f;
        }
        return 0.0f;
    }

    public int OK(int n) {
        return n - VJ.bt((float)n * this.fhi() / 100.0f);
    }

    protected void fhj() {
        this.d(this.doV());
    }

    protected void d(eyp eyp2) {
        if (eyp2.fhN().length <= 0) {
            return;
        }
        ezg_0<exe_1> ezg_02 = this.fgN();
        if (ezg_02 == null) {
            pfX.error((Object)"manager de propri\u00e9t\u00e9 de combat null au chargement des donn\u00e9es de combat");
            return;
        }
        for (int n : eyp2.fhN()) {
            exe_1 exe_12 = exe_1.Te(n);
            if (exe_12 != null) {
                ezg_02.e(exe_12);
                ezg_02.c(exe_12);
                continue;
            }
            pfX.error((Object)("id d'une propri\u00e9t\u00e9 de base incorrect :" + n));
        }
    }

    @Nullable
    public frf dnJ() {
        return null;
    }

    public eHZ dnN() {
        return null;
    }

    public void a(eHZ eHZ2) {
    }

    public eIm dnK() {
        return null;
    }

    public eIj dnL() {
        return null;
    }

    public void b(eIm eIm2) {
    }

    public fhm dnO() {
        return null;
    }

    public fhe dnP() {
        return null;
    }

    public fqP<? extends fqE> fhk() {
        return null;
    }

    public long aZj() {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public eyu_0 fhl() {
        return this.pgt;
    }

    public BitSet fhm() {
        return this.pgq;
    }

    public boolean d(int n, short s) {
        return false;
    }

    public void dkK() {
    }

    public void OL(int n) {
    }

    public void b(int n, eyc eyc2) {
        this.a(n, eyc2);
    }

    protected void a(int n, eyc eyc2) {
    }

    public void OM(int n) {
        this.dkM();
    }

    public void dkM() {
    }

    public boolean dkN() {
        return false;
    }

    public void fhn() {
        if (this.pgA == 0) {
            assert (this.pgz == null);
            this.pgz = new eye_0();
        }
        this.pgA = (byte)(this.pgA + 1);
        if (this.pgA > 100) {
            pfX.warn((Object)"Il doit y avoir un pobl\u00e8me....", (Throwable)new Exception());
        }
    }

    public void c(String string, Runnable runnable) {
        if (this.pgz == null) {
            runnable.run();
        } else {
            this.pgz.d(string, runnable);
        }
    }

    public void fho() {
        this.pgA = (byte)(this.pgA - 1);
        if (this.pgA == 0) {
            this.pgz.bGy();
            this.pgz = null;
        }
    }

    protected void dny() {
    }

    protected <F extends eyh_0<C>, C extends exP> void a(F f2) {
        this.pge = f2;
    }

    public <F extends eyh_0<C>, C extends exP> F fhp() {
        return (F)this.pge;
    }

    protected void dlm() {
    }

    public void W(int n, boolean bl) {
        this.a(n, (HashMap<String, Object>)null, bl);
    }

    public void a(int n, @Nullable HashMap<String, Object> hashMap, boolean bl) {
    }

    @Override
    public long fhq() {
        return this.aXv;
    }

    @Override
    @Nullable
    public TLongShortHashMap fhr() {
        return this.pgB;
    }

    public exP fhs() {
        return null;
    }

    @Override
    public void a(ewy_2 ewy_22, short s) {
        if (this.pgB == null) {
            this.pgB = new TLongShortHashMap();
        }
        short s2 = this.pgB.get(ewy_22.fhq());
        s2 = (short)(s2 + s);
        this.pgB.put(ewy_22.fhq(), s2);
    }

    @Override
    public void b(ewy_2 ewy_22, short s) {
        if (this.pgB != null) {
            short s2 = this.pgB.get(ewy_22.fhq());
            s2 = (short)(s2 - s);
            this.pgB.put(ewy_22.fhq(), s2);
        }
    }

    @Override
    public void c(ewy_2 ewy_22, short s) {
        if (this.pgB == null) {
            this.pgB = new TLongShortHashMap();
        }
        this.pgB.put(ewy_22.fhq(), s);
    }

    @Override
    public void a(ewy_2 ewy_22) {
        if (this.pgB != null) {
            this.pgB.remove(ewy_22.fhq());
        }
    }

    @Override
    public void fht() {
        this.pgB = null;
    }

    @Override
    public String fhu() {
        if (this.dlK() != null) {
            Object object = this.getName();
            if (((String)object).length() == 0) {
                object = "id(" + this.aXv + ") breed(" + String.valueOf(this.doV() != null ? Short.valueOf(this.doV().aWP()) : "unknown") + ")";
            }
            String string = "AggroList for " + (String)object + ":\n";
            if (this.pgB != null) {
                TLongShortIterator tLongShortIterator = this.pgB.iterator();
                while (tLongShortIterator.hasNext()) {
                    tLongShortIterator.advance();
                    long l = tLongShortIterator.key();
                    ety_0 ety_02 = this.dlK();
                    Object f2 = ety_02.qJ(l);
                    Object object2 = null;
                    if (f2 != null && (object2 = ((exP)f2).getName()) != null && ((String)object2).isEmpty()) {
                        object2 = "id(" + ((exP)f2).aXv + ") breed(" + String.valueOf(((exP)f2).doV() != null ? Short.valueOf(((exP)f2).doV().aWP()) : "unknown") + ")";
                    }
                    string = string + (String)object2 + " : " + tLongShortIterator.value() + "\n";
                }
            }
            return string;
        }
        return this.getName() + " not in Fight";
    }

    public void f(QD qD) {
    }

    public int bvS() {
        return this.ltt.bvR().bfX();
    }

    public int bvQ() {
        return this.ltt.bvP().bfX();
    }

    @NotNull
    public abstract ejg_0 dmn();

    @Nullable
    public eid_0 dpX() {
        return null;
    }

    public short fhv() {
        eid_0 eid_02 = this.dpX();
        return eid_02 == null ? (short)-1 : (short)eid_02.dsm();
    }

    public void a(eid_0 eid_02) {
    }

    public boolean i(boolean bl, boolean bl2) {
        return true;
    }

    public boolean dnY() {
        return this.gd(true);
    }

    public boolean gd(boolean bl) {
        return true;
    }

    public void dpt() {
    }

    public abstract void aPg();

    public abstract int dlo();

    public abstract int dlp();

    public boolean dmc() {
        return fcK.rUe.as(this.Xi(), this.Sn()) || this.ieM;
    }

    public void gc(boolean bl) {
        this.ieM = bl;
    }

    public abstract void a(int var1, Object var2);

    protected static <C extends exP> C b(ety_0<C> ety_02, C c2) {
        if (ety_02 == null) {
            return c2;
        }
        C c3 = ety_02.aV(c2);
        return c3 == null ? c2 : c3;
    }

    protected static <C extends exP> C c(ety_0<C> ety_02, C c2) {
        if (ety_02 == null) {
            return c2;
        }
        C c3 = ety_02.aW(c2);
        return c3 == null ? c2 : c3;
    }

    public abstract exP dlI();

    @Override
    public long dOo() {
        exP exP2 = this.dlI();
        if (exP2 == null) {
            return 0L;
        }
        return exP2.aXv;
    }

    @Nullable
    public ezn_0 dob() {
        return null;
    }

    public ezn_0 fhw() {
        return null;
    }

    public void CS(int n) {
    }

    public void ls(boolean bl) {
        this.pge.lx(bl);
    }

    public void fhx() {
    }

    @Nullable
    public frd dnM() {
        return null;
    }

    public void djC() {
        ety_0 ety_02 = this.dlK();
        if (ety_02 == null) {
            return;
        }
        ety_02.aO(this);
        ety_02.A(this);
        ety_02.bf(this);
        ety_02.aP(this);
        ety_02.aY(this);
        this.fga();
        ety_02.be(this);
        ety_02.aR(this);
        ety_02.bg(this);
    }

    public boolean a(Vf vf) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public ern_0 dmQ() {
        return this.pgf;
    }

    @Override
    public Optional<fte_0> doa() {
        return Optional.empty();
    }

    @Override
    public void bpP() {
    }

    @Override
    public boolean a(eyp_0 eyp_02) {
        return eyp_0.pmN.a(eyp_02);
    }

    public exh_1 fhy() {
        return null;
    }

    @Override
    public double ON(int n) {
        int n2 = this.dmn().a(eje_0.qyz, n, 2);
        return (float)n2 / 100.0f;
    }

    public Collection<eyk_0> fhz() {
        return this.pga;
    }

    public eMS dpV() {
        return null;
    }

    public long esx() {
        return 0L;
    }

    public boolean fhA() {
        return this.pgu != null;
    }

    public frr fhB() {
        return this.pgu;
    }

    public void a(frr frr2) {
        this.pgu = frr2;
    }

    public String toString() {
        return "BasicCharacterInfo{m_id=" + this.aXv + ", m_ownerId=" + this.ePP + ", m_name='" + this.p + "'}";
    }

    public boolean fhC() {
        long l = ewo_0.oBF.j(ewr_0.oFa);
        if (l != 0L && ue_0.bjV().bjc().g(uw_0.fn(l))) {
            return true;
        }
        return ezo_1.rML.matcher(this.p).find() || this.p.matches(".*\\d+.*");
    }

    @Override
    public /* synthetic */ QE baz() {
        return this.doc();
    }

    @Override
    public /* synthetic */ pr_0 b(pt_0 pt_02) {
        return this.e(pt_02);
    }
}

