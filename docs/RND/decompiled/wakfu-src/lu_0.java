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
 * Renamed from lU
 */
class lu_0
extends AbstractParser<lt_1> {
    lu_0() {
    }

    public lt_1 hA(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new lt_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hA(codedInputStream, extensionRegistryLite);
    }
}

