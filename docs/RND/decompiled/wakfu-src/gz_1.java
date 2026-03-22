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
 * Renamed from gz
 */
class gz_1
extends AbstractParser<gy_1> {
    gz_1() {
    }

    public gy_1 dN(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new gy_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dN(codedInputStream, extensionRegistryLite);
    }
}

