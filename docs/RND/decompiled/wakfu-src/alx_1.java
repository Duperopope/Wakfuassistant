/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alx
 */
public abstract class alx_1<SoundData>
extends ala_1<SoundData> {
    protected final ZC cFy;
    protected final Logger cFz;

    protected alx_1(ZC zC, LuaState luaState, Logger logger) {
        super(luaState);
        this.cFy = zC;
        this.cFz = logger;
    }

    protected boolean bCb() {
        return this.cFy.bpD();
    }

    @Override
    protected boolean bCc() {
        return super.bCc() && this.bCb();
    }

    @Override
    protected boolean a(@NotNull aix_2 aix_22) {
        return this.cFy.bpw().hC(aix_22.aYj());
    }

    @NotNull
    protected Optional<ahm_1> a(@NotNull aix_2 aix_22, @NotNull afx_1 afx_12) {
        return this.a(aix_22, afx_12.bha(), this.cFy);
    }

    @NotNull
    protected Optional<ahm_1> a(@NotNull aix_2 aix_22, @NotNull afx_1 afx_12, int n) {
        return this.a(aix_22, afx_12.bha(), n, this.c(afx_12), this.cFy);
    }
}

