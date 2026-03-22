/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from Wq
 */
public class wq_0<R extends wp_0> {
    protected static final Logger bNn = Logger.getLogger(wq_0.class);
    protected final HashMap<String, R> bNo = new HashMap();
    protected final ArrayList<wr_0> bNp = new ArrayList();
    private final ayw_2<R> bNq;

    protected wq_0(ayw_2<R> ayw_22) {
        this.bNq = ayw_22;
    }

    public boolean a(wr_0 wr_02) {
        return !this.bNp.contains(wr_02) && this.bNp.add(wr_02);
    }

    public boolean b(wr_0 wr_02) {
        return this.bNp.remove(wr_02);
    }

    public wp_0 h(String string, boolean bl) {
        wp_0 wp_02 = (wp_0)this.bNo.get(string);
        if (wp_02 == null) {
            wp_02 = (wp_0)this.bNq.baw();
            wp_02.dD(string);
            wp_02.bs(bl);
            this.bNo.put(string, wp_02);
        }
        wp_02.bs(bl);
        for (wr_0 wr_02 : this.bNp) {
            wr_02.a(this);
        }
        return wp_02;
    }

    public Collection<R> blV() {
        return this.bNo.values();
    }

    public R dF(String string) {
        return (R)((wp_0)this.bNo.get(string));
    }
}

