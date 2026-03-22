/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bRj
extends fiO {
    private final ArrayList<bRk> kZH = new ArrayList();
    private final bRk kZI = new bRk(34);

    @Override
    public boolean cJ(byte by) {
        if (super.cJ(by)) {
            this.kZH.add(new bRk(by));
            Collections.sort(this.kZH);
            return true;
        }
        return false;
    }

    public List<bRk> ekE() {
        ArrayList<bRk> arrayList = new ArrayList<bRk>(this.kZH.size() + 1);
        arrayList.add(this.kZI);
        arrayList.addAll(this.kZH);
        return arrayList;
    }

    @Override
    public void clear() {
        super.clear();
        this.kZH.clear();
    }

    @Override
    public void a(qt_2 qt_22) {
        throw new UnsupportedOperationException("Pas de serialisation de landmarks dans le client");
    }
}

