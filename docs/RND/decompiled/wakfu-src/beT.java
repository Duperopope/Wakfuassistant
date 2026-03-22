/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class beT {
    private final beV hOO;
    private final int hOP;
    private final beY[] hOQ;

    public beT(beV beV2, int n, ArrayList<beY> arrayList) {
        this.hOO = beV2;
        this.hOP = n;
        this.hOQ = new beY[arrayList.size()];
        Iterator<beY> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            beY beY2;
            this.hOQ[beY2.bEr()] = beY2 = iterator.next();
        }
    }

    public beV dff() {
        return this.hOO;
    }

    public int d() {
        return this.hOP;
    }

    public beY[] dfg() {
        return this.hOQ;
    }
}

