/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.list.array.TLongArrayList;
import java.util.List;

/*
 * Renamed from bTX
 */
class btx_2
implements afp<ads_0, bze_2> {
    final TLongArrayList lqB;
    private final int lqC;
    private final int lqD;

    btx_2(int n, int n2, TLongArrayList tLongArrayList) {
        this.lqC = n;
        this.lqB = tLongArrayList;
        this.lqD = n2;
    }

    public void a(ads_0 ads_02, bze_2 bze_22, bze_2 bze_23) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        List list = bzj_2.eqi().bld();
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            bze_2 bze_24 = (bze_2)list.get(i);
            long l = GC.s(bze_24.getX(), bze_24.getY());
            if (this.lqB.contains(l)) continue;
            this.lqB.add(l);
            int n2 = bze_24.getX() * 18;
            int n3 = bze_24.getY() * 18;
            FreeParticleSystem freeParticleSystem = agY.bzw().bF(this.lqC, this.lqD);
            freeParticleSystem.r(n2, n3, wa_0.y(n2, n3, bgt_02.aZw().bdi()));
            agZ.bzy().b(freeParticleSystem);
        }
    }

    @Override
    public /* synthetic */ void b(afW afW2, vx_0 vx_02, vx_0 vx_03) {
        this.a((ads_0)afW2, (bze_2)vx_02, (bze_2)vx_03);
    }
}

