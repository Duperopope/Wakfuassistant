/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;

public abstract class bCA
extends ni_1
implements crd_1 {
    private static final Logger jJk = Logger.getLogger(bCA.class);
    protected short jJl;
    protected boolean jJm;
    private RJ jJn = RJ.bms;
    protected boolean jJo;
    protected boolean jHv = true;
    protected boolean jHu;
    protected int jJp;
    protected boolean jJq;
    protected boolean jJr;
    private eIu jJs = eIu.qwy;
    protected final bDb jJt = new bDc(this);
    protected bDh jJu;
    private String p;
    private ArrayList<acd_1> jJv;
    protected int ibY = -1;
    private long jJw;
    private final fi_1 jJx = new bcb_0(this);
    private final fi_1 jJy = new bCC(this);
    private final fi_1 jJz = new bcd_0(this);

    public static bCA b(long l, byte[] byArray) {
        bCA bCA2 = (bCA)bcw_0.dQn().dw(l);
        if (bCA2 == null) {
            jJk.error((Object)("Impossible de spawner l'\u00e9l\u00e9ment interactif instanceId=" + l));
            return null;
        }
        if (byArray != null) {
            bCA2.as(byArray);
        }
        bCA2.aVQ();
        for (ng_1 ng_12 : bCA2.aVG()) {
            if (!(ng_12 instanceof afk_0)) continue;
            afk_0 afk_02 = (afk_0)ng_12;
            afh_0.bxU().a(afk_02);
            afk_02.bpH();
            agX.c(afk_02);
        }
        return bCA2;
    }

    @Override
    public void setVisible(boolean bl) {
        super.setVisible(bl);
        if (!bl) {
            this.dQr();
        }
        for (ng_1 ng_12 : this.aVG()) {
            ((bcs_0)ng_12).setVisible(bl);
        }
    }

    @Override
    public boolean isVisible() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return super.isVisible();
        }
        if (!this.c(fcs_0.rUy)) {
            return super.isVisible();
        }
        bsj_0 bsj_02 = bgt_02.dmV();
        acd_1 acd_12 = this.aZw();
        return super.isVisible() && (bsj_02 == null || !bsj_02.bag().T(acd_12.getX(), acd_12.getY()));
    }

    private void dQr() {
        cph_1 cph_12 = cwd_2.eVe().eVf();
        if (cph_12 != null) {
            int n = cph_12.eLr();
            for (int i = 0; i < n; ++i) {
                crd_1 crd_12 = cph_12.Mh(i);
                if (crd_12 != this) continue;
                cwd_2.eVe().eVg();
                break;
            }
        }
    }

    @Override
    public int bcC() {
        return this.bmd.getX();
    }

    @Override
    public int bcD() {
        return this.bmd.getY();
    }

    @Override
    public short bcE() {
        return this.bmd.bdi();
    }

    public float getWorldX() {
        return this.bcC();
    }

    public float getWorldY() {
        return this.bcD();
    }

    public float getAltitude() {
        return this.bcE();
    }

    @Override
    public List<acd_1> aVK() {
        if (this.jJv == null) {
            this.dNE();
        }
        return Collections.unmodifiableList(this.jJv);
    }

    public boolean T(acd_1 acd_12) {
        return this.aVK().contains(acd_12);
    }

    public String getName() {
        return this.p;
    }

    public short dQs() {
        return this.jJl;
    }

    public void bU(short s) {
        this.jJl = s;
    }

    public int dQt() {
        return this.jJp;
    }

    public final RJ dQu() {
        return this.jJn;
    }

    protected final void a(RJ rJ) {
        this.jJn = rJ;
    }

    public boolean dOf() {
        return this.jHu;
    }

    public void ht(boolean bl) {
        this.jHu = bl;
    }

    public boolean isSelectable() {
        return this.jHv;
    }

    public void setSelectable(boolean bl) {
        this.jHv = bl;
    }

    public boolean dQc() {
        return this.jJo;
    }

    public void hu(boolean bl) {
        this.jJo = bl;
    }

    public boolean dQv() {
        return this.jJr;
    }

    public void hv(boolean bl) {
        this.jJr = bl;
    }

    public boolean dOz() {
        return this.jJm;
    }

    public void hw(boolean bl) {
        this.jJm = bl;
    }

    public void b(acd_1 acd_12) {
        this.bmd.C(acd_12);
    }

    @Override
    public boolean a(rw_0 rw_02, RG rG) {
        if (!ArrayUtils.contains((Object[])this.bea(), (Object)rw_02)) {
            jJk.warn((Object)("Tentative de fire de l'action " + String.valueOf(rw_02) + " sur l'\u00e9l\u00e9ment interactif " + String.valueOf(this) + " alors que celle-ci n'est pas g\u00e9r\u00e9e"), (Throwable)new UnsupportedOperationException());
            return false;
        }
        boolean bl = false;
        if (this.jJs.fwA()) {
            bl = this.jJs.a(rw_02, rG);
        } else if (this.jJu != null) {
            bl = this.jJu.b(rw_02, rG);
        }
        if (!bl) {
            bl = super.a(rw_02, rG);
        }
        if (bl) {
            bqm_0.jbp.b(new bru(this, rw_02.bdX()));
        }
        if (rG.Sn() == aue_0.cVJ().cVK().Sn()) {
            agm_2.cbu().d(new bvb_2(this.Sn(), rw_02.bdX()));
        }
        return bl;
    }

    @Override
    public final rw_0[] bea() {
        if (this.jJs.fwA()) {
            return this.jJs.bea();
        }
        if (this.jJu != null) {
            return this.jJu.dNf();
        }
        return this.dNf();
    }

    public abstract rw_0[] dNf();

    protected void dQw() {
        if (!(this instanceof eIy)) {
            return;
        }
        eIy eIy2 = (eIy)((Object)this);
        if (eIy2.dNx() == null) {
            return;
        }
        this.jJs = new bgr(eIy2);
    }

    @Override
    public final void ac(short s) {
        if (s == this.bmf) {
            return;
        }
        super.ac(s);
        this.jJs.bt(s);
        this.dbu();
    }

    public eIu dQx() {
        return this.jJs;
    }

    protected void dbu() {
        this.aVQ();
    }

    @Override
    public final rw_0 bdZ() {
        return this.jJs.fwA() ? this.jJs.bdZ() : this.dNn();
    }

    protected abstract rw_0 dNn();

    @Override
    public void c(rw_0 rw_02) {
        aue_0.cVJ().cVK().ddI().dcK();
        cld cld2 = new cld();
        cld2.cB(rw_02.bdX());
        cld2.ng(this.Sn());
        aue_0.cVJ().etu().d(cld2);
    }

    @Override
    public cpm_1[] chR() {
        if (this.jJs.fwA()) {
            return ((bgr)this.jJs).chR();
        }
        if (this.jJu != null) {
            return this.jJu.dNh();
        }
        return this.dNh();
    }

    public cpm_1[] dNh() {
        return cpm_1.nip;
    }

    @Override
    public boolean chS() {
        return true;
    }

    @Override
    public final Point chT() {
        aam_0 aam_02 = aie_0.cfn().bmC();
        acb_1 acb_12 = agi.c(aam_02, this.getWorldX(), this.getWorldY(), this.getAltitude() + (float)this.bcN());
        int n = GC.A(acb_12.aPY);
        int n2 = GC.A(acb_12.aPZ);
        return new Point(n, n2);
    }

    @Override
    public short chU() {
        return 0;
    }

    public byte bcN() {
        Iterator<ng_1> iterator = this.aVG().iterator();
        if (iterator.hasNext()) {
            ng_1 ng_12 = iterator.next();
            return ng_12.aVC();
        }
        return 4;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.jJl = 0;
        this.jJm = false;
        this.jJn = RJ.bms;
        this.jJo = false;
        this.jHv = true;
        this.jHu = false;
        this.jJp = 0;
        this.jJq = false;
        this.jJr = false;
        assert (this.jJs == eIu.qwy);
        this.p = "";
        assert (this.jJv == null);
        this.ibY = -1;
        this.jJw = -1L;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.p = null;
        this.jJs = eIu.qwy;
        this.jJv = null;
        this.jJu = null;
        this.jJt.clear();
        this.jJw = -1L;
    }

    @Override
    protected final fi_1 bew() {
        return this.jJx;
    }

    @Override
    protected final fi_1 bex() {
        return this.jJy;
    }

    @Override
    protected fi_1 bey() {
        return fi_1.oX;
    }

    protected fi_1 dNe() {
        return this.jJz;
    }

    @Override
    public fi_1[] zj() {
        return new fi_1[]{this.aVL(), this.bew(), this.bex(), this.bey(), this.aVM(), this.aVN(), this.dNe()};
    }

    public String dOk() {
        return null;
    }

    public boolean d(bdf_1 bdf_12) {
        return !this.aVP() && this.T(bdf_12.bqg());
    }

    @Override
    public boolean aVP() {
        return this.jJq;
    }

    public void dNE() {
        if (this.beE()) {
            return;
        }
        ArrayList<ry_0> arrayList = ry_0.aa(this.baz);
        this.jJq = false;
        if (arrayList.contains(ry_0.blL)) {
            if (this.beq()) {
                arrayList.remove(ry_0.blL);
                if (arrayList.isEmpty()) {
                    jJk.error((Object)("[Level Design] Element interactif bloquant, et pas de pattern d'activation valide : " + String.valueOf(this.bmd)));
                    this.jJq = true;
                }
            } else if (arrayList.size() == 1) {
                this.jJq = true;
            }
        }
        acd_1 acd_12 = new acd_1();
        this.jJv = new ArrayList();
        wa_0.a((short)6, (byte)0, (short)4);
        if (arrayList.contains(ry_0.blL)) {
            this.jJv.add(new acd_1(this.bcC(), this.bcD(), this.bcE()));
        }
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            ry_0 ry_02 = arrayList.get(i);
            if (ry_02 == ry_0.blL) continue;
            abi_1 abi_12 = abi_1.wG((this.bcB().dzy + ry_02.bec()) % 8);
            acd_12.Q(this.bmd.getX() + abi_12.dzz, this.bmd.getY() + abi_12.dzA, this.bmd.bdi());
            short s = (short)vz_0.qd(acd_12.getX());
            short s2 = (short)vz_0.qe(acd_12.getY());
            try {
                if (WX.q(s, s2)) {
                    wa_0.j(s, s2);
                    short s3 = wa_0.v(acd_12.getX(), acd_12.getY(), acd_12.bdi());
                    if (s3 == Short.MIN_VALUE) continue;
                    acd_12.aM(s3);
                    this.jJv.add(new acd_1(acd_12));
                    continue;
                }
                jJk.error((Object)("On veut charger une cellule qui n'appartient \u00e0 aucune map " + String.valueOf(acd_12) + " world=" + WX.bhh() + " IE=" + this.Sn()));
                continue;
            }
            catch (IOException iOException) {
                jJk.error((Object)("Impossible de charger la map [" + s + ", " + s2 + "]"), (Throwable)iOException);
            }
        }
    }

    public void dNq() {
    }

    public void dOC() {
    }

    private void a(wy_0 wy_02, boolean bl) {
        if (this.bep()) {
            wy_02.b(this.bcC(), this.bcD(), bl);
        } else {
            wy_02.a(this.bcC(), this.bcD(), this.bcE(), bl);
        }
    }

    @Override
    public void aVR() {
        super.aVR();
        this.dQy();
    }

    public void dQy() {
        if (!this.beq()) {
            return;
        }
        acd_1 acd_12 = this.aZw();
        short s = (short)vz_0.qd(acd_12.getX());
        short s2 = (short)vz_0.qe(acd_12.getY());
        try {
            wa_0.j(s, s2);
        }
        catch (IOException iOException) {
            jJk.warn((Object)"Probl\u00e8me au chargement de la topologie de la map");
        }
        wy_0 wy_02 = this.aVO();
        if (wy_02 != null) {
            this.a(wy_02, true);
        } else {
            jJk.error((Object)"Impossible de marquer bloquant un \u00e9l\u00e9ment sans topologie");
        }
    }

    @Override
    public void aVS() {
        Object object;
        Object object2;
        super.aVS();
        if (this.c(fcs_0.rUy)) {
            object2 = agY.bzw();
            object = this.aVG();
            Iterator<ng_1> iterator = object.iterator();
            while (iterator.hasNext()) {
                ng_1 ng_12 = iterator.next();
                if (!(ng_12 instanceof afk_0)) continue;
                FreeParticleSystem freeParticleSystem = ((agY)object2).sk(800030);
                freeParticleSystem.a((afk_0)ng_12);
                agZ.bzy().b(freeParticleSystem);
            }
        }
        if ((object2 = this.aVO()) != null && this.beq()) {
            this.a((wy_0)object2, false);
        }
        object = afh_0.bxU();
        for (ng_1 ng_12 : this.aVG()) {
            if (!(ng_12 instanceof afk_0)) continue;
            ((afh_0)object).b((afk_0)ng_12);
        }
        this.aZp();
    }

    @Override
    public void bi(boolean bl) {
        super.bi(bl);
        wy_0 wy_02 = this.aVO();
        if (this.aXZ && wy_02 != null) {
            int n = this.bcC();
            int n2 = this.bcD();
            short s = this.bcE();
            bKV bKV2 = bLe.ecw().dQ(n, n2);
            if (bKV2 != null && bKV2.bcE() == s && bKV2.bcS()) {
                return;
            }
            bze_2 bze_22 = (bze_2)bzj_2.eqi().aF(n, n2);
            bce_0 bce_02 = new bce_0(n, n2, s);
            bze_22.x(bce_02);
            this.a(wy_02, bce_02.dQB());
        }
    }

    public int dND() {
        return -1;
    }

    public void Gg(int n) {
        this.ibY = n;
    }

    public boolean Gh(int n) {
        return this.ibY == n;
    }

    public int bqo() {
        return this.ibY;
    }

    public boolean dNL() {
        return true;
    }

    public bDb dQz() {
        return this.jJt;
    }

    @Override
    public void a(abi_1 abi_12) {
        super.a(abi_12);
        this.jJv = null;
    }

    protected void setName(String string) {
        this.p = string;
    }

    public bDh dNj() {
        throw new UnsupportedOperationException("Il faut implementer cette methode pour rendre l'ie deployable");
    }

    public bDh dNk() {
        return this.jJu;
    }

    public void kZ(long l) {
        this.jJw = l;
    }

    public long dQA() {
        return this.jJw;
    }

    static /* synthetic */ long a(bCA bCA2, long l) {
        bCA2.bme = l;
        return bCA2.bme;
    }

    static /* synthetic */ acd_1 a(bCA bCA2) {
        return bCA2.bmd;
    }

    static /* synthetic */ acd_1 b(bCA bCA2) {
        return bCA2.bmd;
    }

    static /* synthetic */ acd_1 c(bCA bCA2) {
        return bCA2.bmd;
    }

    static /* synthetic */ short a(bCA bCA2, short s) {
        bCA2.bmf = s;
        return bCA2.bmf;
    }

    static /* synthetic */ boolean a(bCA bCA2, boolean bl) {
        bCA2.bmh = bl;
        return bCA2.bmh;
    }

    static /* synthetic */ short b(bCA bCA2, short s) {
        bCA2.baz = s;
        return bCA2.baz;
    }

    static /* synthetic */ HashSet d(bCA bCA2) {
        return bCA2.bmj;
    }

    static /* synthetic */ String a(bCA bCA2, String string) {
        bCA2.baB = string;
        return bCA2.baB;
    }

    static /* synthetic */ boolean b(bCA bCA2, boolean bl) {
        bCA2.bml = bl;
        return bCA2.bml;
    }

    static /* synthetic */ boolean c(bCA bCA2, boolean bl) {
        bCA2.bmm = bl;
        return bCA2.bmm;
    }
}

