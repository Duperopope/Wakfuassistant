/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eYE
 */
public final class eye_2
implements ezu_1,
ezx_1,
faa,
fac {
    private static final Logger rKk = Logger.getLogger(eye_2.class);
    private final List<ezy_1> rKl = new ArrayList<ezy_1>();
    private long aXv;
    private String p;
    private long ioh;
    private String aNf;
    private String aCL;
    private short ejt;
    private final eyg_2 rKm = new eyg_2();
    private ux_0 rKn;
    private int rKo;
    private final TLongObjectHashMap<fab> rKp = new TLongObjectHashMap();
    private final TLongObjectHashMap<ezz_1> rKq = new TLongObjectHashMap();
    private final TIntObjectHashMap<ezv_1> rKr = new TIntObjectHashMap();
    private final ezw_1 rKs = new ezw_1();
    private final List<Runnable> rKt = new ArrayList<Runnable>();

    @Override
    public long Sn() {
        return this.aXv;
    }

    @Override
    public long drj() {
        long[] lArray = this.rKp.keys();
        Arrays.sort(lArray);
        return lArray.length > 0 ? lArray[0] : 0L;
    }

    @Override
    public long fPS() {
        fab fab2 = (fab)this.rKp.get(this.dKs());
        TLongObjectIterator tLongObjectIterator = this.rKp.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fab fab3 = (fab)tLongObjectIterator.value();
            if (fab3.Sn() == this.drj() || fab2.bfE() <= fab3.bfE()) continue;
            fab2 = fab3;
        }
        return fab2.Sn();
    }

    @Override
    public long dKs() {
        long[] lArray = this.rKp.keys();
        Arrays.sort(lArray);
        return lArray.length > 1 ? lArray[1] : 0L;
    }

    @Override
    public String getName() {
        return this.p;
    }

    @Override
    public long Yc() {
        return this.ioh;
    }

    @Override
    public String getDescription() {
        return this.aNf;
    }

    @Override
    public String getMessage() {
        return this.aCL;
    }

    @Override
    public short cmL() {
        return this.ejt;
    }

    @Override
    public int Yh() {
        return this.rKm.Yh();
    }

    @Override
    public int Yj() {
        return this.rKm.Yj();
    }

    @Override
    public ezz_1 jP(long l) {
        return (ezz_1)this.rKq.get(l);
    }

    @Override
    public List<ezz_1> rG(long l) {
        ArrayList<ezz_1> arrayList = new ArrayList<ezz_1>();
        TLongObjectIterator tLongObjectIterator = this.rKq.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ezz_1 ezz_12 = (ezz_1)tLongObjectIterator.value();
            if (ezz_12.Xm() != l) continue;
            arrayList.add(ezz_12);
        }
        return arrayList;
    }

    @Override
    public fab jR(long l) {
        return (fab)this.rKp.get(l);
    }

    @Override
    public List<fab> fPT() {
        return Collections.unmodifiableList(new ArrayList(this.rKp.valueCollection()));
    }

    @Override
    public ezv_1 Tu(int n) {
        return (ezv_1)this.rKr.get(n);
    }

    @Override
    public int fPU() {
        return this.rKq.size();
    }

    @Override
    public boolean isFull() {
        return this.fPU() >= 200 + this.rKo;
    }

    @Override
    public boolean I(TObjectProcedure<ezz_1> tObjectProcedure) {
        return this.rKq.forEachValue(tObjectProcedure);
    }

    @Override
    public int fPV() {
        return this.rKp.size();
    }

    @Override
    public boolean g(TObjectProcedure<fab> tObjectProcedure) {
        return this.rKp.forEachValue(tObjectProcedure);
    }

    @Override
    public int fPW() {
        return this.rKr.size();
    }

    @Override
    public boolean J(TObjectProcedure<ezv_1> tObjectProcedure) {
        return this.rKr.forEachValue(tObjectProcedure);
    }

    @Override
    public ezw_1 fPX() {
        return this.rKs;
    }

    @Override
    public int Yl() {
        return this.rKm.Yl();
    }

    @Override
    public int fPY() {
        return this.rKm.fPY();
    }

    @Override
    public int Yp() {
        return this.rKm.Yp();
    }

    @Override
    public ux_0 fPZ() {
        return this.rKn;
    }

    void dC(long l) {
        this.aXv = l;
    }

    void setName(String string) {
        String string2 = this.p;
        this.p = string;
        this.sx(string2);
    }

    void jS(long l) {
        this.ioh = l;
        this.fQb();
    }

    void cA(String string) {
        this.aNf = string;
        this.fQc();
    }

    void co(String string) {
        this.aCL = string;
        this.fQd();
    }

    void bw(short s) {
        this.ejt = s;
        this.ex(this.ejt);
    }

    void Tv(int n) {
        int n2 = this.rKm.Yj();
        this.rKm.Tv(n);
        this.Tz(this.rKm.Yj() - n2);
    }

    void Tw(int n) {
        int n2 = this.rKm.Yh();
        this.rKm.Tw(n);
        this.TA(this.rKm.Yh() - n2);
    }

    void Tq(int n) {
        this.rKm.Tq(n);
    }

    @Override
    public void Tx(int n) {
        this.rKm.Tx(n);
        this.TC(n);
    }

    @Override
    public ezz_1 fQa() {
        long l = this.drj();
        TLongObjectIterator tLongObjectIterator = this.rKq.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ezz_1 ezz_12 = (ezz_1)tLongObjectIterator.value();
            if (ezz_12.Xm() != l) continue;
            return ezz_12;
        }
        return null;
    }

    @Override
    public void Ty(int n) {
        this.rKm.Ty(n);
        this.TD(n);
    }

    void g(fab fab2) {
        this.rKp.put(fab2.Sn(), (Object)fab2);
        fab2.a(this);
        this.h(fab2);
    }

    void j(long l, short s) {
        fab fab2 = (fab)this.rKp.get(l);
        fab2.cX(s);
        this.i(fab2);
    }

    void ry(long l) {
        fab fab2 = (fab)this.rKp.remove(l);
        fab2.b(this);
        this.j(fab2);
    }

    void f(ezz_1 ezz_12) {
        this.rKq.put(ezz_12.Sn(), (Object)ezz_12);
        ezz_12.a(this);
        this.g(ezz_12);
    }

    void rx(long l) {
        ezz_1 ezz_12 = (ezz_1)this.rKq.remove(l);
        ezz_12.b(this);
        this.h(ezz_12);
    }

    void j(ezv_1 ezv_12) {
        if (ezv_12 == null) {
            rKk.error((Object)("Trying to add null bonus to guild " + this.Sn()));
            return;
        }
        this.rKr.put(ezv_12.tJ(), (Object)ezv_12);
        ezv_12.a(this);
        this.k(ezv_12);
    }

    void Tl(int n) {
        ezv_1 ezv_12 = (ezv_1)this.rKr.remove(n);
        ezv_12.b(this);
        this.l(ezv_12);
    }

    void Tr(int n) {
        this.rKo += n;
        this.TB(n);
    }

    private void sx(String string) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.mx(string);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee au changement de nom de la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    private void fQb() {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.dKu();
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee au changement de blason pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    private void fQc() {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.dKv();
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee au changement de description pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    private void ex(short s) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.bP(s);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee au changement de niveau pour la guilde " + String.valueOf(this) + " niveau = " + s), (Throwable)runtimeException);
            }
        }
    }

    private void Tz(int n) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.FI(n);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee au changement de point de guilde, delta = " + n + " pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    private void TA(int n) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.FH(n);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee au changement de point de guilde, delta = " + n + " pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    private void fQd() {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.dKw();
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee au changement de message de la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    private void h(fab fab2) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.b(fab2);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee \u00e0 l'ajout du rank " + String.valueOf(fab2) + " pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    private void i(fab fab2) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.c(fab2);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee sur le changement de rang " + String.valueOf(fab2) + " pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    private void j(fab fab2) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.d(fab2);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee au retrait du rang " + String.valueOf(fab2) + " pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    private void g(ezz_1 ezz_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.b(ezz_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee \u00e0 l'ajout d'un membre " + String.valueOf(ezz_12) + " pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    private void h(ezz_1 ezz_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.c(ezz_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee au retrait d'un membre " + String.valueOf(ezz_12) + " pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    private void k(ezv_1 ezv_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.e(ezv_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee pour le bonus " + String.valueOf(ezv_12) + " de la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    private void l(ezv_1 ezv_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.f(ezv_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee au retrait d'un bonus " + String.valueOf(ezv_12) + " pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    private void TB(int n) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.FL(n);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception raised changing bonus members size, delta : " + n + " for guild " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    private void TC(int n) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.FJ(n);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee lors de la modification de points gagn\u00e9s " + n + " pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    private void TD(int n) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.FK(n);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee lors de la modification de la semaine " + n + " pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void e(fab fab2) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.e(fab2);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee \u00e0 la modification d'un rang " + String.valueOf(fab2) + " pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void d(ezz_1 ezz_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.d(ezz_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee \u00e0 la modification d'un membre " + String.valueOf(ezz_12) + " pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void i(ezz_1 ezz_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.i(ezz_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception raised when updating xp for member " + String.valueOf(ezz_12) + " of guild " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void j(ezz_1 ezz_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.j(ezz_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception raised when updating guild points for member " + String.valueOf(ezz_12) + " of guild " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void k(ezz_1 ezz_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.k(ezz_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception raised when updating guild points for member " + String.valueOf(ezz_12) + " of guild " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void l(ezz_1 ezz_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.l(ezz_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception raised when updating name for member " + String.valueOf(ezz_12) + " of guild " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void m(ezz_1 ezz_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.m(ezz_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception raised when updating sex (UwU) for member " + String.valueOf(ezz_12) + " of guild " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void n(ezz_1 ezz_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.n(ezz_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception raised when updating breed for member " + String.valueOf(ezz_12) + " of guild " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void o(ezz_1 ezz_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.o(ezz_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception raised when updating nation for member " + String.valueOf(ezz_12) + " of guild " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void p(ezz_1 ezz_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.p(ezz_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception raised when updating languages for member " + String.valueOf(ezz_12) + " of guild " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void q(ezz_1 ezz_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.q(ezz_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception raised when updating community for member " + String.valueOf(ezz_12) + " of guild " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void r(ezz_1 ezz_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.i(ezz_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception raised when updating owner id for member " + String.valueOf(ezz_12) + " of guild " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void s(ezz_1 ezz_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.i(ezz_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception raised when updating connection status for member " + String.valueOf(ezz_12) + " of guild " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void a(ezz_1 ezz_12, long l) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.a(ezz_12, l);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee \u00e0 la modification d'un rang d'un membre " + String.valueOf(ezz_12) + " pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void g(ezv_1 ezv_12) {
        for (ezy_1 ezy_12 : this.rKl) {
            try {
                ezy_12.g(ezv_12);
            }
            catch (RuntimeException runtimeException) {
                rKk.error((Object)("Exception levee \u00e0 l'activation d'un bonus " + String.valueOf(ezv_12) + " pour la guilde " + String.valueOf(this)), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public boolean a(ezy_1 ezy_12) {
        return !this.rKl.contains(ezy_12) && this.rKl.add(ezy_12);
    }

    @Override
    public boolean b(ezy_1 ezy_12) {
        return this.rKl.remove(ezy_12);
    }

    public String toString() {
        return "GuildModel{m_id=" + this.aXv + ", m_name='" + this.p + "', m_members=" + this.rKq.size() + "}";
    }

    @Override
    public void V(ux_0 ux_02) {
        this.rKn = ux_02;
    }

    @Override
    public long fQe() {
        return this.rKq.valueCollection().stream().filter(ezz_1::bSr).count();
    }

    @Override
    public int fQf() {
        return this.rKo;
    }

    @Override
    public void E(Runnable runnable) {
        this.rKt.add(runnable);
    }

    @Override
    public void fQg() {
        for (Runnable runnable : this.rKt) {
            runnable.run();
        }
        this.rKt.clear();
    }
}

