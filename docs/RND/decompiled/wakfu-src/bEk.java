/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bEk
implements bug_0<ffV> {
    @Nullable
    private final Boolean jNL;

    public bEk(@Nullable Boolean bl) {
        this.jNL = bl;
    }

    @Nullable
    public Boolean dRZ() {
        return this.jNL;
    }

    public boolean L(ffV ffV2) {
        if (this.jNL == null) {
            return true;
        }
        return beg_1.u((bgv_2)ffV2.dOg()).filter(bl -> bl == this.jNL).isPresent();
    }

    @Override
    public boolean isValid() {
        return this.jNL != null;
    }

    @Override
    public buh_0 dcz() {
        return buh_0.joG;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.L((ffV)object);
    }
}

