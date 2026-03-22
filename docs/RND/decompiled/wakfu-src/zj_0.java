/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from Zj
 */
class zj_0
extends za_0 {
    private aba_0 bUw;

    zj_0(zi_0 zi_02) {
        super(zi_02);
    }

    @Override
    public void d(ArrayList<yn_0> arrayList) {
        super.d(arrayList);
    }

    @Override
    public final void boS() {
        float f2 = this.bUt[0].floatValue();
        float f3 = this.bUt[1].floatValue();
        if (f2 == 0.0f || f3 == 0.0f) {
            this.bhk();
            return;
        }
        if (this.bUw == null) {
            this.start();
        }
        this.bUw.b(this.bUu);
        this.bUw.aF(f3, f2);
    }

    @Override
    public final void bhk() {
        if (this.bUw == null) {
            return;
        }
        this.bUw.reset();
        this.bUw.clear();
        ast_1.bJG().b(this.bUw);
        this.bUw = null;
    }

    @Override
    public final void start() {
        this.bUw = new aba_0();
        this.bUw.btd();
        ast_1.bJG().a(this.bUw);
    }
}

