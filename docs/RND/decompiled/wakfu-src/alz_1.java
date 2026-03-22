/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Optional;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alz
 */
public abstract class alz_1<SoundParam>
extends afk_1 {
    protected alz_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    protected void ss(int n) {
        if (!this.bCc()) {
            return;
        }
        SoundParam SoundParam = this.sA(n);
        afx_1 afx_12 = this.cai();
        this.a(SoundParam, afx_12);
    }

    protected boolean bCc() {
        return aiv_2.bBr().bpD();
    }

    protected int c(afx_1 afx_12) {
        Optional<Integer> optional = afx_12.ia("defaultSoundMaxInstance");
        return optional.orElse(-1);
    }

    protected abstract SoundParam sA(int var1);

    protected abstract void a(SoundParam var1, afx_1 var2);
}

