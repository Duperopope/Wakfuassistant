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

public final class li
extends GeneratedMessageV3
implements lp_0 {
    private static final long HO = 0L;
    int an;
    public static final int HP = 1;
    kW Fc;
    public static final int HQ = 2;
    int ws;
    private byte Y = (byte)-1;
    private static final li HR = new li();
    @Deprecated
    public static final Parser<li> HS = new lj();

    li(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private li() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new li();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    li(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 10: {
                        kY kY2 = null;
                        if ((this.an & 1) != 0) {
                            kY2 = this.Fc.aem();
                        }
                        this.Fc = (kW)codedInputStream.readMessage(kW.Hs, extensionRegistryLite);
                        if (kY2 != null) {
                            kY2.h(this.Fc);
                            this.Fc = kY2.aes();
                        }
                        this.an |= 1;
                        continue block12;
                    }
                    case 16: {
                        this.an |= 2;
                        this.ws = codedInputStream.readInt32();
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

    public static final Descriptors.Descriptor afC() {
        return kF.Gq;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gr.ensureFieldAccessorsInitialized(li.class, lk_1.class);
    }

    @Override
    public boolean aaz() {
        return (this.an & 1) != 0;
    }

    @Override
    public kW aaA() {
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    @Override
    public lh aaB() {
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    @Override
    public boolean Ly() {
        return (this.an & 2) != 0;
    }

    @Override
    public int Lz() {
        return this.ws;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.aaz()) {
            this.Y = 0;
            return false;
        }
        if (!this.Ly()) {
            this.Y = 0;
            return false;
        }
        if (!this.aaA().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeMessage(1, (MessageLite)this.aaA());
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.ws);
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
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.aaA());
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.ws);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof li)) {
            return super.equals(object);
        }
        li li2 = (li)object;
        if (this.aaz() != li2.aaz()) {
            return false;
        }
        if (this.aaz() && !this.aaA().equals(li2.aaA())) {
            return false;
        }
        if (this.Ly() != li2.Ly()) {
            return false;
        }
        if (this.Ly() && this.Lz() != li2.Lz()) {
            return false;
        }
        return this.unknownFields.equals((Object)li2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + li.afC().hashCode();
        if (this.aaz()) {
            n = 37 * n + 1;
            n = 53 * n + this.aaA().hashCode();
        }
        if (this.Ly()) {
            n = 37 * n + 2;
            n = 53 * n + this.Lz();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static li bM(ByteBuffer byteBuffer) {
        return (li)HS.parseFrom(byteBuffer);
    }

    public static li bI(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (li)HS.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static li cR(ByteString byteString) {
        return (li)HS.parseFrom(byteString);
    }

    public static li bI(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (li)HS.parseFrom(byteString, extensionRegistryLite);
    }

    public static li bJ(byte[] byArray) {
        return (li)HS.parseFrom(byArray);
    }

    public static li bI(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (li)HS.parseFrom(byArray, extensionRegistryLite);
    }

    public static li eq(InputStream inputStream) {
        return (li)GeneratedMessageV3.parseWithIOException(HS, (InputStream)inputStream);
    }

    public static li eq(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (li)GeneratedMessageV3.parseWithIOException(HS, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static li er(InputStream inputStream) {
        return (li)GeneratedMessageV3.parseDelimitedWithIOException(HS, (InputStream)inputStream);
    }

    public static li er(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (li)GeneratedMessageV3.parseDelimitedWithIOException(HS, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static li bI(CodedInputStream codedInputStream) {
        return (li)GeneratedMessageV3.parseWithIOException(HS, (CodedInputStream)codedInputStream);
    }

    public static li gY(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (li)GeneratedMessageV3.parseWithIOException(HS, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public lk_1 afD() {
        return li.afE();
    }

    public static lk_1 afE() {
        return HR.afF();
    }

    public static lk_1 a(li li2) {
        return HR.afF().c(li2);
    }

    public lk_1 afF() {
        return this == HR ? new lk_1() : new lk_1().c(this);
    }

    protected lk_1 bI(GeneratedMessageV3.BuilderParent builderParent) {
        lk_1 lk_12 = new lk_1(builderParent);
        return lk_12;
    }

    public static li afG() {
        return HR;
    }

    public static Parser<li> z() {
        return HS;
    }

    public Parser<li> getParserForType() {
        return HS;
    }

    public li afH() {
        return HR;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bI(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.afF();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.afD();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.afF();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.afD();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.afH();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.afH();
    }

    static /* synthetic */ boolean mL() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(li li2) {
        return li2.unknownFields;
    }
}

