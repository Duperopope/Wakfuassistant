/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akn
 */
public class akn_2
extends afk_1 {
    private static final String cCt = "removeParticleSystem";
    private static final afe_1[] cCu = new afe_1[]{new afe_1("particleUniqueId", "L'Id unique de l'APS", aff_2.dJy, false), new afe_1("stopEmittersToKill", "Si true, les emetteurs seront coup?s et le syst?me ne sera supprim? que lorsqu'il n'y a plus de particules vivantes. Si false, d?truit imm?diatement.", aff_2.dJA, true)};

    public akn_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cCt;
    }

    @Override
    public String getDescription() {
        return "D?truit un systeme de particule existant";
    }

    @Override
    public afe_1[] bBg() {
        return cCu;
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        boolean bl = n >= 2 && this.xx(1);
        agZ.bzy().d(n2, bl);
    }
}

