/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Renamed from eUa
 */
public class eua_1
implements Iterator<qu_0> {
    private final Iterator<qu_0> rrK;
    private boolean rrL = false;
    private qu_0 rrM;
    private boolean rrN;
    final /* synthetic */ ety_0 rrO;

    public eua_1(ety_0 ety_02) {
        this.rrO = ety_02;
        this.rrK = ety_02.fKt();
    }

    private boolean w(qu_0 qu_02) {
        exP exP2;
        if (qu_02 instanceof exP && this.rrO.a(exP2 = (exP)qu_02, evv_0.rAb, evv_0.rAc)) {
            return true;
        }
        long l = qu_02.Sn();
        if (this.rrO.rrA != null && this.rrO.rrA.dq(l)) {
            return true;
        }
        return this.rrO.qF(l);
    }

    private boolean fKz() {
        this.rrL = this.fKA();
        return this.rrL;
    }

    private boolean fKA() {
        if (!this.rrK.hasNext()) {
            return false;
        }
        qu_0 qu_02 = this.rrK.next();
        if (this.w(qu_02)) {
            this.rrM = qu_02;
            return true;
        }
        return this.fKA();
    }

    private qu_0 fKB() {
        if (!this.rrL) {
            throw new NoSuchElementException();
        }
        return this.rrM;
    }

    @Override
    public boolean hasNext() {
        if (this.rrN) {
            return this.rrL;
        }
        this.rrN = true;
        return this.fKz();
    }

    public qu_0 fKC() {
        if (!this.rrN) {
            this.fKz();
        }
        this.rrN = false;
        return this.fKB();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.fKC();
    }
}

