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
 * Renamed from dk
 */
class dk_2
extends AbstractParser<dj_2> {
    dk_2() {
    }

    public dj_2 bP(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new dj_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bP(codedInputStream, extensionRegistryLite);
    }
}

