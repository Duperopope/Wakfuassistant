/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class bsg
implements fbb_1 {
    private final int jfo;
    private final ArrayList<bsi> jfp;

    public bsg(int n, Set<eTw> set) {
        this.jfo = n;
        this.jfp = new ArrayList(set.size());
        Iterator<eTw> iterator = set.iterator();
        while (iterator.hasNext()) {
            bsi bsi2 = new bsi();
            bsi2.l(iterator.next());
            this.jfp.add(bsi2);
        }
        Collections.sort(this.jfp);
    }

    @Override
    public int dEZ() {
        return this.jfo;
    }

    @Override
    public Object dFa() {
        return this.jfp;
    }
}

