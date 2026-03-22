/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eMZ
 */
public abstract class emz_0
extends qg_0<enk_0> {
    @Nullable
    public final enk_0 RN(int n) {
        if (eni_0.fBA().RW(n)) {
            return eni_0.fBA().RX(n);
        }
        enk_0 enk_02 = (enk_0)super.oy(n);
        if (enk_02 == null && (enk_02 = this.Ax(n)) != null) {
            this.a(enk_02);
        }
        return enk_02;
    }

    @Nullable
    protected abstract enk_0 Ax(int var1);

    @Override
    @Nullable
    public /* synthetic */ Qj oy(int n) {
        return this.RN(n);
    }
}

