/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class eMB
extends eLT<Qk<enk_0>> {
    public eMB(Qk<enk_0> qk, int n, short s) {
        super(qk, n, s);
    }

    public eMB(Qk<enk_0> qk, int n, short s, boolean bl, ArrayList<String> arrayList, ArrayList<String> arrayList2, eLN eLN2, int n2) {
        super(qk, n, s, bl, arrayList, arrayList2, eLN2, n2);
    }

    @Override
    public boolean q(enk_0 enk_02) {
        return (enk_02.cxC() || eLL.qJe.cZz()) && enk_02.fAv() <= this.qLX && enk_02.fAw() >= this.qLX;
    }
}

