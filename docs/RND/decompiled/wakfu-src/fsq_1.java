/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fSQ
 */
public class fsq_1
implements Iterator<fhv_1> {
    private final fhs_2 veU;
    private Iterator<fhv_1> bia;
    private fhv_1 veV;
    private boolean veW;
    private int veX;

    public fsq_1(fhs_2 fhs_22) {
        this.veU = fhs_22;
        if (this.veU == null) {
            throw new IllegalArgumentException("Impossible d'initialiser avec une map nulle");
        }
        this.bia = this.veU.iterator();
        this.veX = -1;
        this.veV = this.gGw();
    }

    @Nullable
    private fhv_1 gGw() {
        this.veW = true;
        if (this.bia.hasNext()) {
            return this.bia.next();
        }
        this.bia = this.gGx();
        if (this.bia == null) {
            return null;
        }
        return this.bia.next();
    }

    @Nullable
    private Iterator<fhv_1> gGx() {
        ++this.veX;
        ArrayList<fhs_2> arrayList = this.veU.gAu();
        if (arrayList == null || arrayList.size() >= this.veX) {
            return null;
        }
        fhs_2 fhs_22 = arrayList.get(this.veX);
        fsq_1 fsq_12 = new fsq_1(fhs_22);
        return fsq_12.hasNext() ? fsq_12 : this.gGx();
    }

    @Override
    public boolean hasNext() {
        if (!this.veW) {
            this.veV = this.gGw();
        }
        return this.veV != null;
    }

    public fhv_1 gGy() {
        if (this.veV == null) {
            throw new NoSuchElementException();
        }
        this.veW = false;
        return this.veV;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.gGy();
    }
}

