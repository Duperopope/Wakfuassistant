/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@Deprecated
public class aWy
extends agb_1 {
    private final long hvi;
    private final Collection<ftN> hvj = new ArrayList<ftN>();

    private aWy(int n, long l) {
        super(n, eui_1.rsW.aJr(), 0);
        this.hvi = l;
    }

    public static aWy[] b(cqj_0 cqj_02) {
        aWy[] aWyArray = new aWy[cqj_02.aVo()];
        ftJ ftJ2 = cqj_02.eyQ();
        int n = 0;
        for (ftH ftH2 : ftJ2) {
            aWy aWy2 = aWy.a(ftH2);
            aWyArray[n++] = aWy2;
        }
        return aWyArray;
    }

    private static aWy a(ftH ftH2) {
        aWy aWy2 = new aWy(aWy.cbm(), ftH2.aXb());
        Iterator<ftN> iterator = ftH2.iterator();
        while (iterator.hasNext()) {
            aWy2.hvj.add(iterator.next());
        }
        return aWy2;
    }

    @Override
    public long cbk() {
        return 0L;
    }

    @Override
    protected void caV() {
    }
}

