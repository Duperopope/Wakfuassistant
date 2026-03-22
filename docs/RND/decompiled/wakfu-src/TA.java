/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TLongArrayList;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public abstract class TA
implements Tv {
    protected static final Logger bsZ = Logger.getLogger(TA.class);
    private static final int bta = 16;
    protected int bsx = -1;
    protected TI btb;
    private final Uh btc;
    protected final Uj btd = new Uj();
    private final TF bte;
    protected short btf;
    private int btg = 0;
    protected long bth;
    private boolean bti;
    private long btj;
    private long btk;
    private long btl;
    private long btm;
    private long btn;
    private long bto;
    protected final Map<Long, Long> btp = new HashMap<Long, Long>();
    protected boolean btq;
    protected Ty btr = Ty.bsQ;
    protected boolean bts;
    private long btt;

    protected TA(int n, TI tI, Uh uh, TF tF) {
        this.bsx = n;
        this.btb = tI;
        this.btc = uh;
        this.bte = tF;
        this.btk = 30000L;
        this.btl = 20000L;
        this.btm = 90000L;
    }

    public boolean bht() {
        return this.bti;
    }

    public void bm(boolean bl) {
        this.bti = bl;
    }

    public void eo(long l) {
        this.btk = l;
    }

    public long bhu() {
        return this.btk;
    }

    public void ep(long l) {
        this.btl = l;
    }

    public long bhv() {
        return this.btl;
    }

    public void eq(long l) {
        this.btm = l;
    }

    public long bhw() {
        return this.btm;
    }

    public long bhx() {
        return this.btn;
    }

    public void er(long l) {
        this.btn = l;
    }

    public void es(long l) {
        this.bto = l;
    }

    public void et(long l) {
        this.btj = l;
    }

    public long bhy() {
        return this.btj;
    }

    public void eu(long l) {
        this.bth = l;
    }

    public long bhz() {
        return this.bth;
    }

    public long bhA() {
        return this.bth - ue_0.bjV().getTimeInMillis();
    }

    protected abstract long ev(long var1);

    public void a(long l, @NotNull TB tB, TC tC, boolean bl) {
        long l2;
        if (this.bth != 0L && tC == TC.btz) {
            return;
        }
        switch (tB.ordinal()) {
            case 1: {
                long l3 = this.btl;
                break;
            }
            case 2: {
                long l3 = this.btm;
                break;
            }
            default: {
                long l3 = l2 = this.btk;
            }
        }
        if (this.btp.containsKey(l)) {
            l2 += this.btp.get(l).longValue();
            this.btp.remove(l);
        }
        if (bl && this.btf == 1) {
            l2 += this.bto;
        }
        long l4 = this.ev(l);
        switch (tC.ordinal()) {
            case 0: {
                this.bth = ue_0.bjV().getTimeInMillis() + l4 + Math.min(this.btn, l2);
                break;
            }
            case 2: {
                this.bth += l4 + Math.min(this.btn, l2);
                break;
            }
        }
    }

    @Override
    public void start() {
        this.btq = true;
    }

    @Override
    public void bhk() {
        this.btq = false;
    }

    @Override
    public boolean bhl() {
        return this.btq;
    }

    public void a(long l, boolean bl, tw_0 tw_02) {
        if (bl) {
            this.btb.a(l, this.btf, tw_02);
        } else {
            this.btb.e(l, this.btf);
        }
        this.eO(l);
    }

    public void b(long l, boolean bl, tw_0 tw_02) {
        throw new IllegalArgumentException("Not implemented yet");
    }

    public void a(long l, tw_0 tw_02) {
        int n = this.btb.a(tw_02);
        this.btb.o(l, n);
        this.j(l, n);
        this.bhT();
    }

    public boolean ew(long l) {
        if (this.bhl()) {
            if (this.ez(l) && this.btr != Ty.bsQ) {
                this.ey(l);
            }
            this.eP(l);
            this.btb.eX(l);
        }
        return true;
    }

    public void ex(long l) {
        if (this.bhl()) {
            if (this.ez(l) && this.btr != Ty.bsQ) {
                this.ey(l);
            }
            byte by = this.btb.bij();
            boolean bl = this.btb.eZ(l);
            if (bl) {
                this.k(l, by);
            }
        }
    }

    private void ey(long l) {
        this.bts = true;
        this.btt = l;
    }

    public boolean bhB() {
        return this.bts;
    }

    private void bhC() {
        this.bts = false;
        this.btt = 0L;
    }

    protected TLongArrayList bhD() {
        return this.btb.bip();
    }

    public boolean bhE() {
        return this.btb.bhE() || this.bts;
    }

    public boolean ez(long l) {
        if (this.bts) {
            return this.btt == l;
        }
        return this.btb.ez(l);
    }

    public boolean eA(long l) {
        if (this.btr != Ty.bsR) {
            return false;
        }
        if (this.bts) {
            return this.btt == l;
        }
        return this.btb.ez(l);
    }

    public long bhF() {
        return this.bts ? this.btt : this.btb.bik();
    }

    public int bhG() {
        return this.btb.bij() + (this.bts ? (byte)1 : 0);
    }

    public int eB(long l) {
        return this.eC(l);
    }

    private int eC(long l) {
        return this.btb.bip().indexOf(l);
    }

    public int eD(long l) {
        return this.btb.biq().indexOf(l);
    }

    public void bhH() {
        this.btb.bhH();
    }

    public void bhI() {
        this.btb.bio();
    }

    public short bhJ() {
        return this.btf;
    }

    public void bhK() {
        if (!this.bhl()) {
            return;
        }
        if (this.btf == 0) {
            if (this.btr != Ty.bsQ) {
                return;
            }
            this.btr = Ty.bsS;
        } else {
            if (!this.bhU()) {
                return;
            }
            this.a(Ue.biW());
        }
        this.bhL();
    }

    public void bhL() {
        if (!this.bhl()) {
            return;
        }
        this.btf = (short)(this.btf + 1);
        this.btb.bhL();
        this.a(Uf.biX());
        if (!this.bhl()) {
            return;
        }
        this.btd.a(this.btf, this);
        if (!this.bhl()) {
            return;
        }
        this.bhR();
    }

    public int bhM() {
        return this.btg;
    }

    protected boolean eE(long l) {
        if (!this.eF(l)) {
            return false;
        }
        return this.eG(l);
    }

    public boolean eF(long l) {
        if (!this.eT(l)) {
            return false;
        }
        this.bhC();
        this.btr = Ty.bsU;
        this.btb.bim();
        this.bhS();
        this.eR(l);
        return true;
    }

    public boolean eG(long l) {
        this.btd.a(l, this.btf, this);
        if (!this.bhl()) {
            return false;
        }
        if (this.btr != Ty.bsU) {
            return true;
        }
        this.btr = Ty.bsR;
        ++this.btg;
        this.eQ(l);
        return true;
    }

    protected abstract boolean eH(long var1);

    public final boolean eI(long l) {
        return this.e(l, this.eH(l));
    }

    public boolean e(long l, boolean bl) {
        if (this.btr == Ty.bsT) {
            return true;
        }
        if (this.bts) {
            if (this.btt != l) {
                return false;
            }
        } else {
            if (!this.eU(l)) {
                return false;
            }
            this.btr = Ty.bsT;
            if (bl) {
                this.btd.b(l, this.btf, this);
            }
            if (!this.bts) {
                this.btb.bis();
            }
        }
        if (!this.bhl()) {
            return false;
        }
        if (this.btr == Ty.bsU) {
            this.eK(l);
            return true;
        }
        this.btr = Ty.bsS;
        if (this.btt == 0L) {
            this.bhC();
        }
        if (this.eJ(l)) {
            this.ex(l);
        }
        this.eS(l);
        return true;
    }

    private boolean eJ(long l) {
        int n = 0;
        TLongArrayList tLongArrayList = this.btb.bip();
        for (int i = 0; i < tLongArrayList.size(); ++i) {
            if (tLongArrayList.get(i) != l) continue;
            ++n;
        }
        return n > 1 && tLongArrayList.indexOf(l) != this.btb.bij();
    }

    public void eK(long l) {
        this.btr = Ty.bsS;
        this.eM(l);
    }

    public Uj bhN() {
        return this.btd;
    }

    @Override
    public Uh bhj() {
        return this.btc;
    }

    public tz_0 a(TO tO, Ua ua) {
        if (this.b(tO, ua)) {
            return tz_0.biL();
        }
        long l = tO.biC();
        return this.a(tO, ua, l);
    }

    private tz_0 a(TO tO, Ua ua, long l) {
        boolean bl = this.eL(l);
        int n = this.eC(l);
        byte by = this.btb.bij();
        boolean bl2 = n < 0 || n > by;
        return this.btd.a(tO, ua, bl, bl2, (short)Math.max(this.bhJ(), 1));
    }

    public void bhO() {
        this.btd.bhO();
    }

    private boolean b(TO tO, Ua ua) {
        boolean bl = ua.biT();
        if (bl) {
            this.a(tO);
        }
        return bl;
    }

    protected boolean eL(long l) {
        return this.btb.ez(l) && this.btr == Ty.bsR;
    }

    public TN bhP() {
        return new TN(this.bhG(), this.bhJ(), false);
    }

    public short a(tz_0 tz_02) {
        if (!this.btb.fa(tz_02.OO())) {
            return -1;
        }
        return this.btb.a(tz_02);
    }

    public int DN() {
        return 15 + this.btb.DN();
    }

    @Override
    public byte[] bhm() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(this.DN());
        this.eN(byteBuffer);
        return byteBuffer.array();
    }

    protected void eN(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.btf);
        byteBuffer.putInt(this.btg);
        byteBuffer.put(this.btr.aJr());
        byteBuffer.putLong(this.bth);
        this.btb.as(byteBuffer);
    }

    @Override
    public void a(qm_0 qm_02, byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bhQ();
        Tz tz = this.c(qm_02);
        this.a(tz, byteBuffer);
    }

    public Tz c(qm_0 qm_02) {
        return new Tz(qm_02, this.bte);
    }

    protected void a(Tz tz, ByteBuffer byteBuffer) {
        this.btf = byteBuffer.getShort();
        this.btg = byteBuffer.getInt();
        byte by = byteBuffer.get();
        this.btr = Ty.ac(by);
        this.bth = byteBuffer.getLong();
        this.btb.clear();
        this.btb.a(tz, byteBuffer);
    }

    protected void bhQ() {
        this.bhk();
        this.btb.clear();
    }

    public void a(Ug ug) {
        if (ug == null) {
            bsZ.error((Object)"On ne peut pas envoyer un timeEvent null");
            return;
        }
        if (this.btc == null) {
            bsZ.error((Object)"Pas de TimeEventHandler sur la timeline");
            return;
        }
        try {
            ug.a(this.btc);
        }
        catch (Exception exception) {
            bsZ.error((Object)("[Fight] An error occurred while sending time event " + String.valueOf(ug) + " to handler " + String.valueOf(this.btc) + " in fight " + this.bsx), (Throwable)exception);
        }
    }

    protected void eM(long l) {
        long l2 = this.bth - ue_0.bjV().getTimeInMillis();
        if (l2 > 0L && l > 0L) {
            this.btp.put(l, l2);
        }
    }

    protected abstract void eN(long var1);

    protected abstract void bhR();

    protected abstract void eO(long var1);

    protected abstract void j(long var1, int var3);

    protected abstract void eP(long var1);

    protected abstract void k(long var1, int var3);

    protected abstract void bhS();

    protected void bhT() {
    }

    private void eQ(long l) {
        TW tW = new TW(l);
        this.a(tW);
        if (this.btb.ez(l)) {
            this.eN(l);
        }
    }

    private void eR(long l) {
        ty_0 ty_02 = new ty_0(l);
        this.a(ty_02);
    }

    private void eS(long l) {
        TU tU = new TU(l);
        this.a(tU);
        this.eM(l);
    }

    private boolean bhU() {
        if (this.btr != Ty.bsS) {
            bsZ.error((Object)this.dk("Etat de la timeline incorrect : " + String.valueOf((Object)this.btr) + ", attendu: " + String.valueOf((Object)Ty.bsS) + " at " + adu_1.xg(5)));
            return false;
        }
        if (this.btb.bil()) {
            bsZ.error((Object)this.dk("Assertion incorrecte sur la timeline (demande de fin de tour alors que joueur suivant = " + String.valueOf(this.btb.bil() ? Long.valueOf(this.btb.bin()) : "null") + ")").append(adu_1.xg(16)));
            return false;
        }
        return true;
    }

    private boolean eT(long l) {
        if (this.btr != Ty.bsS) {
            bsZ.error((Object)this.dk("Etat de la timeline incorrect : " + String.valueOf((Object)this.btr) + ", attendu: " + String.valueOf((Object)Ty.bsS) + " at " + adu_1.xg(5)));
            return false;
        }
        if (!this.btb.fb(l)) {
            bsZ.error((Object)this.dk("Assertion incorrecte sur la timeline (joueur suivant = " + String.valueOf(this.btb.bil() ? Long.valueOf(this.btb.bin()) : "null") + ", attendu = " + l + ")").append(adu_1.xg(16)));
            return false;
        }
        return true;
    }

    private boolean eU(long l) {
        if (this.btr != Ty.bsR) {
            bsZ.error((Object)this.dk("Etat de la timeline incorrect : " + String.valueOf((Object)this.btr) + ", attendu: " + String.valueOf((Object)Ty.bsR)));
            return false;
        }
        if (!this.btb.fc(l)) {
            String string = this.bhE() ? String.valueOf(this.bhF()) : "NONE";
            bsZ.error((Object)this.dk("Assertion incorrecte sur la timeline (joueur courant = " + string + ", attendu = " + l + ")").append(adu_1.xg(16)));
            return false;
        }
        return true;
    }

    @Override
    public int bha() {
        return this.bsx;
    }

    @Override
    public void pu(int n) {
        this.bsx = n;
    }

    protected StringBuilder dk(String string) {
        return new StringBuilder().append("[_TL_] fightId=").append(this.bsx).append(" - ").append(string).append(" - ").append((CharSequence)this.bhV());
    }

    public StringBuilder bhV() {
        StringBuilder stringBuilder = new StringBuilder(this.btb.toString());
        if (this.bts) {
            stringBuilder.append(" R:").append(this.btt);
        }
        return stringBuilder;
    }

    public void eV(long l) {
    }

    public long bhW() {
        if (this.btb.bil()) {
            return this.btb.bin();
        }
        TLongArrayList tLongArrayList = this.btb.biq();
        if (!tLongArrayList.isEmpty()) {
            return tLongArrayList.get(0);
        }
        return 0L;
    }
}

