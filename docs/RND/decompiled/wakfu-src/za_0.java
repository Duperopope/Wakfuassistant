/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from Za
 */
public abstract class za_0 {
    private final YY bUs;
    protected final Yh[] bUt;
    protected agf bUu;

    public za_0(YY yY) {
        this.bUs = yY;
        this.bUt = yY.boQ();
    }

    protected final String qQ(int n) {
        return this.bUs.bUq[n].boT();
    }

    public abstract void boS();

    public abstract void bhk();

    public abstract void start();

    public void b(aaj_0 aaj_02) {
        this.bUu = aaj_02.bqL();
    }

    public void d(ArrayList<yn_0> arrayList) {
        this.bUs.a(this.bUt);
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            yn_0 yn_02 = arrayList.get(i);
        }
    }
}

