/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bPW
 */
class bpw_2
implements bPc {
    final /* synthetic */ Runnable kTV;
    final /* synthetic */ bpp_2 kTW;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bpw_2(bpp_2 bpp_22, Runnable runnable) {
        this.kTW = bpp_22;
        this.kTV = runnable;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(@Unmodifiable List<bpw_1<?, ?>> list, @Unmodifiable List<bpt_1<?, ?>> list2) {
        Object object = this.kTW.kTk;
        synchronized (object) {
            this.kTW.kTp = bqo_2.kUy;
            this.kTW.kTq.a(bqw_2.kVA);
            this.am(list);
            this.al(list2);
            this.kTV.run();
            this.kTW.kTz = null;
            for (bpo_2 bpo_22 : new ArrayList<bpo_2>(this.kTW.kTs)) {
                bpo_22.eiR();
            }
            fse_1.gFu().a((aef_2)this.kTW, "mode", "currentCategory", "parentCategory");
        }
    }

    private void al(@Unmodifiable List<bpt_1<?, ?>> list) {
        this.kTW.kTx.clear();
        this.kTW.kTx.addAll(list);
        fse_1.gFu().a((aef_2)this.kTW, "homeArticles");
    }

    private void am(@Unmodifiable List<bpw_1<?, ?>> list) {
        this.kTW.kTw.clear();
        this.kTW.kTw.addAll(list);
        fse_1.gFu().a((aef_2)this.kTW, "carrousel");
    }

    @Override
    public void cXM() {
        bpp_2.kSR.warn((Object)"Error occured during load of shop home.");
    }
}

