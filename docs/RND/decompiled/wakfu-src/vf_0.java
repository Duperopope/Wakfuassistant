/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jdom.Content
 *  org.jdom.Element
 */
import gnu.trove.iterator.TIntIterator;
import gnu.trove.set.hash.TIntHashSet;
import java.nio.ByteBuffer;
import java.util.List;
import org.apache.log4j.Logger;
import org.jdom.Content;
import org.jdom.Element;

/*
 * Renamed from VF
 */
public class vf_0 {
    private static final Logger bJr = Logger.getLogger(vf_0.class);
    protected final TIntHashSet bJs;

    public vf_0() {
        this.bJs = new TIntHashSet();
    }

    public vf_0(TIntHashSet tIntHashSet) {
        this.bJs = tIntHashSet;
    }

    public final boolean bkz() {
        return this.bJs.isEmpty();
    }

    public void a(vf_0 vf_02) {
        TIntIterator tIntIterator = vf_02.bJs.iterator();
        while (tIntIterator.hasNext()) {
            this.bJs.add(tIntIterator.next());
        }
    }

    public final void ap(int n, int n2) {
        this.bJs.add(vf_0.as(n, n2));
    }

    public final boolean aq(int n, int n2) {
        return this.bJs.contains(vf_0.as(n, n2));
    }

    public final boolean b(vf_0 vf_02) {
        return this.bJs.removeAll(vf_02.bJs.toArray());
    }

    public final boolean ar(int n, int n2) {
        return this.bJs.remove(vf_0.as(n, n2));
    }

    public TIntHashSet bkA() {
        return this.bJs;
    }

    public Element bkB() {
        Element element = new Element("partitions");
        for (int n : this.bJs) {
            short s = GC.mS(n);
            short s2 = GC.mT(n);
            Element element2 = new Element("partition");
            element2.setAttribute("x", String.valueOf(s));
            element2.setAttribute("y", String.valueOf(s2));
            element.addContent((Content)element2);
        }
        return element;
    }

    public void a(Element element) {
        assert (element.getName().equals("partitions"));
        List list = element.getChildren("partition");
        for (int i = 0; i < list.size(); ++i) {
            Element element2 = (Element)list.get(i);
            int n = Integer.parseInt(element2.getAttributeValue("x"));
            int n2 = Integer.parseInt(element2.getAttributeValue("y"));
            this.ap(n, n2);
        }
        this.bJs.compact();
    }

    public void c(fs_0 fs_02) {
        int n = this.bJs.size();
        fs_02.mz(n);
        TIntIterator tIntIterator = this.bJs.iterator();
        for (int i = 0; i < n; ++i) {
            fs_02.mz(tIntIterator.next());
        }
    }

    public void eS(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            this.bJs.add(byteBuffer.getInt());
        }
        this.bJs.compact();
    }

    protected static int as(int n, int n2) {
        return GC.t(n, n2);
    }
}

