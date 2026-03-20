/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.TestOnly
 */
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

public class ffV
implements RT,
SG,
aEF,
ayZ,
eJl,
eNl,
ffi,
fgf,
fhM,
fiq,
fnQ,
gq<uY> {
    private static final Logger shm = Logger.getLogger(ffV.class);
    protected static final fgb shn = new fgb();
    public static final short sho = 1;
    private static final short shp = 0;
    private static final short shq = 1;
    private long kYd;
    protected boolean Na;
    private fhC jQZ;
    private int shr;
    protected short bol;
    @Nullable
    private fnL klf;
    @Nullable
    protected fij shs;
    @Nullable
    private fhI jRV;
    @Nullable
    private fgX sht;
    @Nullable
    private fgR shu;
    @Nullable
    private fgY mhn;
    @Nullable
    private fhz shv;

    public ffV() {
        this.Na = true;
    }

    public ffV(long l) {
        this.kYd = l;
        this.Na = true;
        this.bYg();
    }

    public static ffV k(fhC fhC2) {
        return ffV.a(ayM.bSE(), fhC2);
    }

    public static ffV a(long l, fhC fhC2) {
        try {
            fim fim2;
            ffV ffV2 = new ffV();
            ffV2.kYd = l;
            ffV2.jQZ = fhC2;
            fov fov2 = foy.sLJ.XQ(fhC2.d());
            if (fov2 != null) {
                ffV2.klf = fnO.sKx.g(fov2);
            }
            if ((fim2 = fin.srJ.VL(fhC2.fYx())) != null) {
                ffV2.shs = fip.b(fim2);
            }
            if (fhC2.fVc() != fgW.smf) {
                ffV2.shu = fgT.b(fhC2.fVc());
            }
            if (fhC2.fYA()) {
                ffV2.mhn = new fgY();
            }
            ffV2.Na = true;
            ffV2.bYg();
            return ffV2;
        }
        catch (Exception exception) {
            shm.error((Object)"Erreur lors d'un checkOut sur un Item : ", (Throwable)exception);
            return null;
        }
    }

    @Nullable
    public static ffV sH(String string) {
        ffV ffV2 = new ffV();
        boolean bl = ffV2.sI(string);
        return bl ? ffV2 : null;
    }

    public void l(fhC fhC2) {
        fim fim2;
        this.jQZ = fhC2;
        fov fov2 = foy.sLJ.XQ(fhC2.d());
        if (fov2 != null) {
            this.klf = fnO.sKx.g(fov2);
        }
        if ((fim2 = fin.srJ.VL(fhC2.fYx())) != null) {
            this.shs = fip.b(fim2);
        }
        if (fhC2.fVc() != fgW.smf) {
            this.shu = fgT.b(fhC2.fVc());
        }
        if (fhC2.fYA()) {
            this.mhn = new fgY();
        }
    }

    public ffV fVT() {
        return this.u(shn.fWE().baY(), this.bol);
    }

    public ffV eU(short s) {
        return this.u(shn.fWE().baY(), s);
    }

    public ffV fVR() {
        return this.to(shn.fWF().baY());
    }

    public ffV to(long l) {
        ffU ffU2 = new ffU(l, this.jQZ, this);
        ffU2.bol = this.bol;
        ffU2.shr = this.shr;
        ffU2.Na = false;
        return ffU2;
    }

    public ffV tp(long l) {
        return this.u(l, this.bol);
    }

    public ffV u(long l, short s) {
        ffV ffV2 = new ffV(l);
        ffV2.jQZ = this.jQZ;
        this.cE(ffV2);
        ffV2.ak(s);
        return ffV2;
    }

    public void cE(ffV ffV2) {
        ffV2.klf = this.klf != null ? fnO.sKx.h(this.klf) : null;
        ffV2.shs = this.shs != null ? fip.a(this.shs) : null;
        if (this.jRV != null) {
            ffV2.jRV = this.jRV.fYR();
        }
        ffV2.sht = this.sht != null ? new fgX(this.sht.pf()) : null;
        ffV2.shu = this.shu != null ? new fgU(this.shu.fXu(), this.shu.eBm()) : null;
        ffV2.mhn = this.mhn != null ? new fgY(this.mhn) : null;
        ffV2.shv = this.shv != null ? new fhz(this.shv) : null;
        ffV2.shr = this.shr;
    }

    public ffV fVU() {
        return this.tp(this.kYd);
    }

    @Override
    public void aZp() {
    }

    @Override
    public void aVI() {
    }

    @Override
    public void aVH() {
        fgc fgc2 = shn.fWG();
        if (fgc2 != null) {
            fgc2.aK(this);
        }
        this.jQZ = null;
        this.klf = null;
        this.shs = null;
        this.jRV = null;
        this.mhn = null;
        this.shv = null;
        this.kYd = 0L;
        this.Na = false;
        this.bol = 0;
    }

    @Override
    public boolean adO() {
        return this.klf != null;
    }

    public void f(fnL fnL2) {
        this.klf = fnL2;
    }

    @Override
    public fnL ead() {
        if (this.klf == null) {
            throw new foE("Aucun familier d\u00e9fini sur l'item " + String.valueOf(this));
        }
        return this.klf;
    }

    @Override
    public boolean pe() {
        return this.shs != null;
    }

    public void a(fir fir2) {
        this.shs = fir2;
    }

    @Override
    public fij fVV() {
        if (this.shs == null) {
            throw new fio("Aucune xp d\u00e9finie sur l'item " + String.valueOf(this));
        }
        return this.shs;
    }

    @Override
    @Contract(pure=true)
    public boolean dXg() {
        return this.jRV != null;
    }

    @Override
    public boolean fVW() {
        return this.dXg() && this.eAZ().fYK();
    }

    @Override
    public int fVX() {
        return this.dXg() ? this.eAZ().fYI() : 0;
    }

    public boolean fVY() {
        return this.dXg() && (this.eAZ().dXi() || this.eAZ().fYQ());
    }

    public void a(fhI fhI2) {
        this.jRV = fhI2;
    }

    @Override
    public fhI eAZ() {
        if (this.jRV == null) {
            throw new fgE("Aucune gemme d\u00e9finie sur l'item " + String.valueOf(this));
        }
        return this.jRV;
    }

    public int fVZ() {
        if (this.jRV == null) {
            return 0;
        }
        Map<Byte, fhN> map = this.jRV.dTS();
        if (map == null || map.isEmpty()) {
            return 0;
        }
        int n = 0;
        for (fhN fhN2 : map.values()) {
            if (fhN2.dBe() != Rd.bjE) continue;
            ++n;
        }
        return map.size() * 10 + n;
    }

    @Override
    public short bfd() {
        return this.bol;
    }

    @Override
    public void ak(short s) {
        if (this.adO() && s > 1) {
            throw new foE("Les stacks d'item ne sont pas autoris\u00e9s pour l'item " + String.valueOf(this));
        }
        if (s == 0) {
            throw new IllegalArgumentException("Impossible de fixer la quantit\u00e9 de l'item " + this.avr() + " \u00e0 0 : il doit \u00e9tre d\u00e9truit.");
        }
        if (s < 0) {
            throw new IllegalArgumentException("Impossible de fixer une quantit\u00e9 n\u00e9gative " + s + " pour l'item " + this.avr());
        }
        if (s > this.bfe()) {
            throw new IllegalArgumentException("Impossible de fixer la quantit\u00e9 de l'objet " + this.avr() + " \u00e0 " + s + " : stackMaximumHeight=" + this.bfe());
        }
        this.bol = s;
        fgi fgi2 = shn.fWH();
        if (fgi2 != null) {
            fgi2.bb(this);
        }
    }

    @Override
    public void al(short s) {
        this.ak((short)(this.bol + s));
    }

    public short fWa() {
        return (short)(this.bfe() - this.bol);
    }

    @Override
    public short bfe() {
        return this.jQZ.bfe();
    }

    @Override
    public int bab() {
        return 12;
    }

    @Override
    public long QF() {
        return this.jQZ.d();
    }

    @Override
    public short cmL() {
        if (this.klf != null) {
            return this.klf.cmL();
        }
        if (this.shs != null) {
            return this.shs.cmL();
        }
        if (this.jQZ != null) {
            return this.jQZ.cmL();
        }
        return 0;
    }

    public short aVe() {
        if (this.klf != null) {
            return this.klf.aVe();
        }
        if (this.shs != null) {
            return this.shs.aVe();
        }
        if (this.jQZ != null) {
            return this.jQZ.cmL();
        }
        return 0;
    }

    @Nullable
    public Short fWb() {
        if (this.klf != null) {
            return this.klf.cmL();
        }
        if (this.shs != null) {
            return this.shs.cmL();
        }
        if (this.sht != null) {
            return Mz.aVX.cR(this.sht.pf());
        }
        return null;
    }

    @Override
    public fgj dwg() {
        return this.jQZ.dwg();
    }

    @Override
    @NotNull
    public Iterator<eNk> iterator() {
        if (!this.dXg()) {
            return this.jQZ.fYj();
        }
        return this.fWc();
    }

    public Iterator<eNk> fWc() {
        Object object;
        azJ<eNk> azJ2 = new azJ<eNk>();
        Iterator<eNk> iterator = this.jQZ.fYj();
        if (iterator != null) {
            azJ2.a(iterator);
        }
        if (!this.dXg()) {
            return azJ2;
        }
        Iterator<eNk> iterator2 = this.fWd();
        if (iterator2 != null) {
            azJ2.a(iterator2);
        }
        fhI fhI2 = this.eAZ();
        boolean bl = ewo.oBF.k(ewr.oDI);
        if (bl) {
            object = fhI2.dTS().entrySet().iterator();
            while (object.hasNext()) {
                Map.Entry entry;
                Map.Entry entry2 = (Map.Entry)object.next();
                if (entry2.getValue() == null || ((fhN)entry2.getValue()).dBe() != Rd.bjA || ((fhN)entry2.getValue()).air() <= 0 || (entry = fgD.fXh().Vd(((fhN)entry2.getValue()).air())) == null) continue;
                azJ2.a(((fhC)((Object)entry)).fYj());
            }
        }
        if ((object = fhI2.fYP()).isEmpty()) {
            return azJ2;
        }
        for (Map.Entry entry : object.entrySet()) {
            Integer n = (Integer)entry.getValue();
            if (n == null || n <= 0) continue;
            Object r = fgD.fXh().Vd(n);
            azJ2.a(((fhC)r).fYj());
        }
        return azJ2;
    }

    private Iterator<eNk> fWd() {
        Iterator<eNk> iterator;
        if (!this.dXg()) {
            return null;
        }
        azJ<eNk> azJ2 = new azJ<eNk>();
        fhI fhI2 = this.eAZ();
        if (fhI2.fYQ() && (iterator = this.a(fhI2, fhI2.ahy())) != null) {
            azJ2.a(iterator);
        }
        if (fhI2.dXi() && (iterator = this.a(fhI2, fhI2.ahA())) != null) {
            azJ2.a(iterator);
        }
        return azJ2;
    }

    private Iterator<eNk> a(fhI fhI2, int n) {
        Object r = fgD.fXh().Vd(n);
        if (r == null) {
            return null;
        }
        fhP fhP2 = ((fhC)r).dCC();
        if (fhP2 == null) {
            return null;
        }
        if (!fhK.a(fhI2, fhP2)) {
            return null;
        }
        return ((fhC)r).fYj();
    }

    @Override
    public short fvT() {
        return 1;
    }

    @Override
    public short fvU() {
        return 0;
    }

    @Override
    public short fvV() {
        return 1;
    }

    public void UX(int n) {
        this.shr = n;
    }

    @Override
    public int fUX() {
        return this.shr;
    }

    public int aVt() {
        Object r = fgD.fXh().Vd(this.shr);
        return this.shr == 0 || r == null ? this.fWe() : ((fhC)r).aVt();
    }

    public int fWe() {
        return this.jQZ.aVt();
    }

    public int cpf() {
        Object r = fgD.fXh().Vd(this.shr);
        if (r == null) {
            return this.fWf();
        }
        return this.shr == 0 ? this.fWf() : ((fhC)r).cpf();
    }

    public int fWf() {
        return this.jQZ.cpf();
    }

    public int cpg() {
        return this.jQZ.cpg();
    }

    public String getName() {
        fgc fgc2 = shn.fWG();
        return fgc2 != null ? fgc2.aH(this) : "<unknown>";
    }

    public String dah() {
        fgc fgc2 = shn.fWG();
        return fgc2 != null ? fgc2.aI(this) : "<unknown>";
    }

    public String byf() {
        fgc fgc2 = shn.fWG();
        return fgc2 != null ? fgc2.ax(this) : "<unknown>";
    }

    @Override
    public String[] bxk() {
        fgc fgc2 = shn.fWG();
        return fgc2 != null ? fgc2.bxk() : null;
    }

    @Override
    public Object eu(String string) {
        fgc fgc2 = shn.fWG();
        return fgc2 != null ? fgc2.a(this, string) : null;
    }

    public void bYg() {
        fgc fgc2 = shn.fWG();
        if (fgc2 != null) {
            fgc2.aL(this);
        }
    }

    public void mW(boolean bl) {
        fgc fgc2 = shn.fWG();
        if (fgc2 != null) {
            fgc2.c(this, bl);
        }
    }

    @Override
    public void c(String string, Object object) {
    }

    @Override
    public void d(String string, Object object) {
    }

    @Override
    public void e(String string, Object object) {
    }

    @Override
    public boolean hP(String string) {
        return false;
    }

    public byte @Nullable [] apI() {
        byte[] byArray;
        uY uY2 = new uY();
        if (this.b(uY2) && uY2.aF(ByteBuffer.wrap(byArray = new byte[uY2.DN()]))) {
            return byArray;
        }
        return null;
    }

    public boolean aG(ByteBuffer byteBuffer) {
        return this.b(Integer.MAX_VALUE, byteBuffer);
    }

    public boolean b(int n, ByteBuffer byteBuffer) {
        uY uY2 = new uY();
        uY2.b(byteBuffer, n);
        return this.c(uY2);
    }

    @Override
    public boolean b(uY uY2) {
        uY2.ZC = this.kYd;
        uY2.aaQ = this.jQZ.d();
        uY2.aaa = this.bol;
        if (this.klf != null) {
            uY2.aeF = new vk();
            this.klf.a(uY2.aeF.afd);
        } else {
            uY2.aeF = null;
        }
        if (this.shs != null) {
            uY2.aeG = new vt();
            this.shs.a(uY2.aeG.afr);
        } else {
            uY2.aeG = null;
        }
        if (this.jRV != null) {
            uY2.aeH = new vp();
            this.jRV.b(uY2.aeH.afm);
        } else {
            uY2.aeH = null;
        }
        if (this.sht != null) {
            uY2.aeI = new vb();
            this.sht.b(uY2.aeI.aeQ);
        } else {
            uY2.aeI = null;
        }
        if (this.shu != null) {
            uY2.aeJ = new uZ();
            this.shu.a(uY2.aeJ.aeN);
        } else {
            uY2.aeJ = null;
        }
        if (this.mhn != null) {
            uY2.aeK = new vd();
            this.mhn.a(uY2.aeK.aeT);
        } else {
            uY2.aeK = null;
        }
        if (this.shv != null) {
            uY2.aeL = new vh();
            this.shv.a(uY2.aeL.aeY);
        } else {
            uY2.aeL = null;
        }
        if (this.shr != 0) {
            uY2.aeM = new vj();
            uY2.aeM.afb = this.shr;
        } else {
            uY2.aeM = null;
        }
        return true;
    }

    public boolean c(uY uY2) {
        Object r;
        int n;
        this.kYd = uY2.ZC;
        int n2 = 24252;
        if (uY2.aaQ == 24252 && uY2.aeJ != null && fgV.c(uY2.aeJ.aeN).fXu() == fgW.smj) {
            n = 24250;
            r = fgD.fXh().Vd(24250);
            shm.warn((Object)"[BOSS SMASHER 9] Change Harmony to Vertox Haven Bag 24252 to 24250");
        } else {
            r = fgD.fXh().Vd(uY2.aaQ);
        }
        this.jQZ = r;
        if (this.jQZ == null) {
            shm.error((Object)("Item with refId " + uY2.aaQ + " isn't on ReferenceItemManager. Item UID : " + this.kYd));
            return false;
        }
        if (uY2.aaa <= 0) {
            shm.error((Object)("Item has a <= 0 qty : refId = " + uY2.aaQ + ", qty = " + uY2.aaa + ", uid = " + uY2.ZC));
            return false;
        }
        this.bol = uY2.aaa;
        if (uY2.aeF != null) {
            this.a(uY2.aeF.afd);
        }
        if (uY2.aeG != null) {
            this.a(uY2.aeG.afr);
        }
        if (uY2.aeH != null) {
            yd yd2 = uY2.aeH.afm;
            this.a(yd2);
        }
        this.sht = uY2.aeI != null ? new fgX(uY2.aeI.aeQ.YH) : null;
        this.shu = uY2.aeJ != null ? fgV.c(uY2.aeJ.aeN) : null;
        this.mhn = uY2.aeK != null ? fgY.b(uY2.aeK.aeT) : null;
        this.shv = uY2.aeL != null ? fhz.b(uY2.aeL.aeY) : null;
        if (uY2.aeM != null) {
            n = uY2.aeM.afb;
            Object r2 = fgD.fXh().Vd(n);
            this.shr = r2 != null ? n : 0;
        }
        this.fWg();
        return true;
    }

    public void fWg() {
        if (this.shu != null && (this.shu.fXu().bKa() || this.shu.eBm())) {
            this.shu.boS();
            return;
        }
        fgW fgW2 = this.jQZ.fVc();
        if (fgW2 == fgW.smf) {
            this.shu = null;
            return;
        }
        if (this.shu == null || this.shu.fXu() != fgW2) {
            this.shu = fgT.b(fgW2);
        }
    }

    @Override
    public boolean bfh() {
        return this.Na;
    }

    public static fgb fWh() {
        return shn;
    }

    public fhC dOg() {
        return this.jQZ;
    }

    @Override
    public long LV() {
        return this.kYd;
    }

    @Override
    public int avr() {
        return this.jQZ.d();
    }

    public fhY fWi() {
        return this.jQZ.dGh();
    }

    public boolean beB() {
        return this.jQZ.beB();
    }

    public boolean fAu() {
        return this.jQZ.fAu();
    }

    public boolean apo() {
        return this.Na;
    }

    public boolean isUsable() {
        return this.jQZ.beB() || this.jQZ.fAu();
    }

    public boolean fWj() {
        return this.n(this);
    }

    public boolean fWk() {
        return true;
    }

    @Override
    public boolean n(RT rT) {
        if (!(rT instanceof ffV)) {
            return false;
        }
        ffV ffV2 = (ffV)rT;
        if (ffV2.adZ() ^ this.adZ()) {
            return false;
        }
        if (this.shu != null && !this.shu.b(ffV2.shu)) {
            return false;
        }
        boolean bl = this.jQZ.fYA();
        if (bl) {
            if (this.fWv() != ffV2.fWv()) {
                return false;
            }
            if (!this.fWt() || !ffV2.fWt()) {
                return false;
            }
        }
        if (this.jRV != null || ffV2.jRV != null) {
            return false;
        }
        return this.avr() == ffV2.avr() && !this.pe() && !ffV2.pe() && !this.fWl() && !ffV2.fWl() && !this.adO() && !ffV2.adO() && !this.adW() && !ffV2.adW() && this.shv == null && ffV2.shv == null;
    }

    private boolean fWl() {
        return this.shr != 0;
    }

    public void a(wG wG2) {
        if (wG2 != null) {
            this.klf = fnO.sKx.b(wG2);
        }
    }

    public void a(vR vR2) {
        if (vR2 != null) {
            this.shs = fip.b(vR2);
        }
    }

    public void a(yd yd2) {
        fhI fhI2 = this.jRV = yd2 != null ? fhK.d(yd2) : null;
        if (this.jRV == null) {
            return;
        }
        if (this.jRV.fYP().isEmpty()) {
            return;
        }
        int n = fhK.cS(this);
        if (n <= 0) {
            return;
        }
        this.jRV.VF(n);
        this.jRV.fYP().clear();
        yd2.alc.clear();
    }

    public void a(tt tt2) {
        if (tt2 != null) {
            this.sht = new fgX();
            this.sht.ij(tt2.YH);
        }
    }

    public HashSet<eNd> UY(int n) {
        return this.mhn.Vi(n);
    }

    public boolean adZ() {
        return this.shu != null;
    }

    public boolean fWm() {
        return this.shu != null && this.shu.eBm();
    }

    @Override
    public int acs() {
        return this.avr();
    }

    @Override
    @Nullable
    public fgR fUY() {
        return this.shu;
    }

    public void a(@Nullable fgR fgR2) {
        this.shu = fgR2;
    }

    public void a(@Nullable fgY fgY2) {
        this.mhn = fgY2;
    }

    public void fWn() {
        if (!this.fWv()) {
            return;
        }
        this.mhn.cN(this);
    }

    public void fWo() {
        if (!this.fWt()) {
            return;
        }
        this.fWn();
    }

    public boolean fWp() {
        if (this.klf != null) {
            return false;
        }
        return this.jRV == null || !this.jRV.fYN() && this.jQZ.fYy();
    }

    public boolean fWq() {
        return this.jRV != null && !this.jRV.fYN();
    }

    public boolean fWr() {
        return this.fWq() && this.jRV.fYK();
    }

    public boolean fWs() {
        Map<Byte, fhN> map;
        if (this.klf != null) {
            return false;
        }
        Map<Byte, fhN> map2 = map = this.jRV != null ? this.jRV.dTS() : null;
        if (map == null && this.jQZ.fYy()) {
            return true;
        }
        return this.fWq() && (this.jQZ.fYy() || this.jRV.fYK());
    }

    public boolean fWt() {
        return this.jQZ.fYA() && (!this.fWv() || this.fWu());
    }

    public boolean fWu() {
        return this.mhn.aJG();
    }

    public boolean fWv() {
        return this.mhn != null;
    }

    @Nullable
    public fgY eAX() {
        return this.mhn;
    }

    @Nullable
    public fgX fWw() {
        return this.sht;
    }

    public void a(@Nullable fgX fgX2) {
        this.sht = fgX2;
    }

    public boolean adW() {
        return this.sht != null;
    }

    public String fWx() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[').append(this.kYd).append(']');
        if (!this.Na) {
            stringBuilder.append('i');
        }
        stringBuilder.append(this.avr());
        if (this.bol != 1) {
            stringBuilder.append('x').append(this.bol);
        }
        return stringBuilder.toString();
    }

    public void cF(ffV ffV2) {
        if (this.shv == null) {
            this.shv = new fhz();
        }
        this.shv.cf(ffV2);
    }

    public void a(@Nullable fhz fhz2) {
        this.shv = fhz2;
    }

    @Nullable
    public fhz fWy() {
        return this.shv;
    }

    public boolean c(fgg fgg2) {
        if (this.jQZ == null) {
            return false;
        }
        return this.jQZ.c(fgg2);
    }

    @Override
    public String beT() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        stringBuilder.append("uid=").append(this.kYd);
        stringBuilder.append(", refId=").append(this.avr());
        stringBuilder.append(", qty=").append(this.bol);
        stringBuilder.append(", opt=");
        if (this.dXg() && this.jRV != null) {
            stringBuilder.append(this.jRV.beT());
        } else if (this.pe() && this.shs != null) {
            stringBuilder.append(this.shs.beT());
        } else if (this.adO() && this.klf != null) {
            stringBuilder.append(this.klf.beT());
        } else {
            stringBuilder.append("none");
        }
        if (this.shu != null) {
            stringBuilder.append("bind=").append(this.shu);
        }
        if (this.sht != null) {
            stringBuilder.append("companionInfo=").append(this.sht);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public String toString() {
        return "Item{m_uniqueId=" + this.kYd + ", m_referenceItem=" + String.valueOf(this.jQZ) + ", m_quantity=" + this.bol + ", m_pet=" + String.valueOf(this.klf) + ", m_xp=" + String.valueOf(this.shs) + ", m_shards=" + String.valueOf(this.jRV) + ", m_companionInfo=" + String.valueOf(this.sht) + ", m_mergedSetItems=" + String.valueOf(this.shv) + "}";
    }

    @Override
    public String bfj() {
        return this.fWz();
    }

    public String fWz() {
        short s = this.bfd();
        if (s <= 0) {
            this.bol = 1;
        }
        String string = BH.de(this.apI());
        this.bol = s;
        return string;
    }

    boolean sI(@Nullable String string) {
        if (string == null) {
            return false;
        }
        return this.aG(ByteBuffer.wrap(BH.bg(string)));
    }

    public fhP dCC() {
        return this.jQZ.dCC();
    }

    public void tn(long l) {
        this.kYd = l;
    }

    @TestOnly
    public void m(fhC fhC2) {
        this.jQZ = fhC2;
    }

    @Override
    public eJm drG() {
        return eJm.qyS;
    }

    @Override
    public Object drH() {
        return this.kYd;
    }

    @Override
    public String drI() {
        return this.getName();
    }

    public boolean bqp() {
        return this.jQZ != null && this.jQZ.bqp();
    }

    @Override
    public ffV getItem() {
        return this;
    }

    @Override
    public /* synthetic */ RT bfg() {
        return this.fVU();
    }

    @Override
    public /* synthetic */ RT bff() {
        return this.fVT();
    }

    @Override
    public /* synthetic */ boolean b(Object object) {
        return this.c((uY)object);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.b((uY)object);
    }
}
