/*
 * Decompiled with CFR 0.152.
 */
public abstract class Va<TBinarSerial extends ff_1>
extends fi_1
implements fh_1 {
    private TBinarSerial bxB;

    protected Va(TBinarSerial TBinarSerial) {
        this.a((TBinarSerial)this);
        this.bxB = TBinarSerial;
    }

    protected Va(TBinarSerial TBinarSerial, int n) {
        super(n);
        this.a((TBinarSerial)this);
        this.bxB = TBinarSerial;
    }

    public TBinarSerial bkl() {
        return this.bxB;
    }

    public void a(TBinarSerial TBinarSerial) {
        this.bxB = TBinarSerial;
    }
}

