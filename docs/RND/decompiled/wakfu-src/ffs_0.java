/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ffs
 */
public abstract class ffs_0
implements gq_0<sv_2>,
Iterable<ffV> {
    public static final int sfj = 2175;
    public static final int sfk = 5;
    private static final int sfl = 2;
    private static final Logger sfm = Logger.getLogger(ffs_0.class);
    protected long bgK;
    protected int brR;
    protected final RL<ffV, uy_1> sfn;
    protected byte mby;
    protected final RU<ffV> sfo;
    @NotNull
    private fgW sfp = fgW.smf;
    protected final List<ffm_0> sfq = new ArrayList<ffm_0>();
    private long ePP;
    private long aDh;

    protected ffs_0(long l, int n, RU rU, short s) {
        this.bgK = l;
        this.sfn = new RL<ffV, uy_1>(fgD.fXh(), rU, s, true);
        this.sfn.a(Sj.bnL);
        this.mby = 0;
        this.brR = n;
        this.sfo = rU;
        this.fVa();
    }

    public void pi(long l) {
        this.ePP = l;
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void fVa() {
        int[] nArray = ffn_0.sgo.UU(this.brR);
        if (nArray != null) {
            this.b(new fgF(nArray, this.sfo));
        } else {
            this.b(this.sfo);
        }
    }

    public void b(RU<ffV> rU) {
        this.sfn.a(rU);
    }

    public int avr() {
        return this.brR;
    }

    public byte eDo() {
        return this.mby;
    }

    public void dC(byte by) {
        this.gg(by);
    }

    public long Lx() {
        return this.bgK;
    }

    public RL<ffV, uy_1> fVb() {
        return this.sfn;
    }

    public short bfa() {
        return this.sfn.bfa();
    }

    public int aVo() {
        return this.sfn.aVo();
    }

    @NotNull
    public fgW fVc() {
        return this.sfp;
    }

    public void a(@Nullable fgW fgW2) {
        this.sfp = fgW2 == null ? fgW.smf : fgW2;
    }

    public boolean g(ffV ffV2, short s) {
        return this.sfn.c(ffV2, s);
    }

    public boolean d(long l, short s) {
        return this.sfn.d(l, s);
    }

    public boolean bq(ffV ffV2) {
        return this.sfn.i(ffV2);
    }

    public boolean h(ffV ffV2, short s) {
        return this.sfn.b(ffV2, s);
    }

    public boolean co(ffV ffV2) {
        return this.sfn.k(ffV2);
    }

    public void beY() {
        this.sfn.beY();
    }

    public void b(Sp sp) {
        if (sp == null) {
            return;
        }
        this.sfn.b(sp);
    }

    public void a(Sp sp) {
        this.sfn.a(sp);
    }

    @Override
    @NotNull
    public Iterator<ffV> iterator() {
        return this.sfn.iterator();
    }

    public ffV eQ(short s) {
        return this.sfn.ai(s);
    }

    @Override
    public boolean a(sv_2 sv_22) {
        sv_22.ZC = this.bgK;
        sv_22.Th = this.brR;
        sv_22.ZD = this.sfn.bfa();
        sv_22.Tg = this.mby;
        sv_22.ZE = this.sfp.aJr();
        for (ffV ffV2 : this.sfn) {
            if (!ffV2.bfh()) continue;
            vv_2 vv_22 = new vv_2();
            vv_22.adx = this.sfn.dK(ffV2.LV());
            boolean bl = ffV2.b(vv_22.afu);
            if (bl) {
                sv_22.ZF.afs.add(vv_22);
                continue;
            }
            sfm.error((Object)("Impossible de convertir l'item \u00e0 la position " + vv_22.adx + " sous forme d\u00e9s\u00e9rialis\u00e9e brute"));
            return false;
        }
        Set<Long> set = this.sfn.beN();
        if (!set.isEmpty()) {
            sv_22.ZF.aft = new long[set.size()];
            int n = 0;
            for (Long l : set) {
                sv_22.ZF.aft[n] = l;
                ++n;
            }
        }
        return true;
    }

    @Override
    public boolean b(sv_2 sv_22) {
        this.bgK = sv_22.ZC;
        this.brR = sv_22.Th;
        this.gg(sv_22.Tg);
        this.sfp = fgW.go(sv_22.ZE);
        this.sfn.ae(sv_22.ZD);
        this.b(ffl_0.sgm);
        if (!ffs_0.a(this.fVf(), this.mby)) {
            sfm.error((Object)("[Bags] Invalid position of bag : position=" + this.mby + ", bag=" + this.bgK + ", owner=" + this.ePP + " / " + this.aDh));
        }
        boolean bl = true;
        for (vv_2 vv_22 : sv_22.ZF.afs) {
            ffV ffV2 = this.sfn.beS().x(vv_22.afu);
            if (ffV2 == null) {
                sfm.error((Object)("Could not unserialize raw item " + String.valueOf(vv_22.afu) + " when adding it to bag " + this.bgK + " of " + this.ePP + " / " + this.aDh));
                continue;
            }
            try {
                if (this.i(ffV2, vv_22.adx)) continue;
                bl = false;
            }
            catch (SD | Sz | sa_0 sb_02) {
                bl = false;
                sfm.error((Object)("[Bags] Could not add item " + ffV2.fWz() + " at position " + vv_22.adx + " of bag " + this.bgK + " of " + this.ePP + " / " + this.aDh + " when reading raw bag " + String.valueOf(sv_22)), (Throwable)sb_02);
            }
        }
        this.fVa();
        if (sv_22.ZF.aft == null) {
            this.sfn.h(Collections.emptyList());
        } else {
            this.sfn.e(sv_22.ZF.aft);
        }
        return bl;
    }

    public int beQ() {
        return this.sfn.beQ();
    }

    public void a(RX<ffV> rX) {
        this.sfn.a(rX);
    }

    public short beO() {
        return this.sfn.beO();
    }

    public short cp(ffV ffV2) {
        return this.sfn.g(ffV2);
    }

    public short cq(ffV ffV2) {
        return this.sfn.h(ffV2);
    }

    public boolean i(ffV ffV2, short s) {
        return this.a(ffV2, s, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(ffV ffV2, short s, @Nullable sh_0 sh_02) {
        if (sh_02 != null) {
            this.sfn.a(sh_02);
        }
        try {
            boolean bl = this.sfn.a(ffV2, s);
            return bl;
        }
        finally {
            if (sh_02 != null) {
                this.sfn.b(sh_02);
            }
        }
    }

    public short cr(ffV ffV2) {
        return this.sfn.e(ffV2);
    }

    public short dK(long l) {
        return this.sfn.dK(l);
    }

    public int beP() {
        return this.sfn.beP();
    }

    public ffV eR(short s) {
        return this.sfn.af(s);
    }

    public boolean bs(ffV ffV2) {
        return this.sfn.c(ffV2);
    }

    public boolean aJG() {
        return this.sfn.aJG();
    }

    public boolean pb(int n) {
        return this.sfn.pb(n);
    }

    public boolean dM(long l) {
        return this.sfn.dM(l);
    }

    public boolean b(long l, short s) {
        return this.a(l, s, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(long l, short s, @Nullable sh_0 sh_02) {
        if (sh_02 != null) {
            this.sfn.a(sh_02);
        }
        try {
            boolean bl = this.sfn.b(l, s);
            return bl;
        }
        finally {
            if (sh_02 != null) {
                this.sfn.b(sh_02);
            }
        }
    }

    public ffV sV(long l) {
        return this.sfn.dN(l);
    }

    public ffV UG(int n) {
        for (ffV ffV2 : this.sfn) {
            if (n != ffV2.dOg().dGh().aIi()) continue;
            return ffV2;
        }
        return null;
    }

    public ffV e(fhy_0 fhy_02) {
        for (ffV ffV2 : this.sfn) {
            if (!ffV2.dOg().dGh().p(fhy_02)) continue;
            return ffV2;
        }
        return null;
    }

    public ffV a(fgg_0 fgg_02) {
        for (ffV ffV2 : this.sfn) {
            if (!ffV2.dOg().c(fgg_02)) continue;
            return ffV2;
        }
        return null;
    }

    public RU<ffV> beR() {
        return this.sfn.beR();
    }

    public boolean bp(ffV ffV2) {
        return this.sfn.b(ffV2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(ffV ffV2, @Nullable Sp sp) {
        if (sp != null) {
            this.sfn.a(sp);
        }
        try {
            boolean bl = this.sfn.b(ffV2);
            return bl;
        }
        finally {
            if (sp != null) {
                this.sfn.b(sp);
            }
        }
    }

    public boolean bt(ffV ffV2) {
        return this.sfn.f(ffV2);
    }

    public ffV UH(int n) {
        return this.sfn.pc(n);
    }

    public ffV c(int n, RX<ffV> rX) {
        return this.sfn.a(n, rX);
    }

    public ffV sW(long l) {
        return this.sfn.dL(l);
    }

    public int fVd() {
        short s = this.sfn.bfa();
        int n = 0;
        for (short s2 = 0; s2 < s; s2 = (short)(s2 + 1)) {
            if (!this.sfn.ah(s2)) continue;
            ++n;
        }
        return n;
    }

    public ArrayList<ffV> pd(int n) {
        return this.sfn.pd(n);
    }

    public ArrayList<ffV> b(int n, RX<ffV> rX) {
        return this.sfn.b(n, rX);
    }

    public ArrayList<ffV> b(RX<ffV> rX) {
        return this.sfn.b(rX);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName()).append(' ').append(this.Lx()).append("{\n");
        stringBuilder.append('\t').append("Owner ").append(this.ePP).append(" / ").append(this.aDh).append('\n');
        stringBuilder.append('\t').append("RefId ").append(this.avr()).append('\n');
        for (short s = 0; s < this.sfn.bfa(); s = (short)(s + 1)) {
            ffV ffV2 = this.sfn.ai(s);
            stringBuilder.append('\t');
            if (ffV2 != null) {
                stringBuilder.append(s).append(" : ").append(ffV2.bfd()).append('x').append(ffV2.avr()).append("; ");
            } else {
                stringBuilder.append(s).append(" : ").append("null").append("; ");
            }
            if (s != this.sfn.bfa() / 2 - 1) continue;
            stringBuilder.append('\n');
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean fVe() {
        return this.avr() == 2175;
    }

    public boolean fVf() {
        return ffn_0.sgo.UV(this.brR);
    }

    public static boolean d(ffV ffV2, exP exP2) {
        short s = exP2.dnG();
        if (ffV2.cmL() > s) {
            return false;
        }
        ang_2 ang_22 = ffV2.dOg().a(ffj_0.sge);
        if (ang_22 != null) {
            return ang_22.b(exP2, ffV2, null, exP2.fgg());
        }
        return true;
    }

    public static boolean a(boolean bl, byte by) {
        if (bl && by <= 3) {
            return false;
        }
        byte by2 = bl ? (byte)5 : 3;
        return by >= 0 && by <= by2;
    }

    public boolean M(TObjectProcedure<ffV> tObjectProcedure) {
        return this.sfn.a(tObjectProcedure);
    }

    public short cs(ffV ffV2) {
        return this.sfn.m(ffV2);
    }

    public abstract ffs_0 dRf();

    public void UI(int n) {
        this.brR = n;
    }

    public void di(long l) {
        this.bgK = l;
    }

    protected void gg(byte by) {
        byte by2 = this.mby;
        this.mby = by;
        for (ffm_0 ffm_02 : this.sfq) {
            ffm_02.onPositionChanged(by2, by);
        }
    }

    public void eS(short s) {
        this.sfn.ae(s);
    }

    public void a(ffm_0 ffm_02) {
        this.sfq.add(ffm_02);
    }

    public void b(ffm_0 ffm_02) {
        this.sfq.remove(ffm_02);
    }
}

