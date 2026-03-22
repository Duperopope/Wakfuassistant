/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class eVd {
    private final long rza;
    private final short rzb;
    private final String rzc;
    private final long rzd;
    private short rze;
    private long rzf;
    private boolean rzg;
    private boolean rzh;
    private long iJl = 0L;
    private long rzi = 0L;
    private long rzj = 0L;
    private final ArrayList<fhy> rzk = new ArrayList();
    private final ArrayList<fhy> rzl = new ArrayList();
    private final ArrayList<fhy> rzm = new ArrayList();
    private final ArrayList<fhy> rzn = new ArrayList();

    public eVd(long l, String string, short s, long l2) {
        this.rza = l;
        this.rzc = string;
        this.rzb = s;
        this.rzd = l2;
    }

    public eVd(long l, String string, short s) {
        this(l, string, s, -1L);
    }

    public eVd(long l, byte[] byArray, short s, long l2) {
        this(l, BH.dc(byArray), s, l2);
    }

    public long doL() {
        return this.rzd;
    }

    public long KU() {
        return this.rza;
    }

    public String getName() {
        return this.rzc;
    }

    public short aWP() {
        return this.rzb;
    }

    public short fMM() {
        return this.rze;
    }

    public long VL() {
        return this.rzf;
    }

    public void o(long l, short s) {
        this.rzf = l;
        this.rze = s;
    }

    public boolean fMN() {
        return this.rzg;
    }

    public ArrayList<fhy> fMO() {
        return this.rzk;
    }

    public ArrayList<fhy> fMP() {
        return this.rzl;
    }

    public ArrayList<fhy> fMQ() {
        return this.rzm;
    }

    public ArrayList<fhy> fMR() {
        return this.rzn;
    }

    public long dzt() {
        return this.iJl;
    }

    public void lQ(long l) {
        this.iJl = l;
    }

    public long fMS() {
        return this.rzi;
    }

    public void qV(long l) {
        this.rzi = l;
    }

    public void mI(boolean bl) {
        this.rzg = bl;
    }

    public void a(fhy fhy2) {
        this.rzl.add(fhy2);
    }

    public void b(fhy fhy2) {
        this.rzm.add(fhy2);
    }

    public void c(fhy fhy2) {
        this.rzn.add(fhy2);
    }

    public void SE(int n) {
        this.iJl += (long)n;
    }

    public void SF(int n) {
        this.rzi += (long)n;
    }

    public boolean fMT() {
        return this.rzh;
    }

    public void mJ(boolean bl) {
        this.rzh = bl;
    }

    public long fMU() {
        return this.rzj;
    }

    public void qW(long l) {
        this.rzj = l;
    }

    public String toString() {
        return "PlayerFightHistory{m_characterId=" + this.rza + ", m_breedId=" + this.rzb + ", m_name='" + this.rzc + "', m_companionId=" + this.rzd + ", m_endLevel=" + this.rze + ", m_endXp=" + this.rzf + ", m_hasWon=" + this.rzg + ", m_hasFled=" + this.rzh + ", m_kamas=" + this.iJl + ", m_taxes=" + this.rzi + ", m_premiumXp=" + this.rzj + ", m_lootsDuringFight=" + String.valueOf(this.rzk) + ", m_lootsAtEndFight=" + String.valueOf(this.rzl) + ", m_canceledLootsAtEndFight=" + String.valueOf(this.rzm) + ", m_almostCanceledLoots=" + String.valueOf(this.rzn) + "}";
    }
}

