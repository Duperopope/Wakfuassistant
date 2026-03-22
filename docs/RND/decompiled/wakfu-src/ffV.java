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
sg_0,
aef_2,
ayz_2,
ejl_0,
eNl,
ffi,
fgf_0,
fhm_0,
fiq_0,
fnq_0,
gq_0<uy_1> {
    private static final Logger shm = Logger.getLogger(ffV.class);
    protected static final fgb shn = new fgb();
    public static final short sho = 1;
    private static final short shp = 0;
    private static final short shq = 1;
    private long kYd;
    protected boolean Na;
    private fhc_0 jQZ;
    private int shr;
    protected short bol;
    @Nullable
    private fnl_0 klf;
    @Nullable
    protected fij_0 shs;
    @Nullable
    private fhi_0 jRV;
    @Nullable
    private fgX sht;
    @Nullable
    private fgr_0 shu;
    @Nullable
    private fgy_0 mhn;
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

    public static ffV k(fhc_0 fhc_02) {
        return ffV.a(aym_2.bSE(), fhc_02);
    }

    public static ffV a(long l, fhc_0 fhc_02) {
        try {
            fim_0 fim_02;
            ffV ffV2 = new ffV();
            ffV2.kYd = l;
            ffV2.jQZ = fhc_02;
            fov_0 fov_02 = foy_0.sLJ.XQ(fhc_02.d());
            if (fov_02 != null) {
                ffV2.klf = fno_0.sKx.g(fov_02);
            }
            if ((fim_02 = fin_0.srJ.VL(fhc_02.fYx())) != null) {
                ffV2.shs = fip_0.b(fim_02);
            }
            if (fhc_02.fVc() != fgW.smf) {
                ffV2.shu = fgt_0.b(fhc_02.fVc());
            }
            if (fhc_02.fYA()) {
                ffV2.mhn = new fgy_0();
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

    public void l(fhc_0 fhc_02) {
        fim_0 fim_02;
        this.jQZ = fhc_02;
        fov_0 fov_02 = foy_0.sLJ.XQ(fhc_02.d());
        if (fov_02 != null) {
            this.klf = fno_0.sKx.g(fov_02);
        }
        if ((fim_02 = fin_0.srJ.VL(fhc_02.fYx())) != null) {
            this.shs = fip_0.b(fim_02);
        }
        if (fhc_02.fVc() != fgW.smf) {
            this.shu = fgt_0.b(fhc_02.fVc());
        }
        if (fhc_02.fYA()) {
            this.mhn = new fgy_0();
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
        ffu_0 ffu_02 = new ffu_0(l, this.jQZ, this);
        ffu_02.bol = this.bol;
        ffu_02.shr = this.shr;
        ffu_02.Na = false;
        return ffu_02;
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
        ffV2.klf = this.klf != null ? fno_0.sKx.h(this.klf) : null;
        ffV2.shs = this.shs != null ? fip_0.a(this.shs) : null;
        if (this.jRV != null) {
            ffV2.jRV = this.jRV.fYR();
        }
        ffV2.sht = this.sht != null ? new fgX(this.sht.pf()) : null;
        ffV2.shu = this.shu != null ? new fgu_0(this.shu.fXu(), this.shu.eBm()) : null;
        ffV2.mhn = this.mhn != null ? new fgy_0(this.mhn) : null;
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

    public void f(fnl_0 fnl_02) {
        this.klf = fnl_02;
    }

    @Override
    public fnl_0 ead() {
        if (this.klf == null) {
            throw new foE("Aucun familier d\u00e9fini sur l'item " + String.valueOf(this));
        }
        return this.klf;
    }

    @Override
    public boolean pe() {
        return this.shs != null;
    }

    public void a(fir_0 fir_02) {
        this.shs = fir_02;
    }

    @Override
    public fij_0 fVV() {
        if (this.shs == null) {
            throw new fio_0("Aucune xp d\u00e9finie sur l'item " + String.valueOf(this));
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

    public void a(fhi_0 fhi_02) {
        this.jRV = fhi_02;
    }

    @Override
    public fhi_0 eAZ() {
        if (this.jRV == null) {
            throw new fgE("Aucune gemme d\u00e9finie sur l'item " + String.valueOf(this));
        }
        return this.jRV;
    }

    public int fVZ() {
        if (this.jRV == null) {
            return 0;
        }
        Map<Byte, fhn_0> map = this.jRV.dTS();
        if (map == null || map.isEmpty()) {
            return 0;
        }
        int n = 0;
        for (fhn_0 fhn_02 : map.values()) {
            if (fhn_02.dBe() != rd_0.bjE) continue;
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
        fgi_0 fgi_02 = shn.fWH();
        if (fgi_02 != null) {
            fgi_02.bb(this);
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
            return mz_1.aVX.cR(this.sht.pf());
        }
        return null;
    }

    @Override
    public fgj dwg() {
        return this.jQZ.dwg();
    }

    @Override
    @NotNull
    public Iterator<enk_0> iterator() {
        if (!this.dXg()) {
            return this.jQZ.fYj();
        }
        return this.fWc();
    }

    public Iterator<enk_0> fWc() {
        Object object;
        azj_1<enk_0> azj_12 = new azj_1<enk_0>();
        Iterator<enk_0> iterator = this.jQZ.fYj();
        if (iterator != null) {
            azj_12.a(iterator);
        }
        if (!this.dXg()) {
            return azj_12;
        }
        Iterator<enk_0> iterator2 = this.fWd();
        if (iterator2 != null) {
            azj_12.a(iterator2);
        }
        fhi_0 fhi_02 = this.eAZ();
        boolean bl = ewo_0.oBF.k(ewr_0.oDI);
        if (bl) {
            object = fhi_02.dTS().entrySet().iterator();
            while (object.hasNext()) {
                Map.Entry entry;
                Map.Entry entry2 = (Map.Entry)object.next();
                if (entry2.getValue() == null || ((fhn_0)entry2.getValue()).dBe() != rd_0.bjA || ((fhn_0)entry2.getValue()).air() <= 0 || (entry = fgD.fXh().Vd(((fhn_0)entry2.getValue()).air())) == null) continue;
                azj_12.a(((fhc_0)((Object)entry)).fYj());
            }
        }
        if ((object = fhi_02.fYP()).isEmpty()) {
            return azj_12;
        }
        for (Map.Entry entry : object.entrySet()) {
            Integer n = (Integer)entry.getValue();
            if (n == null || n <= 0) continue;
            Object r = fgD.fXh().Vd(n);
            azj_12.a(((fhc_0)r).fYj());
        }
        return azj_12;
    }

    private Iterator<enk_0> fWd() {
        Iterator<enk_0> iterator;
        if (!this.dXg()) {
            return null;
        }
        azj_1<enk_0> azj_12 = new azj_1<enk_0>();
        fhi_0 fhi_02 = this.eAZ();
        if (fhi_02.fYQ() && (iterator = this.a(fhi_02, fhi_02.ahy())) != null) {
            azj_12.a(iterator);
        }
        if (fhi_02.dXi() && (iterator = this.a(fhi_02, fhi_02.ahA())) != null) {
            azj_12.a(iterator);
        }
        return azj_12;
    }

    private Iterator<enk_0> a(fhi_0 fhi_02, int n) {
        Object r = fgD.fXh().Vd(n);
        if (r == null) {
            return null;
        }
        fhp_0 fhp_02 = ((fhc_0)r).dCC();
        if (fhp_02 == null) {
            return null;
        }
        if (!fhk_0.a(fhi_02, fhp_02)) {
            return null;
        }
        return ((fhc_0)r).fYj();
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
        return this.shr == 0 || r == null ? this.fWe() : ((fhc_0)r).aVt();
    }

    public int fWe() {
        return this.jQZ.aVt();
    }

    public int cpf() {
        Object r = fgD.fXh().Vd(this.shr);
        if (r == null) {
            return this.fWf();
        }
        return this.shr == 0 ? this.fWf() : ((fhc_0)r).cpf();
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
        uy_1 uy_12 = new uy_1();
        if (this.b(uy_12) && uy_12.aF(ByteBuffer.wrap(byArray = new byte[uy_12.DN()]))) {
            return byArray;
        }
        return null;
    }

    public boolean aG(ByteBuffer byteBuffer) {
        return this.b(Integer.MAX_VALUE, byteBuffer);
    }

    public boolean b(int n, ByteBuffer byteBuffer) {
        uy_1 uy_12 = new uy_1();
        uy_12.b(byteBuffer, n);
        return this.c(uy_12);
    }

    @Override
    public boolean b(uy_1 uy_12) {
        uy_12.ZC = this.kYd;
        uy_12.aaQ = this.jQZ.d();
        uy_12.aaa = this.bol;
        if (this.klf != null) {
            uy_12.aeF = new vk_1();
            this.klf.a(uy_12.aeF.afd);
        } else {
            uy_12.aeF = null;
        }
        if (this.shs != null) {
            uy_12.aeG = new vt_2();
            this.shs.a(uy_12.aeG.afr);
        } else {
            uy_12.aeG = null;
        }
        if (this.jRV != null) {
            uy_12.aeH = new vp_2();
            this.jRV.b(uy_12.aeH.afm);
        } else {
            uy_12.aeH = null;
        }
        if (this.sht != null) {
            uy_12.aeI = new vb_1();
            this.sht.b(uy_12.aeI.aeQ);
        } else {
            uy_12.aeI = null;
        }
        if (this.shu != null) {
            uy_12.aeJ = new uz_2();
            this.shu.a(uy_12.aeJ.aeN);
        } else {
            uy_12.aeJ = null;
        }
        if (this.mhn != null) {
            uy_12.aeK = new vd_2();
            this.mhn.a(uy_12.aeK.aeT);
        } else {
            uy_12.aeK = null;
        }
        if (this.shv != null) {
            uy_12.aeL = new vh_2();
            this.shv.a(uy_12.aeL.aeY);
        } else {
            uy_12.aeL = null;
        }
        if (this.shr != 0) {
            uy_12.aeM = new vj_1();
            uy_12.aeM.afb = this.shr;
        } else {
            uy_12.aeM = null;
        }
        return true;
    }

    public boolean c(uy_1 uy_12) {
        Object r;
        int n;
        this.kYd = uy_12.ZC;
        int n2 = 24252;
        if (uy_12.aaQ == 24252 && uy_12.aeJ != null && fgv_0.c(uy_12.aeJ.aeN).fXu() == fgW.smj) {
            n = 24250;
            r = fgD.fXh().Vd(24250);
            shm.warn((Object)"[BOSS SMASHER 9] Change Harmony to Vertox Haven Bag 24252 to 24250");
        } else {
            r = fgD.fXh().Vd(uy_12.aaQ);
        }
        this.jQZ = r;
        if (this.jQZ == null) {
            shm.error((Object)("Item with refId " + uy_12.aaQ + " isn't on ReferenceItemManager. Item UID : " + this.kYd));
            return false;
        }
        if (uy_12.aaa <= 0) {
            shm.error((Object)("Item has a <= 0 qty : refId = " + uy_12.aaQ + ", qty = " + uy_12.aaa + ", uid = " + uy_12.ZC));
            return false;
        }
        this.bol = uy_12.aaa;
        if (uy_12.aeF != null) {
            this.a(uy_12.aeF.afd);
        }
        if (uy_12.aeG != null) {
            this.a(uy_12.aeG.afr);
        }
        if (uy_12.aeH != null) {
            yd_2 yd_22 = uy_12.aeH.afm;
            this.a(yd_22);
        }
        this.sht = uy_12.aeI != null ? new fgX(uy_12.aeI.aeQ.YH) : null;
        this.shu = uy_12.aeJ != null ? fgv_0.c(uy_12.aeJ.aeN) : null;
        this.mhn = uy_12.aeK != null ? fgy_0.b(uy_12.aeK.aeT) : null;
        this.shv = uy_12.aeL != null ? fhz.b(uy_12.aeL.aeY) : null;
        if (uy_12.aeM != null) {
            n = uy_12.aeM.afb;
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
            this.shu = fgt_0.b(fgW2);
        }
    }

    @Override
    public boolean bfh() {
        return this.Na;
    }

    public static fgb fWh() {
        return shn;
    }

    public fhc_0 dOg() {
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

    public fhy_0 fWi() {
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

    public void a(wg_2 wg_22) {
        if (wg_22 != null) {
            this.klf = fno_0.sKx.b(wg_22);
        }
    }

    public void a(vr_2 vr_22) {
        if (vr_22 != null) {
            this.shs = fip_0.b(vr_22);
        }
    }

    public void a(yd_2 yd_22) {
        fhi_0 fhi_02 = this.jRV = yd_22 != null ? fhk_0.d(yd_22) : null;
        if (this.jRV == null) {
            return;
        }
        if (this.jRV.fYP().isEmpty()) {
            return;
        }
        int n = fhk_0.cS(this);
        if (n <= 0) {
            return;
        }
        this.jRV.VF(n);
        this.jRV.fYP().clear();
        yd_22.alc.clear();
    }

    public void a(tt_1 tt_12) {
        if (tt_12 != null) {
            this.sht = new fgX();
            this.sht.ij(tt_12.YH);
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
    public fgr_0 fUY() {
        return this.shu;
    }

    public void a(@Nullable fgr_0 fgr_02) {
        this.shu = fgr_02;
    }

    public void a(@Nullable fgy_0 fgy_02) {
        this.mhn = fgy_02;
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
        Map<Byte, fhn_0> map;
        if (this.klf != null) {
            return false;
        }
        Map<Byte, fhn_0> map2 = map = this.jRV != null ? this.jRV.dTS() : null;
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
    public fgy_0 eAX() {
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

    public boolean c(fgg_0 fgg_02) {
        if (this.jQZ == null) {
            return false;
        }
        return this.jQZ.c(fgg_02);
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

    public fhp_0 dCC() {
        return this.jQZ.dCC();
    }

    public void tn(long l) {
        this.kYd = l;
    }

    @TestOnly
    public void m(fhc_0 fhc_02) {
        this.jQZ = fhc_02;
    }

    @Override
    public ejm_0 drG() {
        return ejm_0.qyS;
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
        return this.c((uy_1)object);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.b((uy_1)object);
    }
}

