/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class aPl
extends Enum<aPl> {
    public static final /* enum */ aPl exp = new aPl(-1, Integer.MAX_VALUE, null, null, "", false, false, null, null);
    public static final /* enum */ aPl exq = new aPl(1, 10, "vicinityPipe", new fhl_2(ett_1.oos), "chat.pipeName.vicinity", false, true, aPa.evq, null);
    public static final /* enum */ aPl exr = new aPl(2, 20, "privatePipe", new fhl_2(ett_1.oot), "chat.pipeName.private", false, true, aPa.evr, null);
    public static final /* enum */ aPl exs = new aPl(3, 30, "gameErrorPipe", new fhl_2(ett_1.oom), "chat.pipeName.gameError", false, false, null, null);
    public static final /* enum */ aPl ext = new aPl(4, 40, "gameInformationPipe", new fhl_2(ett_1.oon), "chat.pipeName.gameInformation", false, true, null, null);
    public static final /* enum */ aPl exu = new aPl(23, 41, "fightInformationPipe", new fhl_2(ett_1.ooo), "chat.pipeName.fightInformation", false, true, null, null);
    public static final /* enum */ aPl exv = new aPl(5, 50, "partyPipe", new fhl_2(ett_1.oou), "chat.pipeName.group", true, true, aPa.evs, null);
    public static final /* enum */ aPl exw = new aPl(6, 60, "guildPipe", new fhl_2(ett_1.oov), "chat.pipeName.guild", true, true, aPa.evt, null);
    public static final /* enum */ aPl exx = new aPl(7, 70, "tradePipe", new fhl_2(ett_1.oow), "chat.pipeName.trade", true, true, aPa.evu, ewf_0.oIy);
    public static final /* enum */ aPl exy = new aPl(8, 80, "politicPipe", new fhl_2(ett_1.oox), "chat.pipeName.politic", true, true, null, null);
    public static final /* enum */ aPl exz = new aPl(10, 100, "adminPipe", awx_2.doc, "chat.pipeName.admin", true, false, aPa.evz, ewf_0.oIw);
    public static final /* enum */ aPl exA = new aPl(11, 110, "allPipe", new fhl_2(ett_1.oor), "chat.pipeName.all", false, false, null, ewf_0.oIx);
    public static final /* enum */ aPl exB = new aPl(13, 130, "battlegroundPipe", new fhl_2(ett_1.ooy), "chat.pipeName.battleground", true, true, aPa.evv, null);
    public static final /* enum */ aPl exC = new aPl(14, 140, "intergamePipe", new fhl_2(ett_1.ooz), "chat.pipeName.intergame", true, true, aPa.evw, null);
    public static final /* enum */ aPl exD = new aPl(15, 150, "frCommunityChannel", new fhl_2(ett_1.ooA), "chat.pipeName.community.fr", true, true, aPa.evB, ewf_0.oIz, Mv.aVk);
    public static final /* enum */ aPl exE = new aPl(16, 151, "enCommunityChannel", new fhl_2(ett_1.ooB), "chat.pipeName.community.en", true, true, aPa.evC, ewf_0.oIA, Mv.aVl);
    public static final /* enum */ aPl exF = new aPl(17, 152, "esCommunityChannel", new fhl_2(ett_1.ooC), "chat.pipeName.community.es", true, true, aPa.evD, ewf_0.oIB, Mv.aVm);
    public static final /* enum */ aPl exG = new aPl(18, 153, "ptCommunityChannel", new fhl_2(ett_1.ooD), "chat.pipeName.community.pt", true, true, aPa.evE, ewf_0.oIC, Mv.aVn);
    public static final /* enum */ aPl exH = new aPl(19, 190, "frRecruitmentChannel", new fhl_2(ett_1.ooE), "chat.pipeName.recruitment.fr", true, true, aPa.evG, ewf_0.oID, Mv.aVk);
    public static final /* enum */ aPl exI = new aPl(20, 191, "enRecruitmentChannel", new fhl_2(ett_1.ooF), "chat.pipeName.recruitment.en", true, true, aPa.evH, ewf_0.oIE, Mv.aVl);
    public static final /* enum */ aPl exJ = new aPl(21, 192, "esRecruitmentChannel", new fhl_2(ett_1.ooG), "chat.pipeName.recruitment.es", true, true, aPa.evI, ewf_0.oIF, Mv.aVm);
    public static final /* enum */ aPl exK = new aPl(22, 193, "ptRecruitmentChannel", new fhl_2(ett_1.ooH), "chat.pipeName.recruitment.pt", true, true, aPa.evJ, ewf_0.oIG, Mv.aVn);
    public static final List<aPl> exL;
    public static final List<aPl> exM;
    public static final List<aPl> exN;
    private static final List<aPl> exO;
    private static final List<aPl> exP;
    private final int exQ;
    private final int exR;
    private final String exS;
    private final axb_2 exT;
    private final String exU;
    private final boolean exV;
    private final boolean exW;
    private final aPa exX;
    private final ewf_0 exY;
    private final Mv exZ;
    private static final /* synthetic */ aPl[] eya;

    public static aPl[] values() {
        return (aPl[])eya.clone();
    }

    public static aPl valueOf(String string) {
        return Enum.valueOf(aPl.class, string);
    }

    private aPl(int n2, int n3, String string2, axb_2 axb_22, String string3, boolean bl, boolean bl2, aPa aPa2, ewf_0 ewf_02) {
        this(n2, n3, string2, axb_22, string3, bl, bl2, aPa2, ewf_02, null);
    }

    private aPl(int n2, int n3, String string2, axb_2 axb_22, String string3, boolean bl, boolean bl2, aPa aPa2, ewf_0 ewf_02, Mv mv) {
        this.exQ = n2;
        this.exR = n3;
        this.exS = string2;
        this.exT = axb_22;
        this.exU = aum_0.cWf().c(string3, new Object[0]);
        this.exV = bl;
        this.exW = bl2;
        this.exX = aPa2;
        this.exY = ewf_02;
        this.exZ = mv;
    }

    public int d() {
        return this.exQ;
    }

    public int aYs() {
        return this.exR;
    }

    public String czv() {
        return this.exS;
    }

    public axb_2 getColor() {
        return this.exT;
    }

    @Nullable
    public String czC() {
        if (this.exT == null) {
            return null;
        }
        return ftu_2.G(this.exT);
    }

    public String czD() {
        return this.exU;
    }

    public boolean czw() {
        return this.exW;
    }

    public boolean czE() {
        return this.exV;
    }

    public aPa czF() {
        return this.exX;
    }

    public ewf_0 czG() {
        return this.exY;
    }

    @Nullable
    public Mv aUXX() {
        return this.exZ;
    }

    public boolean czH() {
        return exO.contains((Object)this);
    }

    public boolean czI() {
        return exP.contains((Object)this);
    }

    public static aPl yX(int n) {
        for (aPl aPl2 : aPl.values()) {
            if (aPl2.exQ != n) continue;
            return aPl2;
        }
        return exp;
    }

    public static aPl k(Mv mv) {
        for (aPl aPl2 : exO) {
            if (aPl2.exZ != mv) continue;
            return aPl2;
        }
        return exp;
    }

    public static aPl l(Mv mv) {
        for (aPl aPl2 : exP) {
            if (aPl2.exZ != mv) continue;
            return aPl2;
        }
        return exp;
    }

    public static aPl c(ewf_0 ewf_02) {
        for (aPl aPl2 : aPl.values()) {
            if (aPl2.exY != ewf_02) continue;
            return aPl2;
        }
        return exp;
    }

    private static /* synthetic */ aPl[] czJ() {
        return new aPl[]{exp, exq, exr, exs, ext, exu, exv, exw, exx, exy, exz, exA, exB, exC, exD, exE, exF, exG, exH, exI, exJ, exK};
    }

    static {
        eya = aPl.czJ();
        exL = List.of(exq, exr, exC, exs, ext, exu, exv, exw, exx, exy, exz, exA, exB, exD, exE, exF, exG, exH, exI, exJ, exK);
        exM = List.of(exr, exC, exs, exz, exA);
        exN = List.of(exq, exx, exy, exB, exD, exE, exF, exG, exH, exI, exJ, exK);
        exO = List.of(exD, exE, exF, exG);
        exP = List.of(exH, exI, exJ, exK);
    }
}

