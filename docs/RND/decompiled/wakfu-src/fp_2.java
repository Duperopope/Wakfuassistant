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
 * Renamed from fp
 */
class fp_2
extends AbstractParser<fo_2> {
    fp_2() {
    }

    public fo_2 dd(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new fo_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dd(codedInputStream, extensionRegistryLite);
    }
}

