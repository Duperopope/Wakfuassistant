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
 * Renamed from akf
 */
public class akf_2
extends afk_1 {
    private static final String cBY = "addParticleSystem";
    private static final afe_1[] cBZ = new afe_1[]{new afe_1("particleFileId", "Id du systeme", aff_2.dJy, false), new afe_1("x", "Position x", aff_2.dJy, false), new afe_1("y", "Position y", aff_2.dJy, false), new afe_1("z", "Position z", aff_2.dJy, false), new afe_1("level", "Niveau du systeme", aff_2.dJy, true), new afe_1("fightId", null, aff_2.dJy, true)};
    private static final afe_1[] cCa = new afe_1[]{new afe_1("systemId", "Id unique de l'APS", aff_2.dJy, false)};

    public akf_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cBY;
    }

    @Override
    public String getDescription() {
        return "Ajoute un syst?me de particules ? un endroit bien pr?cis du monde.";
    }

    @Override
    public afe_1[] bBg() {
        return cBZ;
    }

    @Override
    public final afe_1[] bBh() {
        return cCa;
    }

    @Override
    public void ss(int n) {
        int n2;
        LuaObject luaObject = this.cai().caC().getLuaObject("fightId");
        int n3 = -1;
        if (luaObject.isNumber()) {
            n3 = (int)luaObject.getNumber();
            if (!agY.bzw().sm(n3)) {
                this.xC(0);
                return;
            }
        }
        if ((n2 = this.xp(0)) == 0) {
            this.xC(-1);
            return;
        }
        if (n >= 6) {
            n3 = this.xp(5);
        }
        int n4 = this.xp(1);
        int n5 = this.xp(2);
        int n6 = this.xp(3);
        FreeParticleSystem freeParticleSystem = n >= 5 ? agY.bzw().bF(n2, this.xp(4)) : agY.bzw().sk(n2);
        freeParticleSystem.r(n4, n5, n6);
        freeParticleSystem.pu(n3);
        agZ.bzy().b(freeParticleSystem);
        this.xC(freeParticleSystem.bLJ());
    }
}

