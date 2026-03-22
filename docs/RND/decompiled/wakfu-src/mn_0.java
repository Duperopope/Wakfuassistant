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
 *  com.google.protobuf.Internal
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
import com.google.protobuf.Internal;
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
 * Renamed from mN
 */
public final class mn_0
extends GeneratedMessageV3
implements mQ {
    private static final long Mn = 0L;
    int an;
    public static final int Mo = 1;
    long Mp;
    public static final int Mq = 2;
    long Mr;
    public static final int Ms = 3;
    kW Fc;
    public static final int Mt = 4;
    int jq;
    public static final int Mu = 5;
    long Kf;
    public static final int Mv = 6;
    long Mw;
    private byte Y = (byte)-1;
    private static final mn_0 Mx = new mn_0();
    @Deprecated
    public static final Parser<mn_0> My = new mO();

    mn_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mn_0() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new mn_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mn_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block16: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block16;
                    }
                    case 8: {
                        this.an |= 1;
                        this.Mp = codedInputStream.readInt64();
                        continue block16;
                    }
                    case 16: {
                        this.an |= 2;
                        this.Mr = codedInputStream.readInt64();
                        continue block16;
                    }
                    case 26: {
                        kY kY2 = null;
                        if ((this.an & 4) != 0) {
                            kY2 = this.Fc.aem();
                        }
                        this.Fc = (kW)codedInputStream.readMessage(kW.Hs, extensionRegistryLite);
                        if (kY2 != null) {
                            kY2.h(this.Fc);
                            this.Fc = kY2.aes();
                        }
                        this.an |= 4;
                        continue block16;
                    }
                    case 32: {
                        this.an |= 8;
                        this.jq = codedInputStream.readInt32();
                        continue block16;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.Kf = codedInputStream.readInt64();
                        continue block16;
                    }
                    case 48: {
                        this.an |= 0x20;
                        this.Mw = codedInputStream.readInt64();
                        continue block16;
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

    public static final Descriptors.Descriptor anP() {
        return mM.Ml;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mM.Mm.ensureFieldAccessorsInitialized(mn_0.class, mP.class);
    }

    @Override
    public boolean anQ() {
        return (this.an & 1) != 0;
    }

    @Override
    public long anR() {
        return this.Mp;
    }

    @Override
    public boolean anS() {
        return (this.an & 2) != 0;
    }

    @Override
    public long anT() {
        return this.Mr;
    }

    @Override
    public boolean aaz() {
        return (this.an & 4) != 0;
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
    public boolean oO() {
        return (this.an & 8) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    @Override
    public boolean akc() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public long akd() {
        return this.Kf;
    }

    @Override
    public boolean anU() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public long anV() {
        return this.Mw;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.anQ()) {
            this.Y = 0;
            return false;
        }
        if (!this.anS()) {
            this.Y = 0;
            return false;
        }
        if (!this.aaz()) {
            this.Y = 0;
            return false;
        }
        if (!this.oO()) {
            this.Y = 0;
            return false;
        }
        if (!this.akc()) {
            this.Y = 0;
            return false;
        }
        if (!this.anU()) {
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
            codedOutputStream.writeInt64(1, this.Mp);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(2, this.Mr);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeMessage(3, (MessageLite)this.aaA());
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(4, this.jq);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt64(5, this.Kf);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeInt64(6, this.Mw);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.Mp);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.Mr);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.aaA());
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.jq);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt64Size((int)5, (long)this.Kf);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeInt64Size((int)6, (long)this.Mw);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mn_0)) {
            return super.equals(object);
        }
        mn_0 mn_02 = (mn_0)object;
        if (this.anQ() != mn_02.anQ()) {
            return false;
        }
        if (this.anQ() && this.anR() != mn_02.anR()) {
            return false;
        }
        if (this.anS() != mn_02.anS()) {
            return false;
        }
        if (this.anS() && this.anT() != mn_02.anT()) {
            return false;
        }
        if (this.aaz() != mn_02.aaz()) {
            return false;
        }
        if (this.aaz() && !this.aaA().equals(mn_02.aaA())) {
            return false;
        }
        if (this.oO() != mn_02.oO()) {
            return false;
        }
        if (this.oO() && this.oP() != mn_02.oP()) {
            return false;
        }
        if (this.akc() != mn_02.akc()) {
            return false;
        }
        if (this.akc() && this.akd() != mn_02.akd()) {
            return false;
        }
        if (this.anU() != mn_02.anU()) {
            return false;
        }
        if (this.anU() && this.anV() != mn_02.anV()) {
            return false;
        }
        return this.unknownFields.equals((Object)mn_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mn_0.anP().hashCode();
        if (this.anQ()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.anR());
        }
        if (this.anS()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.anT());
        }
        if (this.aaz()) {
            n = 37 * n + 3;
            n = 53 * n + this.aaA().hashCode();
        }
        if (this.oO()) {
            n = 37 * n + 4;
            n = 53 * n + this.oP();
        }
        if (this.akc()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashLong((long)this.akd());
        }
        if (this.anU()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashLong((long)this.anV());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mn_0 cf(ByteBuffer byteBuffer) {
        return (mn_0)My.parseFrom(byteBuffer);
    }

    public static mn_0 cb(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mn_0)My.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mn_0 dq(ByteString byteString) {
        return (mn_0)My.parseFrom(byteString);
    }

    public static mn_0 cb(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mn_0)My.parseFrom(byteString, extensionRegistryLite);
    }

    public static mn_0 cc(byte[] byArray) {
        return (mn_0)My.parseFrom(byArray);
    }

    public static mn_0 cb(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mn_0)My.parseFrom(byArray, extensionRegistryLite);
    }

    public static mn_0 fc(InputStream inputStream) {
        return (mn_0)GeneratedMessageV3.parseWithIOException(My, (InputStream)inputStream);
    }

    public static mn_0 fc(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mn_0)GeneratedMessageV3.parseWithIOException(My, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mn_0 fd(InputStream inputStream) {
        return (mn_0)GeneratedMessageV3.parseDelimitedWithIOException(My, (InputStream)inputStream);
    }

    public static mn_0 fd(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mn_0)GeneratedMessageV3.parseDelimitedWithIOException(My, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mn_0 cb(CodedInputStream codedInputStream) {
        return (mn_0)GeneratedMessageV3.parseWithIOException(My, (CodedInputStream)codedInputStream);
    }

    public static mn_0 id(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mn_0)GeneratedMessageV3.parseWithIOException(My, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mP anW() {
        return mn_0.anX();
    }

    public static mP anX() {
        return Mx.anY();
    }

    public static mP a(mn_0 mn_02) {
        return Mx.anY().c(mn_02);
    }

    public mP anY() {
        return this == Mx ? new mP() : new mP().c(this);
    }

    protected mP cb(GeneratedMessageV3.BuilderParent builderParent) {
        mP mP2 = new mP(builderParent);
        return mP2;
    }

    public static mn_0 anZ() {
        return Mx;
    }

    public static Parser<mn_0> z() {
        return My;
    }

    public Parser<mn_0> getParserForType() {
        return My;
    }

    public mn_0 aoa() {
        return Mx;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cb(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.anY();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.anW();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.anY();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.anW();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aoa();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aoa();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mn_0 mn_02) {
        return mn_02.unknownFields;
    }
}

