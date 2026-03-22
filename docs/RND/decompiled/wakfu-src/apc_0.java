/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aPC
 */
public class apc_0
extends aps_0
implements aef_2 {
    protected static final Logger ezu = Logger.getLogger(apc_0.class);
    public static final short ezv = 0;
    public static final short ezw = 1;
    public static final short ezx = 2;
    public static final short ezy = 4;
    public static final short ezz = 8;
    private short aXy = 0;
    private boolean ezA = false;
    private short aZk = 0;
    private byte aZm = 0;
    private String ezB;
    private boolean ezC = false;
    private long aZl;
    private List<Mv> ezD;
    private vb_0 ezE = vb_0.bIT;
    public static final String ezF = "notify";
    public static final String ezG = "type";
    public static final String ezH = "illustrationUrl";
    public static final String ezI = "commentary";
    public static final String ezJ = "commentaryEdition";
    public static final String ezK = "level";
    public static final String ezL = "canInviteToGuild";
    public static final String ezM = "characterNameWithLanguages";
    public static final String[] ezN = new String[]{"notify", "type", "illustrationUrl", "commentary", "commentaryEdition", "level", "canInviteToGuild"};
    public static final String[] ezO = new String[ezN.length + aps_0.eBk.length];

    public apc_0(String string, String string2, boolean bl, long l, boolean bl2, short s, byte by, String string3, long l2) {
        super(string, string2, bl, l);
        this.ezA = bl2;
        this.aZk = s;
        this.aZm = by;
        this.ezB = string3;
        this.aZl = l2;
    }

    public apc_0(long l, String string, String string2) {
        super(l, string, string2);
    }

    public void aQ(short s) {
        this.aXy = (short)(s | this.aXy);
    }

    public void aR(short s) {
        this.aXy = (short)(~s & this.aXy);
    }

    public boolean aS(short s) {
        return (this.aXy & s) != 0;
    }

    public boolean cAJ() {
        return this.aXy == 0;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(ezF)) {
            return this.cAK();
        }
        if (string.equals(ezG)) {
            return this.aXy;
        }
        if (string.equals(ezI)) {
            return this.ezB != null && this.ezB.length() > 0 ? this.ezB : null;
        }
        if (string.equals(ezJ)) {
            return this.ezC;
        }
        if (string.equals(ezK)) {
            return this.aZl == -1L ? "-" : Short.valueOf(mz_1.aVX.cR(this.aZl));
        }
        if (string.equals(ezH)) {
            if (this.aZk == -1) {
                return null;
            }
            try {
                return String.format(auc_0.cVq().bS("breedContactListIllustrationPath"), this.aZk, this.aZm);
            }
            catch (fu_0 fu_02) {
                ezu.error((Object)fu_02.getMessage(), (Throwable)fu_02);
            }
        }
        if (string.equals(ezL)) {
            bhJ bhJ2 = (bhJ)bgg_0.dlO().lI(this.aFD);
            return this.cBt() && bvk.dJZ().ai(bhJ2);
        }
        if (string.equals(ezM)) {
            if (!this.cBt()) {
                return this.xO();
            }
            return bsb_1.a(((bsg_1)aie_0.cfn().bmH()).enc(), this.xO(), this.ezE, this.ezD);
        }
        return super.eu(string);
    }

    public boolean cAK() {
        return this.ezA;
    }

    public void eJ(boolean bl) {
        this.ezA = bl;
    }

    @Override
    public String[] bxk() {
        return ezO;
    }

    public String cAL() {
        return this.ezB;
    }

    public void jo(String string) {
        this.ezB = string;
    }

    public boolean cAM() {
        return this.ezC;
    }

    public void eK(boolean bl) {
        this.ezC = bl;
    }

    public void aT(short s) {
        this.aZk = s;
    }

    public void aQ(byte by) {
        this.aZm = by;
    }

    public void ij(long l) {
        this.aZl = l;
    }

    public void l(List<Mv> list) {
        this.ezD = list;
    }

    public void b(vb_0 vb_02) {
        this.ezE = vb_02;
    }

    public void cAN() {
        fse_1.gFu().a((aef_2)this, ezO);
    }

    static {
        System.arraycopy(ezN, 0, ezO, 0, ezN.length);
        System.arraycopy(aps_0.eBk, 0, ezO, ezN.length, aps_0.eBk.length);
    }
}

