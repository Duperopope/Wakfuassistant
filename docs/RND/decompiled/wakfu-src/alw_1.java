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
 * Renamed from alw
 */
public abstract class alw_1<SoundParam>
extends alz_1<SoundParam> {
    protected final ZC cFw;
    protected final Logger cFx;

    protected alw_1(ZC zC, LuaState luaState, Logger logger) {
        super(luaState);
        this.cFw = zC;
        this.cFx = logger;
    }

    protected boolean bCb() {
        return this.cFw.bpD();
    }

    @Override
    protected boolean bCc() {
        return super.bCc() && this.bCb();
    }
}

