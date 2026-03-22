/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXY
 */
public class exy_1
implements exz_1 {
    private eJS qAm;
    private long lUh;
    private long bxw;
    private boolean msW;
    private int poW;

    public exy_1() {
    }

    public exy_1(eJS eJS2) {
        this.qAm = eJS2;
    }

    public eJS fPk() {
        return this.qAm;
    }

    public void C(eJS eJS2) {
        this.qAm = eJS2;
    }

    @Override
    public short aWP() {
        return this.qAm.aWP();
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
    public boolean fPl() {
        return this.qAm != null;
    }

    @Override
    public long KU() {
        return -this.qAm.Sn();
    }

    @Override
    public void da(long l) {
        this.lUh = l;
    }

    @Override
    public String getName() {
        return this.qAm.getName();
    }

    @Override
    public acd_1 aZw() {
        throw new UnsupportedOperationException("Ne devrait pas etre utilis\u00e9");
    }

    @Override
    public long aqZ() {
        return 0L;
    }

    @Override
    public void af(byte by) {
    }

    @Override
    public long aXa() {
        return this.dnR();
    }

    @Override
    public long dnR() {
        return this.lUh;
    }

    @Override
    public void mL(boolean bl) {
    }

    @Override
    public short cmL() {
        if (this.qAm == null) {
            return 0;
        }
        return this.qAm.cmL();
    }

    @Override
    public short fPm() {
        return this.cmL();
    }

    @Override
    public void eu(short s) {
    }

    @Override
    public boolean fPn() {
        return false;
    }

    @Override
    public boolean dcc() {
        return false;
    }

    @Override
    public long aZj() {
        return this.bxw;
    }

    @Override
    public int fmi() {
        return this.qAm.fmi();
    }

    @Override
    public int fmj() {
        return this.qAm.fxw();
    }

    @Override
    public void OZ(int n) {
        this.qAm.OZ(n);
    }

    @Override
    public void Pa(int n) {
        this.qAm.Qi(n);
    }

    @Override
    public boolean doP() {
        return false;
    }

    @Override
    public boolean fmm() {
        return this.msW;
    }

    @Override
    public void fr(long l) {
        this.bxw = l;
    }

    @Override
    public void db(long l) {
    }

    @Override
    public void setName(String string) {
    }

    @Override
    public void aT(short s) {
    }

    @Override
    public void ly(boolean bl) {
        this.msW = bl;
    }

    @Override
    public void gf(boolean bl) {
    }

    @Override
    public void bw(short s) {
    }

    @Override
    public void fK(long l) {
    }

    @Override
    public void b(acd_1 acd_12) {
    }

    @Override
    public int fmk() {
        return 0;
    }

    @Override
    public void Pb(int n) {
    }

    @Override
    public void a(eyc_1 eyc_12) {
    }

    @Override
    public String fPo() {
        return null;
    }

    @Override
    public boolean aXd() {
        return true;
    }

    @Override
    public boolean dmc() {
        return false;
    }

    @Override
    public void mM(boolean bl) {
    }

    @Override
    public int aeV() {
        return 2;
    }

    @Override
    public boolean fmn() {
        return false;
    }

    @Override
    public byte aWO() {
        return 0;
    }

    @Override
    public void aQ(byte by) {
    }
}

