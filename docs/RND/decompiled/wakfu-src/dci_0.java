/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from dci
 */
public class dci_0 {
    private final WP oez;
    private final int oeA;
    private final List<dcj_0> oeB = new ArrayList<dcj_0>();
    private String nVN = null;
    private axb_2 oeC = awx_2.dnF;
    private String cxT;
    private final int oeD;
    private final List<dcj_0> oeE = new ArrayList<dcj_0>();
    private final List<dcj_0> oeF = new ArrayList<dcj_0>();
    private String nVR;
    private String nVS;
    private boolean nVP;
    private boolean nVQ;
    private String oeG;
    private String nVT;

    public dci_0(WP wP, int n) {
        this(wP, n, -1);
    }

    public dci_0(WP wP, int n, int n2) {
        this.oez = wP;
        this.oeA = n;
        this.oeD = n2;
    }

    public WP fbv() {
        return this.oez;
    }

    public List<dcj_0> fbw() {
        return this.oeB;
    }

    public List<dcj_0> fbx() {
        return this.oeE;
    }

    public List<dcj_0> fby() {
        return this.oeF;
    }

    public void kZ(boolean bl) {
        this.nVP = bl;
    }

    public void la(boolean bl) {
        this.nVQ = bl;
    }

    public boolean fbz() {
        return this.nVP;
    }

    public boolean fbA() {
        return this.nVQ;
    }

    public int bFT() {
        return this.oeA;
    }

    public String fbB() {
        return this.nVN;
    }

    public void rd(String string) {
        this.nVN = string;
    }

    public axb_2 fbC() {
        return this.oeC;
    }

    public void v(axb_2 axb_22) {
        this.oeC = axb_22;
    }

    public String bAD() {
        return this.cxT;
    }

    public void eQ(String string) {
        this.cxT = string;
    }

    public void re(String string) {
        this.a(string, null, null, null);
    }

    public void at(String string, String string2) {
        this.a(string, string2, null, null);
    }

    public void g(String string, String string2, String string3) {
        this.a(string, string2, string3, null);
    }

    public void a(String string, String string2, List<String> list) {
        this.a(string, null, string2, list);
    }

    public void a(String string, String string2, String string3, List<String> list) {
        if (string != null && !string.isEmpty()) {
            this.oeB.add(new dcj_0(string, string2, null, string3, list, null, false));
        }
    }

    public void a(String string, String string2, String string3, bue_0 bue_02, boolean bl) {
        if (string != null && !string.isEmpty()) {
            this.oeE.add(new dcj_0(string, null, string2, string3, null, bue_02, bl));
        }
    }

    public void b(String string, String string2, String string3, bue_0 bue_02, boolean bl) {
        if (string != null && !string.isEmpty()) {
            this.oeF.add(new dcj_0(string, null, string2, string3, null, bue_02, bl));
        }
    }

    public boolean fbD() {
        return this.oeD >= 0;
    }

    public int dND() {
        return this.oeD;
    }

    public void rf(String string) {
        this.nVR = string;
    }

    public void rg(String string) {
        this.nVS = string;
    }

    public String fbE() {
        return this.nVR;
    }

    public String fbF() {
        return this.nVS;
    }

    public void rh(String string) {
        this.oeG = string;
    }

    public void ri(String string) {
        this.nVT = string;
    }

    public String fbG() {
        return this.oeG;
    }

    public String fbH() {
        return this.nVT;
    }
}

