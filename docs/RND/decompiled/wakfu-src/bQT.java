/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

class bQT
implements TObjectProcedure<bQN> {
    final /* synthetic */ bQS kXI;

    bQT(bQS bQS2) {
        this.kXI = bQS2;
    }

    public boolean b(bQN bQN2) {
        ArrayList<aef_2> arrayList = bQN2.kXo;
        for (aef_2 aef_22 : arrayList) {
            Object object;
            Object object2;
            if (aef_22 instanceof bRd) {
                object2 = new fsJ(this.kXI.kXG);
                object = (bRd)aef_22;
                int n = ((bRd)object).ekC();
                ((bRf)object).it(((fsH)object2).k(new caj_2(0L, n, 0, Short.MIN_VALUE, Short.MIN_VALUE)));
                ((bRf)object).a((fsH)object2);
                continue;
            }
            if (aef_22 instanceof bRg || !(aef_22 instanceof bRh)) continue;
            object2 = (bRh)aef_22;
            object = (fcb_0)((bRf)object2).ekD();
            faz_0 faz_02 = czc_2.eYH().eAj();
            int n = this.a(faz_02);
            boolean bl = this.kXI.kXH.cr(((fcb_0)object).fRN()) ? n >= 20 : false;
            boolean bl2 = this.kXI.kXG.aah(((fcb_0)object).cmP());
            ((bRf)object2).it(bl2 && !bl);
        }
        return true;
    }

    private int a(faz_0 faz_02) {
        if (faz_02 == null) {
            return 0;
        }
        LU lU = new LU();
        faz_02.P(new bQU(this, lU));
        for (bQE bQE2 : this.kXI.kXH.kXC) {
            this.a(lU, bQE2, faz_02);
        }
        return lU.aTn();
    }

    private void a(LU lU, bQE bQE2, faz_0 faz_02) {
        cix_1 cix_12;
        fsG fsG2;
        short s;
        ciy_1 ciy_12 = bQE2.ejH();
        if (ciy_12 instanceof civ_1) {
            civ_1 civ_12 = (civ_1)ciy_12;
            fsG fsG3 = (fsG)civ_12.eLi();
            short s2 = civ_12.eLf();
            if (this.kXI.kXH.cr(fsG3.fRN()) && !this.kXI.kXH.cr(s2)) {
                lU.aTo();
            } else if (!this.kXI.kXH.cr(fsG3.fRN()) && this.kXI.kXH.cr(s2)) {
                lU.aTq();
            }
        } else if (ciy_12 instanceof cix_1 && this.kXI.kXH.cr(s = (fsG2 = (fsG)(cix_12 = (cix_1)ciy_12).eLi()).fRN())) {
            lU.aTq();
        }
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((bQN)object);
    }
}

