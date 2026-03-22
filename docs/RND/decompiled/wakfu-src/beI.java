/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.AlmanaxMonth
 *  com.google.common.primitives.Ints
 */
import com.ankama.haapi.client.okhttp.ankama.model.AlmanaxMonth;
import com.google.common.primitives.Ints;

public class beI {
    private final int hNS;

    public beI(int n) {
        this.hNS = n;
    }

    public int bjG() {
        return this.hNS;
    }

    public static beI a(AlmanaxMonth almanaxMonth) {
        int n = Ints.saturatedCast((long)almanaxMonth.getMonth());
        return new beI(n);
    }
}

