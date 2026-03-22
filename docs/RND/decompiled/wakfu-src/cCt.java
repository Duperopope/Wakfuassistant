/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TIntIterator;
import gnu.trove.set.hash.TIntHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

public class cCt
implements cCk {
    public static final byte mzP = 4;
    public static final Pattern mzQ = Pattern.compile("[0-9]+\\s*(;\\s*([0-9]+)\\s*)*$");
    public static final Pattern mzR = Pattern.compile("(([0-9]+)\\s*[;]\\s*)|(([0-9]+)$)");
    private TIntHashSet mzS = new TIntHashSet();
    private static final int mzT = 233811181;

    public cCt() {
    }

    public cCt(String string) {
        this.mzS = cCt.pc(string);
    }

    public cCt(@NotNull TIntHashSet tIntHashSet) {
        this.mzS = tIntHashSet;
    }

    public String eJx() {
        TIntIterator tIntIterator = this.mzS.iterator();
        boolean bl = true;
        StringBuilder stringBuilder = new StringBuilder();
        while (tIntIterator.hasNext()) {
            if (!bl) {
                stringBuilder.append(";");
            } else {
                bl = false;
            }
            stringBuilder.append(tIntIterator.next());
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean c(cCs cCs2) {
        if (cCs2.eJm() != 4) {
            return false;
        }
        cCu cCu2 = (cCu)cCs2;
        return this.mzS.contains(cCu2.cax());
    }

    @Override
    public void a(apl_1 apl_12) {
        int n = apl_12.aIA();
        if (n == 233811181) {
            int n2 = apl_12.aIy();
            for (int i = 0; i < n2; ++i) {
                this.mzS.add(apl_12.aIA());
            }
        } else {
            this.mzS.add(n);
        }
    }

    @Override
    public void b(fs_0 fs_02) {
        fs_02.mz(233811181);
        fs_02.g((byte)this.mzS.size());
        TIntIterator tIntIterator = this.mzS.iterator();
        while (tIntIterator.hasNext()) {
            fs_02.mz(tIntIterator.next());
        }
    }

    @Override
    public byte eIT() {
        return 4;
    }

    @Override
    public cCk eJk() {
        return new cCt(this.mzS);
    }

    public static boolean pb(String string) {
        if (string == null) {
            return false;
        }
        Matcher matcher = mzQ.matcher(string);
        return matcher.matches();
    }

    public static TIntHashSet pc(String string) {
        TIntHashSet tIntHashSet = new TIntHashSet();
        if (string == null) {
            return tIntHashSet;
        }
        Matcher matcher = mzQ.matcher(string);
        if (!matcher.matches()) {
            return tIntHashSet;
        }
        Matcher matcher2 = mzR.matcher(string);
        matcher2.reset();
        while (matcher2.find()) {
            String string2 = matcher2.group(2);
            if (string2 == null) {
                string2 = matcher2.group(3);
            }
            int n = Bw.m(string2);
            tIntHashSet.add(n);
        }
        return tIntHashSet;
    }

    public /* synthetic */ Object clone() {
        return this.eJk();
    }
}

