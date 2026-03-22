/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bEO
implements aeh_2,
bdz_0 {
    public static final Comparator<bEO> jRu = Comparator.comparingInt(bEO::dSO);
    private static final int jRv = 2;
    public static final String jRw = "name";
    public static final String jRx = "icon";
    public static final String jRy = "hasSubTypes";
    public static final String jRz = "subTypes";
    public static final String jRA = "collapsed";
    public static final String jRB = "selected";
    private static final String[] jRC = new String[]{"name", "icon", "hasSubTypes", "subTypes", "collapsed", "selected"};
    @NotNull
    private final fhy_0 jRD;
    @Nullable
    private final bEO jRE;
    private final List<bEO> jRF;
    private boolean hFE = true;
    private boolean bWn = false;

    public bEO(@NotNull fhy_0 fhy_02, @Nullable bEO bEO2, @Nullable beq_0 beq_02) {
        this(fhy_02, bEO2, beq_02, 1);
    }

    private bEO(@NotNull fhy_0 fhy_02, @Nullable bEO bEO2, @Nullable beq_0 beq_02, int n) {
        this.jRD = fhy_02;
        this.jRE = bEO2;
        this.jRF = new ArrayList<bEO>();
        if (n < 2 && beq_02 != null) {
            LinkedList linkedList = new LinkedList();
            this.jRD.fZp().forEach(linkedList::add);
            while (!linkedList.isEmpty()) {
                fhy_0 fhy_03 = (fhy_0)linkedList.remove(0);
                if (beq_02.isValid(fhy_03)) {
                    this.jRF.add(new bEO(fhy_03, this, beq_02, n + 1));
                    continue;
                }
                fhy_03.fZp().forEach(linkedList::add);
            }
            this.jRF.sort(jRu);
        }
    }

    public static bEO a(@NotNull fhy_0 fhy_02, @Nullable bEO bEO2) {
        return new bEO(fhy_02, bEO2, null, 2);
    }

    public void d(@NotNull bEO bEO2) {
        this.jRF.add(bEO2);
        this.jRF.sort(jRu);
    }

    public void e(@NotNull bEO bEO2) {
        this.jRF.remove(bEO2);
    }

    @Override
    public void fm(boolean bl) {
        this.hFE = bl;
        fse_1.gFu().a((aef_2)this, jRA);
    }

    public void setSelected(boolean bl) {
        this.bWn = bl;
        fse_1.gFu().a((aef_2)this, jRB);
        if (this.jRE != null) {
            if (!this.bWn) {
                this.jRE.setSelected(false);
            } else if (this.jRE.dSM()) {
                this.jRE.setSelected(true);
            }
        }
    }

    public void hD(boolean bl) {
        this.setSelected(bl);
        this.jRF.forEach(bEO2 -> bEO2.hD(bl));
    }

    public boolean dSM() {
        if (this.jRF.isEmpty()) {
            return this.bWn;
        }
        return this.jRF.stream().allMatch(bEO::dSM);
    }

    public boolean dSN() {
        return this.jRE != null && this.jRE.bWn;
    }

    public void k(Consumer<bEO> consumer) {
        bEO bEO2 = this;
        while (bEO2.jRE != null) {
            bEO2 = bEO2.jRE;
        }
        bEO.a(bEO2, consumer);
    }

    public void l(Consumer<bEO> consumer) {
        bEO.a(this, consumer);
    }

    private static void a(bEO bEO2, Consumer<bEO> consumer) {
        LinkedList<bEO> linkedList = new LinkedList<bEO>();
        linkedList.add(bEO2);
        while (!linkedList.isEmpty()) {
            bEO bEO3 = (bEO)linkedList.remove(0);
            consumer.accept(bEO3);
            linkedList.addAll(bEO3.jRF);
        }
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return this.getName();
            }
            case "icon": {
                return this.byf();
            }
            case "hasSubTypes": {
                return !this.jRF.isEmpty();
            }
            case "subTypes": {
                return this.jRF;
            }
            case "collapsed": {
                return this.hFE;
            }
            case "selected": {
                return this.bWn;
            }
        }
        return null;
    }

    public String getName() {
        return this.jRD.gP(true);
    }

    protected int dSO() {
        return this.jRD.cqd();
    }

    @Nullable
    protected String byf() {
        String string = auc_0.cVq().aZ(this.jRD.aIi());
        if ((string == null || string.isBlank()) && this.jRE != null) {
            return this.jRE.byf();
        }
        if (string == null) {
            return auc_0.cVq().aZ((short)385);
        }
        return string;
    }

    @Override
    public String[] bxk() {
        return jRC;
    }

    public String toString() {
        return "type=" + this.jRD.getName();
    }

    @NotNull
    @Generated
    public fhy_0 dGh() {
        return this.jRD;
    }

    @Nullable
    @Generated
    public bEO dSP() {
        return this.jRE;
    }

    @Generated
    public List<bEO> dSQ() {
        return this.jRF;
    }

    @Override
    @Generated
    public boolean dbK() {
        return this.hFE;
    }

    @Generated
    public boolean bqr() {
        return this.bWn;
    }
}

