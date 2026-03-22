/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class daD
extends dae_0 {
    private final ArrayList<oo_0> oct = new ArrayList();
    private String lOn;
    private String lOo;
    private boolean ocu;

    @Override
    public int d() {
        return 17993;
    }

    public void oi(String string) {
        this.lOn = string;
    }

    public void oj(String string) {
        this.lOo = string;
    }

    public void Y(ArrayList<oo_0> arrayList) {
        this.oct.addAll(arrayList);
    }

    public void k(Boolean bl) {
        this.ocu = bl;
    }

    public ArrayList<oo_0> eZW() {
        return this.oct;
    }

    public String etm() {
        return this.lOn;
    }

    public String etn() {
        return this.lOo;
    }

    public Boolean eZX() {
        return this.ocu;
    }
}

