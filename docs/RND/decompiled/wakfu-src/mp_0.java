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
 * Renamed from mp
 */
class mp_0
extends AbstractParser<mo_0> {
    mp_0() {
    }

    public mo_0 hP(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new mo_0(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hP(codedInputStream, extensionRegistryLite);
    }
}

