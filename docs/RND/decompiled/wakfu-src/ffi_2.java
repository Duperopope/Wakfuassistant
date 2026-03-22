/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from fFi
 */
public class ffi_2<T extends ffp_2>
implements ffp_2 {
    private final long uoF;
    private final axb_2 uoG;
    private final String uoH;
    private final String uoI;
    private int uoJ;
    private final ArrayList<ffq_2> uoK = new ArrayList();
    private short iIp;
    private T uoL;

    public ffi_2(long l, axb_2 axb_22, String string, String string2) {
        this.uoF = l;
        this.uoG = axb_22;
        this.uoH = string;
        this.uoI = string2;
    }

    public T gvG() {
        return this.uoL;
    }

    public void b(T t) {
        this.uoL = t;
    }

    @Override
    public short dZr() {
        return this.iIp;
    }

    public void fR(short s) {
        this.iIp = s;
    }

    public void a(ffq_2 ffq_22) {
        this.uoK.add(ffq_22);
    }

    public void b(ffq_2 ffq_22) {
        this.uoK.remove(ffq_22);
    }

    public void bJk() {
        this.uoK.clear();
    }

    @Override
    public List<ffq_2> bFA() {
        return this.uoK;
    }

    @Override
    public axb_2 dYq() {
        return this.uoG;
    }

    @Override
    public long Sn() {
        return this.uoF;
    }

    @Override
    public byte gvB() {
        return 0;
    }

    @Override
    public String dZs() {
        return this.uoH;
    }

    public void aaN(int n) {
        this.uoJ = n;
    }

    @Override
    public int gvC() {
        return this.uoJ;
    }

    @Override
    public String byf() {
        return this.uoI;
    }

    @Override
    public boolean dZi() {
        return false;
    }

    @Override
    @Nullable
    public String gvD() {
        return null;
    }

    @Override
    @Nullable
    public String gvE() {
        return null;
    }

    @Override
    @Nullable
    public String dYr() {
        return null;
    }

    @Override
    public long gvF() {
        return -1L;
    }

    @Override
    public @Unmodifiable Collection<? extends ffp_2> dYw() {
        return Collections.singleton(this);
    }

    @Override
    public String dYn() {
        return null;
    }
}

