/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager2;
import java.util.HashMap;

public class ahN
implements LayoutManager2 {
    private final HashMap<Component, aho_0> cyy = new HashMap();

    @Override
    public void addLayoutComponent(Component component, Object object) {
        this.cyy.put(component, (aho_0)object);
    }

    @Override
    public Dimension maximumLayoutSize(Container container) {
        return new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    @Override
    public float getLayoutAlignmentX(Container container) {
        return 0.5f;
    }

    @Override
    public float getLayoutAlignmentY(Container container) {
        return 0.5f;
    }

    @Override
    public void invalidateLayout(Container container) {
    }

    @Override
    public void addLayoutComponent(String string, Component component) {
    }

    @Override
    public void removeLayoutComponent(Component component) {
        this.cyy.remove(component);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Dimension preferredLayoutSize(Container container) {
        Object object = container.getTreeLock();
        synchronized (object) {
            int n = Integer.MIN_VALUE;
            int n2 = Integer.MIN_VALUE;
            int n3 = container.getComponentCount();
            for (int i = 0; i < n3; ++i) {
                Component component = container.getComponent(i);
                if (!component.isVisible()) continue;
                Dimension dimension = component.getPreferredSize();
                n = Math.max((int)dimension.getWidth(), n);
                n2 = Math.max((int)dimension.getHeight(), n2);
            }
            Insets insets = container.getInsets();
            return new Dimension(n += insets.left + insets.right, n2 += insets.top + insets.bottom);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Dimension minimumLayoutSize(Container container) {
        Object object = container.getTreeLock();
        synchronized (object) {
            int n = Integer.MIN_VALUE;
            int n2 = Integer.MIN_VALUE;
            int n3 = container.getComponentCount();
            for (int i = 0; i < n3; ++i) {
                Component component = container.getComponent(i);
                if (!component.isVisible()) continue;
                Dimension dimension = component.getMinimumSize();
                n = Math.max((int)dimension.getWidth(), n);
                n2 = Math.max((int)dimension.getHeight(), n2);
            }
            Insets insets = container.getInsets();
            return new Dimension(n += insets.left + insets.right, n2 += insets.top + insets.bottom);
        }
    }

    @Override
    public void layoutContainer(Container container) {
        Insets insets = container.getInsets();
        int n = container.getWidth() - insets.left - insets.right;
        int n2 = container.getHeight() - insets.top - insets.bottom;
        int n3 = container.getComponentCount();
        for (int i = 0; i < n3; ++i) {
            Component component = container.getComponent(i);
            if (!component.isVisible()) continue;
            aho_0 aho_02 = this.cyy.get(component);
            if (aho_02 == null) {
                component.setBounds(insets.left, insets.top, n, n2);
                continue;
            }
            Dimension dimension = component.getPreferredSize();
            int n4 = aho_02.bJ(n, dimension.width);
            int n5 = aho_02.bK(n2, dimension.height);
            if (aho_02.bBb()) {
                n4 += n4 % 2;
                n5 += n5 % 2;
            }
            int n6 = aho_02.bL(n4, n) + insets.top;
            int n7 = aho_02.bM(n5, n2) + insets.left;
            component.setBounds(n6, n7, n4, n5);
        }
    }
}

