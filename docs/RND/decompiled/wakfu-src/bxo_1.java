/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXO
 */
public class bxo_1
extends afk_1 {
    private static final Logger lxj = Logger.getLogger(bxo_1.class);

    public bxo_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "isWalkable";
    }

    @Override
    public String getDescription() {
        return "Permit to know if provided cell is walkable";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("worldX", "Position x", aff_2.dJy, false), new afe_1("worldY", "Position y", aff_2.dJy, false), new afe_1("worldZ", "Position z", aff_2.dJy, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("walkable", null, aff_2.dJA, false)};
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        int n4 = this.xp(2);
        this.dK(wa_0.j(n2, n3, (short)n4));
    }
}

