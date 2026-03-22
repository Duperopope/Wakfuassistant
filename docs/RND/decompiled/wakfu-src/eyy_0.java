/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eyY
 */
public final class eyy_0
implements gq_0<yl_1> {
    protected static final Logger poD = Logger.getLogger(eyy_0.class);
    private static final Comparator<eyw_0> poE = new eyz_0();
    private final int poF;
    private final int poG;
    private final int poH;
    private final int poI;
    private final List<eyw_0> poJ = new ArrayList<eyw_0>();
    private short poK;
    private long poL;
    private long poM;

    public eyy_0(int n, int n2, int n3, int n4) {
        this.poF = n;
        this.poG = n2;
        this.poH = n3;
        this.poI = n4;
    }

    public void b(eyw_0 eyw_02) {
        boolean bl = false;
        for (eyw_0 eyw_03 : this.poJ) {
            long l = Math.abs(eyw_02.aay() - eyw_03.aay());
            if (l <= (long)(this.poH * 1000 * 60) && (eyw_03.ov() + eyw_02.ov() > this.poI || !(bl = eyw_03.a(eyw_02)))) continue;
            break;
        }
        if (!bl) {
            this.poJ.add(eyw_02);
        }
        this.poJ.sort(poE);
        this.flX();
        this.poK = (short)(this.poK + 1);
        this.poL += eyw_02.alI();
    }

    private void flX() {
        while (!this.poJ.isEmpty()) {
            if (this.poJ.size() > this.poF || System.currentTimeMillis() - this.poJ.get(this.poJ.size() - 1).aay() > (long)this.poG * 1000L * 60L * 60L * 24L) {
                this.poJ.remove(this.poJ.size() - 1);
                continue;
            }
            return;
        }
    }

    public short flY() {
        return this.poK;
    }

    public long flZ() {
        return this.poL;
    }

    public long fma() {
        return this.poM;
    }

    public void pr(long l) {
        this.poM = l;
    }

    public void fmb() {
        this.poK = 0;
        this.poL = 0L;
    }

    public List<eyw_0> fmc() {
        return this.poJ;
    }

    public int aVo() {
        return this.poJ.size();
    }

    public void clear() {
        this.poJ.clear();
    }

    @Override
    public boolean a(yl_1 yl_12) {
        yl_12.amq.clear();
        for (eyw_0 eyw_02 : this.poJ) {
            ym_2 ym_22 = new ym_2();
            ym_22.amu = eyw_02.aay();
            ym_22.amv = eyw_02.flT();
            ym_22.amw = eyw_02.flU();
            Iterator<azx_1<Integer, Short>> iterator = eyw_02.flV();
            while (iterator.hasNext()) {
                azx_1<Integer, Short> azx_12 = iterator.next();
                yn_2 yn_22 = new yn_2();
                yn_22.aaQ = azx_12.getFirst();
                yn_22.aaa = azx_12.aHI();
                ym_22.amx.add(yn_22);
            }
            ym_22.amy = eyw_02.alI();
            yl_12.amq.add(ym_22);
        }
        yl_12.amr = this.poK;
        yl_12.ams = this.poL;
        yl_12.amt = this.poM;
        return true;
    }

    @Override
    public boolean b(yl_1 yl_12) {
        this.poJ.clear();
        for (ym_2 ym_22 : yl_12.amq) {
            try {
                eyw_0 eyw_02 = new eyw_0();
                eyw_02.pp(ym_22.amv);
                eyw_02.rQ(ym_22.amw);
                eyw_02.po(ym_22.amu);
                for (yn_2 yn_22 : ym_22.amx) {
                    eyw_02.f(yn_22.aaQ, yn_22.aaa);
                }
                eyw_02.pq(ym_22.amy);
                this.poJ.add(eyw_02);
            }
            catch (Exception exception) {
                poD.error((Object)("Exception lors de la d\u00e9-serialisation du log de transaction " + String.valueOf(ym_22)), (Throwable)exception);
            }
        }
        this.poK = yl_12.amr;
        this.poL = yl_12.ams;
        this.poM = yl_12.amt;
        return true;
    }
}

