/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alE
 */
public class ale_1
extends alx_1<alo_1<Byte>> {
    public static final String cFG = "playGroundSound";
    private static final afe_1[] cFH = new afe_1[]{new afe_1("walkType", null, aff_2.dJy, false), new afe_1("gain", null, aff_2.dJy, true)};

    public ale_1(ZC zC, LuaState luaState, Logger logger) {
        super(zC, luaState, logger);
    }

    @Override
    public String getName() {
        return cFG;
    }

    @Override
    public afe_1[] bBg() {
        return cFH;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected alo_1<Byte> sU(int n) {
        byte by = (byte)this.xp(0);
        if (n < 2) {
            return new alo_1<Byte>(by);
        }
        int n2 = this.xp(1);
        return new alo_1<Byte>(by, n2);
    }

    @Override
    public void a(alo_1<Byte> alo_12, afx_1 afx_12) {
        Object object;
        byte by = agj_1.dLQ.aFW();
        byte by2 = alo_12.aHA();
        int n = (int)alo_12.bBt();
        short s = wa_0.w(this.cFy.bcC(), this.cFy.bcD(), this.cFy.bcE());
        DisplayedScreenElement displayedScreenElement = aaa_0.brC().e(this.cFy.bcC(), this.cFy.bcD(), s, abd.ccZ);
        if (displayedScreenElement != null && (object = displayedScreenElement.brk().bsz()) != null) {
            by = ((aeS)object).bxa();
        }
        try {
            object = aiv_2.bBr().f(by, by2);
            if (object == null) {
                this.cFz.debug((Object)"Impossible de trouver de GroundSoundData ad?quat");
                return;
            }
            this.a((aix_2)object, afx_12, n);
        }
        catch (Exception exception) {
            this.cFz.debug((Object)("soundExtension or soundPath not initialized " + String.valueOf(exception)));
        }
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sU(n);
    }
}

