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
 * Renamed from bD
 */
class bd_2
extends AbstractParser<bc_2> {
    bd_2() {
    }

    public bc_2 aH(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new bc_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aH(codedInputStream, extensionRegistryLite);
    }
}

