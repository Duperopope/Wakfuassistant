/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eUL
 */
final class eul_1
extends eug_1<fqE, exP> {
    private static final Logger rxY = Logger.getLogger(eul_1.class);
    private final ewc_2 rxZ = new ewc_2();
    private boolean rya = true;

    eul_1(etu_0 etu_02) {
        super(etu_02);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    fqH a(exP exP2, fqE fqE2, acd_1 acd_12, boolean bl) {
        fqH fqH2;
        if (fqE2 == null) {
            rxY.error((Object)this.rrZ.sq("casting a null SpellLevel"));
            return fqH.sUU;
        }
        Object Spell = fqE2.giP();
        if (Spell == null) {
            rxY.error((Object)this.rrZ.sq("casting a SpellLevel with a null spell"));
            return fqH.sUU;
        }
        if (euk_1.b(Spell)) {
            return fqH.sVl;
        }
        if (exP2.a(exe_1.rEP)) {
            return fqH.sVq;
        }
        if (ewo_0.oBF.o(ewr_0.oDD).contains(((fqD)Spell).d())) {
            return fqH.sVq;
        }
        if (!euk_1.a(exP2, Spell)) {
            return fqH.sVk;
        }
        if (bl) {
            if (!euk_1.c(exP2, fqE2, Spell)) {
                return fqH.sUY;
            }
            if (!euk_1.b(exP2, fqE2, Spell)) {
                return fqH.sUZ;
            }
            if (!euk_1.a(exP2, fqE2, Spell)) {
                return fqH.sVa;
            }
            if (!euk_1.a(exP2, exx_2.rGQ, fqE2, Spell)) {
                return fqH.sVb;
            }
            if (!euk_1.d(exP2, fqE2, Spell)) {
                return fqH.sVc;
            }
            if (!euk_1.e(exP2, fqE2, Spell)) {
                return fqH.sVd;
            }
        }
        if (!(fqH2 = exP2.fgh().c(exP2, fqE2, this.rrZ.dHf().bhJ())).isValid()) {
            return fqH2;
        }
        int n = ((fqD)Spell).j(fqE2, exP2, acd_12, this.rrZ.bbh());
        int n2 = ((fqD)Spell).i(fqE2, exP2, acd_12, this.rrZ.bbh());
        boolean bl2 = ((fqD)Spell).d(fqE2, (Object)exP2, (Object)acd_12, (Object)this.rrZ.bbh());
        int n3 = this.a(exP2, bl2, n, n2);
        this.rxZ.a(this.rrZ, exP2, fqE2, n, n3, acd_12);
        if (this.rya) {
            this.rxZ.fNE();
        }
        fqH fqH3 = fqH.sVr;
        try {
            if (acd_12 != null) {
                Object t = this.rrZ.dy(acd_12.getX(), acd_12.getY());
                if (!this.a(exP2, acd_12, fqE2, (exP)t, this.rrZ, n, n3)) {
                    fqH fqH4 = fqH.sVj;
                    return fqH4;
                }
                List<qu_0> list = this.rrZ.a(acd_12);
                for (qu_0 qu_02 : list) {
                    fqH fqH5 = exP2.fgh().a(exP2, fqE2, (int)this.rrZ.dHf().bhJ(), qu_02);
                    if (fqH5.isValid()) continue;
                    fqH fqH6 = fqH5;
                    return fqH6;
                }
            }
            fqH3 = this.a(exP2, fqE2, acd_12, bl2, n, n2, ((fqD)Spell).a(fqE2, (Object)exP2, (Object)acd_12, (Object)this.rrZ.bbh()), ((fqD)Spell).f(fqE2, exP2, (Object)acd_12, (Object)this.rrZ.bbh()), ((fqD)Spell).fYo(), ((fqD)Spell).l(fqE2, exP2, acd_12, this.rrZ.bbh()), ((fqD)Spell).giF());
        }
        catch (Exception exception) {
            rxY.error((Object)"Exception levee", (Throwable)exception);
        }
        finally {
            this.rxZ.clear();
        }
        return fqH3;
    }

    @Override
    public boolean a(exP exP2, fqE fqE2, int n, int n2, boolean bl, int n3, int n4) {
        if (((fqD)fqE2.giP()).g(fqS.sWo) && this.b(exP2, n3, n4)) {
            return true;
        }
        if (((fqD)fqE2.giP()).g(fqS.sWq) && this.c(exP2, n3, n4)) {
            return true;
        }
        if (!((fqD)fqE2.giP()).g(fqS.sWm)) {
            return super.a(exP2, fqE2, n, n2, bl, n3, n4);
        }
        if (!this.rxZ.fNF()) {
            return super.a(exP2, fqE2, n, n2, bl, n3, n4);
        }
        boolean bl2 = this.rxZ.fNG();
        if (!bl2) {
            return super.a(exP2, fqE2, n, n2, bl, n3, n4);
        }
        return bl2;
    }

    private boolean b(exP exP2, int n, int n2) {
        List<QQ> list = this.rrZ.bai().g(new acd_1(n, n2));
        boolean bl = false;
        for (QQ qQ : list) {
            if (qQ.aeV() != etm_0.rnG.aHp() || qQ.bcP() != exP2.bcP()) continue;
            bl = true;
        }
        return bl;
    }

    private boolean c(exP exP2, int n, int n2) {
        List<QQ> list = this.rrZ.bai().g(new acd_1(n, n2));
        boolean bl = false;
        for (QQ qQ : list) {
            qu_0 qu_02;
            if (qQ.aeV() != etm_0.rnr.aHp() || (qu_02 = qQ.bci()) == null || qu_02.Sn() != exP2.Sn()) continue;
            bl = true;
        }
        return bl;
    }

    @Override
    protected boolean a(exP exP2, fqE fqE2, int n, int n2, short s, int n3, int n4, boolean bl) {
        if (((fqD)fqE2.giP()).g(fqS.sWo) && this.b(exP2, n, n2)) {
            return true;
        }
        if (((fqD)fqE2.giP()).g(fqS.sWq) && this.c(exP2, n, n2)) {
            return true;
        }
        if (!((fqD)fqE2.giP()).g(fqS.sWm)) {
            return super.a(exP2, fqE2, n, n2, s, n3, n4, bl);
        }
        if (!this.rxZ.fNF()) {
            return super.a(exP2, fqE2, n, n2, s, n3, n4, bl);
        }
        boolean bl2 = this.rxZ.fNI();
        if (!bl2) {
            return super.a(exP2, fqE2, n3, n4, bl, n, n2) && eul_1.a(exP2, new acd_1(n, n2), fqE2, null, this.rrZ) && super.a(exP2, fqE2, n, n2, s, n3, n4, bl);
        }
        return bl2;
    }

    boolean a(exP exP2, acd_1 acd_12, fqE fqE2, exP exP3, etu_0 etu_02, int n, int n2) {
        Object Spell = fqE2.giP();
        boolean bl = ((fqD)Spell).b(fqE2, (Object)exP2, (Object)acd_12, (Object)etu_02.bbh());
        boolean bl2 = ((fqD)Spell).k(fqE2, exP2, acd_12, etu_02.bbh());
        if (!bl && !bl2) {
            return true;
        }
        boolean bl3 = ((fqD)Spell).c(fqE2, (Object)exP2, (Object)acd_12, (Object)etu_02.bbh());
        boolean bl4 = eul_1.a(exP2, acd_12, fqE2, exP3, etu_02, bl3);
        if (!((fqD)Spell).g(fqS.sWm)) {
            return bl4;
        }
        if (!this.rxZ.fNF()) {
            return bl4;
        }
        boolean bl5 = this.rxZ.fNH();
        if (!bl5) {
            boolean bl6 = ((fqD)Spell).l(fqE2, exP2, acd_12, etu_02.bbh());
            boolean bl7 = super.a(exP2, fqE2, n, n2, bl6, acd_12.getX(), acd_12.getY());
            return bl7 && bl4;
        }
        return bl5;
    }

    public void fMA() {
        this.rya = false;
    }

    public void fMB() {
        this.rya = true;
    }
}

