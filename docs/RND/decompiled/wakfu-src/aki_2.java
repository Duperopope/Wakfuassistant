/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aki
 */
public class aki_2
extends akh_2 {
    private static final Logger cCf = Logger.getLogger(aki_2.class);
    private static final String cCg = "addParticleSystemToIeWithOffset";
    private static final afe_1[] cCh = new afe_1[]{new afe_1("particleFileId", null, aff_2.dJy, false), new afe_1("targetId", null, aff_2.dJw, false), new afe_1("level", null, aff_2.dJy, false), new afe_1("height", null, aff_2.dJy, true)};

    public aki_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cCg;
    }

    @Override
    public afe_1[] bBg() {
        return cCh;
    }

    @Override
    protected void a(FreeParticleSystem freeParticleSystem, ZC zC, int n) {
        int n2 = n == 4 ? this.xp(3) : zC.bpX();
        freeParticleSystem.a(zC, 0.0f, n2);
    }
}

