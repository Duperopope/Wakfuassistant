/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from kg
 */
public final class kg_0
extends GeneratedMessageV3
implements kr_0 {
    private static final long EN = 0L;
    public static final int EO = 1;
    List<kj_0> EP;
    public static final int EQ = 2;
    List<kn_0> ER;
    private byte Y = (byte)-1;
    private static final kg_0 ES = new kg_0();
    @Deprecated
    public static final Parser<kg_0> ET = new kh_0();

    kg_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kg_0() {
        this.EP = Collections.emptyList();
        this.ER = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new kg_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kg_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    case 10: {
                        if ((n & 1) == 0) {
                            this.EP = new ArrayList<kj_0>();
                            n |= 1;
                        }
                        this.EP.add((kj_0)codedInputStream.readMessage(kj_0.Fg, extensionRegistryLite));
                        continue block12;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.ER = new ArrayList<kn_0>();
                            n |= 2;
                        }
                        this.ER.add((kn_0)codedInputStream.readMessage(kn_0.Fo, extensionRegistryLite));
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
                bl = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (n & true) {
                this.EP = Collections.unmodifiableList(this.EP);
            }
            if ((n & 2) != 0) {
                this.ER = Collections.unmodifiableList(this.ER);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor ZS() {
        return kb.Ez;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kb.EA.ensureFieldAccessorsInitialized(kg_0.class, ki_0.class);
    }

    @Override
    public List<kj_0> ZT() {
        return this.EP;
    }

    @Override
    public List<? extends km_0> ZU() {
        return this.EP;
    }

    @Override
    public int ZV() {
        return this.EP.size();
    }

    @Override
    public kj_0 gq(int n) {
        return this.EP.get(n);
    }

    @Override
    public km_0 gr(int n) {
        return this.EP.get(n);
    }

    @Override
    public List<kn_0> ZW() {
        return this.ER;
    }

    @Override
    public List<? extends kq_0> ZX() {
        return this.ER;
    }

    @Override
    public int ZY() {
        return this.ER.size();
    }

    @Override
    public kn_0 gs(int n) {
        return this.ER.get(n);
    }

    @Override
    public kq_0 gt(int n) {
        return this.ER.get(n);
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (n = 0; n < this.ZV(); ++n) {
            if (this.gq(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        for (n = 0; n < this.ZY(); ++n) {
            if (this.gs(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        for (n = 0; n < this.EP.size(); ++n) {
            codedOutputStream.writeMessage(1, (MessageLite)this.EP.get(n));
        }
        for (n = 0; n < this.ER.size(); ++n) {
            codedOutputStream.writeMessage(2, (MessageLite)this.ER.get(n));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        for (n = 0; n < this.EP.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.EP.get(n)));
        }
        for (n = 0; n < this.ER.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.ER.get(n)));
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kg_0)) {
            return super.equals(object);
        }
        kg_0 kg_02 = (kg_0)object;
        if (!this.ZT().equals(kg_02.ZT())) {
            return false;
        }
        if (!this.ZW().equals(kg_02.ZW())) {
            return false;
        }
        return this.unknownFields.equals((Object)kg_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kg_0.ZS().hashCode();
        if (this.ZV() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.ZT().hashCode();
        }
        if (this.ZY() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.ZW().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kg_0 bz(ByteBuffer byteBuffer) {
        return (kg_0)ET.parseFrom(byteBuffer);
    }

    public static kg_0 bv(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kg_0)ET.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kg_0 cB(ByteString byteString) {
        return (kg_0)ET.parseFrom(byteString);
    }

    public static kg_0 bv(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kg_0)ET.parseFrom(byteString, extensionRegistryLite);
    }

    public static kg_0 bw(byte[] byArray) {
        return (kg_0)ET.parseFrom(byArray);
    }

    public static kg_0 bv(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kg_0)ET.parseFrom(byArray, extensionRegistryLite);
    }

    public static kg_0 dQ(InputStream inputStream) {
        return (kg_0)GeneratedMessageV3.parseWithIOException(ET, (InputStream)inputStream);
    }

    public static kg_0 dQ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kg_0)GeneratedMessageV3.parseWithIOException(ET, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kg_0 dR(InputStream inputStream) {
        return (kg_0)GeneratedMessageV3.parseDelimitedWithIOException(ET, (InputStream)inputStream);
    }

    public static kg_0 dR(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kg_0)GeneratedMessageV3.parseDelimitedWithIOException(ET, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kg_0 bv(CodedInputStream codedInputStream) {
        return (kg_0)GeneratedMessageV3.parseWithIOException(ET, (CodedInputStream)codedInputStream);
    }

    public static kg_0 gl(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kg_0)GeneratedMessageV3.parseWithIOException(ET, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ki_0 ZZ() {
        return kg_0.aaa();
    }

    public static ki_0 aaa() {
        return ES.aab();
    }

    public static ki_0 a(kg_0 kg_02) {
        return ES.aab().c(kg_02);
    }

    public ki_0 aab() {
        return this == ES ? new ki_0() : new ki_0().c(this);
    }

    protected ki_0 bv(GeneratedMessageV3.BuilderParent builderParent) {
        ki_0 ki_02 = new ki_0(builderParent);
        return ki_02;
    }

    public static kg_0 aac() {
        return ES;
    }

    public static Parser<kg_0> z() {
        return ET;
    }

    public Parser<kg_0> getParserForType() {
        return ET;
    }

    public kg_0 aad() {
        return ES;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bv(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aab();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.ZZ();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aab();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.ZZ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aad();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aad();
    }

    static /* synthetic */ boolean gG() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean B() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean jh() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(kg_0 kg_02) {
        return kg_02.unknownFields;
    }
}

