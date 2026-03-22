/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

class aKy<RE extends QD<enk_0, eNl>, EC extends eNl>
extends aKx<RE, EC> {
    final /* synthetic */ aKv eeE;

    aKy(aKv aKv2) {
        this.eeE = aKv2;
        super(aKv2);
    }

    @Override
    protected void d(bgy bgy2, acd_1 acd_12, enk_0 enk_02, short s, List<eNl> list) {
        abi_1 abi_12 = new acq_1(bgy2.aZw(), acd_12).bXb();
        Iterable<int[]> iterable = this.a(enk_02, list).b(acd_12.getX(), acd_12.getY(), acd_12.bdi(), bgy2.bcC(), bgy2.bcD(), bgy2.bcE(), abi_12);
        acd_1 acd_13 = new acd_1();
        rh_0 rh_02 = bgy2.dkZ().bag();
        for (int[] nArray : iterable) {
            int n = nArray[0];
            int n2 = nArray[1];
            acd_13.Q(n, n2, acd_12.bdi());
            if (!rh_02.T(n, n2)) continue;
            this.eeE.a(list, bgy2, acd_13, s);
        }
    }
}

