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
 * Renamed from alC
 */
public class alc_2
extends alx_1<alo_1<ald_1>> {
    public static final String cFC = "playBark";
    private static final afe_1[] cFD = new afe_1[]{new afe_1("barkId", null, aff_2.dJy, false), new afe_1("gain", null, aff_2.dJy, true), new afe_1("breedId", null, aff_2.dJy, true)};

    public alc_2(ZC zC, LuaState luaState, Logger logger) {
        super(zC, luaState, logger);
    }

    @Override
    public String getName() {
        return cFC;
    }

    @Override
    public afe_1[] bBg() {
        return cFD;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected alo_1<ald_1> sU(int n) {
        int n2 = this.xp(0);
        if (n < 2) {
            return new alo_1<ald_1>(new ald_1(n2));
        }
        int n3 = this.xp(1);
        if (n < 3) {
            return new alo_1<ald_1>(new ald_1(n2), n3);
        }
        int n4 = this.xp(2);
        return new alo_1<ald_1>(new ald_1(n2, n4), n3);
    }

    @Override
    public void a(alo_1<ald_1> alo_12, afx_1 afx_12) {
        int n = alo_12.aHA().bCd();
        int n2 = (int)alo_12.bBt();
        int n3 = alo_12.aHA().xT();
        try {
            if (n != 0) {
                aix_2 aix_22 = aiv_2.bBr().a(n, this.cFy, n3);
                if (aix_22 == null) {
                    this.cFz.debug((Object)"Impossible de trouver de BarkData ad\u00e9quat");
                    return;
                }
                this.a(aix_22, afx_12, n2);
            } else {
                this.cFz.debug((Object)"Id du son nul");
            }
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

