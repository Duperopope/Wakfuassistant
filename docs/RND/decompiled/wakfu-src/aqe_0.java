/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aQe
 */
public abstract class aqe_0 {
    public static final int eBz = 100;
    private final List<String> eBA = new ArrayList<String>();
    private int eBB = 0;
    private String eBC = "";

    aqe_0() {
    }

    public String cBx() {
        if (this.eBA.isEmpty()) {
            return "";
        }
        if (this.eBB > 0) {
            --this.eBB;
        }
        return this.eBA.get(this.eBB);
    }

    public String cBy() {
        if (this.eBB <= this.eBA.size() - 1) {
            ++this.eBB;
        }
        return this.eBB <= this.eBA.size() - 1 ? this.eBA.get(this.eBB) : this.eBC;
    }

    public boolean cBz() {
        return this.eBB <= this.eBA.size() - 1;
    }

    public void jA(String string) {
        this.eBC = string;
    }

    protected void jB(String string) {
        if (this.eBA.size() >= 100) {
            this.eBA.remove(0);
        }
        this.eBA.add(string);
        this.eBB = this.eBA.size();
        this.eBC = "";
    }
}

