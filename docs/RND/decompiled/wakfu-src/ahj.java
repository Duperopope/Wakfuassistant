/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public abstract class ahj {
    private boolean cwA = false;
    private List<ahk> aRj = null;
    protected final afW cwB;

    public ahj(afW afW2) {
        this.cwB = afW2;
    }

    public void a(ahk ahk2) {
        if (this.aRj == null) {
            this.aRj = new ArrayList<ahk>();
        }
        this.aRj.add(ahk2);
    }

    public void b(ahk ahk2) {
        if (this.aRj == null) {
            return;
        }
        this.aRj.remove(ahk2);
    }

    public boolean isRemovable() {
        return this.cwA;
    }

    public void bzQ() {
        this.cwA = true;
        if (this.aRj != null) {
            for (ahk ahk2 : this.aRj) {
                ahk2.a(this);
            }
        }
    }

    public abstract float bzP();

    public abstract void qy(int var1);
}

