/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dez
 */
class dez_0
extends afk_1 {
    private final dea_0 ojW = new dea_0(this);
    private int kwu;
    private int ojX = 1;

    dez_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "displayCountdown";
    }

    @Override
    public String getDescription() {
        return "Affiche un d?compte";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohM;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    void fcJ() {
        dgw.fcT().a(new dgv(dgx.okL, String.valueOf(this.kwu), this.kwu * 1000));
        this.kwu -= this.ojX;
    }

    @Override
    public void ss(int n) {
        this.kwu = this.xp(0);
        this.ojX = n == 2 ? this.xp(1) : 1;
        this.fcJ();
        abb_2.bUA().a(this.ojW, (long)this.ojX * 1000L, -1, this.kwu / this.ojX + 1);
    }
}

