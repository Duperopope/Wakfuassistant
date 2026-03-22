/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.TLongCollection
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.TLongCollection;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongProcedure;
import java.nio.ByteBuffer;
import java.util.HashSet;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class TJ
implements TI {
    protected static final Logger btN = Logger.getLogger(TJ.class);
    final TLongObjectHashMap<TE> btO = new TLongObjectHashMap();
    TD btP;
    byte btQ = (byte)-1;
    private TLongArrayList btR;

    @Override
    public void d(TD tD) {
        this.btP = tD;
    }

    public TJ(TF tF) {
        this.btP = new TD(tF);
        this.btR = new TLongArrayList((TLongCollection)this.btP.bhD());
    }

    @Override
    public void a(long l, short s, tw_0 tw_02) {
        TLongArrayList tLongArrayList = this.btP.bhD();
        int n = tLongArrayList.size() + 1;
        int n2 = tw_02.bho() + this.b(tw_02);
        int n3 = Math.floorMod(n2, n);
        if (this.btR != null && n3 != tLongArrayList.size()) {
            long l2 = tLongArrayList.get(n3);
            int n4 = this.btR.indexOf(l2);
            int n5 = this.btR.indexOf(l);
            if (l2 != 0L && n4 != -1 && n5 != -1 && n5 > n4) {
                int n6 = n3++;
                LU lU = new LU();
                LU lU2 = new LU();
                tLongArrayList.forEach((TLongProcedure)new TK(this, lU, n6, l2, lU2));
                if (lU2.aTn() <= 1) {
                    // empty if block
                }
            }
        }
        if (n3 <= this.bij()) {
            this.btQ = (byte)(this.btQ + 1);
            this.f(l, (short)(s + 1));
        } else {
            this.f(l, s);
        }
        int n7 = this.py(n3);
        this.btP.m(l, n3 - n7);
        this.btP.l(l, n3);
        this.btP.bhI();
    }

    private int py(int n) {
        int n2 = 0;
        TLongArrayList tLongArrayList = this.btP.bhD();
        HashSet<Long> hashSet = new HashSet<Long>();
        for (int i = 0; i < n && i < tLongArrayList.size(); ++i) {
            long l = tLongArrayList.getQuick(i);
            if (hashSet.add(l)) continue;
            ++n2;
        }
        return n2;
    }

    private int b(tw_0 tw_02) {
        return switch (tw_02.bhn()) {
            default -> throw new MatchException(null, null);
            case Tx.bsM -> {
                if (this.bhE()) {
                    yield this.btQ;
                }
                yield 0;
            }
            case Tx.bsN -> 0;
            case Tx.bsO -> this.btP.bhD().indexOf(tw_02.bhp());
        };
    }

    @Override
    public void e(long l, short s) {
        this.f(l, (short)(s + 1));
        this.btP.m(l, this.btP.bia().size());
    }

    @Override
    public void o(long l, int n) {
        if (n <= this.btQ) {
            return;
        }
        this.btP.l(l, n);
        this.btP.bhI();
    }

    @Override
    public int a(tw_0 tw_02) {
        int n = this.btP.bhD().size() + 1;
        int n2 = tw_02.bho() + this.b(tw_02);
        return Math.floorMod(n2, n);
    }

    @Override
    public boolean fa(long l) {
        return this.btO.containsKey(l);
    }

    private void f(long l, short s) {
        TE tE = new TE(l, s);
        this.btO.put(l, (Object)tE);
    }

    @Override
    public void eX(long l) {
        if (!this.fa(l)) {
            btN.error((Object)("On tente de retirer un fighter absent de la timeline (" + l + ")"));
            return;
        }
        TLongArrayList tLongArrayList = this.bip();
        int n = Math.min(this.btQ + 1, tLongArrayList.size());
        for (int i = 0; i < n; ++i) {
            if (tLongArrayList.getQuick(i) != l) continue;
            this.btQ = (byte)(this.btQ - 1);
        }
        this.btP.eX(l);
        this.btO.remove(l);
    }

    @Override
    public boolean eZ(long l) {
        if (!this.fa(l)) {
            btN.error((Object)("Trying to remove a fighterId that is not in the timeline (" + l + ") " + String.valueOf(this.btO)));
            return false;
        }
        TLongArrayList tLongArrayList = this.bip();
        if (tLongArrayList.getQuick((int)this.btQ) != l) {
            btN.error((Object)("Trying to remove a fighterId from a position that is not his. Fighter : " + l + " | turnOrder : " + String.valueOf(tLongArrayList) + " | position : " + this.btQ));
            return false;
        }
        byte by = this.btQ;
        this.btQ = (byte)(this.btQ - 1);
        this.btP.n(l, by);
        if (!this.btP.bhD().contains(l)) {
            this.btO.remove(l);
        }
        return true;
    }

    @Override
    public void bhH() {
        this.btP.bhH();
        this.btR = new TLongArrayList((TLongCollection)this.btP.bhD());
    }

    @Override
    public void bhL() {
        this.bit();
        this.biu();
    }

    private void bit() {
        this.btP.bhZ();
    }

    @Override
    public void bio() {
        this.btP.bhI();
    }

    private void biu() {
        this.btQ = (byte)-1;
    }

    @Override
    public TLongArrayList bip() {
        return this.btP.bhD();
    }

    @Override
    public TLongArrayList biq() {
        return this.btP.bia();
    }

    @Override
    @Nullable
    public TLongArrayList bir() {
        return this.btR;
    }

    @Override
    public boolean bhE() {
        return this.btQ >= 0 && this.btQ < this.bip().size();
    }

    @Override
    public long bik() {
        if (!this.bhE()) {
            this.biw();
            throw new IllegalStateException("currentFighter() sans hasCurrentFighter()");
        }
        return this.bip().get((int)this.btQ);
    }

    @Override
    public boolean ez(long l) {
        return this.bhE() && this.bik() == l;
    }

    TE biv() {
        if (!this.bhE()) {
            this.biw();
            throw new IllegalStateException("currentNode() sans hasCurrentFighter()");
        }
        return (TE)this.btO.get(this.bik());
    }

    @Override
    public byte bij() {
        return this.btQ;
    }

    @Override
    public boolean bil() {
        return this.btQ + 1 < this.bip().size();
    }

    @Override
    public void bim() {
        if (!this.bil()) {
            return;
        }
        this.btQ = (byte)(this.btQ + 1);
    }

    @Override
    public long bin() {
        if (!this.bil()) {
            throw new IllegalStateException("peekAtNextFighter() sans hasNextFighter()");
        }
        return this.bip().get(this.btQ + 1);
    }

    @Override
    public void bis() {
        if (this.bhE()) {
            this.biv().bib();
        }
    }

    void biw() {
        String string = this.toString();
        btN.error((Object)(string + adu_1.cN(1, 5)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[Timeline] ");
        stringBuilder.append("P:").append(this.btQ).append(' ');
        stringBuilder.append("T:[");
        TLongArrayList tLongArrayList = this.bip();
        int n = tLongArrayList.size();
        for (int i = 0; i < n; ++i) {
            stringBuilder.append(tLongArrayList.get(i)).append(',');
        }
        if (n > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        stringBuilder.append("] D:[");
        TLongArrayList tLongArrayList2 = this.btP.bia();
        int n2 = tLongArrayList2.size();
        for (int i = 0; i < n2; ++i) {
            stringBuilder.append(tLongArrayList2.get(i)).append(',');
        }
        if (n2 > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        stringBuilder.append(']');
        long[] lArray = this.btO.keys();
        int n3 = lArray.length;
        stringBuilder.append(" N:[");
        for (int i = 0; i < n3; ++i) {
            long l = lArray[i];
            if (this.btO.get(l) == null) {
                stringBuilder.append('!');
            }
            stringBuilder.append(l).append(',');
        }
        if (n3 > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Override
    public boolean a(tz_0 tz_02, short s) {
        long l = tz_02.OO();
        TE tE = (TE)this.btO.get(l);
        if (tE == null) {
            return tz_02.biN() < s;
        }
        int n = tz_02.biN() - tE.bic();
        if (!tz_02.biM() && this.ez(l)) {
            --n;
        }
        return n < 0;
    }

    @Override
    public short a(tz_0 tz_02) {
        long l = tz_02.OO();
        TE tE = (TE)this.btO.get(l);
        if (tE == null) {
            return -1;
        }
        int n = tz_02.biN() - tE.bic();
        if (tz_02.biM() && !this.ez(l)) {
            ++n;
        }
        return (short)n;
    }

    @Override
    public short fd(long l) {
        if (!this.fa(l)) {
            return -1;
        }
        return (short)(((TE)this.btO.get(l)).bic() - 1);
    }

    @Override
    public boolean fb(long l) {
        return this.bil() && this.bin() == l;
    }

    @Override
    public boolean fc(long l) {
        return this.bhE() && this.bik() == l;
    }

    @Override
    public int DN() {
        int n = 1 + this.btP.DN() + 1 + 8 * this.btO.size();
        for (long l : this.btO.keys()) {
            n += ((TE)this.btO.get(l)).DN();
        }
        return n;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        this.btP.as(byteBuffer);
        byteBuffer.put((byte)this.btO.size());
        for (int i = 0; i < this.btO.keys().length; ++i) {
            long l = this.btO.keys()[i];
            byteBuffer.putLong(l);
            ((TE)this.btO.get(l)).as(byteBuffer);
        }
        byteBuffer.put(this.btQ);
    }

    @Override
    public void a(Tz tz, ByteBuffer byteBuffer) {
        this.btP.eO(byteBuffer);
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            long l = byteBuffer.getLong();
            TE tE = TE.b(tz, byteBuffer);
            tE.eY(l);
            this.btO.put(l, (Object)tE);
        }
        this.btQ = byteBuffer.get();
    }

    public static TJ c(Tz tz, ByteBuffer byteBuffer) {
        TJ tJ = new TJ(tz.bhs());
        tJ.a(tz, byteBuffer);
        return tJ;
    }

    @Override
    public void clear() {
        this.btO.clear();
        if (this.btP != null) {
            this.btP.clear();
        }
        this.biu();
    }
}

