/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class bvz
implements aeh_2 {
    public static final String jtB = "isCreation";
    public static final String jtC = "isBlazonChange";
    public static final String jtD = "isNameChange";
    public static final String jtE = "canChangeBlazon";
    public static final String jtF = "canChangeName";
    public static final String jtG = "selectedCategory";
    public static final String jtH = "emblemIcons";
    public static final String jtI = "backgroundIcons";
    public static final String jtJ = "emblemCategories";
    public static final String jtK = "selectedBackground";
    public static final String jtL = "selectedEmblem";
    public static final String jtM = "displayEmblem";
    public static final String jtN = "displayBackground";
    public static final String jtO = "guildBannerTexture";
    public static final String jtP = "guildName";
    public static final String jtQ = "title";
    public static final String jtR = "iconType";
    public static final String jtS = "previousBlazon";
    public static final String jtT = "mustRename";
    public static final int jtU = 0;
    public static final int jtV = 1;
    public static final String[] jtW = new String[]{"isCreation", "isBlazonChange", "isNameChange", "canChangeBlazon", "canChangeName", "selectedCategory", "emblemIcons", "backgroundIcons", "emblemCategories", "selectedBackground", "selectedEmblem", "displayEmblem", "displayBackground", "guildBannerTexture", "guildName", "title", "iconType", "previousBlazon", "mustRename"};
    private bvd_0 jtX;
    private final ImmutableList<bvC> jtY = bvz.dKB();
    private bvC jtZ = (bvC)this.jtY.get(0);
    private buJ jua;
    private buJ jub;
    private int juc;
    private String aFF;
    private boolean jud;

    @Override
    @Nullable
    public Object eu(String string) {
        if (jtB.equals(string)) {
            return this.jtX == bvd_0.juz;
        }
        if (jtC.equals(string)) {
            return this.jtX == bvd_0.juA;
        }
        if (jtD.equals(string)) {
            return this.jtX == bvd_0.juB;
        }
        if (jtE.equals(string)) {
            return this.jtX == bvd_0.juz || this.jtX == bvd_0.juA;
        }
        if (jtF.equals(string)) {
            return this.jtX == bvd_0.juz || this.jtX == bvd_0.juB;
        }
        if (jtG.equals(string)) {
            return this.jtZ;
        }
        if (jtH.equals(string)) {
            return this.dKz();
        }
        if (jtI.equals(string)) {
            return this.dKA();
        }
        if (jtJ.equals(string)) {
            return this.jtY;
        }
        if (jtL.equals(string)) {
            return this.jua.dJq();
        }
        if (jtK.equals(string)) {
            return this.jua.dJp();
        }
        if (jtM.equals(string)) {
            return this.juc == 0;
        }
        if (jtN.equals(string)) {
            return this.juc != 0;
        }
        if (jtO.equals(string)) {
            if (this.jua == null) {
                return null;
            }
            return buK.dJw().a(this.jua);
        }
        if (jtP.equals(string)) {
            return this.aFF;
        }
        if (jtQ.equals(string)) {
            switch (this.jtX) {
                case juz: {
                    return aum_0.cWf().c("guild.creation", new Object[0]);
                }
                case juA: {
                    return aum_0.cWf().c("guild.change.blazon.title", new Object[0]);
                }
                case juB: {
                    return aum_0.cWf().c("guild.change.name.title", new Object[0]);
                }
            }
        }
        if (jtR.equals(string)) {
            return this.juc;
        }
        if (jtS.equals(string)) {
            if (this.jub == null) {
                return null;
            }
            return buK.dJw().a(this.jub);
        }
        if (jtT.equals(string)) {
            String string2 = aue_0.cVJ().cVK().HR();
            this.jud = ezo_1.rML.matcher(string2).find();
            return this.jud;
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return jtW;
    }

    public void dKy() {
        if (this.jub == null) {
            return;
        }
        this.jua.bM(this.jub.dJp());
        this.jua.bN(this.jub.dJq());
        this.jua.k(this.jub.dJr());
        this.jua.l(this.jub.dJs());
        this.jtZ = this.bQ(this.jub.dJq());
        fse_1.gFu().a((aef_2)this, jtK, jtL, jtM, jtN, jtO);
    }

    private List<bvy> dKz() {
        if (this.jtZ == null) {
            return null;
        }
        ArrayList<bvy> arrayList = new ArrayList<bvy>();
        for (Integer n : this.jtZ.dKG()) {
            arrayList.add(new bvy(n));
        }
        return arrayList;
    }

    private List<bvy> dKA() {
        ArrayList<bvy> arrayList = new ArrayList<bvy>();
        for (int i = 0; i < 46; ++i) {
            arrayList.add(new bvy(i));
        }
        return arrayList;
    }

    private bvC bQ(short s) {
        for (bvC bvC2 : this.jtY) {
            if (!bvC2.dKI().FO(s)) continue;
            return bvC2;
        }
        return (bvC)this.jtY.get(0);
    }

    private static ImmutableList<bvC> dKB() {
        ArrayList<bvC> arrayList = new ArrayList<bvC>();
        for (bvb_0 bvb_02 : bvb_0.values()) {
            arrayList.add(new bvC(bvb_02));
        }
        return ImmutableList.copyOf(arrayList);
    }

    public void a(bvC bvC2) {
        this.jtZ = bvC2;
        fse_1.gFu().a((aef_2)this, jtH, jtJ);
    }

    public void a(bvd_0 bvd_02) {
        this.jtX = bvd_02;
    }

    public void bR(short s) {
        this.jua.bM(s);
        fse_1.gFu().a((aef_2)this, jtK, jtO);
    }

    public void bS(short s) {
        this.jua.bN(s);
        fse_1.gFu().a((aef_2)this, jtL, jtO);
    }

    public void m(axb_2 axb_22) {
        this.jua.k(axb_22);
        fse_1.gFu().a((aef_2)this, jtO);
    }

    public void setBackgroundColor(axb_2 axb_22) {
        this.jua.l(axb_22);
        fse_1.gFu().a((aef_2)this, jtO);
    }

    public void FM(int n) {
        this.juc = n;
        fse_1.gFu().a((aef_2)this, jtM, jtN);
    }

    public void f(buJ buJ2) {
        this.jua = buJ2;
        this.jtZ = this.bQ(buJ2.dJq());
        fse_1.gFu().a((aef_2)this, jtO);
    }

    public void my(String string) {
        this.aFF = string;
    }

    public void g(buJ buJ2) {
        this.jub = buJ2;
        fse_1.gFu().a((aef_2)this, jtS);
    }

    public void dKC() {
        this.jua = null;
    }

    public String HR() {
        return this.aFF;
    }

    public int dKD() {
        return this.juc;
    }

    public ezb dJv() {
        return this.jua.dJv();
    }

    public bvd_0 dKE() {
        return this.jtX;
    }

    public buJ dKF() {
        return this.jua;
    }
}

