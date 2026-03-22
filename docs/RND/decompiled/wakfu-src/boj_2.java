/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bOj
 */
public class boj_2
implements aeh_2 {
    public static final String kJZ = "name";
    final boi_2 kKa;
    private ArrayList<bog_2> kJL = new ArrayList();

    public boj_2(boi_2 boi_22, ArrayList<bog_2> arrayList) {
        this.kKa = boi_22;
        this.kJL = arrayList;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kJZ)) {
            return this.getName();
        }
        return null;
    }

    public String getName() {
        return this.kKa.getName();
    }

    public ArrayList<bog_2> egH() {
        return this.kJL;
    }
}

