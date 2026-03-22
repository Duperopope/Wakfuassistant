/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aPn
 */
public class apn_0
extends aOY {
    private static final Logger eyc = Logger.getLogger(apn_0.class);
    public static final String eyd = "%s \"%s\"";
    public static final int eye = 13;
    private String p;
    private boolean eyf;
    public static final String eyg = "name";
    public static final String eyh = "windowId";
    public static final String eyi = "allFiltersList";
    public static final String eyj = "isDefaultView";
    public static final String eyk = "isPrivateView";
    private aPP eyl;
    private boolean eym;
    private boolean eyn;
    public static final String eyo = "characterName";
    public static final String eyp = ";";
    public static final String eyq = "accountName";
    public static final String eyr = "Error";
    public static final String[] eys;
    public static final String[] eyt;
    private app_0 eyu;

    public apn_0(int n, String string, aPa aPa2, List<aPl> list, boolean bl) {
        this(n, string, aPa2, list, bl, false);
    }

    public apn_0(int n, String string, aPa aPa2, List<aPl> list, boolean bl, boolean bl2) {
        super(n, list);
        this.p = string;
        this.eyl = aPa2;
        this.eyf = bl;
        this.eym = bl2;
        if (bl2) {
            this.iC(apn_0.a(string, aPa2));
        }
    }

    @Override
    public String[] bxk() {
        return eys;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(eyg)) {
            return this.czL() ? aum_0.cWf().c(this.p, new Object[0]) : this.p;
        }
        if (string.equals(eyh)) {
            return this.czm();
        }
        if (string.equals(eyi)) {
            return this.cyF();
        }
        if (string.equals(eyj)) {
            return this.eyf;
        }
        if (string.equals(eyk)) {
            return this.cyN();
        }
        return super.eu(string);
    }

    private int czm() {
        return aPt.cAg().d(this);
    }

    @Override
    public boolean hP(String string) {
        if (string.equals(eyg)) {
            return true;
        }
        return super.hP(string);
    }

    @Override
    public void c(String string, Object object) {
        if (string.equals(eyg)) {
            this.setName(object.toString());
        } else {
            super.c(string, object);
        }
    }

    @Override
    public void d(String string, Object object) {
        super.d(string, object);
        this.czK();
    }

    @Override
    public void e(String string, Object object) {
        super.e(string, object);
        this.czK();
    }

    public void czK() {
        int n = this.czm();
        fey_2 fey_22 = csz_1.ePn().My(n);
        if (fey_22 == null) {
            return;
        }
        fhs_2 fhs_22 = fey_22.getElementMap();
        if (fhs_22 == null) {
            return;
        }
        fcq_2 fcq_22 = (fcq_2)fhs_22.uH("chatScrollContainer");
        if (this.eyu != null) {
            abg_2.bUP().h(this.eyu);
            this.eyu.a(fcq_22);
        } else {
            this.eyu = new app_0(this, fcq_22);
        }
        abg_2.bUP().a((Runnable)this.eyu, 250L, 1);
    }

    @Override
    public void cyE() {
        super.cyE();
        this.czK();
    }

    private void a(ahv_2 ahv_22, String string, String string2, String string3, axb_2 axb_22, String string4) {
        if (axb_22 != null) {
            ahv_22.ceC();
            ahv_22.e(axb_22);
        }
        if (string3 != null && !string3.trim().isEmpty()) {
            ahv_22.c("[").c(string3).c("] ");
        }
        if (string2 != null) {
            apn_0.a(ahv_22, string, string2);
        }
        ahv_22.c(aum_0.cWf().c("colon", new Object[0])).c(string4).c("\n");
        if (axb_22 != null) {
            ahv_22.ceD();
        }
    }

    public static void a(ahv_2 ahv_22, String string, String string2) {
        ahv_22.ceu().ceA();
        ahv_22.ij(string);
        ahv_22.c(string2);
        ahv_22.ceB().cev();
    }

    @Override
    protected String a(api_0 api_02) {
        ahv_2 ahv_22 = new ahv_2();
        String string = api_02.czp();
        axb_2 axb_22 = apn_0.h(api_02);
        if (((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljI)) {
            apn_0.a(ahv_22, api_02);
        }
        bsb_1 bsb_12 = ((bsg_1)aie_0.cfn().bmH()).enc();
        String string2 = "characterName_" + api_02.czn() + eyp + api_02.czo();
        String string3 = api_02.a(bsb_12);
        switch (api_02.czl()) {
            case ext: 
            case exu: {
                if (string3 != null) {
                    ahv_22.ceu().ceA().c(string3).ceB().cev().c(aum_0.cWf().c("colon", new Object[0]));
                }
                if (axb_22 != null) {
                    ahv_22.ceC().e(axb_22).c(string).ceD();
                } else {
                    ahv_22.c(string);
                }
                ahv_22.c("\n");
                break;
            }
            case exs: {
                String string4;
                String string5 = string4 = string.isEmpty() ? eyr : string;
                if (axb_22 != null) {
                    ahv_22.ceC().e(axb_22).c(string4).ceD();
                } else {
                    ahv_22.c(string4);
                }
                ahv_22.c("\n");
                break;
            }
            case exA: {
                ahv_22.ceC();
                ahv_22.e(axb_22);
                ahv_22.c("(").c(aum_0.cWf().c("chat.pipeName.all", new Object[0])).c(") ");
                ahv_22.c(string);
                ahv_22.c(">\n");
                ahv_22.ceD();
                break;
            }
            case exr: {
                if (!api_02.a(aue_0.cVJ().cVK())) {
                    this.a(ahv_22, string2, api_02.czo(), null, axb_22, string);
                    break;
                }
                ahv_22.ceC();
                ahv_22.e(axb_22);
                ahv_22.c(aum_0.cWf().c("chat.to", new Object[0])).c(" ");
                ahv_22.ceD();
                this.a(ahv_22, "characterName_" + ((aPm)api_02).aWS(), api_02.czo(), null, axb_22, string);
                break;
            }
            case exC: {
                if (api_02.czn() == aue_0.cVJ().cVO().xl()) {
                    ahv_22.ceC();
                    ahv_22.e(aPl.exC.getColor());
                    ahv_22.c(aum_0.cWf().c("chat.to", new Object[0])).c(" ");
                    ahv_22.ceD();
                } else {
                    apn_0.b(ahv_22, api_02);
                }
                this.a(ahv_22, "accountName_" + api_02.czn(), string3, null, aPl.exC.getColor(), string);
                break;
            }
            case exy: {
                if (string3 == null) {
                    ahv_22.ceC().e(axb_22).c(string).ceD();
                    ahv_22.c("\n");
                    break;
                }
            }
            default: {
                this.a(ahv_22, string2, string3, api_02.czt(), axb_22, string);
            }
        }
        return ahv_22.ceL();
    }

    private static axb_2 h(api_0 api_02) {
        if (ahv_2.io(api_02.getMessage())) {
            return null;
        }
        return aPh.czg().l(api_02.czl()).getColor();
    }

    private static void a(ahv_2 ahv_22, api_0 api_02) {
        ux_0 ux_02 = api_02.czq();
        int n = ux_02.bjE();
        int n2 = ux_02.bjF();
        int n3 = ux_02.bjH();
        ahv_22.ceC();
        ahv_22.ih("808080");
        ahv_22.c(String.format("[%02d:%02d:%02d] ", n, n2, n3));
        ahv_22.ceD();
    }

    @Override
    public void b(api_0 api_02) {
        if (!this.a(api_02.czl())) {
            return;
        }
        if (!this.i(api_02)) {
            return;
        }
        super.b(api_02);
        if (!aPt.cAg().n(api_02.czl())) {
            cza_2.k(this);
        }
    }

    private boolean i(api_0 api_02) {
        return api_02.czm() == -1 || api_02.czm() == this.czm();
    }

    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
    }

    public void eE(boolean bl) {
        this.eyn = bl;
    }

    public boolean czL() {
        return this.eyf;
    }

    public boolean czM() {
        return this.eyn;
    }

    public void eF(boolean bl) {
        this.eyf = bl;
    }

    public void b(aPP aPP2) {
        this.eyl = aPP2;
    }

    public aPP czN() {
        return this.eyl;
    }

    @Override
    public aPR a(aPP aPP2, boolean bl) {
        aPR aPR2 = super.a(aPP2, bl);
        if (aPR2 == null) {
            return null;
        }
        boolean bl2 = aPP2 == this.eyl;
        this.eyl = aPP2;
        if (aPR2.cBn().czv().startsWith("subPipe") || this.eym) {
            this.iC(apn_0.a(this.p, aPP2));
        } else {
            this.iC(aPR2.cBl());
        }
        if (!bl || bl2) {
            return aPR2;
        }
        fse_1.gFu().a((aef_2)this, "currentChannel");
        try {
            aPb.buR();
        }
        catch (Exception exception) {
            eyc.error((Object)"Erreur \u00e0 la sauvegarde du chat");
            eyc.error((Object)"Exception during setCurrentChannel", (Throwable)exception);
        }
        return aPR2;
    }

    private static void b(ahv_2 ahv_22, api_0 api_02) {
        try {
            int n = apl_0.eAC.im(api_02.czn());
            ahv_22.a(auk_0.zU(n), 13, 13, null).k(' ');
        }
        catch (fu_0 fu_02) {
            eyc.error((Object)"Error when getting game icon", (Throwable)fu_02);
        }
    }

    public static String jh(String string) {
        return apn_0.a(string, aPa.evr);
    }

    public static String a(String string, aPP aPP2) {
        aPO aPO2 = aPb.iE(aPP2.cyR());
        return String.format(eyd, aPO2.cBl(), string);
    }

    @Override
    public boolean cyN() {
        return this.eym;
    }

    public String toString() {
        return String.format("ChatView{m_name='%s', viewIndex=%d}", this.p, this.cyJ());
    }

    public void czO() {
        fse_1.gFu().a((aef_2)this.cyI(), aPR.eBa);
    }

    public void clean() {
        if (this.eyu != null) {
            abg_2.bUP().h(this.eyu);
            this.eyu = null;
        }
    }

    static {
        eyt = new String[]{eyg, eyh, eyi, eyk, eyj};
        eys = new String[eyt.length + aOY.evc.length];
        System.arraycopy(eyt, 0, eys, 0, eyt.length);
        System.arraycopy(aOY.evc, 0, eys, eyt.length, aOY.evc.length);
    }
}

