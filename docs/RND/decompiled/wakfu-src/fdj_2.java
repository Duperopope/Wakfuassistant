/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

/*
 * Renamed from fDj
 */
class fdj_2
implements fia_2 {
    final /* synthetic */ faw_2 udE;
    final /* synthetic */ Consumer udF;
    final /* synthetic */ faw_2 udG;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fdj_2(fdh_1 fdh_12, faw_2 faw_22, Consumer consumer, faw_2 faw_23) {
        this.udE = faw_22;
        this.udF = consumer;
        this.udG = faw_23;
    }

    @Override
    public boolean Mf(int n) {
        if (this.udE.isValid()) {
            this.udE.b(this);
            this.udF.accept(this.udG);
            return false;
        }
        return true;
    }
}

