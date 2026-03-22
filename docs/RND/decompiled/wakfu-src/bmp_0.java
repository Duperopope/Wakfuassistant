/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.wakfu.client.console.command.debug.DisplayStatesCommand;
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectProcedure;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bMp
 */
public class bmp_0
implements bNC {
    private final THashMap<azq_2, bMn> kwU = new THashMap();
    private long kwV = 0L;
    private final long kwW = 1L;
    private static final TObjectProcedure<bMn> kwX = new bMq();
    private static final TObjectProcedure<bMn> kwY = new bmr_0();

    @Nullable
    public bMn c(QD qD, long l) {
        aeh_2 aeh_22;
        if (qD == null) {
            return null;
        }
        Object object = qD.bbf();
        if (qD.d() == enf_0.qPC.d()) {
            object = ((erh_0)qD).fGk();
        } else if (qD.d() == enf_0.qTV.d()) {
            object = ((eQN)qD).fav();
        } else if (qD.d() == enf_0.qTR.d() || qD.d() == enf_0.qTS.d()) {
            return null;
        }
        if (object == null) {
            return null;
        }
        if (object instanceof bmx_0 && ((aeh_22 = (bmt_0)((bmx_0)object).giP()) == null || !((bmt_0)aeh_22).eeE() && !DisplayStatesCommand.cTU())) {
            return null;
        }
        aeh_22 = this.B(qD);
        if (aeh_22 != null) {
            boolean bl = qD.bba() == null || ((enk_0)qD.bba()).cxC();
            ((bMn)aeh_22).b(qD, bl);
            if (l != -1L) {
                ((bMn)aeh_22).lO(l);
            }
        }
        return aeh_22 == null || ((bMn)aeh_22).eey() == 0 ? null : aeh_22;
    }

    private bMn B(QD qD) {
        azq_2 azq_22;
        bMn bMn2;
        Object EC = qD.bbf();
        if (EC == null) {
            return null;
        }
        long l = EC.QF();
        if (EC.bab() == 19 || EC.bab() == 33) {
            if (this.kwV != 0L) {
                l = this.kwV;
            } else {
                this.kwV = l;
            }
        }
        if ((bMn2 = (bMn)this.kwU.get((Object)(azq_22 = new azq_2(EC.bab(), l)))) == null) {
            bMn2 = bMn.c(EC);
            this.kwU.put((Object)azq_22, (Object)bMn2);
        } else {
            bMn2.d((Qk)EC);
        }
        return bMn2;
    }

    public void C(QD qD) {
        azq_2 azq_22;
        bMn bMn2;
        if (qD == null) {
            return;
        }
        Object object = qD.bbf();
        if (qD.d() == enf_0.qPC.d()) {
            object = ((erh_0)qD).fGk();
        }
        if (object == null) {
            return;
        }
        long l = object.QF();
        if ((object.bab() == 19 || object.bab() == 33) && this.kwV != 0L) {
            l = this.kwV;
        }
        if (object.bab() == 28) {
            l = 1L;
        }
        if ((bMn2 = (bMn)this.kwU.get((Object)(azq_22 = new azq_2(object.bab(), l)))) != null) {
            bMn2.e((Qk)object);
            if (!bMn2.eew()) {
                this.kwU.remove((Object)azq_22);
                bMn2.aZp();
                if (object.bab() == 19 || object.bab() == 33) {
                    this.kwV = 0L;
                }
            }
        }
    }

    public void eeA() {
        this.kwU.forEachValue(kwX);
    }

    public void clear() {
        this.kwV = 0L;
        this.kwU.forEachValue(kwY);
        this.kwU.clear();
    }

    @Override
    public void daZ() {
        this.eeA();
    }
}

