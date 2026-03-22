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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class kc
extends GeneratedMessageV3
implements kf_0 {
    private static final long EF = 0L;
    int an;
    public static final int EG = 1;
    int dL;
    public static final int EH = 2;
    boolean kO;
    public static final int EI = 3;
    List<kJ> jj;
    public static final int EJ = 4;
    long EK;
    private byte Y = (byte)-1;
    private static final kc EL = new kc();
    @Deprecated
    public static final Parser<kc> EM = new kd();

    kc(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kc() {
        this.jj = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new kc();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kc(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block14: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block14;
                    }
                    case 8: {
                        this.an |= 1;
                        this.dL = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 16: {
                        this.an |= 2;
                        this.kO = codedInputStream.readBool();
                        continue block14;
                    }
                    case 26: {
                        if ((n & 4) == 0) {
                            this.jj = new ArrayList<kJ>();
                            n |= 4;
                        }
                        this.jj.add((kJ)codedInputStream.readMessage(kJ.GM, extensionRegistryLite));
                        continue block14;
                    }
                    case 32: {
                        this.an |= 4;
                        this.EK = codedInputStream.readInt64();
                        continue block14;
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
            if ((n & 4) != 0) {
                this.jj = Collections.unmodifiableList(this.jj);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor ZA() {
        return kb.Ex;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kb.Ey.ensureFieldAccessorsInitialized(kc.class, ke.class);
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public int d() {
        return this.dL;
    }

    @Override
    public boolean rn() {
        return (this.an & 2) != 0;
    }

    @Override
    public boolean getEnabled() {
        return this.kO;
    }

    @Override
    public List<kJ> ot() {
        return this.jj;
    }

    @Override
    public List<? extends kM> ou() {
        return this.jj;
    }

    @Override
    public int ov() {
        return this.jj.size();
    }

    @Override
    public kJ gk(int n) {
        return this.jj.get(n);
    }

    @Override
    public kM gl(int n) {
        return this.jj.get(n);
    }

    @Override
    public boolean ZB() {
        return (this.an & 4) != 0;
    }

    @Override
    public long ZC() {
        return this.EK;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.oN()) {
            this.Y = 0;
            return false;
        }
        if (!this.rn()) {
            this.Y = 0;
            return false;
        }
        for (int i = 0; i < this.ov(); ++i) {
            if (this.gk(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.dL);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeBool(2, this.kO);
        }
        for (int i = 0; i < this.jj.size(); ++i) {
            codedOutputStream.writeMessage(3, (MessageLite)this.jj.get(i));
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt64(4, this.EK);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.dL);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeBoolSize((int)2, (boolean)this.kO);
        }
        for (int i = 0; i < this.jj.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.jj.get(i)));
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.EK);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kc)) {
            return super.equals(object);
        }
        kc kc2 = (kc)object;
        if (this.oN() != kc2.oN()) {
            return false;
        }
        if (this.oN() && this.d() != kc2.d()) {
            return false;
        }
        if (this.rn() != kc2.rn()) {
            return false;
        }
        if (this.rn() && this.getEnabled() != kc2.getEnabled()) {
            return false;
        }
        if (!this.ot().equals(kc2.ot())) {
            return false;
        }
        if (this.ZB() != kc2.ZB()) {
            return false;
        }
        if (this.ZB() && this.ZC() != kc2.ZC()) {
            return false;
        }
        return this.unknownFields.equals((Object)kc2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kc.ZA().hashCode();
        if (this.oN()) {
            n = 37 * n + 1;
            n = 53 * n + this.d();
        }
        if (this.rn()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashBoolean((boolean)this.getEnabled());
        }
        if (this.ov() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.ot().hashCode();
        }
        if (this.ZB()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.ZC());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kc by(ByteBuffer byteBuffer) {
        return (kc)EM.parseFrom(byteBuffer);
    }

    public static kc bu(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kc)EM.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kc cA(ByteString byteString) {
        return (kc)EM.parseFrom(byteString);
    }

    public static kc bu(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kc)EM.parseFrom(byteString, extensionRegistryLite);
    }

    public static kc bv(byte[] byArray) {
        return (kc)EM.parseFrom(byArray);
    }

    public static kc bu(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kc)EM.parseFrom(byArray, extensionRegistryLite);
    }

    public static kc dO(InputStream inputStream) {
        return (kc)GeneratedMessageV3.parseWithIOException(EM, (InputStream)inputStream);
    }

    public static kc dO(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kc)GeneratedMessageV3.parseWithIOException(EM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kc dP(InputStream inputStream) {
        return (kc)GeneratedMessageV3.parseDelimitedWithIOException(EM, (InputStream)inputStream);
    }

    public static kc dP(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kc)GeneratedMessageV3.parseDelimitedWithIOException(EM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kc bu(CodedInputStream codedInputStream) {
        return (kc)GeneratedMessageV3.parseWithIOException(EM, (CodedInputStream)codedInputStream);
    }

    public static kc gi(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kc)GeneratedMessageV3.parseWithIOException(EM, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ke ZD() {
        return kc.ZE();
    }

    public static ke ZE() {
        return EL.ZF();
    }

    public static ke a(kc kc2) {
        return EL.ZF().c(kc2);
    }

    public ke ZF() {
        return this == EL ? new ke() : new ke().c(this);
    }

    protected ke bu(GeneratedMessageV3.BuilderParent builderParent) {
        ke ke2 = new ke(builderParent);
        return ke2;
    }

    public static kc ZG() {
        return EL;
    }

    public static Parser<kc> z() {
        return EM;
    }

    public Parser<kc> getParserForType() {
        return EM;
    }

    public kc ZH() {
        return EL;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bu(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.ZF();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.ZD();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.ZF();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.ZD();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ZH();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ZH();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean bg() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(kc kc2) {
        return kc2.unknownFields;
    }
}

