/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from SZ
 */
public class sz_0<TCountedType extends PH>
implements tc_0<TCountedType> {
    protected static final Logger brP = Logger.getLogger(sz_0.class);
    protected final ArrayList<tc_0<TCountedType>> brQ;
    protected final int brR;
    protected int brS;

    public sz_0(int n) {
        this(n, 0);
    }

    public sz_0(int n, int n2) {
        this.brR = n;
        this.brS = n2;
        this.brQ = new ArrayList();
    }

    @Override
    public void a(TCountedType TCountedType) {
        ++this.brS;
        int n = this.brQ.size();
        for (int i = 0; i < n; ++i) {
            this.brQ.get(i).a(TCountedType);
        }
    }

    @Override
    public void b(TCountedType TCountedType) {
        --this.brS;
        int n = this.brQ.size();
        for (int i = 0; i < n; ++i) {
            this.brQ.get(i).b(TCountedType);
        }
    }

    public int avr() {
        return this.brR;
    }

    public int getCurrentValue() {
        return this.brS;
    }

    @Override
    public void a(tc_0<TCountedType> tc_02) {
        this.brQ.add(tc_02);
    }

    @Override
    public void b(tc_0<TCountedType> tc_02) {
        this.brQ.remove(tc_02);
    }

    public void bgw() {
        this.brS = 0;
    }
}

