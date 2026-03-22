/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from apC
 */
public class apc_2
implements apl_2 {
    private List<apg_2> cOj = null;
    private StringBuffer cOk = null;
    private StringBuffer cOl = null;
    private boolean cOm = false;
    private boolean cOnn = false;
    private apn_2 cNR = null;
    private int cOo = -1;
    private int cOp = -1;
    private int cOq = -1;

    apc_2() {
    }

    void bFq() {
        if (this.cOj == null) {
            this.cOj = new ArrayList<apg_2>();
        }
        this.cOj.clear();
        this.cOk = new StringBuffer("");
        this.cOl = new StringBuffer("");
        this.cOm = false;
        this.cOnn = false;
        this.cNR = null;
        this.cOo = -1;
        this.cOp = -1;
    }

    @Override
    public List<apg_2> bFa() {
        return this.cOj;
    }

    void s(List<apg_2> list) {
        this.cOj = list;
    }

    void a(apg_2 apg_22) {
        if (this.cOj == null) {
            this.cOj = new ArrayList<apg_2>();
        }
        this.cOj.add(apg_22);
    }

    void v(String string, String string2) {
        if (this.cOj == null) {
            this.cOj = new ArrayList<apg_2>();
        }
        this.cOj.add(new apg_2(string, string2));
    }

    @Override
    public String bEX() {
        return this.cOk.toString();
    }

    void fw(String string) {
        this.cOk = new StringBuffer(string);
    }

    void c(char c2) {
        this.cOk.append(c2);
    }

    @Override
    public boolean bEZ() {
        return this.cOm;
    }

    void cJ(boolean bl) {
        this.cOm = bl;
    }

    @Override
    public boolean bEY() {
        return this.cOnn;
    }

    void cK(boolean bl) {
        this.cOnn = bl;
    }

    @Override
    public int bES() {
        return this.cOp;
    }

    void ts(int n) {
        this.cOp = n;
    }

    @Override
    public apn_2 bET() {
        return this.cNR;
    }

    void a(apn_2 apn_22) {
        this.cNR = apn_22;
    }

    @Override
    public int bER() {
        return this.cOo;
    }

    void tt(int n) {
        this.cOp = n;
    }

    @Override
    public String bEQ() {
        Object object = "<";
        if (this.cOm) {
            object = (String)object + "/";
        }
        object = (String)object + String.valueOf(this.cOk);
        if (this.cOj != null && this.cOj.size() > 0) {
            for (apg_2 apg_22 : this.cOj) {
                object = (String)object + " " + apg_22.bEP() + "=\"" + apg_22.bEO() + "\"";
            }
        }
        if (this.cOnn) {
            object = (String)object + "/";
        }
        return (String)object + ">";
    }

    void fx(String string) {
        this.cOl = new StringBuffer(string);
    }

    public String toString() {
        Object object = "[TAG]";
        if (this.cOm) {
            object = (String)object + "/";
        }
        object = (String)object + String.valueOf(this.cOk) + "(";
        if (this.cOj != null) {
            for (apg_2 apg_22 : this.cOj) {
                object = (String)object + apg_22.bEP() + ":" + apg_22.bEO() + " ";
            }
        }
        object = ((String)object).trim();
        object = (String)object + ")";
        return object;
    }

    void tr(int n) {
        this.cOq = n;
    }

    @Override
    public int wp() {
        return this.cOq;
    }
}

