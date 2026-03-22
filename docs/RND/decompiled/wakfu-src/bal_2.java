/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.wakfu.client.console.command.debug.DisplayStatesCommand;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from baL
 */
public class bal_2
implements emp_0 {
    private static final Logger hzl = Logger.getLogger(bal_2.class);

    @Override
    public void a(@NotNull My my, @NotNull ahx_2 ahx_22) {
        eLL.imR = my;
        eLL.qJd = ahx_22;
        eLL.qJe = this;
        try {
            eLL.qJc = auc_0.cVq().bS("effectDescPlotIconUrl");
            eLL.qJb = eLL.qJd.ceG().c(" ").a(eLL.qJc, -1, -1, null).c(" ").ceL();
        }
        catch (fu_0 fu_02) {
            hzl.error((Object)("Could not read value of PLOT_URL or SUB_EFFECT_CARAC_PREFIX parameters of " + eLL.class.getSimpleName()), (Throwable)fu_02);
        }
        eLL.gMK = "critical";
        eLL.gQc = "requirements";
        eLL.gTj = "hp.var.beacon";
        eLL.gTk = "hp.var.barrel";
        eLL.gzV = "levelShort.custom";
        eLL.gAa = "levelShort.customCumulable";
        eLL.gCN = "WISDOMShort";
        eLL.gCL = "AGILITYShort";
        eLL.gCK = "STRENGTHShort";
        eLL.gCM = "LUCKShort";
        eLL.gCO = "INTELLIGENCEShort";
        eLL.gCA = "vitalityShort";
        eLL.gCB = "huppermagerResource";
        eLL.gCD = "ouginak.resource";
        eLL.qJf = "SPShort";
        eLL.gzU = "max";
        eLL.gRV = "level";
        eLL.gRW = "levelReal";
        eLL.qJg = 10;
        eLL.qJh = 33;
        eLL.qJi = 6;
        eLL.qJj = 5;
    }

    @Override
    public ahv_2 a(ahv_2 ahv_22, String string) {
        return ahv_22.ceC().ih("cc4444").c(string);
    }

    @Override
    public void a(ahv_2 ahv_22, eSS eSS2, short s) {
        ahv_22.ceu().ceA().ih(bal_2.cZv()).ij("glyph_" + GC.d((short)eSS2.bcw(), s));
        ahv_22.c(aum_0.cWf().a(6, (long)((short)eSS2.bcw()), new Object[0]));
        ahv_22.ceB().cev();
    }

    @Override
    public void a(ahv_2 ahv_22, fqU fqU2, short s) {
        ahv_22.ceu().ceA().ih(bal_2.cZv()).ij("state_" + GC.d(fqU2.gjy(), s));
        ahv_22.c(fqU2.getName());
        ahv_22.ceB().cev();
    }

    @Override
    public void a(ahv_2 ahv_22, fqD fqD2) {
        ahv_22.ceu().ceA().ih(bal_2.cZv()).ij("spell_" + fqD2.d());
        ahv_22.c(aum_0.cWf().a(3, (long)fqD2.d(), new Object[0]));
        ahv_22.ceB().cev();
    }

    private static String cZv() {
        return fhm_2.uwB.a(ett_1.opF).bQk();
    }

    @Override
    public void a(ahv_2 ahv_22, int n) {
        ahv_22.c(aum_0.cWf().c(String.format("spellProperty.%d", n), new Object[0]));
    }

    @Override
    public fqD bb(short s) {
        return bmb_0.eeV().If(s);
    }

    @Override
    public String a(exe_1 exe_12) {
        return aum_0.cWf().c("property.fight.desc." + exe_12.aJr(), new Object[0]);
    }

    @Override
    public String b(ezj_0 ezj_02) {
        return aum_0.cWf().c("property.world.desc." + ezj_02.aJr(), new Object[0]);
    }

    @Override
    public String a(etl_0 etl_02) {
        return aum_0.cWf().c("property.area.desc." + etl_02.aJr(), new Object[0]);
    }

    @Override
    public String a(exx_2 exx_22) {
        return aum_0.cWf().c(exx_22.aXB(), new Object[0]);
    }

    @Override
    public String Am(int n) {
        return aum_0.cWf().a(62, (long)n, new Object[0]);
    }

    @Override
    public String An(int n) {
        return aum_0.cWf().a(64, (long)n, new Object[0]);
    }

    @Override
    public String Ao(int n) {
        return aum_0.cWf().a(61, (long)n, new Object[0]);
    }

    @Override
    public String Ap(int n) {
        return bew_1.dSk().Gy(n).getName();
    }

    @Override
    public String Aq(int n) {
        return aum_0.cWf().a(15, (long)n, new Object[0]);
    }

    @Override
    public String bc(short s) {
        return aum_0.cWf().a(43, (long)s, new Object[0]);
    }

    @Override
    public String Ar(int n) {
        return aum_0.cWf().a(138, (long)n, new Object[0]);
    }

    @Override
    public String bd(short s) {
        bjz_1 bjz_12 = bja_1.drJ().bC(s);
        if (bjz_12 == null) {
            return "";
        }
        return bjz_12.getName();
    }

    @Override
    public String be(short s) {
        return aum_0.cWf().a(38, (long)s, new Object[0]);
    }

    @Override
    public String As(int n) {
        return aum_0.cWf().c("breed." + n, new Object[0]);
    }

    @Override
    public String At(int n) {
        return aum_0.cWf().a(39, (long)n, new Object[0]);
    }

    @Override
    public String ba(byte by) {
        return aum_0.cWf().c("nation.alignmentName" + fkc_0.gT(by).name(), new Object[0]);
    }

    @Override
    public String Au(int n) {
        return aum_0.cWf().c("subscriptionLevelName" + n, new Object[0]);
    }

    @Override
    public String a(fpp_0 fpp_02) {
        return aum_0.cWf().c("nation.pvpRank." + String.valueOf(fpp_02), new Object[0]);
    }

    @Override
    public Optional<Integer> Av(int n) {
        return Optional.empty();
    }

    @Override
    public String Aw(int n) {
        return aum_0.cWf().a(77, (long)n, new Object[0]);
    }

    @Override
    public int Xt() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null) {
            fjn_0 fjn_02 = bgt_02.ffF();
            return fjn_02.Xt();
        }
        return -1;
    }

    @Override
    public ahv_2 d(ahv_2 ahv_22) {
        try {
            String string = String.format(auc_0.cVq().bS("elementsSmallIconsPath"), "craft");
            ahv_22.a(string, -1, -1, null);
        }
        catch (fu_0 fu_02) {
            hzl.warn((Object)fu_02.getMessage());
        }
        return ahv_22;
    }

    @Override
    public ahv_2 a(ahv_2 ahv_22, eNd eNd2) {
        try {
            String string = String.format(auc_0.cVq().bS("elementsSmallIconsPath"), eNd2.name());
            ahv_22.a(string, -1, -1, null);
        }
        catch (fu_0 fu_02) {
            hzl.warn((Object)fu_02.getMessage());
        }
        return ahv_22;
    }

    @Override
    public Optional<String> b(eNd eNd2) {
        return Optional.ofNullable(eNd2 != null ? aum_0.cWf().c(eNd2.name(), new Object[0]) : null);
    }

    @Override
    public ahv_2 b(ahv_2 ahv_22, String string) {
        try {
            String string2 = String.format(auc_0.cVq().bS("targetEffectIconsPath"), string);
            ahv_22.a(string2, -1, -1, null, string);
        }
        catch (fu_0 fu_02) {
            hzl.warn((Object)fu_02.getMessage());
        }
        return ahv_22;
    }

    @Override
    public String c(aoh_1 aoh_12) {
        try {
            String string = String.format(auc_0.cVq().bS("areasIconsPath"), aoh_12.bEq().name());
            Object object = "areaRange";
            String string2 = aoh_12.bEo();
            if (string2 != null) {
                object = (String)object + "_" + string2;
            }
            return eLL.qJd.ceG().a(string, -1, -1, null, (String)object).ceL();
        }
        catch (fu_0 fu_02) {
            hzl.error((Object)fu_02.toString());
            return "";
        }
    }

    @Override
    public String cZw() {
        try {
            return eLL.qJd.ceG().a(auk_0.zU(10), -1, -1, null, "critere.chrage").c(" ").ceL();
        }
        catch (fu_0 fu_02) {
            hzl.error((Object)("Error while loading chrage icon: " + fu_02.getMessage()));
            return "";
        }
    }

    @Override
    public String cZx() {
        try {
            return eLL.qJd.ceG().a(auk_0.zU(9), -1, -1, null, "citizenScore").c(" ").ceL();
        }
        catch (fu_0 fu_02) {
            hzl.error((Object)("Error while loading citizen points icon: " + fu_02.getMessage()));
            return "";
        }
    }

    @Override
    public String kZ(String string) {
        try {
            String string2 = String.format(auc_0.cVq().bS("areasIconsPath"), string);
            return eLL.qJd.ceG().a(string2, -1, -1, null).ceL();
        }
        catch (fu_0 fu_02) {
            hzl.error((Object)fu_02.toString());
            return "";
        }
    }

    @Override
    public String a(My my) {
        return eLL.imR.c("cast.infiniteDuration", new Object[0]);
    }

    @Override
    public String a(My my, int n) {
        return eLL.imR.c("remaining.duration.turn", n);
    }

    @Override
    public boolean a(fqE fqE2) {
        return ((bmt_0)((bmx_0)fqE2).giP()).cvG();
    }

    @Override
    public exP cZy() {
        return aue_0.cVJ().cVK();
    }

    @Override
    public exP b(fqE fqE2) {
        if (fqE2 instanceof bmx_0) {
            return ((bmx_0)fqE2).eeL();
        }
        return this.cZy();
    }

    @Override
    public boolean cZz() {
        return DisplayStatesCommand.cTU();
    }

    @Override
    public Object cZA() {
        return this.cZy().fgg();
    }
}

