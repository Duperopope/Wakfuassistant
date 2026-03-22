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
 * Renamed from cu
 */
class cu_1
extends AbstractParser<ct_2> {
    cu_1() {
    }

    public ct_2 bo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ct_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bo(codedInputStream, extensionRegistryLite);
    }
}

