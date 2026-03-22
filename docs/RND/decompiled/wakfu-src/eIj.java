/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class eIj {
    private static final Logger qvQ = Logger.getLogger(eIj.class);
    private String p;
    private int eoY;
    private int cxt;
    private int qvR = 1;
    private boolean qvS;
    private final List<eIk> qvT = new ArrayList<eIk>();

    public eIj(String string, int n, int n2, boolean bl) {
        this(string, n, n2, eIp.fww(), bl);
    }

    public eIj(String string, int n, int n2, int n3, boolean bl) {
        this.p = string;
        this.eoY = n;
        this.cxt = n2;
        this.qvR = n3;
        this.qvS = n2 == 0 || bl;
    }

    public static eIj fwo() {
        return new eIj("", -1, 0, true);
    }

    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
        this.fwp();
    }

    public int tL() {
        return this.eoY;
    }

    public int am(exP exP2) {
        return this.eoY == -1 ? exP2.dnG() : this.eoY;
    }

    public void PP(int n) {
        this.eoY = n;
        this.fwq();
    }

    public int ws() {
        return this.qvR;
    }

    public void PQ(int n) {
        this.qvR = n;
    }

    public int wp() {
        return this.cxt;
    }

    public void tr(int n) {
        this.cxt = n;
    }

    public boolean dhe() {
        return this.qvS;
    }

    public void lC(boolean bl) {
        this.qvS = this.cxt == 0 || bl;
    }

    private void fwp() {
        for (eIk eIk2 : this.qvT) {
            try {
                eIk2.b(this);
            }
            catch (Exception exception) {
                qvQ.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void fwq() {
        for (eIk eIk2 : this.qvT) {
            try {
                eIk2.c(this);
            }
            catch (Exception exception) {
                qvQ.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    public void a(eIj eIj2) {
        this.setName(eIj2.p);
        this.PP(eIj2.eoY);
        this.PQ(eIj2.qvR);
    }

    public boolean a(eIk eIk2) {
        return !this.qvT.contains(eIk2) && this.qvT.add(eIk2);
    }

    public boolean b(eIk eIk2) {
        return this.qvT.remove(eIk2);
    }

    public String toString() {
        return "BuildSheetModel{m_name='" + this.p + "', m_level=" + this.eoY + ", m_index=" + this.cxt + ", m_iconIndex=" + this.qvR + "}";
    }
}

