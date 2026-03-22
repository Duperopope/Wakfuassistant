/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bZg
 */
class bzg_1
extends bzo_1 {
    private static final boolean lBX = false;
    private static final int lBY = 2048;
    private static final float lBZ = 1.5f;
    private int lCa;
    private int lCb;
    private boolean lCc = false;
    private long lCd;
    private boolean bVZ;
    private final ArrayList<FreeParticleSystem> lCe = new ArrayList();
    private byx_2 lCf = new bzi_1();
    private final abj_0 lCg = new abj_0();
    private bzc_2 lCh;
    private float lCi;
    private final bzh_1 lCj;

    protected bzg_1(bzh_1 bzh_12) {
        this.lCj = bzh_12;
    }

    bzg_1() {
        this.lCj = new bzh_1();
    }

    public void eN(float f2) {
        this.lCi = f2;
        if (this.lCh != null) {
            this.lCh.eN(f2);
        }
    }

    public byx_2 epP() {
        return this.lCf;
    }

    public void a(byx_2 byx_22) {
        this.lCf = byx_22;
    }

    @Override
    void i(afV afV2) {
        super.i(afV2);
        if (this.lCa > 0) {
            return;
        }
        agf agf2 = afV2.brf();
        abg_1 abg_12 = new abg_1(-18.0f, 18.0f, -18.0f, 18.0f, 0.0f, 54.0f);
        abq_0 abq_02 = new abq_0();
        abq_02.a(abg_12);
        abq_02.b(agf2);
        this.lCj.a(abq_02);
        abg_12 = new abg_1(-18.0f, 18.0f, -18.0f, 18.0f, 0.0f, 18.0f);
        abn_0 abn_02 = new abn_0();
        abn_02.a(abg_12);
        abn_02.b(agf2);
        this.lCj.a(abn_02);
        ast_1.bJG().a(abq_02);
        ast_1.bJG().a(abn_02);
        this.lCa = abq_02.d();
        this.lCb = abn_02.d();
        acq_0.cge.a(this.lCg);
        this.lCg.b(agf2);
        this.hNy = true;
    }

    private void iL(boolean bl) {
    }

    private boolean epQ() {
        return this.lCh != null;
    }

    @Override
    void bhk() {
        super.bhk();
        if (this.lCa == 0) {
            return;
        }
        ass_1 ass_12 = ast_1.bJG().uo(this.lCa);
        if (ass_12 != null) {
            ass_12.bX(false);
            ast_1.bJG().b(ass_12);
            ass_12.clear();
        }
        this.lCa = 0;
        ass_12 = ast_1.bJG().uo(this.lCb);
        if (ass_12 != null) {
            ass_12.bX(false);
            ast_1.bJG().b(ass_12);
            ass_12.clear();
        }
        this.lCb = 0;
        this.iL(false);
        if (this.lCc) {
            this.epS();
        }
        acq_0.cge.b(this.lCg);
        this.hNy = false;
    }

    private void epR() {
        List list = bzj_2.eqi().bld();
        if (list == null) {
            return;
        }
        int n = 86;
        boolean bl = false;
        TLongArrayList tLongArrayList = new TLongArrayList();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            bze_2 bze_22 = (bze_2)list.get(i);
            long l = GC.s(bze_22.getX(), bze_22.getY());
            if (tLongArrayList.contains(l)) continue;
            tLongArrayList.add(l);
            int n3 = bze_22.getX() * 18;
            int n4 = bze_22.getY() * 18;
            short s = wa_0.y(n3, n4, bgt_02.aZw().bdi());
            FreeParticleSystem freeParticleSystem = agY.bzw().bF(86, 0);
            freeParticleSystem.r(n3, n4, s);
            agZ.bzy().b(freeParticleSystem);
            this.lCe.add(freeParticleSystem);
        }
        this.lCc = true;
    }

    private void epS() {
        int n = this.lCe.size();
        for (int i = 0; i < n; ++i) {
            int n2 = this.lCe.get(i).bLJ();
            agZ.bzy().d(n2, true);
        }
        this.lCe.clear();
        this.lCc = false;
    }

    @Override
    public void setVisible(boolean bl) {
        super.setVisible(bl);
        if (!bl) {
            abq_0 abq_02;
            if (this.lCc) {
                this.epS();
            }
            if ((abq_02 = (abq_0)ast_1.bJG().uo(this.lCa)) != null) {
                abq_02.rB(400);
            }
        }
    }

    @Override
    void b(afV afV2, float f2, float f3) {
        boolean bl;
        if (!this.hNy) {
            this.bVZ = true;
            if (this.epQ()) {
                this.lCh.eQ(0.0f);
            }
            return;
        }
        float f4 = this.lCH.epJ();
        long l = System.currentTimeMillis();
        if (this.epQ()) {
            float f5 = l - this.lCd > 0L ? Math.min(1.0f, (float)(l - this.lCd) / 10000.0f) : 1.0f;
            this.lCh.eQ((this.bVZ ? 1.0f - f5 : f5) * this.bnY());
        }
        boolean bl2 = bl = f4 <= 0.2f;
        if (bl != this.bVZ) {
            this.lCd = l;
            this.bVZ = bl;
        }
        if (f4 <= 0.0f) {
            this.bhk();
            return;
        }
        this.iL(true);
        abq_0 abq_02 = (abq_0)ast_1.bJG().uo(this.lCa);
        abn_0 abn_02 = (abn_0)ast_1.bJG().uo(this.lCb);
        if (abq_02 == null || abn_02 == null) {
            return;
        }
        float f6 = f3 * f2;
        abq_02.aJ(-1.5707964f - f6 * 0.7853982f, 0.117809735f * (f6 + 0.3f));
        int n = (int)(this.bmg && f4 > 0.2f ? 2048.0f * f4 : 0.0f);
        abq_02.rA(n);
        abn_02.rA(n);
        abq_02.ce(1.5f * (1.0f + f4 * 1.5f));
        float f7 = acz_0.cgH.btK();
        if (f7 > 0.7f && this.lCH.epK() < this.lCH.epJ() && this.lCH.epK() < 0.2f) {
            if (!this.lCc && this.bmg) {
                this.epR();
            }
        } else if (this.lCc) {
            this.epS();
        }
        float f8 = this.lCf.eH(f4);
        float f9 = this.lCf.by(f4, f7);
        this.lCg.cb(f8);
        this.lCg.cc(f9);
        this.lCg.aH(-f6 * (2.0f - f4) * 5.0f, 0.0f);
        this.lCg.cd(this.lCf.epI());
        if (this.epQ()) {
            this.lCh.bK(f4);
        }
    }
}

