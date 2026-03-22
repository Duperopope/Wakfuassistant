/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from azv
 */
class azv_1
implements Iterator<Long> {
    private final azu_2 dvD;
    private int cxt;
    private final int dvE;

    protected azv_1(azu_2 azu_22) {
        this.dvD = azu_22;
        this.cxt = 0;
        this.dvE = azu_22.aVo();
    }

    @Override
    public boolean hasNext() {
        return this.cxt < this.dvE;
    }

    public Long bTC() {
        return this.dvD.vR(this.cxt++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.bTC();
    }
}

