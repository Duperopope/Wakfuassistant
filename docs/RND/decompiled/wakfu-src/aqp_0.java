/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aQp
 */
public class aqp_0
extends aRY {
    public static final byte eCr = 0;
    public static final byte eCs = 1;
    public static final byte eCt = 2;
    public static final byte eCu = 3;
    public static final byte eCv = 4;
    private final byte eCw;
    @Nullable
    private final Integer eCx;

    public aqp_0(byte by) {
        this(by, null);
    }

    public aqp_0(byte by, @Nullable Integer n) {
        this.eCw = by;
        this.eCx = n;
    }

    @Override
    public boolean isValid() {
        switch (this.eCw) {
            case 0: {
                return true;
            }
            case 1: 
            case 2: 
            case 3: {
                return this.eCx != null && this.eCx > 0;
            }
            case 4: {
                return this.eCx == null || this.eCx > 0;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        switch (this.eCw) {
            case 0: {
                aqp_0.cBS();
                break;
            }
            case 1: {
                ns_02.Q((short)241);
                break;
            }
            case 2: {
                ns_02.Q((short)240);
                break;
            }
            case 3: {
                ns_02.Q((short)337);
                break;
            }
            case 4: {
                ns_02.Q((short)106);
                break;
            }
            default: {
                return;
            }
        }
        if (this.eCx != null) {
            ns_02.nX(this.eCx);
        }
        aue_0.cVJ().etu().d(ns_02);
    }

    private static void cBS() {
        aqp_0.jF("help | h : display help");
        aqp_0.jF("grant | g &lt;rewardId&gt; : if possible, grant the corresponding account reward to the current account");
        aqp_0.jF("reset | re &lt;rewardId&lt; : reset the corresponding account reward for the current account (so it can be granted once more)");
        aqp_0.jF("resetAchievement | ra &lt;achievementId&gt; : reset all the account rewards of the corresponding achievement for the current account");
        aqp_0.jF("list | l : list all the account rewards of the current account");
        aqp_0.jF("list | l &lt;achievementId&gt; : list all the account rewards of the current account and the corresponding achievement");
    }
}

