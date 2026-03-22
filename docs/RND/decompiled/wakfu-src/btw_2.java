/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.list.array.TLongArrayList;
import java.util.List;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTW
 */
class btw_2
extends afk_1 {
    btw_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setEnvironmentAps";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("APS Id", null, aff_2.dJz, false), new afe_1("level", null, aff_2.dJz, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        TLongArrayList tLongArrayList = new TLongArrayList();
        List list = bzj_2.eqi().bld();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        int n4 = list.size();
        for (int i = 0; i < n4; ++i) {
            bze_2 bze_22 = (bze_2)list.get(i);
            long l = GC.s(bze_22.getX(), bze_22.getY());
            if (tLongArrayList.contains(l)) continue;
            tLongArrayList.add(l);
            int n5 = bze_22.getX() * 18;
            int n6 = bze_22.getY() * 18;
            FreeParticleSystem freeParticleSystem = agY.bzw().bF(n2, n3);
            freeParticleSystem.r(n5, n6, wa_0.y(n5, n6, bgt_02.aZw().bdi()));
            agZ.bzy().b(freeParticleSystem);
        }
        bzj_2.eqi().b(new btx_2(n2, n3, tLongArrayList));
    }
}

