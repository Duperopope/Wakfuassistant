/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class blP
implements aeh_2,
bek_0,
ejl_0,
Comparable<blP> {
    private static final Logger iwE = Logger.getLogger(blP.class);
    public static final String iwF = "noCostumes";
    public static final String iwG = "cosmeticItem";
    public static final String iwH = "isActive";
    public static final String iwI = "isPreviewed";
    public static final String iwJ = "isNew";
    @Nullable
    private final bgv_2 iwK;
    private final ekp_0 iwL;
    private final fm_1 iwM;
    private boolean dxk = false;
    private boolean iwN = false;
    private boolean iwO = false;

    public blP(fm_1 fm_12, int n) {
        this.iwM = fm_12;
        this.iwL = new ekp_0(n, null, null);
        this.iwK = this.dun();
    }

    @Nullable
    protected bgv_2 dun() {
        return (bgv_2)fgD.fXh().Vd(this.iwL.AK());
    }

    @Override
    @Nullable
    public bgv_2 duo() {
        return this.iwK;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "noCostumes": {
                return this.iwK == null;
            }
            case "cosmeticItem": {
                return this.iwK;
            }
            case "isActive": {
                return this.dxk;
            }
            case "isPreviewed": {
                return this.iwN;
            }
            case "isQuestItem": {
                return false;
            }
            case "isRefItem": {
                return true;
            }
            case "backgroundStyle": {
                return this.dxk ? beh_1.jNF.getStyle() : beh_1.jNH.getStyle();
            }
            case "themeItemBorderUrl": {
                return this.dxk ? fgj.siG.aKJ() : fgj.siA.aKJ();
            }
            case "clickDescription": {
                return null;
            }
            case "iconUrl": {
                if (this.iwK == null) {
                    return null;
                }
                bhJ bhJ2 = ctb_2.eQw();
                return auc_0.cVq().a((fjm)bhJ2, this.iwK);
            }
            case "isNew": {
                return this.iwO;
            }
        }
        if (this.iwK == null) {
            return null;
        }
        return this.iwK.eu(string);
    }

    public void T(boolean bl) {
        this.dxk = bl;
        fse_1.gFu().a((aef_2)this, iwH);
    }

    public boolean apo() {
        return this.dxk;
    }

    public boolean dup() {
        return this.iwN;
    }

    public void gv(boolean bl) {
        if (bl != this.iwN) {
            this.iwN = bl;
            fse_1.gFu().a((aef_2)this, iwI);
        }
    }

    public boolean duq() {
        return this.iwO;
    }

    public void gw(boolean bl) {
        if (bl != this.iwO) {
            this.iwO = bl;
            fse_1.gFu().a((aef_2)this, iwJ);
        }
    }

    public Optional<String> dur() {
        if (this.iwK == null) {
            return Optional.empty();
        }
        if (!this.iwK.wq()) {
            return Optional.empty();
        }
        return Optional.ofNullable(this.iwK.dah());
    }

    public int f(@NotNull blP blP2) {
        if (blP2 == this || this.iwK == blP2.duo()) {
            return 0;
        }
        if (this.iwK == null) {
            return -1;
        }
        if (blP2.duo() == null) {
            return 1;
        }
        return this.iwK.getName().compareTo(blP2.duo().getName());
    }

    public ekp_0 dus() {
        return this.iwL;
    }

    public int dut() {
        return this.iwL.AK();
    }

    public fm_1 duf() {
        return this.iwM;
    }

    @Override
    public ejm_0 drG() {
        return ejm_0.qyV;
    }

    @Override
    public Object drH() {
        return this.iwL.AK();
    }

    @Override
    public String drI() {
        return this.iwK.getName();
    }

    public String toString() {
        return "CosmeticItemView{m_cosmeticItem=" + String.valueOf(this.iwL) + ", m_type=" + String.valueOf((Object)this.iwM) + "}";
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.f((blP)object);
    }
}

