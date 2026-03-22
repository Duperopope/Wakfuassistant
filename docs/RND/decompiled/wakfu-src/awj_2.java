/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from awj
 */
public class awj_2 {
    private final String dku;
    private final ArrayList<awu_1> dkv = new ArrayList();

    public awj_2(String string) {
        this.dku = string;
    }

    public void a(String string, String string2, int n, int n2, int n3) {
        awu_1 awu_12 = new awu_1();
        awu_12.b(string);
        awu_12.cL(string2);
        awu_12.uR(n);
        awu_12.setDeltaX(n2);
        awu_12.setDeltaY(n3);
        this.dkv.add(awu_12);
    }

    public String bpu() {
        awu_1 awu_12 = this.bOn();
        return awu_12 == null ? null : awu_12.bpu();
    }

    private awu_1 bOn() {
        Mv mv = My.aUV() != null ? My.aUV().aUXX() : Mv.aVl;
        int n = this.dkv.size();
        for (int i = 0; i < n; ++i) {
            awu_1 awu_12 = this.dkv.get(i);
            if (!awu_12.f(mv)) continue;
            return awu_12;
        }
        return null;
    }

    public int bOo() {
        awu_1 awu_12 = this.bOn();
        return awu_12 == null ? 0 : awu_12.bOo();
    }

    public int getDeltaX() {
        awu_1 awu_12 = this.bOn();
        return awu_12 == null ? 0 : awu_12.getDeltaX();
    }

    public int getDeltaY() {
        awu_1 awu_12 = this.bOn();
        return awu_12 == null ? 0 : awu_12.getDeltaY();
    }

    public String getName() {
        return this.dku;
    }

    public boolean aJG() {
        return this.dkv.isEmpty();
    }
}

