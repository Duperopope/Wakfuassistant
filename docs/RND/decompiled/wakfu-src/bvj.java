/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bvj
implements aeh_2 {
    private static final Logger jrO = Logger.getLogger(bvj.class);
    public static final String jrP = "characterId";
    public static final String jrQ = "name";
    public static final String jrR = "smileyDescriptorLibrary";
    public static final String jrS = "flagIconUrl";
    public static final String jrT = "level";
    public static final String jrU = "guildPoints";
    public static final String jrV = "conquestPoints";
    public static final String jrW = "rank";
    public static final String jrX = "isLocalPlayer";
    public static final String jrY = "isConnected";
    public static final String jrZ = "backgroundColor";
    public static final String jsa = "canBan";
    public static final String jsb = "canChangeRank";
    public static final String jsc = "ranks";
    public static final String jsd = "isFriend";
    public static final String jse = "hasRightToChangeMemberRank";
    public static final String jsf = "lastConnection";
    public static final String jsg = "lastConnectionAsString";
    private final ezz_1 jsh;
    public static final String[] jsi = new String[]{"characterId", "name", "smileyDescriptorLibrary", "flagIconUrl", "level", "guildPoints", "conquestPoints", "rank", "isLocalPlayer", "isConnected", "backgroundColor", "canBan", "canChangeRank", "ranks", "isFriend", "hasRightToChangeMemberRank", "lastConnection", "lastConnectionAsString"};

    public bvj(ezz_1 ezz_12) {
        this.jsh = ezz_12;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jrP)) {
            return this.jsh.Sn();
        }
        if (string.equals(jrQ)) {
            return this.bSr() ? this.dJV() : this.jsh.getName();
        }
        if (string.equals(jrR)) {
            boolean bl = this.jsh.Sn() == aue_0.cVJ().cVK().Sn();
            byte by = this.jsh.dJY();
            return bl ? bvk.dJZ().bP(by) : bue_0.a(this.jsh.aWP(), this.jsh.aWO(), (int)this.jsh.dJY());
        }
        if (string.equals(jrT)) {
            long l = this.jsh.pf();
            return aue_0.cVJ().cVK().dnH().cR(l);
        }
        if (string.equals(jrV)) {
            return BH.mk(0);
        }
        if (string.equals(jrU)) {
            return BH.mk(this.jsh.Xk());
        }
        if (string.equals(jrW)) {
            return bvk.dJZ().kI(this.jsh.Xm());
        }
        if (string.equals(jsc)) {
            bvk bvk2 = bvk.dJZ();
            ArrayList<bve> arrayList = new ArrayList<bve>();
            for (bve bve2 : bvk2.dKd()) {
                fab fab2 = bvk.dJZ().dKl();
                if (fab2 == null || !fab2.b(eyh_2.rKG, bve2.dJS().bfE())) continue;
                arrayList.add(bve2);
            }
            return arrayList;
        }
        if (string.equals(jsb)) {
            return (!this.dJX() || bvk.dJZ().dKm()) && bvk.dJZ().dKl().b(eyh_2.rKH);
        }
        if (string.equals(jrX)) {
            return this.bvY();
        }
        if (string.equals(jrY)) {
            return this.bSr();
        }
        if (string.equals(jrZ)) {
            if (this.dJX()) {
                return "1,0.97,0.7,0.9";
            }
            if (this.bSr()) {
                return "1,1,1,0.9";
            }
            return "1,1,1,0.3";
        }
        if (string.equals(jse)) {
            bvk bvk3 = bvk.dJZ();
            if (bvk3.drl() == null) {
                return false;
            }
            if (bvk3.drl().fPU() == 1) {
                return false;
            }
            fab fab3 = bvk3.dKl();
            if (fab3 == null) {
                return false;
            }
            bve bve3 = bvk.dJZ().kI(this.jsh.Xm());
            return !this.dJX() && fab3.b(eyh_2.rKG, bve3.dJS().bfE());
        }
        if (string.equals(jsa)) {
            fab fab4 = bvk.dJZ().dKl();
            if (fab4 == null) {
                return false;
            }
            bve bve4 = bvk.dJZ().kI(this.jsh.Xm());
            return !this.dJX() && fab4.b(eyh_2.rKF, bve4.dJS().bfE());
        }
        if (string.equals(jrS)) {
            int n = this.jsh.Xt();
            return auc_0.cVq().zG(n == 0 ? -1 : n);
        }
        if (string.equals(jsd)) {
            return apd_0.cAO().cAQ().ii(this.jsh.Sn()) != null;
        }
        if (string.equals(jsf)) {
            return this.dJW();
        }
        if (string.equals(jsg)) {
            return aum_0.cWf().c("guild.lastConnectionDays", this.dJW());
        }
        return null;
    }

    private String dJV() {
        return bsb_1.a(((bsg_1)aie_0.cfn().bmH()).enc(), this.jsh.getName(), this.jsh.dxH(), this.jsh.dxI());
    }

    private long dJW() {
        return (ue_0.bjV().bjZ() - this.jsh.Xv()) / 86400000L;
    }

    private boolean dJX() {
        return this.Xm() == bvk.dJZ().drj();
    }

    public boolean bvY() {
        return aue_0.cVJ().cVK().Sn() == this.jsh.Sn();
    }

    public long Xm() {
        return this.jsh.Xm();
    }

    public int Xk() {
        return this.jsh.Xk();
    }

    public short cmL() {
        mj_1 mj_12 = aue_0.cVJ().cVK().dnH();
        return mj_12.cR(this.jsh.pf());
    }

    public String getName() {
        return this.jsh.getName() == null ? "" : this.jsh.getName();
    }

    public long Sn() {
        return this.jsh.Sn();
    }

    public boolean bSr() {
        return this.jsh.bSr();
    }

    public byte dJY() {
        return this.jsh.dJY();
    }

    public byte aWO() {
        return this.jsh.aWO();
    }

    public short aWP() {
        return this.jsh.aWP();
    }
}

