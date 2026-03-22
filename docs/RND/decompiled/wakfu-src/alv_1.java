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
 * Renamed from alv
 */
public abstract class alv_1<SoundParam>
extends aly_1<SoundParam> {
    protected final ZC cFu;
    protected final Logger cFv;

    protected alv_1(ZC zC, LuaState luaState, Logger logger) {
        super(luaState);
        this.cFu = zC;
        this.cFv = logger;
    }

    protected boolean bCb() {
        return this.cFu.bpD();
    }

    @Override
    protected boolean bCc() {
        return super.bCc() && this.bCb();
    }
}

