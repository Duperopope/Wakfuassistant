/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteLongHashMap
 */
import gnu.trove.map.hash.TByteLongHashMap;
import java.util.LinkedList;

public abstract class ezc
extends UX {
    protected long aHT;
    protected int bap;
    protected int baq;
    protected short ban;
    protected int poU;
    protected int poV;
    protected int iar;
    protected int poW;
    protected boolean poX = false;
    protected boolean poY = false;
    private boolean poZ;
    short ejt;
    protected final TByteLongHashMap ppa = new TByteLongHashMap();
    public final Va ppb = new ezd(this, this, 12);
    public final Va ppc = new eze(this, this, 12);
    public final Va ppd = new ezf(this, this, 2);
    public final Va ppe = new ezg(this, this, 1);
    public final Va ppf = new ezh(this, this, 1);
    private final fi_1[] ppg = new fi_1[]{this.ppe, this.ppf, this.ppd, this.ppc, this.ppb};

    public long ae(byte by) {
        return this.ppa.get(by);
    }

    public void a(byte by, long l) {
        this.ppa.put(by, l);
    }

    public void af(byte by) {
        this.ppa.remove(by);
    }

    @Override
    public fi_1[] zj() {
        fi_1[] fi_1Array = new fi_1[super.zj().length + this.ppg.length];
        System.arraycopy(super.zj(), 0, fi_1Array, 0, super.zj().length);
        System.arraycopy(this.ppg, 0, fi_1Array, super.zj().length, this.ppg.length);
        return fi_1Array;
    }

    @Override
    public void reset() {
        super.reset();
        this.aHT = 0L;
        this.bap = 0;
        this.baq = 0;
        this.ban = 0;
        this.poU = 0;
        this.poV = 0;
        this.iar = 0;
        this.poY = false;
        this.poX = false;
        this.poZ = false;
        this.ppa.clear();
    }

    public short cmL() {
        return this.ejt;
    }

    public long aqZ() {
        return this.aHT;
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public short bdi() {
        return this.ban;
    }

    public void fK(long l) {
        this.aHT = l;
    }

    public void setX(int n) {
        this.bap = n;
    }

    public void setY(int n) {
        this.baq = n;
    }

    public void aM(short s) {
        this.ban = s;
    }

    public void bw(short s) {
        this.ejt = s;
    }

    public int fmi() {
        return this.poU;
    }

    public void OZ(int n) {
        this.poU = n;
    }

    public int fmj() {
        return this.poV;
    }

    public void Pa(int n) {
        this.poV = n;
    }

    public int fmk() {
        return this.iar;
    }

    public void Pb(int n) {
        this.iar = n;
    }

    public int fml() {
        return this.poW;
    }

    public void Pc(int n) {
        this.poW = n;
    }

    public void ly(boolean bl) {
        this.poX = bl;
    }

    public void gf(boolean bl) {
        this.poY = bl;
    }

    public boolean fmm() {
        return this.poX;
    }

    public boolean doP() {
        return this.poY;
    }

    public void lz(boolean bl) {
        this.poZ = bl;
    }

    public boolean fmn() {
        return this.poZ;
    }

    static /* synthetic */ LinkedList a(ezc ezc2) {
        return ezc2.bxv;
    }

    static /* synthetic */ LinkedList b(ezc ezc2) {
        return ezc2.bxv;
    }

    static /* synthetic */ LinkedList c(ezc ezc2) {
        return ezc2.bxv;
    }

    static /* synthetic */ LinkedList d(ezc ezc2) {
        return ezc2.bxv;
    }

    static /* synthetic */ LinkedList e(ezc ezc2) {
        return ezc2.bxv;
    }
}

