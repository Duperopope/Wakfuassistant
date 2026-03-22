/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

public final class cfu
extends ceK<cqk_0, bsj_0> {
    private static final Logger lSU = Logger.getLogger(cfu.class);

    public boolean a(cqk_0 cqk_02) {
        if (cvu_2.eQx()) {
            cvu_2.eTO().eTS();
        }
        cfv cfv2 = new cfv(this, agb_1.cbm(), eui_1.rts.aJr(), 0, cqk_02);
        aVi.cWF().a((bsj_0)this.jkR, (aft_2)cfv2);
        aVi.cWF().m(this.jkR);
        return false;
    }

    @Override
    boolean b(cqk_0 cqk_02) {
        long l = cqk_02.KU();
        byte[] byArray = cqk_02.exX();
        bgy bgy2 = (bgy)((bsj_0)this.jkR).qJ(l);
        if (bgy2 == null) {
            lSU.error((Object)("Trying to synchronize a fighter from current fight but the fighter can't be found " + l));
            return false;
        }
        try {
            lSU.info((Object)("Unserializing effects for fighter " + l + ", byte size : " + byArray.length));
            bgy2.dU(byArray);
            List<QD> list = bgy2.doc().oH(enf_0.qUE.d());
            list.addAll(bgy2.doc().oH(enf_0.qUF.d()));
            list.addAll(bgy2.doc().oH(enf_0.qUG.d()));
            list.addAll(bgy2.doc().oH(enf_0.qUK.d()));
            list.addAll(bgy2.doc().oH(enf_0.qUL.d()));
            list.addAll(bgy2.doc().oH(enf_0.qSG.d()));
            list.addAll(bgy2.doc().oH(enf_0.qSI.d()));
            list.addAll(bgy2.doc().oH(enf_0.qVt.d()));
            for (QD qD : list) {
                if (!((ero_0)qD).fHo()) continue;
                qD.n(null);
                qD.a(null, false);
            }
        }
        catch (Exception exception) {
            lSU.error((Object)"Exception levee", (Throwable)exception);
        }
        bgy2.dpF();
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqk_0)aam_22);
    }
}

