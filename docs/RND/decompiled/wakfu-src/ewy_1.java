/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.WeakReference;

/*
 * Renamed from eWy
 */
public final class ewy_1
extends WeakReference<ewq_2>
implements ewq_2 {
    public ewy_1(ewq_2 ewq_22) {
        super(ewq_22);
    }

    @Override
    public void Fs(int n) {
        ewq_2 ewq_22 = (ewq_2)this.get();
        if (ewq_22 != null) {
            ewq_22.Fs(n);
        }
    }

    @Override
    public ewq_2 dHg() {
        return (ewq_2)this.get();
    }
}

