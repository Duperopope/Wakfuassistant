/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Optional;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alJ
 */
public class alj_1
extends alx_1<alo_1<String>> {
    public static final String cFQ = "playMountSound";
    private static final afe_1[] cFR = new afe_1[]{new afe_1("soundType", null, aff_2.dJx, false)};

    public alj_1(ZC zC, LuaState luaState, Logger logger) {
        super(zC, luaState, logger);
    }

    @Override
    public String getName() {
        return cFQ;
    }

    @Override
    public afe_1[] bBg() {
        return cFR;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected alo_1<String> sU(int n) {
        String string = this.xu(0);
        return new alo_1<String>(string);
    }

    @Override
    public void a(alo_1<String> alo_12, afx_1 afx_12) {
        String string = alo_12.aHA();
        Byte by = this.cFy.bHZ();
        Integer n = this.cFy.bIa();
        if (by == null || n == null) {
            this.cFz.error((Object)("playMountSound call while AnimatedObject has no mount info " + String.valueOf(this.cFy)));
            return;
        }
        aiv_2 aiv_22 = aiv_2.bBr();
        aix_2 aix_22 = aiv_22.a(by, (int)n, string);
        long l = aix_22.aYj();
        try {
            if (l == 0L) {
                this.cFz.error((Object)("Null sound ID for mountType " + by + " and mountSkinId " + n));
                return;
            }
            Optional<ahm_1> optional = this.a(aix_22, afx_12);
            optional.ifPresent(ahm_12 -> this.cFy.e(l, ahm_12.ccq()));
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

