/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
 * Renamed from bEU
 */
public class beu_0
extends bDz {
    public static final String jSt = "stackInventory";
    public static final String jSu = String.format("%s.%s", "collapsedView", "stackInventory");
    private final String jSv;
    private final String jSw;
    private List<bee_0> iJk = new ArrayList<bee_0>();

    public beu_0(String string) {
        this.jSv = string;
        this.dQX();
        this.dQZ();
        this.jSw = aum_0.cWf().c(this.jSv, new Object[0]);
    }

    @Override
    public String[] bxk() {
        return jKB;
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "bagName": 
            case "bagNameSize": {
                return this.jSw;
            }
            case "bagInventory": {
                return this.iJk;
            }
            case "bagSize": {
                return this.iJk.size();
            }
            case "canBeSorted": {
                return false;
            }
            case "collapsingIgnoreSize": {
                return false;
            }
            case "collapsible": {
                return true;
            }
        }
        return super.eu(string);
    }

    @Override
    public void j(Consumer<fgf_0> consumer) {
        this.iJk.forEach(consumer);
    }

    @Override
    public int aVo() {
        return this.iJk.size();
    }

    public void W(List<bee_0> list) {
        this.iJk = list;
    }

    @Override
    protected afh dQT() {
        return afh.cpV;
    }

    @Override
    protected String getKey() {
        return String.format("%s.%s", jSu, this.jSv);
    }
}

