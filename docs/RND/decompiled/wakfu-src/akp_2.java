/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaObject
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akp
 */
public class akp_2
extends afk_1 {
    private static final String cCz = "getTweenParticleSystemTime";
    private static final afe_1[] cCA = new afe_1[]{new afe_1("particleFileId", null, aff_2.dJy, false), new afe_1("startX", null, aff_2.dJy, false), new afe_1("startY", null, aff_2.dJy, false), new afe_1("startZ", null, aff_2.dJy, false), new afe_1("destX", null, aff_2.dJy, false), new afe_1("destY", null, aff_2.dJy, false), new afe_1("destZ", null, aff_2.dJy, false), new afe_1("angle", null, aff_2.dJy, false), new afe_1("type", null, aff_2.dJy, false), new afe_1("timeCoef", null, aff_2.dJz, true), new afe_1("level", null, aff_2.dJy, true)};
    private static final afe_1[] cCB = new afe_1[]{new afe_1("movementDuration", null, aff_2.dJy, false)};

    public akp_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cCz;
    }

    @Override
    public afe_1[] bBg() {
        return cCA;
    }

    @Override
    public final afe_1[] bBh() {
        return cCB;
    }

    @Override
    public void ss(int n) {
        LuaObject luaObject = this.cai().caC().getLuaObject("fightId");
        int n2 = -1;
        if (luaObject.isNumber()) {
            n2 = (int)luaObject.getNumber();
            if (!agY.bzw().sm(n2)) {
                this.xC(0);
                return;
            }
        }
        int n3 = this.xp(0);
        int n4 = this.xp(1);
        int n5 = this.xp(2);
        int n6 = this.xp(3);
        int n7 = this.xp(4);
        int n8 = this.xp(5);
        int n9 = this.xp(6);
        int n10 = this.xp(7);
        this.xp(8);
        float f2 = n >= 9 ? this.xr(9) : -1.0f;
        FreeParticleSystem freeParticleSystem = n >= 10 ? agY.bzw().bF(n3, this.xp(10)) : agY.bzw().sk(n3);
        freeParticleSystem.r(n4, n5, n6);
        freeParticleSystem.pu(n2);
        ahi ahi2 = f2 < 0.0f ? new ahi(freeParticleSystem, n7, n8, n9, n10) : new ahi(freeParticleSystem, n7, n8, n9, n10, f2);
        this.xC((int)ahi2.bzP());
        freeParticleSystem.bsI();
    }
}

