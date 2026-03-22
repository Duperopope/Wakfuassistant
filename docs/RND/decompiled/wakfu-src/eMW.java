/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class eMW {
    private int els;
    private int biD = 0;
    private int qOs = 2;
    private boolean ejB = true;
    private boolean iNs = true;
    private boolean qOt = false;
    private ArrayList<Long> qOu;
    private boolean qOv = false;
    private int mjD;
    private short qOw;
    private short qOx;
    private long qOy;
    private final hk_1 qOz = hi_1.Hz();

    public eMW() {
        this.qOu = new ArrayList();
    }

    public int Fq() {
        return this.biD;
    }

    public boolean erF() {
        return this.qOv;
    }

    public ArrayList<Long> fAR() {
        return this.qOu;
    }

    public void qr(long l) {
        this.qOu.add(l);
    }

    public int rI() {
        return this.els;
    }

    public void RK(int n) {
        this.els = n;
    }

    public void Km(int n) {
        this.biD = n;
    }

    public int Fs() {
        return this.qOs;
    }

    public void RL(int n) {
        this.qOs = n;
    }

    public boolean cmT() {
        return this.ejB;
    }

    public void iS(boolean bl) {
        this.ejB = bl;
    }

    public boolean erC() {
        return this.iNs;
    }

    public void iT(boolean bl) {
        this.iNs = bl;
    }

    public void iR(boolean bl) {
        this.qOt = bl;
    }

    public boolean erD() {
        return this.qOt;
    }

    public void RM(int n) {
        this.mjD = n;
    }

    public void ec(short s) {
        this.qOx = s;
    }

    public void ed(short s) {
        this.qOw = (short)(this.qOw + s);
    }

    public void qs(long l) {
        this.qOy = l;
    }

    public void n(long l, short s) {
        this.qOz.b(l, hm_1.HU().du(s).Ia());
    }

    public ha_1 fAS() {
        ha_1 ha_12 = hy_1.Jl();
        ha_12.a(hr_1.uw).a(this.qOz).dG(this.qOs).aa(this.qOy).dH(this.qOw).dI(this.qOx).ab(this.mjD);
        return ha_12;
    }

    public void ac(ArrayList<Long> arrayList) {
        this.qOu = arrayList;
    }

    public void lQ(boolean bl) {
        this.qOv = bl;
    }
}

