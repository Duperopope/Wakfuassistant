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
 * Renamed from zz
 */
class zz_2
extends AbstractParser<zy_2> {
    zz_2() {
    }

    public zy_2 jB(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new zy_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jB(codedInputStream, extensionRegistryLite);
    }
}

