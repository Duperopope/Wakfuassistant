/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.List;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bQj
 */
class bqj_2
implements bOX {
    final /* synthetic */ bqi_2 kUt;

    bqj_2(bqi_2 bqi_22) {
        this.kUt = bqi_22;
    }

    @Override
    public void d(long l, @Unmodifiable List<bpt_1<?, ?>> list) {
        this.kUt.kUs.jwd = (int)Math.ceil((double)l / 12.0);
        this.kUt.kUq.addAll(list);
        this.kUt.aCx = true;
        if (this.kUt.kUu != null) {
            this.kUt.kUu.ak(list);
        }
    }

    @Override
    public void cXM() {
        this.kUt.kUs.jwd = 0;
        this.kUt.aCx = true;
        if (this.kUt.kUu != null) {
            this.kUt.kUu.cXM();
        }
    }
}

