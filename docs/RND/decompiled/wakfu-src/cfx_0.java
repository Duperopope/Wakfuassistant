/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cfX
 */
final class cfx_0
extends ceK<cqn_0, bsj_0> {
    cfx_0() {
    }

    public boolean a(cqn_0 cqn_02) {
        bgy bgy2 = (bgy)((bsj_0)this.jkR).qJ(cqn_02.KU());
        if (bgy2 == null) {
            return false;
        }
        bgy2.fgh().eL(ByteBuffer.wrap(cqn_02.eyY()));
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqn_0)aam_22);
    }
}

