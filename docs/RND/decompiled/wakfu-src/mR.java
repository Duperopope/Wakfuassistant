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

public final class mR
extends GeneratedMessageV3
implements mu_1 {
    private static final long Mz = 0L;
    int an;
    public static final int MA = 1;
    mk Kp;
    public static final int MB = 2;
    List<mn_0> MC;
    private byte Y = (byte)-1;
    private static final mR MD = new mR();
    @Deprecated
    public static final Parser<mR> ME = new ms_0();

    mR(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mR() {
        this.MC = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new mR();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mR(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        mm_0 mm_02 = null;
                        if ((this.an & 1) != 0) {
                            mm_02 = this.Kp.ald();
                        }
                        this.Kp = (mk)codedInputStream.readMessage(mk.KC, extensionRegistryLite);
                        if (mm_02 != null) {
                            mm_02.e(this.Kp);
                            this.Kp = mm_02.alj();
                        }
                        this.an |= 1;
                        continue block12;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.MC = new ArrayList<mn_0>();
                            n |= 2;
                        }
                        this.MC.add((mn_0)codedInputStream.readMessage(mn_0.My, extensionRegistryLite));
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
            if ((n & 2) != 0) {
                this.MC = Collections.unmodifiableList(this.MC);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor aom() {
        return mM.Mj;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mM.Mk.ensureFieldAccessorsInitialized(mR.class, mt_0.class);
    }

    @Override
    public boolean akD() {
        return (this.an & 1) != 0;
    }

    @Override
    public mk akE() {
        return this.Kp == null ? mk.ale() : this.Kp;
    }

    @Override
    public mn akF() {
        return this.Kp == null ? mk.ale() : this.Kp;
    }

    @Override
    public List<mn_0> aon() {
        return this.MC;
    }

    @Override
    public List<? extends mQ> aoo() {
        return this.MC;
    }

    @Override
    public int aop() {
        return this.MC.size();
    }

    @Override
    public mn_0 iF(int n) {
        return this.MC.get(n);
    }

    @Override
    public mQ iG(int n) {
        return this.MC.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.akD()) {
            this.Y = 0;
            return false;
        }
        if (!this.akE().isInitialized()) {
            this.Y = 0;
            return false;
        }
        for (int i = 0; i < this.aop(); ++i) {
            if (this.iF(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeMessage(1, (MessageLite)this.akE());
        }
        for (int i = 0; i < this.MC.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.MC.get(i));
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
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.akE());
        }
        for (int i = 0; i < this.MC.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.MC.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mR)) {
            return super.equals(object);
        }
        mR mR2 = (mR)object;
        if (this.akD() != mR2.akD()) {
            return false;
        }
        if (this.akD() && !this.akE().equals(mR2.akE())) {
            return false;
        }
        if (!this.aon().equals(mR2.aon())) {
            return false;
        }
        return this.unknownFields.equals((Object)mR2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mR.aom().hashCode();
        if (this.akD()) {
            n = 37 * n + 1;
            n = 53 * n + this.akE().hashCode();
        }
        if (this.aop() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.aon().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mR cg(ByteBuffer byteBuffer) {
        return (mR)ME.parseFrom(byteBuffer);
    }

    public static mR cc(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mR)ME.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mR dr(ByteString byteString) {
        return (mR)ME.parseFrom(byteString);
    }

    public static mR cc(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mR)ME.parseFrom(byteString, extensionRegistryLite);
    }

    public static mR cd(byte[] byArray) {
        return (mR)ME.parseFrom(byArray);
    }

    public static mR cc(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mR)ME.parseFrom(byArray, extensionRegistryLite);
    }

    public static mR fe(InputStream inputStream) {
        return (mR)GeneratedMessageV3.parseWithIOException(ME, (InputStream)inputStream);
    }

    public static mR fe(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mR)GeneratedMessageV3.parseWithIOException(ME, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mR ff(InputStream inputStream) {
        return (mR)GeneratedMessageV3.parseDelimitedWithIOException(ME, (InputStream)inputStream);
    }

    public static mR ff(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mR)GeneratedMessageV3.parseDelimitedWithIOException(ME, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mR cc(CodedInputStream codedInputStream) {
        return (mR)GeneratedMessageV3.parseWithIOException(ME, (CodedInputStream)codedInputStream);
    }

    public static mR ig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mR)GeneratedMessageV3.parseWithIOException(ME, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mt_0 aoq() {
        return mR.aor();
    }

    public static mt_0 aor() {
        return MD.aos();
    }

    public static mt_0 a(mR mR2) {
        return MD.aos().c(mR2);
    }

    public mt_0 aos() {
        return this == MD ? new mt_0() : new mt_0().c(this);
    }

    protected mt_0 cc(GeneratedMessageV3.BuilderParent builderParent) {
        mt_0 mt_02 = new mt_0(builderParent);
        return mt_02;
    }

    public static mR aot() {
        return MD;
    }

    public static Parser<mR> z() {
        return ME;
    }

    public Parser<mR> getParserForType() {
        return ME;
    }

    public mR aou() {
        return MD;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cc(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aos();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aoq();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aos();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aoq();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aou();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aou();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mR mR2) {
        return mR2.unknownFields;
    }
}

