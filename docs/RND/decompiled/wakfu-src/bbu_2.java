/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bbU
 */
public final class bbu_2
implements PL {
    private final int hBN;
    private final bcc_1 hBO;
    private final boolean hBP;
    private final boolean hBQ;
    private final String hBR;
    private final String hBS;
    private final int hBT;
    private final long hBU;
    private final boolean hBV;
    private final boolean hBW;
    private final boolean hBX;
    private final boolean hBY;
    private final boolean hBZ;
    private final int hCa;
    private final int hCb;
    private final ArrayList<bcj_1> hCc = new ArrayList();
    private final ArrayList<bcl_1> hCd = new ArrayList();
    private boolean Na;
    private boolean hCe;
    private long hCf;
    private long dfi;
    private boolean Nc;
    private final int hCg;
    private final int hCh;
    private final byte hCi;
    private final int hCj;
    private final String hCk;
    private final bbz_2 hCl;
    private final ang_2 hCm;
    private final ang_2 hCn;
    private ux_0 hCo;
    private ua_0 hCp;

    bbu_2(bbu_2 bbu_22) {
        this.hBN = bbu_22.hBN;
        this.Na = bbu_22.Na;
        this.hBO = bbu_22.hBO;
        this.hBP = bbu_22.hBP;
        this.hBQ = bbu_22.hBQ;
        this.hBR = bbu_22.hBR;
        this.hBS = bbu_22.hBS;
        this.hCm = bbu_22.hCm;
        this.hBT = bbu_22.hBT;
        this.hBU = bbu_22.hBU;
        this.hBV = bbu_22.hBV;
        this.hBW = bbu_22.hBW;
        this.hBX = bbu_22.hBX;
        this.hCg = bbu_22.hCg;
        this.hCh = bbu_22.hCh;
        this.hBY = bbu_22.hBY;
        this.hCb = bbu_22.hCb;
        this.hCo = bbu_22.hCo;
        this.hCp = bbu_22.hCp;
        this.hBZ = bbu_22.hBZ;
        this.hCa = bbu_22.hCa;
        this.hCi = bbu_22.hCi;
        this.hCn = bbu_22.hCn;
        this.hCj = bbu_22.hCj;
        this.hCk = bbu_22.hCk;
        this.hCl = bbu_22.hCl;
        this.Nc = bbu_22.Nc;
    }

    bbu_2(int n, bcc_1 bcc_12, boolean bl, boolean bl2, String string, String string2, ang_2 ang_22, int n2, long l, boolean bl3, boolean bl4, boolean bl5, int n3, int n4, boolean bl6, int n5, ux_0 ux_02, ua_0 ua_02, boolean bl7, int n6, byte by, ang_2 ang_23, int n7, String string3, bbz_2 bbz_22, boolean bl8) {
        this.hBN = n;
        this.hBO = bcc_12;
        this.hBP = bl;
        this.hBQ = bl2;
        this.hCi = by;
        this.hCn = ang_23;
        this.hBR = string != null ? string.intern() : null;
        this.hBS = string2 != null ? string2.intern() : null;
        this.hCm = ang_22;
        this.hBT = n2;
        this.hBU = l;
        this.hBV = bl3;
        this.hBW = bl4;
        this.hBX = bl5;
        this.hCg = n3;
        this.hCh = n4;
        this.hBY = bl6;
        this.hCb = n5;
        this.hCo = ux_02;
        this.hCp = ua_02;
        this.hBZ = bl7;
        this.hCa = n6;
        this.hCj = n7;
        this.hCk = string3;
        this.hCl = bbz_22;
        this.Nc = bl8;
    }

    void a(bcj_1 bcj_12) {
        if (!this.hCc.contains(bcj_12)) {
            this.hCc.add(bcj_12);
        }
    }

    void a(bcl_1 bcl_12) {
        if (!this.hCd.contains(bcl_12)) {
            this.hCd.add(bcl_12);
        }
    }

    public boolean isVisible() {
        return this.hBP;
    }

    public boolean a(PO pO) {
        return this.hBP && (this.hCm == null || this.hCm.b(pO, null, null, pO.aYx()));
    }

    public boolean b(PO pO) {
        return this.hCn == null || this.hCn.b(pO, null, null, pO.aYx());
    }

    @Override
    public boolean apo() {
        return this.Na;
    }

    void cCb() {
        this.Na = true;
        ux_0 ux_02 = Uq.buK.bjc();
        this.dfi = ux_02.bjB();
    }

    @Override
    public void T(boolean bl) {
        this.Na = bl;
    }

    @Override
    public boolean app() {
        return this.hCe;
    }

    void a(bcd_2 bcd_22) {
        this.hCe = true;
        ux_0 ux_02 = Uq.buK.bjc();
        if (this.hBU != 0L) {
            this.hCf = ux_02.bjB();
        }
    }

    void fk(boolean bl) {
        this.hCe = bl;
    }

    @Override
    public void dd(long l) {
        this.hCf = l;
    }

    @Override
    public int d() {
        return this.hBN;
    }

    public bcc_1 dat() {
        return this.hBO;
    }

    public String getName() {
        return this.hBR;
    }

    public String getDescription() {
        return this.hBS;
    }

    public ArrayList<bcj_1> dau() {
        return this.hCc;
    }

    public ArrayList<bcl_1> aFV() {
        return this.hCd;
    }

    @Override
    public int getDuration() {
        return this.hBT;
    }

    @Override
    public long aYn() {
        return this.hBU;
    }

    public boolean cje() {
        return this.hBQ;
    }

    public boolean cjn() {
        return this.hBY;
    }

    public boolean cjj() {
        return this.hBV;
    }

    @Override
    public boolean aYo() {
        return this.hBW;
    }

    @Override
    public long aYu() {
        return this.hCf;
    }

    public boolean cjk() {
        return this.hBX;
    }

    @Override
    public long atA() {
        return this.dfi;
    }

    public void hq(long l) {
        this.dfi = l;
    }

    public int cjl() {
        return this.hCg;
    }

    public int cjm() {
        return this.hCh;
    }

    public int cjo() {
        return this.hCb;
    }

    public void reset() {
        this.Na = false;
        this.hCe = false;
        for (int i = 0; i < this.hCc.size(); ++i) {
            this.hCc.get(i).reset();
        }
        this.hCf = 0L;
    }

    public void x(ux_0 ux_02) {
        this.hCo = ux_02;
    }

    public void m(ua_0 ua_02) {
        this.hCp = ua_02;
    }

    @Override
    public ux_0 aYp() {
        return this.hCo;
    }

    @Override
    public ua_0 aYq() {
        return this.hCp;
    }

    @Override
    public boolean aYt() {
        return true;
    }

    public boolean cjr() {
        return this.hBZ;
    }

    public int aVt() {
        return this.hCa;
    }

    @Override
    public byte aYr() {
        return this.hCi;
    }

    @Override
    public int aYs() {
        return this.hCj;
    }

    public String cjv() {
        return this.hCk;
    }

    public bbz_2 dav() {
        return this.hCl;
    }

    public ang_2 daw() {
        return this.hCn;
    }

    @Override
    public boolean apv() {
        return this.Nc;
    }

    public void fl(boolean bl) {
        this.Nc = bl;
    }

    public boolean dax() {
        return this.hBO != null && this.hBO.AQ(4);
    }
}

