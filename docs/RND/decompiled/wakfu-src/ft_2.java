/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 */
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

/*
 * Renamed from ft
 */
class ft_2
extends AbstractParser<fs_1> {
    ft_2() {
    }

    public fs_1 dg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new fs_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dg(codedInputStream, extensionRegistryLite);
    }
}

