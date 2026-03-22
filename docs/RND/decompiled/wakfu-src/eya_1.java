/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eYa
 */
public final class eya_1
implements exz_1 {
    private String p;
    private long bxw;
    private long aDh;
    private long aHT;
    private acd_1 bio;
    private int poU;
    private int poV;
    private int iar;
    private long aZA;
    private short ejt;
    private short jvL = (short)-1;
    private boolean rJm;
    private boolean mcR;
    private boolean msW;
    private short aZk;
    private byte aZm;
    private String rJn;
    private final List<eyc_1> rJo = new ArrayList<eyc_1>();
    private boolean rJp;
    private int poW;

    @Override
    public boolean fPl() {
        return this.p != null;
    }

    @Override
    public long KU() {
        return this.aDh;
    }

    @Override
    public void da(long l) {
        this.aZA = l;
    }

    @Override
    public short aWP() {
        return this.aZk;
    }

    @Override
    public void Pc(int n) {
        this.poW = n;
    }

    @Override
    public int fml() {
        return this.poW;
    }

    @Override
    public String getName() {
        return this.p;
    }

    @Override
    public acd_1 aZw() {
        return this.bio;
    }

    @Override
    public long aqZ() {
        return this.aHT;
    }

    @Override
    public void af(byte by) {
        this.aZA = 0L;
    }

    @Override
    public long aXa() {
        return this.aZA;
    }

    @Override
    public long dnR() {
        return this.aZA;
    }

    @Override
    public void mL(boolean bl) {
        this.rJm = bl;
    }

    @Override
    public short cmL() {
        return this.ejt;
    }

    @Override
    public short fPm() {
        return this.jvL;
    }

    @Override
    public void eu(short s) {
        this.jvL = s;
        this.fPq();
    }

    @Override
    public boolean fPn() {
        return this.jvL != this.ejt && this.jvL != -1;
    }

    @Override
    public boolean dcc() {
        return this.rJm;
    }

    @Override
    public long aZj() {
        return this.bxw;
    }

    @Override
    public int fmi() {
        return this.poU;
    }

    @Override
    public int fmj() {
        return this.poV;
    }

    @Override
    public void OZ(int n) {
        this.poU = n;
        this.fPt();
    }

    @Override
    public void Pa(int n) {
        this.poV = n;
        this.fPu();
    }

    @Override
    public boolean doP() {
        return this.mcR;
    }

    @Override
    public boolean fmm() {
        return this.msW;
    }

    @Override
    public boolean fmn() {
        return false;
    }

    @Override
    public void fr(long l) {
        this.bxw = l;
    }

    @Override
    public void db(long l) {
        this.aDh = l;
    }

    @Override
    public void setName(String string) {
        this.p = string;
    }

    @Override
    public void aT(short s) {
        this.aZk = s;
    }

    @Override
    public void ly(boolean bl) {
        this.msW = bl;
        this.fPs();
    }

    @Override
    public void gf(boolean bl) {
        this.mcR = bl;
        this.fPr();
    }

    @Override
    public void bw(short s) {
        this.ejt = s;
        this.fPp();
    }

    @Override
    public void fK(long l) {
        this.aHT = l;
    }

    @Override
    public void b(acd_1 acd_12) {
        this.bio = acd_12;
    }

    @Override
    public int fmk() {
        return this.iar;
    }

    @Override
    public void Pb(int n) {
        this.iar = n;
    }

    @Override
    public String fPo() {
        return this.rJn;
    }

    @Override
    public boolean aXd() {
        return false;
    }

    @Override
    public boolean dmc() {
        return this.rJp;
    }

    @Override
    public void mM(boolean bl) {
        this.rJp = bl;
    }

    @Override
    public int aeV() {
        return 1;
    }

    @Override
    public byte aWO() {
        return this.aZm;
    }

    @Override
    public void aQ(byte by) {
        this.aZm = by;
    }

    @Override
    public void a(eyc_1 eyc_12) {
        if (this.rJo.contains(eyc_12)) {
            return;
        }
        this.rJo.add(eyc_12);
    }

    public boolean b(eyc_1 eyc_12) {
        return this.rJo.remove(eyc_12);
    }

    private void fPp() {
        for (eyc_1 eyc_12 : this.rJo) {
            eyc_12.a(this);
        }
    }

    private void fPq() {
        this.rJo.forEach(eyc_12 -> eyc_12.b(this));
    }

    private void fPr() {
        for (eyc_1 eyc_12 : this.rJo) {
            eyc_12.c(this);
        }
    }

    private void fPs() {
        for (eyc_1 eyc_12 : this.rJo) {
            eyc_12.d(this);
        }
    }

    private void fPt() {
        for (eyc_1 eyc_12 : this.rJo) {
            eyc_12.f(this);
        }
    }

    private void fPu() {
        for (eyc_1 eyc_12 : this.rJo) {
            eyc_12.g(this);
        }
    }
}

