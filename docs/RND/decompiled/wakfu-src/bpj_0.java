/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpj
 */
public class bpj_0
implements bug_0<bpe_0> {
    @Nullable
    private final fhr_0 iUF;

    public bpj_0(@Nullable fhr_0 fhr_02) {
        this.iUF = fhr_02;
    }

    @Nullable
    public fhr_0 dCF() {
        return this.iUF;
    }

    public boolean c(bpe_0 bpe_02) {
        return bpe_02.dCC().dCF() == this.iUF;
    }

    @Override
    public boolean isValid() {
        return this.iUF != null;
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jow;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.c((bpe_0)object);
    }
}

