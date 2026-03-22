/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bIx
 */
public class bix_2
extends biu_2 {
    private long kgC;

    public void lw(long l) {
        this.kgC = l;
    }

    @Override
    public void a(fsn_1 fsn_12) {
        adq adq2;
        if (!biu_2.b(fsn_12)) {
            fsn_12.setVisible(false);
            return;
        }
        if (fsn_12.getValue() instanceof adq && this.a(adq2 = (adq)fsn_12.getValue())) {
            if (adq2.aXv == this.kgC) {
                fsn_12.setVisible(false);
                return;
            }
            fsn_12.pt(true);
            Object Info2 = frb_0.sYO.a(fre_0.sZa, adq2.aXv);
            bix_2.a(fsn_12, ((frk_0)Info2).gkp());
            long l = aue_0.cVJ().cVO().xl();
            if (frz.a(l, zd_2.aoD, (int)adq2.aXv)) {
                fsn_12.setVisible(true);
                fsn_12.ps(true);
                fsn_12.pt(false);
                return;
            }
        }
        fsn_12.setVisible(true);
        fsn_12.ps(false);
        fsn_12.pt(true);
    }

    private boolean a(adq adq2) {
        return adq2.aXy == 47;
    }

    private boolean c(fsn_1 fsn_12) {
        if (fsn_12.getValue() instanceof adq) {
            return this.a((adq)fsn_12.getValue());
        }
        return false;
    }

    @Override
    public List<fsn_1> aa(List<fsn_1> list) {
        ArrayList<fsn_1> arrayList = new ArrayList<fsn_1>(list);
        list.sort((fsn_12, fsn_13) -> {
            boolean bl = this.c((fsn_1)fsn_12);
            boolean bl2 = this.c((fsn_1)fsn_13);
            if (bl && !bl2) {
                return 1;
            }
            if (!bl && bl2) {
                return -1;
            }
            return 0;
        });
        return arrayList;
    }
}

