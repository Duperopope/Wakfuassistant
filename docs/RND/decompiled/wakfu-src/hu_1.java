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
 * Renamed from hu
 */
class hu_1
extends AbstractParser<ht_1> {
    hu_1() {
    }

    public ht_1 er(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ht_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.er(codedInputStream, extensionRegistryLite);
    }
}

