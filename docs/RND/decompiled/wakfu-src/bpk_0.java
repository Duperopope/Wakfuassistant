/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpk
 */
public class bpk_0
implements bug_0<bpe_0> {
    @Nullable
    private final Boolean iUG;

    public bpk_0(@Nullable Boolean bl) {
        this.iUG = bl;
    }

    @Nullable
    public Boolean bDR() {
        return this.iUG;
    }

    public boolean c(bpe_0 bpe_02) {
        if (this.iUG == null) {
            return true;
        }
        ffV ffV2 = cui_1.eRw().dBU();
        if (ffV2 == null) {
            return false;
        }
        fhp_0 fhp_02 = bpe_02.dCC();
        if (fhp_02.dCF() == fhr_0.sqz) {
            if (!ffV2.dXg()) {
                return false;
            }
            return fhk_0.a(ffV2.eAZ(), fhp_02) == this.iUG;
        }
        return fhp_02.dCF().aA(ffV2) == this.iUG.booleanValue();
    }

    @Override
    public boolean isValid() {
        return this.iUG != null;
    }

    @Override
    public buh_0 dcz() {
        return buh_0.joP;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.c((bpe_0)object);
    }
}

