/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.BitSet;

public abstract class QI {
    protected final QE bhH;
    protected final TLongArrayList bhI = new TLongArrayList();
    protected final TLongArrayList bhJ = new TLongArrayList();
    protected final TLongObjectHashMap<QD> bhK = new TLongObjectHashMap();
    private boolean bhL = true;

    protected QI(QE qE) {
        this.bhH = qE;
    }

    public boolean a(BitSet bitSet, QD qD, byte by) {
        if (!this.bhL) {
            return false;
        }
        this.bco();
        boolean bl = false;
        try {
            bl = this.b(bitSet, qD, by);
        }
        catch (Throwable throwable) {
            QE.bhg.fatal((Object)("[RUNNING_EFFECT] An error was caught in effect trigger check for effect " + String.valueOf(qD)), throwable);
        }
        if (bl) {
            try {
                this.a(qD, by);
            }
            catch (Throwable throwable) {
                QE.bhg.error((Object)("[RUNNING_EFFECT] An error was caught in the effect execution for effect " + String.valueOf(qD)), throwable);
            }
        }
        this.bco();
        return bl;
    }

    private void bco() {
        this.bhI.clear();
        this.bhJ.clear();
        this.bhK.clear();
    }

    protected abstract boolean b(BitSet var1, QD var2, byte var3);

    protected abstract void a(QD var1, byte var2);

    protected boolean a(BitSet bitSet, byte by, QD qD) {
        boolean bl = false;
        switch (by) {
            case 1: {
                if (qD.aZJ() == null || !qD.aZJ().intersects(bitSet)) break;
                this.s(qD);
                bl = true;
                break;
            }
            case 2: {
                if (qD.aZK() == null || !qD.aZK().intersects(bitSet)) break;
                this.s(qD);
                bl = true;
                break;
            }
            case 3: {
                if (qD.aZM() == null || !qD.aZM().intersects(bitSet)) break;
                this.s(qD);
                bl = true;
                break;
            }
            case 5: {
                if (qD.bbv() == null || !qD.bbv().intersects(bitSet)) break;
                this.s(qD);
                bl = true;
                break;
            }
            case 6: {
                if (qD.bbw() == null || !qD.bbw().intersects(bitSet)) break;
                this.s(qD);
                bl = true;
                break;
            }
            case 4: {
                if (qD.aZL() == null || !qD.aZL().intersects(bitSet)) break;
                this.t(qD);
                bl = true;
            }
        }
        return bl;
    }

    protected boolean b(BitSet bitSet, byte by, QD qD) {
        boolean bl = false;
        switch (by) {
            case 10: {
                if (qD.aZJ() == null || !qD.aZJ().intersects(bitSet)) break;
                this.s(qD);
                bl = true;
                break;
            }
            case 20: {
                if (qD.aZK() == null || !qD.aZK().intersects(bitSet)) break;
                this.s(qD);
                bl = true;
                break;
            }
            case 30: {
                if (qD.aZM() == null || !qD.aZM().intersects(bitSet)) break;
                this.s(qD);
                bl = true;
                break;
            }
            case 60: {
                if (qD.bbw() == null || !qD.bbw().intersects(bitSet)) break;
                this.s(qD);
                bl = true;
                break;
            }
            case 40: {
                if (qD.aZL() == null || !qD.aZL().intersects(bitSet)) break;
                this.t(qD);
                bl = true;
            }
        }
        return bl;
    }

    protected void s(QD qD) {
        this.bhI.add(qD.LV());
        this.bhK.put(qD.LV(), (Object)qD);
    }

    protected void t(QD qD) {
        this.bhJ.add(qD.LV());
        this.bhK.put(qD.LV(), (Object)qD);
    }

    public void aZ(boolean bl) {
        this.bhL = bl;
    }
}

