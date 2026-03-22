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

/*
 * Renamed from AJ
 */
public final class aj_0
extends GeneratedMessageV3
implements AM {
    private static final long are = 0L;
    int an;
    public static final int arf = 1;
    int Gx;
    public static final int arg = 2;
    Ab arh;
    private byte Y = (byte)-1;
    private static final aj_0 ari = new aj_0();
    @Deprecated
    public static final Parser<aj_0> arj = new ak_0();

    aj_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private aj_0() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new aj_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    aj_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.an |= 1;
                        this.Gx = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 18: {
                        Ad ad = null;
                        if ((this.an & 2) != 0) {
                            ad = this.arh.aBL();
                        }
                        this.arh = (Ab)codedInputStream.readMessage(Ab.aqc, extensionRegistryLite);
                        if (ad != null) {
                            ad.c(this.arh);
                            this.arh = ad.aBS();
                        }
                        this.an |= 2;
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
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
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor aEt() {
        return zS.apz;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apA.ensureFieldAccessorsInitialized(aj_0.class, AL.class);
    }

    @Override
    public boolean acr() {
        return (this.an & 1) != 0;
    }

    @Override
    public int acs() {
        return this.Gx;
    }

    @Override
    public boolean aEu() {
        return (this.an & 2) != 0;
    }

    @Override
    public Ab aEv() {
        return this.arh == null ? Ab.aBM() : this.arh;
    }

    @Override
    public Ae aEw() {
        return this.arh == null ? Ab.aBM() : this.arh;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (this.aEu() && !this.aEv().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.Gx);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeMessage(2, (MessageLite)this.aEv());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.Gx);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.aEv());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof aj_0)) {
            return super.equals(object);
        }
        aj_0 aj_02 = (aj_0)object;
        if (this.acr() != aj_02.acr()) {
            return false;
        }
        if (this.acr() && this.acs() != aj_02.acs()) {
            return false;
        }
        if (this.aEu() != aj_02.aEu()) {
            return false;
        }
        if (this.aEu() && !this.aEv().equals(aj_02.aEv())) {
            return false;
        }
        return this.unknownFields.equals((Object)aj_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + aj_0.aEt().hashCode();
        if (this.acr()) {
            n = 37 * n + 1;
            n = 53 * n + this.acs();
        }
        if (this.aEu()) {
            n = 37 * n + 2;
            n = 53 * n + this.aEv().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static aj_0 eA(ByteBuffer byteBuffer) {
        return (aj_0)arj.parseFrom(byteBuffer);
    }

    public static aj_0 cO(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (aj_0)arj.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static aj_0 es(ByteString byteString) {
        return (aj_0)arj.parseFrom(byteString);
    }

    public static aj_0 cO(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (aj_0)arj.parseFrom(byteString, extensionRegistryLite);
    }

    public static aj_0 cQ(byte[] byArray) {
        return (aj_0)arj.parseFrom(byArray);
    }

    public static aj_0 cO(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (aj_0)arj.parseFrom(byArray, extensionRegistryLite);
    }

    public static aj_0 gC(InputStream inputStream) {
        return (aj_0)GeneratedMessageV3.parseWithIOException(arj, (InputStream)inputStream);
    }

    public static aj_0 gC(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (aj_0)GeneratedMessageV3.parseWithIOException(arj, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static aj_0 gD(InputStream inputStream) {
        return (aj_0)GeneratedMessageV3.parseDelimitedWithIOException(arj, (InputStream)inputStream);
    }

    public static aj_0 gD(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (aj_0)GeneratedMessageV3.parseDelimitedWithIOException(arj, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static aj_0 cO(CodedInputStream codedInputStream) {
        return (aj_0)GeneratedMessageV3.parseWithIOException(arj, (CodedInputStream)codedInputStream);
    }

    public static aj_0 kq(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (aj_0)GeneratedMessageV3.parseWithIOException(arj, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public AL aEx() {
        return aj_0.aEy();
    }

    public static AL aEy() {
        return ari.aEz();
    }

    public static AL a(aj_0 aj_02) {
        return ari.aEz().c(aj_02);
    }

    public AL aEz() {
        return this == ari ? new AL() : new AL().c(this);
    }

    protected AL cO(GeneratedMessageV3.BuilderParent builderParent) {
        AL aL = new AL(builderParent);
        return aL;
    }

    public static aj_0 aEA() {
        return ari;
    }

    public static Parser<aj_0> z() {
        return arj;
    }

    public Parser<aj_0> getParserForType() {
        return arj;
    }

    public aj_0 aEB() {
        return ari;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cO(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aEz();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aEx();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aEz();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aEx();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aEB();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aEB();
    }

    static /* synthetic */ boolean aEC() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(aj_0 aj_02) {
        return aj_02.unknownFields;
    }
}

