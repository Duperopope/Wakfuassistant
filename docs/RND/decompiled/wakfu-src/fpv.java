/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  gnu.trove.list.array.TIntArrayList
 */
import com.google.common.collect.HashBasedTable;
import gnu.trove.list.array.TIntArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class fpv {
    public static final short sOJ = 51;
    public static final long sOK = TimeUnit.MINUTES.toMillis(60L);
    public static final long sOL = TimeUnit.MINUTES.toMillis(15L);
    private int o;
    private final fpf_0 sOM;
    private final int sON;
    private final fpz_0 sOO;
    private final uw_0 sOP;
    private uw_0 sOQ;
    private final TIntArrayList sOR = new TIntArrayList();
    private final TIntArrayList sOS = new TIntArrayList();
    private final HashBasedTable<Long, Long, fpw_0> sOT = HashBasedTable.create();
    private int mjL;
    private int mjM;
    private short mjN;
    private short mjO;
    private short sOU;
    private int hQp;
    private int sOV;
    private final Set<fpa_0> sOW = new HashSet<fpa_0>();
    private final long sOX;
    private final long sOY;

    public fpv(int n, fpf_0 fpf_02, fpz_0 fpz_02, int n2, uw_0 uw_02) {
        this.o = n;
        this.sOM = fpf_02;
        this.sOO = fpz_02;
        this.sON = n2;
        this.sOP = uw_02;
        this.sOX = aym_2.bSE();
        this.sOY = aym_2.bSE();
    }

    public int d() {
        return this.o;
    }

    public long ggF() {
        return this.sOX;
    }

    public long ggG() {
        return this.sOY;
    }

    public void lK(int n) {
        this.o = n;
    }

    public fpf_0 dfF() {
        return this.sOM;
    }

    public fpz_0 ggH() {
        return this.sOO;
    }

    public int att() {
        return this.sON;
    }

    public uw_0 ggI() {
        return this.sOP;
    }

    public uw_0 ggJ() {
        return this.sOQ;
    }

    public void c(uw_0 uw_02) {
        this.sOQ = uw_02;
    }

    public TIntArrayList ggK() {
        return this.sOR;
    }

    public TIntArrayList ggL() {
        return this.sOS;
    }

    public HashBasedTable<Long, Long, fpw_0> ggM() {
        return this.sOT;
    }

    public int eDI() {
        return this.mjL;
    }

    public void Yv(int n) {
        this.mjL = n;
        for (fpa_0 fpa_02 : this.sOW) {
            fpa_02.a(this, false, this.mjL);
        }
    }

    public void Yw(int n) {
        this.mjL += n;
        for (fpa_0 fpa_02 : this.sOW) {
            fpa_02.a(this, false, this.mjL);
        }
    }

    public int eDJ() {
        return this.mjM;
    }

    public void Yx(int n) {
        this.mjM = n;
        for (fpa_0 fpa_02 : this.sOW) {
            fpa_02.a(this, true, this.mjM);
        }
    }

    public void Yy(int n) {
        this.mjM += n;
        for (fpa_0 fpa_02 : this.sOW) {
            fpa_02.a(this, true, this.mjM);
        }
    }

    public short eDK() {
        return this.mjN;
    }

    public void fv(short s) {
        this.mjN = s;
    }

    public short eDL() {
        return this.mjO;
    }

    public void fw(short s) {
        this.mjO = s;
    }

    public short ggN() {
        return this.sOU;
    }

    public int atC() {
        return this.hQp;
    }

    public void fx(short s) {
        this.sOU = s;
    }

    public void Yz(int n) {
        this.hQp = n;
    }

    public int atD() {
        return this.sOV;
    }

    public void YA(int n) {
        this.sOV = n;
    }

    public void a(fpa_0 fpa_02) {
        this.sOW.add(fpa_02);
    }

    public boolean gm(int n, int n2) {
        boolean bl = this.sOR.contains(n) && this.sOS.contains(n2);
        return bl |= this.sOS.contains(n) && this.sOR.contains(n2);
    }

    public String toString() {
        return "BattlegroundDefinition{m_id=" + this.o + ", m_type=" + String.valueOf(this.sOM) + ", m_dataId=" + this.sON + ", m_level=" + String.valueOf(this.sOO) + ", m_startTime=" + String.valueOf(this.sOP) + ", m_ownerId=" + this.sOV + ", m_winnerId=" + this.hQp + "}";
    }
}

