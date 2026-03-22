/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Unmodifiable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bPV
 */
class bpv_1
implements bPb {
    final /* synthetic */ boolean kTS;
    final /* synthetic */ Runnable kTT;
    final /* synthetic */ bpp_2 kTU;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bpv_1(bpp_2 bpp_22, boolean bl, Runnable runnable) {
        this.kTU = bpp_22;
        this.kTS = bl;
        this.kTT = runnable;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void ad(@Unmodifiable List<bpu_1<?>> list) {
        Iterator<bpo_2> iterator = this.kTU.kTk;
        synchronized (iterator) {
            if (!this.kTS) {
                this.kTU.kTp = bqo_2.kUz;
            }
            TObjectProcedure object = bpu_12 -> {
                this.kTU.kTv.add((bpu_1<?>)bpu_12);
                return true;
            };
            bpp_2.kSR.info((Object)"Web shop categories loaded");
            this.kTU.kTu.clear();
            this.kTU.kTu.addAll(list);
            list.forEach(bpu_12 -> bpu_12.w(object));
            this.kTU.kTE = 3;
        }
        fse_1.gFu().a((aef_2)this.kTU, "categories", "rootCategories", "parentCategory");
        this.kTT.run();
        for (bpo_2 bpo_22 : new ArrayList<bpo_2>(this.kTU.kTs)) {
            bpo_22.eiS();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void cXM() {
        bpp_2.kSR.warn((Object)"Error occured during load of shop categories.");
        Object object = this.kTU.kTk;
        synchronized (object) {
            this.kTU.kTE = 1;
        }
    }
}

