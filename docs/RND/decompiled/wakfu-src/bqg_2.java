/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.List;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bQg
 */
class bqg_2
implements bot_0 {
    final /* synthetic */ bqk_2 kUm;
    final /* synthetic */ int kUn;
    final /* synthetic */ bpp_2 kUo;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bqg_2(bpp_2 bpp_22, bqk_2 bqk_22, int n) {
        this.kUo = bpp_22;
        this.kUm = bqk_22;
        this.kUn = n;
    }

    @Override
    public void c(long l, @Unmodifiable List<bpt_1<?, ?>> list) {
        int n = list.size();
        this.kUo.jwd = (int)Math.ceil((double)l / 12.0);
        if (n <= 0) {
            this.kUm.ak(null);
            return;
        }
        this.kUo.kTG.put(this.kUn, new bqh_2(0, null, list));
        this.kUm.ak(null);
    }

    @Override
    public void cXM() {
        this.kUm.cXM();
    }
}

