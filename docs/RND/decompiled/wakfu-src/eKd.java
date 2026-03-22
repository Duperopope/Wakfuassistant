/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

public class eKd
implements evv_2 {
    private static final Logger qBg = Logger.getLogger(eKd.class);
    private final Collection<eKf> qBh = new ArrayList<eKf>();
    private long aDg;
    private long qBi;
    private int epQ;
    private long aDL;
    private String aFF;
    private int qBj;
    private boolean cdF;

    @Override
    public byte[] fej() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.aDg);
        azg_12.gK(this.qBi);
        azg_12.vC(this.epQ);
        azg_12.gK(this.aDL);
        byte[] byArray = BH.aP(this.aFF);
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        azg_12.vC(this.qBj);
        azg_12.aF(this.cdF ? (byte)1 : 0);
        return azg_12.bTe();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        this.aDg = byteBuffer.getLong();
        this.qBi = byteBuffer.getLong();
        this.epQ = byteBuffer.getInt();
        this.aDL = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.aFF = BH.dc(byArray);
        this.qBj = byteBuffer.getInt();
        this.cdF = byteBuffer.get() == 1;
    }

    @Override
    public eva_1 fek() {
        return eva_1.owr;
    }

    public long xl() {
        return this.aDg;
    }

    public void nL(long l) {
        this.aDg = l;
        this.fxI();
    }

    public long dua() {
        return this.qBi;
    }

    public void pY(long l) {
        this.qBi = l;
        this.fxJ();
    }

    public int Xt() {
        return this.epQ;
    }

    public void Le(int n) {
        this.epQ = n;
        this.fxK();
    }

    public long Ya() {
        return this.aDL;
    }

    public void jQ(long l) {
        this.aDL = l;
        this.fxL();
    }

    public String HR() {
        return this.aFF;
    }

    public void my(String string) {
        this.aFF = string;
    }

    public int fxH() {
        return this.qBj;
    }

    public void Qk(int n) {
        this.qBj = n;
        this.fxM();
    }

    public void Ql(int n) {
        this.qBj += n;
        this.fxM();
    }

    public boolean aOY() {
        return this.cdF;
    }

    public void az(boolean bl) {
        this.cdF = bl;
        this.fxN();
    }

    public boolean a(eKf eKf2) {
        if (this.qBh.contains(eKf2)) {
            return false;
        }
        return this.qBh.add(eKf2);
    }

    public boolean b(eKf eKf2) {
        return this.qBh.remove(eKf2);
    }

    private void fxI() {
        for (eKf eKf2 : this.qBh) {
            try {
                eKf2.cXZ();
            }
            catch (Exception exception) {
                qBg.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void fxJ() {
        for (eKf eKf2 : this.qBh) {
            try {
                eKf2.cYa();
            }
            catch (Exception exception) {
                qBg.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void fxK() {
        for (eKf eKf2 : this.qBh) {
            try {
                eKf2.cYb();
            }
            catch (Exception exception) {
                qBg.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void fxL() {
        for (eKf eKf2 : this.qBh) {
            try {
                eKf2.cYc();
            }
            catch (Exception exception) {
                qBg.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void fxM() {
        for (eKf eKf2 : this.qBh) {
            try {
                eKf2.cYd();
            }
            catch (Exception exception) {
                qBg.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void fxN() {
        for (eKf eKf2 : this.qBh) {
            try {
                eKf2.cYe();
            }
            catch (Exception exception) {
                qBg.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public String toString() {
        return "Company{m_accountId=" + this.aDg + ", m_companyChiefId=" + this.qBi + ", m_nationId=" + this.epQ + ", m_guildId=" + this.aDL + ", m_isActivated=" + this.cdF + "}";
    }
}

